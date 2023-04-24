namespace IMC
{
    partial class frmIMC
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnCalcular = new System.Windows.Forms.Button();
            this.lblPeso = new System.Windows.Forms.Label();
            this.lblAltura = new System.Windows.Forms.Label();
            this.btnLimpar = new System.Windows.Forms.Button();
            this.btnSair = new System.Windows.Forms.Button();
            this.lblClassificacao = new System.Windows.Forms.Label();
            this.lblIMC = new System.Windows.Forms.Label();
            this.txtImc = new System.Windows.Forms.TextBox();
            this.txtClassificacao = new System.Windows.Forms.TextBox();
            this.lblGrauObesidade = new System.Windows.Forms.Label();
            this.txtGrauObesidade = new System.Windows.Forms.TextBox();
            this.txtPeso = new System.Windows.Forms.TextBox();
            this.txtAltura = new System.Windows.Forms.TextBox();
            this.gbxFaixa = new System.Windows.Forms.GroupBox();
            this.txtSobrepeso = new System.Windows.Forms.TextBox();
            this.txtNormal = new System.Windows.Forms.TextBox();
            this.txtObesidade = new System.Windows.Forms.TextBox();
            this.txtObesGrave = new System.Windows.Forms.TextBox();
            this.txtMagreza = new System.Windows.Forms.TextBox();
            this.lblObesGrave = new System.Windows.Forms.Label();
            this.lblObesidade = new System.Windows.Forms.Label();
            this.lblSobrepeso = new System.Windows.Forms.Label();
            this.lblNormal = new System.Windows.Forms.Label();
            this.lblMagreza = new System.Windows.Forms.Label();
            this.gbxFaixa.SuspendLayout();
            this.SuspendLayout();
            // 
            // btnCalcular
            // 
            this.btnCalcular.BackColor = System.Drawing.SystemColors.HighlightText;
            this.btnCalcular.Location = new System.Drawing.Point(334, 244);
            this.btnCalcular.Margin = new System.Windows.Forms.Padding(5);
            this.btnCalcular.Name = "btnCalcular";
            this.btnCalcular.Size = new System.Drawing.Size(269, 29);
            this.btnCalcular.TabIndex = 0;
            this.btnCalcular.Text = "Calcular";
            this.btnCalcular.UseVisualStyleBackColor = false;
            this.btnCalcular.Click += new System.EventHandler(this.btnCalcular_Click);
            // 
            // lblPeso
            // 
            this.lblPeso.AutoSize = true;
            this.lblPeso.ForeColor = System.Drawing.SystemColors.ControlDarkDark;
            this.lblPeso.Location = new System.Drawing.Point(15, 84);
            this.lblPeso.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblPeso.Name = "lblPeso";
            this.lblPeso.Size = new System.Drawing.Size(51, 23);
            this.lblPeso.TabIndex = 1;
            this.lblPeso.Text = "Peso:";
            this.lblPeso.Click += new System.EventHandler(this.lblPeso_Click);
            // 
            // lblAltura
            // 
            this.lblAltura.AutoSize = true;
            this.lblAltura.ForeColor = System.Drawing.SystemColors.ControlDarkDark;
            this.lblAltura.Location = new System.Drawing.Point(15, 30);
            this.lblAltura.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblAltura.Name = "lblAltura";
            this.lblAltura.Size = new System.Drawing.Size(66, 23);
            this.lblAltura.TabIndex = 3;
            this.lblAltura.Text = "Altura:";
            // 
            // btnLimpar
            // 
            this.btnLimpar.BackColor = System.Drawing.SystemColors.HighlightText;
            this.btnLimpar.ForeColor = System.Drawing.SystemColors.ControlText;
            this.btnLimpar.Location = new System.Drawing.Point(334, 208);
            this.btnLimpar.Margin = new System.Windows.Forms.Padding(5);
            this.btnLimpar.Name = "btnLimpar";
            this.btnLimpar.Size = new System.Drawing.Size(132, 29);
            this.btnLimpar.TabIndex = 4;
            this.btnLimpar.Text = "Limpar";
            this.btnLimpar.UseVisualStyleBackColor = false;
            this.btnLimpar.Click += new System.EventHandler(this.btnLimpar_Click);
            // 
            // btnSair
            // 
            this.btnSair.BackColor = System.Drawing.SystemColors.HighlightText;
            this.btnSair.Location = new System.Drawing.Point(472, 209);
            this.btnSair.Margin = new System.Windows.Forms.Padding(5);
            this.btnSair.Name = "btnSair";
            this.btnSair.Size = new System.Drawing.Size(132, 29);
            this.btnSair.TabIndex = 5;
            this.btnSair.Text = "Sair";
            this.btnSair.UseVisualStyleBackColor = false;
            this.btnSair.Click += new System.EventHandler(this.btnSair_Click);
            // 
            // lblClassificacao
            // 
            this.lblClassificacao.AutoSize = true;
            this.lblClassificacao.ForeColor = System.Drawing.SystemColors.ControlDarkDark;
            this.lblClassificacao.Location = new System.Drawing.Point(15, 192);
            this.lblClassificacao.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblClassificacao.Name = "lblClassificacao";
            this.lblClassificacao.Size = new System.Drawing.Size(114, 23);
            this.lblClassificacao.TabIndex = 7;
            this.lblClassificacao.Text = "Classificação:";
            // 
            // lblIMC
            // 
            this.lblIMC.AutoSize = true;
            this.lblIMC.ForeColor = System.Drawing.SystemColors.ControlDarkDark;
            this.lblIMC.Location = new System.Drawing.Point(15, 138);
            this.lblIMC.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblIMC.Name = "lblIMC";
            this.lblIMC.Size = new System.Drawing.Size(50, 23);
            this.lblIMC.TabIndex = 8;
            this.lblIMC.Text = "IMC:";
            // 
            // txtImc
            // 
            this.txtImc.BackColor = System.Drawing.SystemColors.HighlightText;
            this.txtImc.Enabled = false;
            this.txtImc.Location = new System.Drawing.Point(179, 135);
            this.txtImc.Name = "txtImc";
            this.txtImc.Size = new System.Drawing.Size(147, 30);
            this.txtImc.TabIndex = 9;
            this.txtImc.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.txtImc.TextChanged += new System.EventHandler(this.txtImc_TextChanged);
            // 
            // txtClassificacao
            // 
            this.txtClassificacao.BackColor = System.Drawing.SystemColors.HighlightText;
            this.txtClassificacao.Enabled = false;
            this.txtClassificacao.Location = new System.Drawing.Point(179, 189);
            this.txtClassificacao.Name = "txtClassificacao";
            this.txtClassificacao.Size = new System.Drawing.Size(147, 30);
            this.txtClassificacao.TabIndex = 10;
            this.txtClassificacao.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // lblGrauObesidade
            // 
            this.lblGrauObesidade.AutoSize = true;
            this.lblGrauObesidade.ForeColor = System.Drawing.SystemColors.ControlDarkDark;
            this.lblGrauObesidade.Location = new System.Drawing.Point(15, 246);
            this.lblGrauObesidade.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblGrauObesidade.Name = "lblGrauObesidade";
            this.lblGrauObesidade.Size = new System.Drawing.Size(165, 23);
            this.lblGrauObesidade.TabIndex = 11;
            this.lblGrauObesidade.Text = "Grau de Obesidade:";
            // 
            // txtGrauObesidade
            // 
            this.txtGrauObesidade.BackColor = System.Drawing.SystemColors.HighlightText;
            this.txtGrauObesidade.Enabled = false;
            this.txtGrauObesidade.Location = new System.Drawing.Point(179, 243);
            this.txtGrauObesidade.Name = "txtGrauObesidade";
            this.txtGrauObesidade.Size = new System.Drawing.Size(147, 30);
            this.txtGrauObesidade.TabIndex = 12;
            this.txtGrauObesidade.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtPeso
            // 
            this.txtPeso.BackColor = System.Drawing.SystemColors.HighlightText;
            this.txtPeso.Location = new System.Drawing.Point(179, 81);
            this.txtPeso.Name = "txtPeso";
            this.txtPeso.Size = new System.Drawing.Size(147, 30);
            this.txtPeso.TabIndex = 13;
            this.txtPeso.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.txtPeso.Validated += new System.EventHandler(this.txtPeso_Validated);
            // 
            // txtAltura
            // 
            this.txtAltura.BackColor = System.Drawing.SystemColors.HighlightText;
            this.txtAltura.Location = new System.Drawing.Point(179, 27);
            this.txtAltura.Name = "txtAltura";
            this.txtAltura.Size = new System.Drawing.Size(147, 30);
            this.txtAltura.TabIndex = 14;
            this.txtAltura.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.txtAltura.Validated += new System.EventHandler(this.txtAltura_Validated);
            // 
            // gbxFaixa
            // 
            this.gbxFaixa.Controls.Add(this.txtSobrepeso);
            this.gbxFaixa.Controls.Add(this.txtNormal);
            this.gbxFaixa.Controls.Add(this.txtObesidade);
            this.gbxFaixa.Controls.Add(this.txtObesGrave);
            this.gbxFaixa.Controls.Add(this.txtMagreza);
            this.gbxFaixa.Controls.Add(this.lblObesGrave);
            this.gbxFaixa.Controls.Add(this.lblObesidade);
            this.gbxFaixa.Controls.Add(this.lblSobrepeso);
            this.gbxFaixa.Controls.Add(this.lblNormal);
            this.gbxFaixa.Controls.Add(this.lblMagreza);
            this.gbxFaixa.ForeColor = System.Drawing.SystemColors.WindowFrame;
            this.gbxFaixa.Location = new System.Drawing.Point(334, 17);
            this.gbxFaixa.Name = "gbxFaixa";
            this.gbxFaixa.Size = new System.Drawing.Size(270, 179);
            this.gbxFaixa.TabIndex = 15;
            this.gbxFaixa.TabStop = false;
            this.gbxFaixa.Text = "Faixa";
            // 
            // txtSobrepeso
            // 
            this.txtSobrepeso.Enabled = false;
            this.txtSobrepeso.Location = new System.Drawing.Point(138, 82);
            this.txtSobrepeso.Name = "txtSobrepeso";
            this.txtSobrepeso.Size = new System.Drawing.Size(123, 30);
            this.txtSobrepeso.TabIndex = 17;
            this.txtSobrepeso.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtNormal
            // 
            this.txtNormal.Enabled = false;
            this.txtNormal.Location = new System.Drawing.Point(138, 52);
            this.txtNormal.Name = "txtNormal";
            this.txtNormal.Size = new System.Drawing.Size(123, 30);
            this.txtNormal.TabIndex = 16;
            this.txtNormal.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtObesidade
            // 
            this.txtObesidade.Enabled = false;
            this.txtObesidade.Location = new System.Drawing.Point(138, 112);
            this.txtObesidade.Name = "txtObesidade";
            this.txtObesidade.Size = new System.Drawing.Size(123, 30);
            this.txtObesidade.TabIndex = 18;
            this.txtObesidade.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtObesGrave
            // 
            this.txtObesGrave.Enabled = false;
            this.txtObesGrave.Location = new System.Drawing.Point(138, 142);
            this.txtObesGrave.Name = "txtObesGrave";
            this.txtObesGrave.Size = new System.Drawing.Size(123, 30);
            this.txtObesGrave.TabIndex = 19;
            this.txtObesGrave.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // txtMagreza
            // 
            this.txtMagreza.Enabled = false;
            this.txtMagreza.Location = new System.Drawing.Point(138, 22);
            this.txtMagreza.Name = "txtMagreza";
            this.txtMagreza.Size = new System.Drawing.Size(123, 30);
            this.txtMagreza.TabIndex = 20;
            this.txtMagreza.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.txtMagreza.TextChanged += new System.EventHandler(this.txtMagreza_TextChanged);
            // 
            // lblObesGrave
            // 
            this.lblObesGrave.AutoSize = true;
            this.lblObesGrave.Location = new System.Drawing.Point(8, 145);
            this.lblObesGrave.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblObesGrave.Name = "lblObesGrave";
            this.lblObesGrave.Size = new System.Drawing.Size(116, 23);
            this.lblObesGrave.TabIndex = 16;
            this.lblObesGrave.Text = "Obes. Grave:";
            // 
            // lblObesidade
            // 
            this.lblObesidade.AutoSize = true;
            this.lblObesidade.Location = new System.Drawing.Point(8, 115);
            this.lblObesidade.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblObesidade.Name = "lblObesidade";
            this.lblObesidade.Size = new System.Drawing.Size(97, 23);
            this.lblObesidade.TabIndex = 17;
            this.lblObesidade.Text = "Obesidade:";
            // 
            // lblSobrepeso
            // 
            this.lblSobrepeso.AutoSize = true;
            this.lblSobrepeso.Location = new System.Drawing.Point(8, 85);
            this.lblSobrepeso.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblSobrepeso.Name = "lblSobrepeso";
            this.lblSobrepeso.Size = new System.Drawing.Size(97, 23);
            this.lblSobrepeso.TabIndex = 18;
            this.lblSobrepeso.Text = "Sobrepeso:";
            // 
            // lblNormal
            // 
            this.lblNormal.AutoSize = true;
            this.lblNormal.Location = new System.Drawing.Point(8, 55);
            this.lblNormal.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblNormal.Name = "lblNormal";
            this.lblNormal.Size = new System.Drawing.Size(71, 23);
            this.lblNormal.TabIndex = 5;
            this.lblNormal.Text = "Normal:";
            // 
            // lblMagreza
            // 
            this.lblMagreza.AutoSize = true;
            this.lblMagreza.Location = new System.Drawing.Point(8, 25);
            this.lblMagreza.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.lblMagreza.Name = "lblMagreza";
            this.lblMagreza.Size = new System.Drawing.Size(84, 23);
            this.lblMagreza.TabIndex = 4;
            this.lblMagreza.Text = "Magreza:";
            // 
            // frmIMC
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 23F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.ClientSize = new System.Drawing.Size(617, 284);
            this.Controls.Add(this.gbxFaixa);
            this.Controls.Add(this.txtAltura);
            this.Controls.Add(this.txtPeso);
            this.Controls.Add(this.txtGrauObesidade);
            this.Controls.Add(this.lblGrauObesidade);
            this.Controls.Add(this.txtClassificacao);
            this.Controls.Add(this.txtImc);
            this.Controls.Add(this.lblIMC);
            this.Controls.Add(this.lblClassificacao);
            this.Controls.Add(this.btnSair);
            this.Controls.Add(this.btnLimpar);
            this.Controls.Add(this.lblAltura);
            this.Controls.Add(this.lblPeso);
            this.Controls.Add(this.btnCalcular);
            this.Font = new System.Drawing.Font("Comic Sans MS", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(5);
            this.Name = "frmIMC";
            this.Text = "Índice de Massa Corporal";
            this.Load += new System.EventHandler(this.frmIMC_Load);
            this.gbxFaixa.ResumeLayout(false);
            this.gbxFaixa.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnCalcular;
        private System.Windows.Forms.Label lblPeso;
        private System.Windows.Forms.Label lblAltura;
        private System.Windows.Forms.Button btnLimpar;
        private System.Windows.Forms.Button btnSair;
        private System.Windows.Forms.Label lblClassificacao;
        private System.Windows.Forms.Label lblIMC;
        private System.Windows.Forms.TextBox txtImc;
        private System.Windows.Forms.TextBox txtClassificacao;
        private System.Windows.Forms.Label lblGrauObesidade;
        private System.Windows.Forms.TextBox txtGrauObesidade;
        private System.Windows.Forms.TextBox txtPeso;
        private System.Windows.Forms.TextBox txtAltura;
        private System.Windows.Forms.GroupBox gbxFaixa;
        private System.Windows.Forms.TextBox txtSobrepeso;
        private System.Windows.Forms.TextBox txtNormal;
        private System.Windows.Forms.TextBox txtObesidade;
        private System.Windows.Forms.TextBox txtObesGrave;
        private System.Windows.Forms.TextBox txtMagreza;
        private System.Windows.Forms.Label lblObesGrave;
        private System.Windows.Forms.Label lblObesidade;
        private System.Windows.Forms.Label lblSobrepeso;
        private System.Windows.Forms.Label lblNormal;
        private System.Windows.Forms.Label lblMagreza;
    }
}

