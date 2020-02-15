Imports System.Text.RegularExpressions
Imports Newtonsoft.Json
Public Class Form1

    Dim PATH As String = "C:\Users\ROBERTO\Desktop\School\FormatsVB\filename"
    Class formInput
        Public name As String
        Public age As Int32
        Public address As String
    End Class
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Status.Text = "Hi!"
    End Sub

    Private Sub agetext_TextChanged(sender As Object, e As EventArgs) Handles agetext.TextChanged
        Dim digits As Regex = New Regex("[^\d]")
        agetext.Text = digits.Replace(agetext.Text, "")
    End Sub

    Private Sub agetext_KeyPress(sender As Object, e As KeyPressEventArgs) Handles agetext.KeyPress
        If Not Char.IsNumber(e.KeyChar) AndAlso Not Char.IsControl(e.KeyChar) Then
            e.Handled = True
        End If
    End Sub

    Function isBlank() As Boolean
        If nametext.Text = "" Or agetext.Text = "" Or addresstext.Text = "" Then
            isBlank = False
        Else
            isBlank = True
        End If
    End Function

    Private Sub submitxml_Click(sender As Object, e As EventArgs) Handles submitxml.Click
        If isBlank() Then
            Dim xmlDeclaration As New XDeclaration("1.0", "UTF-8", "yes")
            Dim doc As XDocument =
                New XDocument(xmlDeclaration,
                              New XElement("Form",
                                           New XElement("name", "" & nametext.Text),
                                           New XElement("age", "" & agetext.Text),
                                           New XElement("address", "" & addresstext.Text)
                                          )
                              )

            doc.Save(PATH & ".xml")

            Status.Text = "Successfully saved as XML format."
        Else
            Status.Text = "Please fill up all inputs."
        End If
    End Sub

    Private Sub submitjson_Click(sender As Object, e As EventArgs) Handles submitjson.Click
        If isBlank() Then
            Dim inp As formInput = New formInput()
            inp.name = nametext.Text
            inp.age = Convert.ToInt32(agetext.Text)
            inp.address = addresstext.Text

            My.Computer.FileSystem.WriteAllText(PATH & "JSON.txt", JsonConvert.SerializeObject(inp, Newtonsoft.Json.Formatting.Indented), False)

            Status.Text = "Successfully saved as JSON format."
        Else
            Status.Text = "Please fill up all inputs."
        End If
    End Sub
    Private Sub submittext_Click(sender As Object, e As EventArgs) Handles submittext.Click
        If isBlank() Then
            My.Computer.FileSystem.WriteAllText(PATH & ".txt", "", True)
            Dim objWriter As New System.IO.StreamWriter(PATH & ".txt")

            objWriter.WriteLine("Name:" & ControlChars.Tab & nametext.Text)
            objWriter.WriteLine("Age:" & ControlChars.Tab & agetext.Text)
            objWriter.WriteLine("Address:" & ControlChars.Tab & addresstext.Text)

            objWriter.Close()

            Status.Text = "Successfully saved as TXT format."
        Else
            Status.Text = "Please fill up all inputs."
        End If
    End Sub
End Class
