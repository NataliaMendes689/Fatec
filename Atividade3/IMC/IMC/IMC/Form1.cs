using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace IMC
{
    public partial class frmIMC : Form
    {
        double peso, altura, imc;
        string classificacao, grauObes, magreza, normal, sobrepeso, obes, obesGrave;

        public frmIMC()
        {
            InitializeComponent();
        }

        private void txtImc_TextChanged(object sender, EventArgs e)
        {

        }

        private void frmIMC_Load(object sender, EventArgs e)
        {

        }

        private void lblPeso_Click(object sender, EventArgs e)
        {

        }

        private void txtAltura_Validated(object sender, EventArgs e)
        {
            if(Double.TryParse(txtAltura.Text, out altura) && (altura > 2.8
                || altura < 0.55))
            {
                txtImc.Clear();
                txtClassificacao.Clear();
                txtGrauObesidade.Clear();
                txtMagreza.Clear();
                txtNormal.Clear();
                txtSobrepeso.Clear();
                txtObesidade.Clear();
                txtObesGrave.Clear();

                MessageBox.Show("Digite um valor entre 0,55m - 2,8m");

                
            }
            else
            {
                //Calculo txtMagreza
                magreza = (Math.Pow(altura, 2) * 18.5).ToString("N1");
                txtMagreza.Text = ("< " + magreza);

                //Calculo txtNormal
                normal = (Math.Pow(altura, 2) * 24.9).ToString("N1");
                txtNormal.Text = (magreza + " - " + normal);

                //Calculo txtSobrepeso
                sobrepeso = (Math.Pow(altura,2) * 29.9).ToString("N1");
                txtSobrepeso.Text = (normal + " - " + sobrepeso);

                //Calculo txtObesidade
                obes = (Math.Pow(altura,2) * 39.9).ToString("N1");
                txtObesidade.Text = (sobrepeso + " - " + obes);

                //Calculo txtObesGrave
                obesGrave = (Math.Pow(altura, 2) * 40).ToString("N1");
                txtObesGrave.Text = ( "> " + obesGrave);

            }
            if(txtAltura.Text == "")
            {
                txtMagreza.Clear();
                txtNormal.Clear();
                txtSobrepeso.Clear();
                txtObesidade.Clear();
                txtObesGrave.Clear();
            }
        }

        private void txtPeso_Validated(object sender, EventArgs e)
        {
            if(Double.TryParse(txtPeso.Text, out peso) && peso > 600)
            {
                txtImc.Clear();
                txtClassificacao.Clear();
                txtGrauObesidade.Clear();
                txtMagreza.Clear();
                txtNormal.Clear();
                txtSobrepeso.Clear();
                txtObesidade.Clear();
                txtObesGrave.Clear();
                MessageBox.Show("Peso máximo excedido, digite um peso de até 600kg");
            }
        }

        private void txtMagreza_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            txtPeso.Clear();
            txtAltura.Clear();
            txtImc.Clear();
            txtClassificacao.Clear();
            txtGrauObesidade.Clear();
            txtMagreza.Clear();
            txtNormal.Clear();
            txtSobrepeso.Clear();
            txtObesidade.Clear();
            txtObesGrave.Clear();
        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            if((altura < 2.8 && altura > 0.55) && (peso < 600))
            {
                imc = (peso / Math.Pow(altura, 2));
                txtImc.Text = imc.ToString("N1");

                if (imc <= 18.5)
                {
                    classificacao = "Magreza";
                    grauObes = "0";
                }
                else if (imc <= 24.9)
                {
                    classificacao = "Normal";
                    grauObes = "0";
                }
                else if (imc <= 29.9)
                {
                    classificacao = "Sobrepeso";
                    grauObes = "I";
                }
                else if (imc <= 39.9)
                {
                    classificacao = "Obesidade";
                    grauObes = "II";
                }
                else
                {
                    classificacao = "Obesidade Grave";
                    grauObes = "III";
                }

                txtClassificacao.Text = classificacao;
                txtGrauObesidade.Text = grauObes;
             
            }
            else
            {
                MessageBox.Show("Valores inválidos");
            }
        }
    }
}
