package Interface;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
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
import java.text.DecimalFormat;

import javax.swing.JTextPane;
import javax.swing.JToolBar;

public class Pecas extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JLabel jLabelNome = null;

	private JTextField jTextFieldNome = null;

	private JTextField jTextFieldCodigo = null;

	private JLabel jLabelCodigo = null;

	private JTextField jTextFieldCPFCGC = null;

	private JLabel jLabelModelo = null;

	private JLabel jLabelDescricao = null;

	private JTextField jTextFieldEndereco = null;

	private JLabel jLabelCL = null;

	private JTextField jTextFieldBairro = null;

	private JLabel jLabelTributario = null;

	private JTextField jTextFieldCidade = null;

	private JLabel jLabelEstoque = null;

	private JTextField jTextFieldTelFax = null;

	private JLabel jLabelMinimo = null;

	private JTextField jTextFieldContato = null;

	private JLabel jLabelMax = null;

	private JTextField jTextField = null;

	private JPanel jPanel = null;

	private JButton jButton = null;

	private JButton jButton1Incluir = null;

	private JButton jButton1 = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JButton jButton4 = null;

	private JButton jButton5 = null;

	private JButton jButton6 = null;

	private JButton jButton7 = null;

	private JButton jButton8 = null;

	private JTextField jTextField1 = null;

	private JTextField jTextField11 = null;

	private JLabel jLabelAliIPI = null;

	private JLabel jLabelAliICMS = null;

	private JTextField jTextFieldLocal = null;

	private JLabel jLabelLocal = null;

	private JPanel jPanelCusto = null;

	private JLabel jLabelPrecoAqui = null;

	private JTextField jTextFieldPrecoAqui = null;

	private JTextField jTextFieldICMS1 = null;

	private JTextField jTextFieldICMS2 = null;

	private JTextField jTextFieldIPI1 = null;

	private JTextField jTextFieldIPI2 = null;

	private JTextField jTextFieldFrete1 = null;

	private JTextField jTextFieldfrete2 = null;

	private JTextField jTextFieldSeguro1 = null;

	private JTextField jTextFieldSeguro2 = null;

	private JTextField jTextFieldPrecoCusto = null;

	private JLabel jLabelPrecoICMS = null;

	private JLabel jLabelPrecoporcentagem = null;

	private JLabel jLabelPrecoporcentagem1 = null;

	private JLabel jLabelPrecoporcentagem2 = null;

	private JLabel jLabelPrecoporcentagem3 = null;

	private JLabel jLabelPrecoIPICompra = null;

	private JLabel jLabelPrecoFrete = null;

	private JLabel jLabelPrecoSeguro = null;

	private JLabel jLabelPrecoPecoCusto = null;

	private JPanel jPanelCusto1 = null;

	private JLabel jLabelPrecoCusto1 = null;

	private JTextField jTextFieldPrecoAqui2 = null;

	private JTextField jTextFieldICMS11 = null;

	private JTextField jTextFieldICMS21 = null;

	private JTextField jTextFieldIPI11 = null;

	private JTextField jTextFieldTelFax21 = null;

	private JTextField jTextFieldFrete11 = null;

	private JTextField jTextFieldfrete21 = null;

	private JTextField jTextFieldSeguro11 = null;

	private JTextField jTextFieldSeguro21 = null;

	private JTextField jTextFieldPrecoAqui11 = null;

	private JLabel jLabelPrecoICMS1 = null;

	private JLabel jLabelPrecoporcentagem4 = null;

	private JLabel jLabelPrecoporcentagem11 = null;

	private JLabel jLabelPrecoporcentagem21 = null;

	private JLabel jLabelPrecoporcentagem31 = null;

	private JLabel jLabelPrecoIPICompra1 = null;

	private JLabel jLabelPrecoFrete1 = null;

	private JLabel jLabelPrecoSeguro1 = null;

	private JLabel jLabelPrecoPecoCusto1 = null;

	private JTextArea jTextArea = null;

	private JLabel jLabelDados = null;
	static public float precoAquisicao=0;
	static public float precoporcentagem=0;
	static public float valorIPI=0;
	static public float valorICMS=0;
	static public float valorSeguro=0;
	static public float valorFrete=0;
	static public float precoDeCusto =0;
	
	
	

	public Pecas() {
		super();
		initialize();
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Peças");
		this.setVisible(true); 
		
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelDados = new JLabel();
			jLabelDados.setBounds(new Rectangle(10, 382, 214, 16));
			jLabelDados.setText("Dados sobre as ultimas compras:");
			jLabelLocal = new JLabel();
			jLabelLocal.setBounds(new Rectangle(415, 145, 42, 19));
			jLabelLocal.setText("Local:");
			jLabelAliICMS = new JLabel();
			jLabelAliICMS.setBounds(new Rectangle(538, 123, 60, 16));
			jLabelAliICMS.setText("Aliq. ICMS:");
			jLabelAliIPI = new JLabel();
			jLabelAliIPI.setBounds(new Rectangle(396, 123, 54, 16));
			jLabelAliIPI.setText("Aliq. IPI:");
			jLabelMax = new JLabel();
			jLabelMax.setBounds(new Rectangle(278, 146, 54, 19));
			jLabelMax.setText("Máximo:");
			jLabelMinimo = new JLabel();
			jLabelMinimo.setBounds(new Rectangle(144, 146, 56, 19));
			jLabelMinimo.setText("Minimo:");
			jLabelEstoque = new JLabel();
			jLabelEstoque.setBounds(new Rectangle(7, 146, 62, 19));
			jLabelEstoque.setText("Estoque:");
			jLabelTributario = new JLabel();
			jLabelTributario.setBounds(new Rectangle(194, 123, 91, 19));
			jLabelTributario.setText("Sit. Tributário:");
			jLabelCL = new JLabel();
			jLabelCL.setBounds(new Rectangle(7, 123, 61, 19));
			jLabelCL.setText("Cl. fiscal :");
			jLabelDescricao = new JLabel();
			jLabelDescricao.setBounds(new Rectangle(194, 100, 60, 19));
			jLabelDescricao.setText("Discrição:");
			jLabelModelo = new JLabel();
			jLabelModelo.setBounds(new Rectangle(6, 100, 60, 19));
			jLabelModelo.setText("Modelo:");
			jLabelCodigo = new JLabel();
			jLabelCodigo.setBounds(new Rectangle(7, 75, 122, 22));
			jLabelCodigo.setText("Código da aquisição:");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(264, 75, 47, 20));
			jLabelNome.setText("Nome :");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabelNome, null);
			jContentPane.add(getJTextFieldNome(), null);
			jContentPane.add(getJTextFieldCodigo(), null);
			jContentPane.add(jLabelCodigo, null);
			jContentPane.add(getJTextFieldCPFCGC(), null);
			jContentPane.add(jLabelModelo, null);
			jContentPane.add(jLabelDescricao, null);
			jContentPane.add(getJTextFieldEndereco(), null);
			jContentPane.add(jLabelCL, null);
			jContentPane.add(getJTextFieldBairro(), null);
			jContentPane.add(jLabelTributario, null);
			jContentPane.add(getJTextFieldCidade(), null);
			jContentPane.add(jLabelEstoque, null);
			jContentPane.add(getJTextFieldTelFax(), null);
			jContentPane.add(jLabelMinimo, null);
			jContentPane.add(getJTextFieldContato(), null);
			jContentPane.add(jLabelMax, null);
			jContentPane.add(getJTextField(), null);
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getJTextField1(), null);
			jContentPane.add(getJTextField11(), null);
			jContentPane.add(jLabelAliIPI, null);
			jContentPane.add(jLabelAliICMS, null);
			jContentPane.add(getJTextFieldLocal(), null);
			jContentPane.add(jLabelLocal, null);
			jContentPane.add(getJPanelCusto(), null);
			jContentPane.add(getJPanelCusto1(), null);
			jContentPane.add(getJTextArea(), null);
			jContentPane.add(jLabelDados, null);
			
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
			jTextFieldNome.setBounds(new Rectangle(314, 74, 437, 21));
			jTextFieldNome.setBackground(new Color(238, 238, 238));
			jTextFieldNome.setToolTipText("Digite aqui o nome da peça. ");
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
			jTextFieldCodigo.setBounds(new Rectangle(135, 75, 121, 21));
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
			jTextFieldCPFCGC.setBounds(new Rectangle(71, 100, 121, 20));
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
			jTextFieldEndereco.setBounds(new Rectangle(258, 100, 429, 20));
			jTextFieldEndereco.setBackground(new Color(238, 238, 238));
			jTextFieldEndereco.setToolTipText("Digite aqui o endereço");
		}
		return jTextFieldEndereco;
	}


	/**
	 * This method initializes jTextFieldBairro	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldBairro() {
		if (jTextFieldBairro == null) {
			jTextFieldBairro = new JTextField();
			jTextFieldBairro.setBounds(new Rectangle(71, 123, 121, 20));
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
			jTextFieldCidade.setBounds(new Rectangle(287, 123, 104, 20));
			jTextFieldCidade.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCidade;
	}


	/**
	 * This method initializes jTextFieldTelFax	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelFax() {
		if (jTextFieldTelFax == null) {
			jTextFieldTelFax = new JTextField();
			jTextFieldTelFax.setBounds(new Rectangle(72, 146, 69, 20));
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
			jTextFieldContato.setBounds(new Rectangle(203, 146, 73, 19));
			jTextFieldContato.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldContato;
	}


	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(336, 145, 76, 20));
			jTextField.setBackground(new Color(238, 238, 238));
		}
		return jTextField;
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
			jPanel.add(getJButton7(), null);
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
			jButton.setBounds(new Rectangle(215, 0, 109, 48));
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
			jButton1Incluir.setBounds(new Rectangle(0, 0, 106, 48));
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
	 * This method initializes jButton5	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setBounds(new Rectangle(106, 0, 109, 48));
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
			jButton6.setBounds(new Rectangle(324, 0, 125, 48));
			jButton6.setBackground(Color.white);
			Icon consulta = new ImageIcon("imagens/find.gif");
			jButton6.setText("Consultar");
			jButton6.setIcon(consulta);
			jButton6.setToolTipText("Consultar");
		}
		return jButton6;
	}


	/**
	 * This method initializes jButton7	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setBounds(new Rectangle(449, 0, 106, 48));
			jButton7.setBackground(Color.white);
			Icon listar = new ImageIcon("imagens/Filestext.gif");
			jButton7.setIcon(listar);
			jButton7.setText("Limites");
			
		}
		return jButton7;
	}


	/**
	 * This method initializes jButton8	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setBounds(new Rectangle(554, 0, 94, 48));
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
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setBounds(new Rectangle(453, 122, 71, 20));
			jTextField1.setBackground(new Color(238, 238, 238));
		}
		return jTextField1;
	}


	/**
	 * This method initializes jTextField11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField11() {
		if (jTextField11 == null) {
			jTextField11 = new JTextField();
			jTextField11.setBounds(new Rectangle(600, 122, 87, 20));
			jTextField11.setBackground(new Color(238, 238, 238));
		}
		return jTextField11;
	}


	/**
	 * This method initializes jTextFieldLocal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocal() {
		if (jTextFieldLocal == null) {
			jTextFieldLocal = new JTextField();
			jTextFieldLocal.setBounds(new Rectangle(459, 146, 227, 20));
			jTextFieldLocal.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldLocal;
	}


	/**
	 * This method initializes jPanelCusto	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelCusto() {
		if (jPanelCusto == null) {
			jLabelPrecoPecoCusto = new JLabel();
			jLabelPrecoPecoCusto.setBounds(new Rectangle(11, 134, 94, 16));
			jLabelPrecoPecoCusto.setText("Preço de custo:");
			jLabelPrecoSeguro = new JLabel();
			jLabelPrecoSeguro.setBounds(new Rectangle(10, 112, 80, 16));
			jLabelPrecoSeguro.setText("Seguro:");
			jLabelPrecoFrete = new JLabel();
			jLabelPrecoFrete.setBounds(new Rectangle(10, 90, 80, 16));
			jLabelPrecoFrete.setText("Frete:");
			jLabelPrecoIPICompra = new JLabel();
			jLabelPrecoIPICompra.setBounds(new Rectangle(9, 66, 89, 18));
			jLabelPrecoIPICompra.setText("IPI Compra:");
			jLabelPrecoporcentagem3 = new JLabel();
			jLabelPrecoporcentagem3.setBounds(new Rectangle(170, 112, 15, 16));
			jLabelPrecoporcentagem3.setText(" % ");
			jLabelPrecoporcentagem2 = new JLabel();
			jLabelPrecoporcentagem2.setBounds(new Rectangle(170, 91, 15, 16));
			jLabelPrecoporcentagem2.setText(" % ");
			jLabelPrecoporcentagem1 = new JLabel();
			jLabelPrecoporcentagem1.setBounds(new Rectangle(170, 68, 15, 16));
			jLabelPrecoporcentagem1.setText(" % ");
			jLabelPrecoporcentagem = new JLabel();
			jLabelPrecoporcentagem.setBounds(new Rectangle(170, 46, 15, 16));
			jLabelPrecoporcentagem.setText(" % ");
			jLabelPrecoICMS = new JLabel();
			jLabelPrecoICMS.setBounds(new Rectangle(9, 44, 112, 19));
			jLabelPrecoICMS.setText("ICMS Compra:");
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 0;
			jLabelPrecoAqui = new JLabel();
			jLabelPrecoAqui.setText("Preço de aquisição:");
			jLabelPrecoAqui.setBounds(new Rectangle(10, 24, 114, 18));
			jPanelCusto = new JPanel();
			jPanelCusto.setLayout(null);
			jPanelCusto.setBounds(new Rectangle(5, 179, 334, 185));
			jPanelCusto.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Custo de Aquisição"),BorderFactory.createEmptyBorder(5,5,5,5)));
			jPanelCusto.setBackground(Color.white);
			jPanelCusto.add(jLabelPrecoAqui, gridBagConstraints1);
			jPanelCusto.add(getJTextFieldPrecoAqui(), null);
			jPanelCusto.add(getJTextFieldICMS1(), null);
			jPanelCusto.add(getJTextFieldICMS2(), null);
			jPanelCusto.add(getJTextFieldIPI1(), null);
			jPanelCusto.add(getJTextFieldIPI2(), null);
			jPanelCusto.add(getJTextFieldFrete1(), null);
			jPanelCusto.add(getJTextFieldfrete2(), null);
			jPanelCusto.add(getJTextFieldSeguro1(), null);
			jPanelCusto.add(getJTextFieldSeguro2(), null);
			jPanelCusto.add(getJTextFieldPrecoCusto(), null);
			jPanelCusto.add(jLabelPrecoICMS, null);
			jPanelCusto.add(jLabelPrecoporcentagem, null);
			jPanelCusto.add(jLabelPrecoporcentagem1, null);
			jPanelCusto.add(jLabelPrecoporcentagem2, null);
			jPanelCusto.add(jLabelPrecoporcentagem3, null);
			jPanelCusto.add(jLabelPrecoIPICompra, null);
			jPanelCusto.add(jLabelPrecoFrete, null);
			jPanelCusto.add(jLabelPrecoSeguro, null);
			jPanelCusto.add(jLabelPrecoPecoCusto, null);
		}
		return jPanelCusto;
	}


	/**
	 * This method initializes jTextFieldPrecoAqui	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrecoAqui() {
		if (jTextFieldPrecoAqui == null) {
			jTextFieldPrecoAqui = new JTextField();
			jTextFieldPrecoAqui.setBounds(new Rectangle(130, 23, 94, 20));
			jTextFieldPrecoAqui.setBackground(new Color(238, 238, 238));
			
		}
		return jTextFieldPrecoAqui;
	}


	/**
	 * This method initializes jTextFieldICMS1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldICMS1() {
		if (jTextFieldICMS1 == null) {
			jTextFieldICMS1 = new JTextField();
			jTextFieldICMS1.setBounds(new Rectangle(130, 45, 36, 20));
			jTextFieldICMS1.setBackground(new Color(238, 238, 238));
			jTextFieldICMS1.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					precoAquisicao = Float.parseFloat(getJTextFieldPrecoAqui().getText());
					float ICMSPerc =Float.parseFloat(getJTextFieldICMS1().getText());
					valorICMS = (ICMSPerc/100)*precoAquisicao;
					DecimalFormat dm = new DecimalFormat("R$0.##");
					String ICMSvalor =  dm.format(valorICMS);
					getJTextFieldICMS2().setText(ICMSvalor);
					calculo();
								
				}
			});
			
		}
		return jTextFieldICMS1;
	}


	/**
	 * This method initializes jTextFieldICMS2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldICMS2() {
		if (jTextFieldICMS2 == null) {
			jTextFieldICMS2 = new JTextField();
			jTextFieldICMS2.setBounds(new Rectangle(193, 46, 68, 20));
			jTextFieldICMS2.setEditable(false);
			jTextFieldICMS2.setBackground(new Color(238, 238, 238));
			
		}
		return jTextFieldICMS2;
	}


	/**
	 * This method initializes jTextFieldIPI1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIPI1() {
		if (jTextFieldIPI1 == null) {
			jTextFieldIPI1 = new JTextField();
			jTextFieldIPI1.setBounds(new Rectangle(130, 67, 36, 20));
			jTextFieldIPI1.setBackground(new Color(238, 238, 238));
			jTextFieldIPI1.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					DecimalFormat dm = new DecimalFormat("R$0.##");
				    precoAquisicao = Float.parseFloat(getJTextFieldPrecoAqui().getText());
					float IPIPerc =Float.parseFloat(getJTextFieldIPI1().getText());
					valorIPI = (IPIPerc/100)*precoAquisicao;
					String ICMS =  dm.format(valorIPI);
					getJTextFieldIPI2().setText(ICMS);
					calculo();
					
				}
			});
			
			
		}
		return jTextFieldIPI1;
	}


	/**
	 * This method initializes jTextFieldIPI2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIPI2() {
		if (jTextFieldIPI2 == null) {
			jTextFieldIPI2 = new JTextField();
			jTextFieldIPI2.setBounds(new Rectangle(193, 67, 68, 20));
			jTextFieldIPI2.setEditable(false);
			jTextFieldIPI2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldIPI2;
	}


	/**
	 * This method initializes jTextFieldFrete1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFrete1() {
		if (jTextFieldFrete1 == null) {
			jTextFieldFrete1 = new JTextField();
			jTextFieldFrete1.setBounds(new Rectangle(130, 90, 36, 20));
			jTextFieldFrete1.setBackground(new Color(238, 238, 238));
			jTextFieldFrete1.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					DecimalFormat dm = new DecimalFormat("R$0.##");
					precoAquisicao = Float.parseFloat(getJTextFieldPrecoAqui().getText());
					float fretePerc =Float.parseFloat(getJTextFieldFrete1().getText());
					valorFrete = (fretePerc/100)*precoAquisicao;
					String ICMS =  dm.format(valorFrete);
					getJTextFieldfrete2().setText(ICMS);
					calculo();
				}
			});
			
		}
		return jTextFieldFrete1;
	}


	/**
	 * This method initializes jTextFieldfrete2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldfrete2() {
		if (jTextFieldfrete2 == null) {
			jTextFieldfrete2 = new JTextField();
			jTextFieldfrete2.setBounds(new Rectangle(193, 90, 68, 20));
			jTextFieldfrete2.setEditable(false);
			jTextFieldfrete2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldfrete2;
	}


	/**
	 * This method initializes jTextFieldSeguro1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSeguro1() {
		if (jTextFieldSeguro1 == null) {
			jTextFieldSeguro1 = new JTextField();
			jTextFieldSeguro1.setBounds(new Rectangle(130, 112, 36, 20));
			jTextFieldSeguro1.setBackground(new Color(238, 238, 238));
			jTextFieldSeguro1.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusLost(java.awt.event.FocusEvent e) {
					DecimalFormat dm = new DecimalFormat("R$0.##");
					precoAquisicao = Float.parseFloat(getJTextFieldPrecoAqui().getText());
					float seguroPerc =Float.parseFloat(getJTextFieldSeguro1().getText());
					valorSeguro = (seguroPerc/100)*precoAquisicao;
					String ICMS =  dm.format(valorSeguro);
					getJTextFieldSeguro2().setText(ICMS);
					calculo();
					
				}
			});
			
		}
		return jTextFieldSeguro1;
	}


	/**
	 * This method initializes jTextFieldSeguro2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSeguro2() {
		if (jTextFieldSeguro2 == null) {
			jTextFieldSeguro2 = new JTextField();
			jTextFieldSeguro2.setBounds(new Rectangle(193, 112, 68, 20));
			jTextFieldSeguro2.setEditable(false);
			jTextFieldSeguro2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldSeguro2;
	}


	/**
	 * This method initializes jTextFieldPrecoCusto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrecoCusto() {
		if (jTextFieldPrecoCusto == null) {
			jTextFieldPrecoCusto = new JTextField();
			jTextFieldPrecoCusto.setBounds(new Rectangle(130, 135, 94, 20));
			jTextFieldPrecoCusto.setEditable(false);
			jTextFieldPrecoCusto.setBackground(new Color(238, 238, 238));
			
			
			
			
		}
		return jTextFieldPrecoCusto;
	}


	/**
	 * This method initializes jPanelCusto1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelCusto1() {
		if (jPanelCusto1 == null) {
			jLabelPrecoPecoCusto1 = new JLabel();
			jLabelPrecoPecoCusto1.setBounds(new Rectangle(11, 134, 94, 16));
			jLabelPrecoPecoCusto1.setText("Preço de Venda:");
			jLabelPrecoSeguro1 = new JLabel();
			jLabelPrecoSeguro1.setBounds(new Rectangle(10, 112, 80, 16));
			jLabelPrecoSeguro1.setText("Seguro:");
			jLabelPrecoFrete1 = new JLabel();
			jLabelPrecoFrete1.setBounds(new Rectangle(10, 90, 80, 16));
			jLabelPrecoFrete1.setText("Frete:");
			jLabelPrecoIPICompra1 = new JLabel();
			jLabelPrecoIPICompra1.setBounds(new Rectangle(9, 66, 89, 18));
			jLabelPrecoIPICompra1.setText("IPI Venda:");
			jLabelPrecoporcentagem31 = new JLabel();
			jLabelPrecoporcentagem31.setBounds(new Rectangle(170, 112, 15, 16));
			jLabelPrecoporcentagem31.setText(" % ");
			jLabelPrecoporcentagem21 = new JLabel();
			jLabelPrecoporcentagem21.setBounds(new Rectangle(170, 91, 15, 16));
			jLabelPrecoporcentagem21.setText(" % ");
			jLabelPrecoporcentagem11 = new JLabel();
			jLabelPrecoporcentagem11.setBounds(new Rectangle(170, 68, 15, 16));
			jLabelPrecoporcentagem11.setText(" % ");
			jLabelPrecoporcentagem4 = new JLabel();
			jLabelPrecoporcentagem4.setBounds(new Rectangle(170, 46, 15, 16));
			jLabelPrecoporcentagem4.setText(" % ");
			jLabelPrecoICMS1 = new JLabel();
			jLabelPrecoICMS1.setBounds(new Rectangle(9, 44, 112, 19));
			jLabelPrecoICMS1.setText("ICMS Venda:");
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 0;
			gridBagConstraints11.gridy = 0;
			jLabelPrecoCusto1 = new JLabel();
			jLabelPrecoCusto1.setBounds(new Rectangle(10, 24, 114, 18));
			jLabelPrecoCusto1.setText("Preço de custo:");
			jPanelCusto1 = new JPanel();
			jPanelCusto1.setLayout(null);
			jPanelCusto1.setBounds(new Rectangle(360, 180, 328, 183));
			jPanelCusto1.setBackground(Color.white);
			jPanelCusto1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Formação de Preço"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			jPanelCusto1.add(jLabelPrecoCusto1, gridBagConstraints11);
			jPanelCusto1.add(getJTextFieldPrecoAqui2(), null);
			jPanelCusto1.add(getJTextFieldICMS11(), null);
			jPanelCusto1.add(getJTextFieldICMS21(), null);
			jPanelCusto1.add(getJTextFieldIPI11(), null);
			jPanelCusto1.add(getJTextFieldTelFax21(), null);
			jPanelCusto1.add(getJTextFieldFrete11(), null);
			jPanelCusto1.add(getJTextFieldfrete21(), null);
			jPanelCusto1.add(getJTextFieldSeguro11(), null);
			jPanelCusto1.add(getJTextFieldSeguro21(), null);
			jPanelCusto1.add(getJTextFieldPrecoAqui11(), null);
			jPanelCusto1.add(jLabelPrecoICMS1, null);
			jPanelCusto1.add(jLabelPrecoporcentagem4, null);
			jPanelCusto1.add(jLabelPrecoporcentagem11, null);
			jPanelCusto1.add(jLabelPrecoporcentagem21, null);
			jPanelCusto1.add(jLabelPrecoporcentagem31, null);
			jPanelCusto1.add(jLabelPrecoIPICompra1, null);
			jPanelCusto1.add(jLabelPrecoFrete1, null);
			jPanelCusto1.add(jLabelPrecoSeguro1, null);
			jPanelCusto1.add(jLabelPrecoPecoCusto1, null);
		}
		return jPanelCusto1;
	}


	/**
	 * This method initializes jTextFieldPrecoAqui2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrecoAqui2() {
		if (jTextFieldPrecoAqui2 == null) {
			jTextFieldPrecoAqui2 = new JTextField();
			jTextFieldPrecoAqui2.setBounds(new Rectangle(130, 23, 94, 20));
			jTextFieldPrecoAqui2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldPrecoAqui2;
	}


	/**
	 * This method initializes jTextFieldICMS11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldICMS11() {
		if (jTextFieldICMS11 == null) {
			jTextFieldICMS11 = new JTextField();
			jTextFieldICMS11.setBounds(new Rectangle(130, 45, 36, 20));
			jTextFieldICMS11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldICMS11;
	}


	/**
	 * This method initializes jTextFieldICMS21	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldICMS21() {
		if (jTextFieldICMS21 == null) {
			jTextFieldICMS21 = new JTextField();
			jTextFieldICMS21.setBounds(new Rectangle(193, 46, 68, 20));
			jTextFieldICMS21.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldICMS21;
	}


	/**
	 * This method initializes jTextFieldIPI11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIPI11() {
		if (jTextFieldIPI11 == null) {
			jTextFieldIPI11 = new JTextField();
			jTextFieldIPI11.setBounds(new Rectangle(130, 67, 36, 20));
			jTextFieldIPI11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldIPI11;
	}


	/**
	 * This method initializes jTextFieldTelFax21	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelFax21() {
		if (jTextFieldTelFax21 == null) {
			jTextFieldTelFax21 = new JTextField();
			jTextFieldTelFax21.setBounds(new Rectangle(193, 67, 68, 20));
			jTextFieldTelFax21.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldTelFax21;
	}


	/**
	 * This method initializes jTextFieldFrete11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFrete11() {
		if (jTextFieldFrete11 == null) {
			jTextFieldFrete11 = new JTextField();
			jTextFieldFrete11.setBounds(new Rectangle(130, 90, 36, 20));
			jTextFieldFrete11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldFrete11;
	}


	/**
	 * This method initializes jTextFieldfrete21	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldfrete21() {
		if (jTextFieldfrete21 == null) {
			jTextFieldfrete21 = new JTextField();
			jTextFieldfrete21.setBounds(new Rectangle(193, 90, 68, 20));
			jTextFieldfrete21.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldfrete21;
	}


	/**
	 * This method initializes jTextFieldSeguro11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSeguro11() {
		if (jTextFieldSeguro11 == null) {
			jTextFieldSeguro11 = new JTextField();
			jTextFieldSeguro11.setBounds(new Rectangle(130, 112, 36, 20));
			jTextFieldSeguro11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldSeguro11;
	}


	/**
	 * This method initializes jTextFieldSeguro21	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSeguro21() {
		if (jTextFieldSeguro21 == null) {
			jTextFieldSeguro21 = new JTextField();
			jTextFieldSeguro21.setBounds(new Rectangle(193, 112, 68, 20));
			jTextFieldSeguro21.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldSeguro21;
	}


	/**
	 * This method initializes jTextFieldPrecoAqui11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrecoAqui11() {
		if (jTextFieldPrecoAqui11 == null) {
			jTextFieldPrecoAqui11 = new JTextField();
			jTextFieldPrecoAqui11.setBounds(new Rectangle(130, 135, 94, 20));
			jTextFieldPrecoAqui11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldPrecoAqui11;
	}


	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(9, 402, 524, 138));
			jTextArea.setLineWrap(false);
			jTextArea.setWrapStyleWord(false);
			jTextArea.setRows(0);
			jTextArea.setBackground(new Color(238, 238, 238));
		}
		return jTextArea;
	}
	
	public void calculo(){
		 		
		precoporcentagem += valorICMS+ valorIPI+valorSeguro+valorFrete;
		precoDeCusto=precoAquisicao-precoporcentagem;
		DecimalFormat dm = new DecimalFormat("R$0.##");
		String precoDeCustoS = dm.format(precoDeCusto);
		getJTextFieldPrecoCusto().setText(precoDeCustoS);
		getJTextFieldPrecoAqui2().setText(precoDeCustoS);
		precoDeCusto=0;
		precoporcentagem=0;
		
	}
	
}
