<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    Private Const V As String = "Form1"

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.submittext = New System.Windows.Forms.Button()
        Me.nametext = New System.Windows.Forms.TextBox()
        Me.asdf = New System.Windows.Forms.Label()
        Me.age = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.agetext = New System.Windows.Forms.TextBox()
        Me.addresstext = New System.Windows.Forms.TextBox()
        Me.submitxml = New System.Windows.Forms.Button()
        Me.submitjson = New System.Windows.Forms.Button()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Status = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'submittext
        '
        Me.submittext.Location = New System.Drawing.Point(117, 311)
        Me.submittext.Name = "submittext"
        Me.submittext.Size = New System.Drawing.Size(120, 44)
        Me.submittext.TabIndex = 0
        Me.submittext.Text = "Save as Text"
        Me.submittext.UseVisualStyleBackColor = True
        '
        'nametext
        '
        Me.nametext.Location = New System.Drawing.Point(171, 87)
        Me.nametext.Name = "nametext"
        Me.nametext.Size = New System.Drawing.Size(287, 26)
        Me.nametext.TabIndex = 1
        '
        'asdf
        '
        Me.asdf.AutoSize = True
        Me.asdf.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!)
        Me.asdf.Location = New System.Drawing.Point(81, 83)
        Me.asdf.MaximumSize = New System.Drawing.Size(100, 100)
        Me.asdf.Name = "asdf"
        Me.asdf.Size = New System.Drawing.Size(84, 29)
        Me.asdf.TabIndex = 2
        Me.asdf.Text = "Name:"
        '
        'age
        '
        Me.age.AutoSize = True
        Me.age.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!)
        Me.age.ForeColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.age.Location = New System.Drawing.Point(103, 138)
        Me.age.MaximumSize = New System.Drawing.Size(100, 100)
        Me.age.Name = "age"
        Me.age.Size = New System.Drawing.Size(62, 29)
        Me.age.TabIndex = 3
        Me.age.Text = "Age:"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!)
        Me.Label1.ForeColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Label1.Location = New System.Drawing.Point(57, 191)
        Me.Label1.MaximumSize = New System.Drawing.Size(200, 200)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(108, 29)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "Address:"
        '
        'agetext
        '
        Me.agetext.Location = New System.Drawing.Point(171, 138)
        Me.agetext.Name = "agetext"
        Me.agetext.Size = New System.Drawing.Size(42, 26)
        Me.agetext.TabIndex = 5
        '
        'addresstext
        '
        Me.addresstext.Location = New System.Drawing.Point(171, 191)
        Me.addresstext.Name = "addresstext"
        Me.addresstext.Size = New System.Drawing.Size(598, 26)
        Me.addresstext.TabIndex = 6
        '
        'submitxml
        '
        Me.submitxml.Location = New System.Drawing.Point(338, 311)
        Me.submitxml.Name = "submitxml"
        Me.submitxml.Size = New System.Drawing.Size(120, 44)
        Me.submitxml.TabIndex = 7
        Me.submitxml.Text = "Save as XML"
        Me.submitxml.UseVisualStyleBackColor = True
        '
        'submitjson
        '
        Me.submitjson.Location = New System.Drawing.Point(561, 311)
        Me.submitjson.Name = "submitjson"
        Me.submitjson.Size = New System.Drawing.Size(120, 44)
        Me.submitjson.TabIndex = 8
        Me.submitjson.Text = "Save as Json"
        Me.submitjson.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!)
        Me.Label2.ForeColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Label2.Location = New System.Drawing.Point(57, 383)
        Me.Label2.MaximumSize = New System.Drawing.Size(200, 200)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(85, 29)
        Me.Label2.TabIndex = 9
        Me.Label2.Text = "Status:"
        '
        'Status
        '
        Me.Status.AutoSize = True
        Me.Status.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!)
        Me.Status.ForeColor = System.Drawing.SystemColors.ActiveCaptionText
        Me.Status.Location = New System.Drawing.Point(148, 383)
        Me.Status.MaximumSize = New System.Drawing.Size(1000, 1000)
        Me.Status.Name = "Status"
        Me.Status.Size = New System.Drawing.Size(214, 29)
        Me.Status.TabIndex = 10
        Me.Status.Text = "Formatting status..."
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(9.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.Status)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.submitjson)
        Me.Controls.Add(Me.submitxml)
        Me.Controls.Add(Me.addresstext)
        Me.Controls.Add(Me.agetext)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.age)
        Me.Controls.Add(Me.asdf)
        Me.Controls.Add(Me.nametext)
        Me.Controls.Add(Me.submittext)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents submittext As Button
    Friend WithEvents nametext As TextBox
    Friend WithEvents asdf As Label
    Friend WithEvents age As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents agetext As TextBox
    Friend WithEvents addresstext As TextBox
    Friend WithEvents submitxml As Button
    Friend WithEvents submitjson As Button
    Friend WithEvents Label2 As Label
    Friend WithEvents Status As Label
End Class
