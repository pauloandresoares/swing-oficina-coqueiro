package camadaVisualSwing;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextPane;

public class Seguradoras extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JLabel jLabelNome = null;

	private JTextField jTextFieldNome = null;

	private JTextField jTextFieldCodigo = null;

	private JLabel jLabelCodigo = null;

	private JTextField jTextFieldCPFCGC = null;

	private JLabel jLabelMeta = null;

	private JLabel jLabelEndereco = null;

	private JTextField jTextFieldEndereco = null;

	private JLabel jLabelCEP = null;

	private JTextField jTextFieldCEP = null;

	private JLabel jLabelBairro = null;

	private JTextField jTextFieldBairro = null;

	private JLabel jLabelCidade = null;

	private JTextField jTextFieldCidade = null;

	private JLabel jLabelUF = null;

	private JComboBox jComboBox1 = null;

	private JLabel jLabelTel = null;

	private JTextField jTextFieldTelFax = null;

	private JLabel jLabelContato = null;

	private JTextField jTextFieldContato = null;

	private JLabel jLabelcinistro = null;

	private JPanel jPanel = null;

	private JButton jButton = null;

	private JButton jButton1Incluir = null;

	private JButton jButton1 = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JButton jButton4 = null;

	private JTextArea jTextArea = null;

	private JButton jButton5 = null;

	private JButton jButton6 = null;

	private JButton jButton8 = null;

	private JTextField jTextFieldAss = null;

	private JLabel jLabelAss = null;

	private JTextField jTextFieldMail = null;

	private JLabel jLabelMail = null;

	private JTextField jTextFieldCentralFax = null;

	private JLabel jLabelCentralFax = null;

	public Seguradoras() {
		super();
		initialize();
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Seguradora");
		this.setVisible(true); 
		
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelCentralFax = new JLabel();
			jLabelCentralFax.setBounds(new Rectangle(256, 178, 69, 20));
			jLabelCentralFax.setText("Central fax:");
			jLabelMail = new JLabel();
			jLabelMail.setBounds(new Rectangle(7, 179, 62, 16));
			jLabelMail.setText("E-mail:");
			jLabelAss = new JLabel();
			jLabelAss.setBounds(new Rectangle(525, 155, 63, 21));
			jLabelAss.setText("Ass. 24hs :");
			jLabelcinistro = new JLabel();
			jLabelcinistro.setBounds(new Rectangle(6, 205, 132, 19));
			jLabelcinistro.setText("Em caso de cinistro  :");
			jLabelContato = new JLabel();
			jLabelContato.setBounds(new Rectangle(255, 155, 62, 19));
			jLabelContato.setText("Contatos :");
			jLabelTel = new JLabel();
			jLabelTel.setBounds(new Rectangle(7, 155, 62, 19));
			jLabelTel.setText("Telefones :");
			jLabelUF = new JLabel();
			jLabelUF.setBounds(new Rectangle(523, 131, 38, 19));
			jLabelUF.setText("UF.:");
			jLabelCidade = new JLabel();
			jLabelCidade.setBounds(new Rectangle(253, 131, 53, 19));
			jLabelCidade.setText("Cidade :");
			jLabelBairro = new JLabel();
			jLabelBairro.setBounds(new Rectangle(7, 130, 61, 19));
			jLabelBairro.setText("Bairro :");
			jLabelCEP = new JLabel();
			jLabelCEP.setBounds(new Rectangle(523, 105, 38, 19));
			jLabelCEP.setText("CEP.:");
			jLabelEndereco = new JLabel();
			jLabelEndereco.setBounds(new Rectangle(7, 105, 60, 19));
			jLabelEndereco.setText("Endereço :");
			jLabelMeta = new JLabel();
			jLabelMeta.setBounds(new Rectangle(603, 77, 39, 19));
			jLabelMeta.setText("Meta :");
			jLabelCodigo = new JLabel();
			jLabelCodigo.setBounds(new Rectangle(8, 76, 59, 22));
			jLabelCodigo.setText("Código :");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(202, 78, 47, 20));
			jLabelNome.setText("Nome :");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabelNome, null);
			jContentPane.add(getJTextFieldNome(), null);
			jContentPane.add(getJTextFieldCodigo(), null);
			jContentPane.add(jLabelCodigo, null);
			jContentPane.add(getJTextFieldCPFCGC(), null);
			jContentPane.add(jLabelMeta, null);
			jContentPane.add(jLabelEndereco, null);
			jContentPane.add(getJTextFieldEndereco(), null);
			jContentPane.add(jLabelCEP, null);
			jContentPane.add(getJTextFieldCEP(), null);
			jContentPane.add(jLabelBairro, null);
			jContentPane.add(getJTextFieldBairro(), null);
			jContentPane.add(jLabelCidade, null);
			jContentPane.add(getJTextFieldCidade(), null);
			jContentPane.add(jLabelUF, null);
			jContentPane.add(getJComboBox1(), null);
			jContentPane.add(jLabelTel, null);
			jContentPane.add(getJTextFieldTelFax(), null);
			jContentPane.add(jLabelContato, null);
			jContentPane.add(getJTextFieldContato(), null);
			jContentPane.add(jLabelcinistro, null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getJTextArea(), null);
			jContentPane.add(getJTextFieldAss(), null);
			jContentPane.add(jLabelAss, null);
			jContentPane.add(getJTextFieldMail(), null);
			jContentPane.add(jLabelMail, null);
			jContentPane.add(getJTextFieldCentralFax(), null);
			jContentPane.add(jLabelCentralFax, null);
		}
		return jContentPane;
	}


	/**
	 * This method initializes jTextFieldNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNome() {
		if (jTextFieldNome == null) {
			jTextFieldNome = new JTextField(40);
			jTextFieldNome.setBounds(new Rectangle(249, 78, 350, 21));
			jTextFieldNome.setBackground(new Color(238, 238, 238));
			jTextFieldNome.setToolTipText("Digito aqui o nome da Seguradora. Ex: Nome da seguradora LTDA.");
		}
		return jTextFieldNome;
	}


	/**
	 * This method initializes jTextFieldCodigo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodigo() {
		if (jTextFieldCodigo == null) {
			jTextFieldCodigo = new JTextField(8);
			jTextFieldCodigo.setBounds(new Rectangle(70, 78, 121, 21));
			jTextFieldCodigo.setBackground(new Color(238, 238, 238));
			
			
		}
		return jTextFieldCodigo;
	}


	/**
	 * This method initializes jTextFieldCPFCGC	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCPFCGC() {
		if (jTextFieldCPFCGC == null) {
			jTextFieldCPFCGC = new JTextField();
			jTextFieldCPFCGC.setBounds(new Rectangle(646, 77, 86, 20));
			jTextFieldCPFCGC.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCPFCGC;
	}


	/**
	 * This method initializes jTextFieldEndereco	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEndereco() {
		if (jTextFieldEndereco == null) {
			jTextFieldEndereco = new JTextField();
			jTextFieldEndereco.setBounds(new Rectangle(70, 105, 449, 20));
			jTextFieldEndereco.setBackground(new Color(238, 238, 238));
			jTextFieldEndereco.setToolTipText("Digite aqui o endereço");
		}
		return jTextFieldEndereco;
	}


	/**
	 * This method initializes jTextFieldCEP	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCEP() {
		if (jTextFieldCEP == null) {
			jTextFieldCEP = new JTextField();
			jTextFieldCEP.setBounds(new Rectangle(564, 105, 146, 20));
			jTextFieldCEP.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCEP;
	}


	/**
	 * This method initializes jTextFieldBairro	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldBairro() {
		if (jTextFieldBairro == null) {
			jTextFieldBairro = new JTextField();
			jTextFieldBairro.setBounds(new Rectangle(70, 131, 181, 20));
			jTextFieldBairro.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldBairro;
	}


	/**
	 * This method initializes jTextFieldCidade	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCidade() {
		if (jTextFieldCidade == null) {
			jTextFieldCidade = new JTextField();
			jTextFieldCidade.setBounds(new Rectangle(308, 131, 211, 20));
			jTextFieldCidade.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCidade;
	}


	/**
	 * This method initializes jComboBox1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox();
			jComboBox1.setBounds(new Rectangle(564, 129, 56, 19));
			String listaUF [] = {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
			
			for(int i=0; i < listaUF.length; i ++ ){
				jComboBox1.addItem(listaUF[i]);
			}
		}
		return jComboBox1;
	}


	/**
	 * This method initializes jTextFieldTelFax	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelFax() {
		if (jTextFieldTelFax == null) {
			jTextFieldTelFax = new JTextField();
			jTextFieldTelFax.setBounds(new Rectangle(70, 155, 181, 20));
			jTextFieldTelFax.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldTelFax;
	}


	/**
	 * This method initializes jTextFieldContato	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldContato() {
		if (jTextFieldContato == null) {
			jTextFieldContato = new JTextField();
			jTextFieldContato.setBounds(new Rectangle(320, 156, 200, 19));
			jTextFieldContato.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldContato;
	}


	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(0, 0, 791, 63));
			jPanel.add(getJButton(), gridBagConstraints);
			jPanel.setBackground(Color.white);
			jPanel.add(getJButton1Incluir(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJButton2(), null);
			jPanel.add(getJButton3(), null);
			jPanel.add(getJButton4(), null);
			jPanel.add(getJButton5(), null);
			jPanel.add(getJButton6(), null);
			jPanel.add(getJButton8(), null);
			
		}
		return jPanel;
	}


	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(277, 0, 134, 48));
			Icon excluir = new ImageIcon("imagens/Trashfull.gif");
			jButton.setBackground(Color.white);
			jButton.setText("Excluir");
			jButton.setToolTipText("Excluir registro");
			jButton.setIcon(excluir);
		}
		return jButton;
	}


	/**
	 * This method initializes jButton1Incluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1Incluir() {
		if (jButton1Incluir == null) {
			jButton1Incluir = new JButton();
			jButton1Incluir.setBounds(new Rectangle(0, 0, 141, 48));
			Icon incluir = new ImageIcon("imagens/Applications.gif");
			jButton1Incluir.setIcon(incluir);
			jButton1Incluir.setText("Incluir");
			jButton1Incluir.setToolTipText("Incluir Registro");
			jButton1Incluir.setBackground(Color.white);
		}
		return jButton1Incluir;
	}


	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(647, 0, 36, 48));
			jButton1.setBackground(Color.white);
			Icon retornar = new ImageIcon("imagens/initio.gif"); 
			jButton1.setIcon(retornar);
		}
		return jButton1;
	}


	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBounds(new Rectangle(683, 0, 36, 48));
			Icon voltar = new ImageIcon("imagens/anterior2.gif");
			jButton2.setIcon(voltar);
			jButton2.setBackground(Color.white);
		}
		return jButton2;
	}


	/**
	 * This method initializes jButton3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setBounds(new Rectangle(719, 0, 36, 48));
			Icon avancar = new ImageIcon("imagens/proxime.gif");
			jButton3.setIcon(avancar);
			jButton3.setBackground(Color.white);
		
		}
		return jButton3;
	}


	/**
	 * This method initializes jButton4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setBounds(new Rectangle(755, 0, 36, 48));
			jButton4.setBackground(Color.white);
			Icon ultimo =  new ImageIcon("imagens/fin.gif");
			jButton4.setIcon(ultimo);
		}
		return jButton4;
	}


	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(143, 205, 589, 109));
			jTextArea.setBackground(new Color(238, 238, 238));
			jTextArea.setRows(0);
		}
		return jTextArea;
	}


	/**
	 * This method initializes jButton5	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setBounds(new Rectangle(140, 0, 137, 48));
			jButton5.setBackground(Color.white);
			Icon alterar = new ImageIcon("imagens/Filesedit.gif"); 
			jButton5.setIcon(alterar);
			jButton5.setText("Alterar");
			jButton5.setToolTipText("Alterar dados");
			
		}
		return jButton5;
	}


	/**
	 * This method initializes jButton6	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setBounds(new Rectangle(410, 0, 125, 48));
			jButton6.setBackground(Color.white);
			Icon consulta = new ImageIcon("imagens/find.gif");
			jButton6.setText("Consultar");
			jButton6.setIcon(consulta);
			jButton6.setToolTipText("Consultar");
		}
		return jButton6;
	}


	/**
	 * This method initializes jButton8	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setBounds(new Rectangle(534, 0, 114, 48));
			jButton8.setBackground(Color.white);
			Icon sair = new ImageIcon("imagens/Networkuploads.gif");
			jButton8.setIcon(sair);
			jButton8.setText("Sair");
			jButton8.setToolTipText("Clique aqui para sair do formulario");
			jButton8.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				}
			});
		}
		return jButton8;
	}


	/**
	 * This method initializes jTextFieldAss	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldAss() {
		if (jTextFieldAss == null) {
			jTextFieldAss = new JTextField();
			jTextFieldAss.setBounds(new Rectangle(591, 155, 141, 20));
			jTextFieldAss.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldAss;
	}


	/**
	 * This method initializes jTextFieldMail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMail() {
		if (jTextFieldMail == null) {
			jTextFieldMail = new JTextField();
			jTextFieldMail.setBounds(new Rectangle(70, 178, 181, 20));
			jTextFieldMail.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldMail;
	}


	/**
	 * This method initializes jTextFieldCentralFax	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCentralFax() {
		if (jTextFieldCentralFax == null) {
			jTextFieldCentralFax = new JTextField();
			jTextFieldCentralFax.setBounds(new Rectangle(332, 179, 189, 20));
			jTextFieldCentralFax.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCentralFax;
	}

}
