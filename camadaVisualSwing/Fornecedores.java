package camadaVisualSwing;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JTextPane;
import javax.swing.text.MaskFormatter;


import dto.DadosCliente;
import dto.DadosFornecedor;



import facade.ClienteFacade;
import facade.FornecedorFacade;

import javax.swing.JDesktopPane;



public class Fornecedores extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	private JButton jButtonCancel = null;
	private JList jList = null;
	private DefaultListModel modelo = null;

	private JLabel jLabelNome = null;
	private int abre = 0;

	private JTextField jTextFieldNome = null;

	private JTextField jTextFieldCodigo = null;

	private JLabel jLabelCodigo = null;

	private JTextField jTextFieldCPFCGC = null;

	private JLabel jLabelCPFCGC = null;

	private JLabel jLabelIE = null;

	private JTextField jTextFieldIE = null;

	private JLabel jLabelEndereco = null;

	private JTextField jTextFieldEndereco = null;

	private JLabel jLabelCEP = null;

	private JLabel jLabelBairro = null;

	private JTextField jTextFieldBairro = null;

	private JLabel jLabelCidade = null;

	private JTextField jTextFieldCidade = null;

	private JLabel jLabelUF = null;

	private JComboBox jComboBox1 = null;

	private JLabel jLabelTelFax = null;

	private JTextField jTextFieldTelFax = null;

	private JLabel jLabelContato = null;

	private JTextField jTextFieldContato = null;

	private JPanel jPanel = null;

	private JButton jButton = null;
	private JLabel jLabelResultado = null;
	private JLabel jLabelCodigoConsulta = null;
	private JLabel jLabelNomeConsulta = null;

	private JButton jButton1Incluir = null;

	private JButton jButton1 = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JButton jButton4 = null;

	private JButton jButton5 = null;

	private JButton jButton6 = null;

	private JButton jButton7 = null;

	private JButton jButton8 = null;
	private JFormattedTextField tfCep =null;
	private JPanel jPanel1 = null;

	private JDesktopPane jDesktopPane = null;
	private JPanel jpanel2;
	private JButton jButtonOk =  null;
	private JButton jButtonPesquisaCodigo = null;
	private JButton jButtonNomeConsulta = null;
	private JTextField jTextFieldCodigoConsulta = null;
	private JTextField  jTextFieldNomeConsulta = null;

	private JLabel jLabel = null;

	private JTextField jTextFieldEmail = null;

	private JScrollPane jScrollPane = null;
	
	

	public Fornecedores() {
		super();
		initialize();
		
		
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Fornecedor");
		this.setVisible(true); 
		setUILanguage();
		
		
	}
	public void setUILanguage() {
		   ResourceBundle rb;
		   Locale locale = new Locale("JOptionPane_pt.properties"); 
		   rb = ResourceBundle.getBundle("JOptionPane", locale);

		   UIManager.put("OptionPane.yesButtonText", rb.getString("Yes"));
		   UIManager.put("OptionPane.noButtonText", rb.getString("No"));
		   UIManager.put("OptionPane.cancelButtonText", rb.getString("Cancel"));
		  
		   }
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelContato = new JLabel();
			jLabelContato.setBounds(new Rectangle(257, 119, 56, 19));
			jLabelContato.setText("Contato :");
			jLabelTelFax = new JLabel();
			jLabelTelFax.setBounds(new Rectangle(5, 118, 62, 19));
			jLabelTelFax.setText("Tel/Fax :");
			jLabelUF = new JLabel();
			jLabelUF.setBounds(new Rectangle(516, 48, 32, 19));
			jLabelUF.setText("UF.:");
			jLabelCidade = new JLabel();
			jLabelCidade.setBounds(new Rectangle(258, 95, 53, 19));
			jLabelCidade.setText("Cidade :");
			jLabelBairro = new JLabel();
			jLabelBairro.setBounds(new Rectangle(5, 96, 61, 19));
			jLabelBairro.setText("Bairro :");
			jLabelCEP = new JLabel();
			jLabelCEP.setBounds(new Rectangle(519, 72, 38, 19));
			jLabelCEP.setText("CEP.:");
			jLabelEndereco = new JLabel();
			jLabelEndereco.setBounds(new Rectangle(5, 73, 60, 19));
			jLabelEndereco.setText("Endereço :");
			jLabelIE = new JLabel();
			jLabelIE.setBounds(new Rectangle(279, 49, 25, 19));
			jLabelIE.setText("I.E.:");
			jLabelCPFCGC = new JLabel();
			jLabelCPFCGC.setBounds(new Rectangle(6, 49, 60, 19));
			jLabelCPFCGC.setText("CPF/CGC :");
			jLabelCodigo = new JLabel();
			jLabelCodigo.setBounds(new Rectangle(7, 24, 59, 22));
			jLabelCodigo.setText("Código :");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(196, 25, 47, 20));
			jLabelNome.setText("Nome :");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
						
			jContentPane.add(getJPanel(), null);
			
			jContentPane.add(getJPanel1(), null);
			
		}
		return jContentPane;
	}

	
	
	
	private JTextField getJTextFieldNome() {
		if (jTextFieldNome == null) {
			jTextFieldNome = new JTextField(75);
			jTextFieldNome.setBounds(new Rectangle(245, 24, 350, 21));
			jTextFieldNome.setBackground(new Color(238, 238, 238));
			jTextFieldNome.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
		}
		return jTextFieldNome;
	}
	private MaskFormatter setMascara(String mascara){
		MaskFormatter mask = null;
		try {
		mask = new MaskFormatter(mascara);
		mask.setPlaceholderCharacter('_');
		}
		catch (java.text.ParseException exc) { }
		return mask;
		}
	private JFormattedTextField getTfCep() {
		if (tfCep == null) {
		tfCep = new JFormattedTextField(setMascara("#####-###"));
		tfCep.setBounds(new Rectangle(557, 72, 65, 20));
		tfCep.setBackground(new Color(238, 238, 238));
		}
		return tfCep;
	}
	/**
	 * This method initializes jTextFieldCodigo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodigo() {
		if (jTextFieldCodigo == null) {
			jTextFieldCodigo = new JTextField(8);
			jTextFieldCodigo.setBounds(new Rectangle(70, 24, 121, 21));
			jTextFieldCodigo.setEditable(false);
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
			jTextFieldCPFCGC = new JTextField(15);
			jTextFieldCPFCGC.setBounds(new Rectangle(70, 49, 206, 20));
			jTextFieldCPFCGC.setBackground(new Color(238, 238, 238));
			jTextFieldCPFCGC.setToolTipText("Digite aqui o CPF ou CGC da empresa.");
		}
		return jTextFieldCPFCGC;
	}


	/**
	 * This method initializes jTextFieldIE	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIE() {
		if (jTextFieldIE == null) {
			jTextFieldIE = new JTextField(20);
			jTextFieldIE.setBounds(new Rectangle(307, 48, 206, 20));
			jTextFieldIE.setBackground(new Color(238, 238, 238));
			jTextFieldIE.setToolTipText("Digite aqui a Inscrição Estadual");
		}
		return jTextFieldIE;
	}


	/**
	 * This method initializes jTextFieldEndereco	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEndereco() {
		if (jTextFieldEndereco == null) {
			jTextFieldEndereco = new JTextField();
			jTextFieldEndereco.setBounds(new Rectangle(70, 72, 445, 20));
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
			jTextFieldBairro = new JTextField(20);
			jTextFieldBairro.setBounds(new Rectangle(70, 95, 181, 20));
			jTextFieldBairro.setBackground(new Color(238, 238, 238));
			jTextFieldBairro.setToolTipText("Digite aqui o nome do bairro");
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
			jTextFieldCidade = new JTextField(20);
			jTextFieldCidade.setBounds(new Rectangle(314, 95, 200, 20));
			jTextFieldCidade.setBackground(new Color(238, 238, 238));
			jTextFieldCidade.setToolTipText("Digite aqui o nome da cidade.");
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
			jComboBox1.setToolTipText("Informe o Estado.");
			jComboBox1.setBounds(new Rectangle(554, 48, 56, 19));
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
			jTextFieldTelFax = new JTextField(40);
			jTextFieldTelFax.setBounds(new Rectangle(70, 118, 180, 20));
			jTextFieldTelFax.setBackground(new Color(238, 238, 238));
			jTextFieldTelFax.setToolTipText("Informe aqui o telefone e o fax para contato");
			
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
			jTextFieldContato = new JTextField(15);
			jTextFieldContato.setBounds(new Rectangle(314, 119, 200, 19));
			jTextFieldContato.setBackground(new Color(238, 238, 238));
			jTextFieldContato.setToolTipText("Iforme aqui o contato(pessoa) do telefone.");
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
			jPanel.setBounds(new Rectangle(0, 0, 791, 50));
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
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					try{
						int valorCodigo = Integer.parseInt(getJTextFieldCodigo().getText());
						if(valorCodigo>0){
							int resposta = JOptionPane.showConfirmDialog(null,"Você deseja deletar esse registro ? ");
							
							if (resposta== 0){ 
							FornecedorFacade facade = new FornecedorFacade();
							DadosFornecedor fornecedor = new DadosFornecedor();
							fornecedor.setFornecedorCodigo(valorCodigo);
							facade.excluirFornecedor(fornecedor);
							
							JOptionPane.showMessageDialog(null, "Registro com o codigo numero "+valorCodigo +", excluido com sucesso!");
							
							limpar();
							}
						}else{
							JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'Consultar' o registro, seleciona-lo para poder deleta-lo em seguida. ");
						}
												
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'Consultar' o registro, seleciona-lo para poder deleta-lo em seguida. ");
					}
				}
			});
		}
		return jButton;
	}


	/**
	 * Este é o botão para incluir um novo registro	
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
			jButton1Incluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					 
					 try{
						 int codigo = Integer.parseInt(getJTextFieldCodigo().getText());
						 JOptionPane.showMessageDialog(null, "Contato não pode ser inserido, ele já existe!");
					 
					 }
				catch(Exception e2){}
				
				 FornecedorFacade facade = new FornecedorFacade();
				
				 DadosFornecedor df = new DadosFornecedor();
				 df.setFornecedorNome(getJTextFieldNome().getText());
				 df.setFornecedorContato(getJTextFieldContato().getText());
				 df.setFornecedorCGCCPF(getJTextFieldCPFCGC().getText());
				 df.setFornecedorTELFAX(getJTextFieldTelFax().getText());
				 df.setFornecedorEndereco(getJTextFieldEndereco().getText());
				 df.setFornecedorBairro(getJTextFieldBairro().getText());
				 df.setFornecedorCidade(getJTextFieldCidade().getText());
				 df.setFornecedorCep(getTfCep().getText());
				 df.setFornecedorUF(getJComboBox1().getSelectedIndex());
				 df.setFornecedorIE(getJTextFieldIE().getText());
				 df.setFornecedorEmail(getJTextFieldEmail().getText());
				 
				
				 facade.incluirFornecedor(df);
				 String msnErro = facade.criarContato(df);
					limpar();
					if(msnErro == null){
						JOptionPane.showMessageDialog(null, "Contato Inserido com sucesso!");
						limpar();
					
					}else{
						JOptionPane.showMessageDialog(null, msnErro);
					}
				 }	 
							
			});
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
			jButton1.setToolTipText("Primeiro registro");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFornecedor fornecedor = new DadosFornecedor();
					FornecedorFacade facade = new FornecedorFacade();
					facade.primeiro(fornecedor);
					mostrarValores(fornecedor);
					getJButton1().setEnabled(false);
					getJButton3().setEnabled(true);
					getJButton4().setEnabled(true);
				}
			});
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
			jButton2.setToolTipText("Registro anterior");
			jButton2.setBounds(new Rectangle(683, 0, 36, 48));
			Icon voltar = new ImageIcon("imagens/anterior2.gif");
			jButton2.setIcon(voltar);
			jButton2.setBackground(Color.white);
			jButton2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFornecedor fornecedor = new DadosFornecedor();
					FornecedorFacade facade = new FornecedorFacade();;
					
					
					if(getJTextFieldCodigo().getText() != ""){
						getJButton3().setEnabled(true);
						getJButton4().setEnabled(true);
						int codigo =Integer.parseInt(getJTextFieldCodigo().getText());
						String nada ="";
						String nome = "";
						facade.primeiro(fornecedor);
						int codigoPrimeiro = fornecedor.getFornecedorCodigo();					
						 fornecedor = new DadosFornecedor();
						do{
							codigo--;
							fornecedor.setFornecedorCodigo(codigo);
							facade.pesquisaComum(fornecedor);
							nome = fornecedor.getFornecedorBairro();
							
							
							if(nome==null)nome ="";
																			
						
						}while((nome.equals(nada)&&(codigo>=codigoPrimeiro)) );
						if(codigo>=codigoPrimeiro){
							mostrarValores(fornecedor);
						}else{
							
							jButton2.setEnabled(false);
							getJButton1().setEnabled(false);
						}
						
						
					}else{
						JOptionPane.showMessageDialog(null, "Selecione um Registro como parametro");
					}
					
					
										
					
				}
			});
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
			jButton3.setToolTipText("Próximo registro");
			jButton3.setBounds(new Rectangle(719, 0, 36, 48));
			Icon avancar = new ImageIcon("imagens/proxime.gif");
			jButton3.setIcon(avancar);
			jButton3.setBackground(Color.white);
			jButton3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFornecedor fornecedor = new DadosFornecedor();
					FornecedorFacade facade = new FornecedorFacade();;
					
					if(getJTextFieldCodigo().getText() != ""){
						getJButton2().setEnabled(true);
						getJButton1().setEnabled(true);
						int codigo =Integer.parseInt(getJTextFieldCodigo().getText());
						String nada ="";
						String nome = "";
						facade.ultimo(fornecedor);
						int codigoUltimo = fornecedor.getFornecedorCodigo();					
						fornecedor = new DadosFornecedor();
						do{
							codigo++;
							fornecedor.setFornecedorCodigo(codigo);
							
							facade.pesquisaComum(fornecedor);
							nome = fornecedor.getFornecedorNome();
							if(nome==null)nome ="";
																			
						
						}while((nome.equals(nada)&&(codigo<=codigoUltimo)) );
						if(codigo<=codigoUltimo){
						mostrarValores(fornecedor);
						}else{
							
							jButton3.setEnabled(false);
							getJButton2().setEnabled(true);
							getJButton4().setEnabled(false);
						}
						
						
					}else{
						JOptionPane.showMessageDialog(null, "Selecione um Registro como parametro");
					}
					
					
					
					
					
					
					//
					if(getJTextFieldCodigo().getText() != ""){
						int codigo =Integer.parseInt(getJTextFieldCodigo().getText());
						codigo++;
						fornecedor.setFornecedorCodigo(codigo);
						facade.pesquisaComum(fornecedor);
						mostrarValores(fornecedor);
						
					}else{
						JOptionPane.showMessageDialog(null, "Selecione um Registro como parametro");
					}
				}
			});
		
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
			jButton4.setToolTipText("Ultimo registro");
			Icon ultimo =  new ImageIcon("imagens/fin.gif");
			jButton4.setIcon(ultimo);
			jButton4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFornecedor fornecedor = new DadosFornecedor();
					FornecedorFacade facade = new FornecedorFacade();;
					facade.ultimo(fornecedor );
					mostrarValores(fornecedor );
					getJButton1().setEnabled(true);
					getJButton2().setEnabled(true);
					getJButton4().setEnabled(false);
				}
			});
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
			jButton5.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
						int valorCodigo = Integer.parseInt(getJTextFieldCodigo().getText());
						if(valorCodigo>0){
						FornecedorFacade facade = new FornecedorFacade();
						
						 DadosFornecedor df = new DadosFornecedor();
						 df.setFornecedorNome(getJTextFieldNome().getText());
						 df.setFornecedorContato(getJTextFieldContato().getText());
						 df.setFornecedorCGCCPF(getJTextFieldCPFCGC().getText());
						 df.setFornecedorTELFAX(getJTextFieldTelFax().getText());
						 df.setFornecedorEndereco(getJTextFieldEndereco().getText());
						 df.setFornecedorBairro(getJTextFieldBairro().getText());
						 df.setFornecedorCidade(getJTextFieldCidade().getText());
						 df.setFornecedorCep(getTfCep().getText());
						 df.setFornecedorUF(getJComboBox1().getSelectedIndex());
						 df.setFornecedorIE(getJTextFieldIE().getText());
						 df.setFornecedorEmail(getJTextFieldEmail().getText());
						 facade.atualizarFornecedor(df);
						 int codigo = Integer.parseInt(getJTextFieldCodigo().getText());
						 JOptionPane.showMessageDialog(null, "Registro com o codigo "+codigo+", foi alterado com sucesso!"); 
						 }
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'Consultar' o registro, seleciona-lo para poder altera-lo em seguida. ");
						
					}
				}
				
			});
			
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
			jButton6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					bloquear();
					getJPanel1().setBounds(new Rectangle(0, 205, 790, 330));
					
					getJContentPane().add(getJpanel2(),null);
					if(abre > 0){
					jpanel2.add(getJButtonOk(),null);
					jpanel2.add(getJButtonCancel(),null);
					//jpanel2.add(getJList(),null);
					jpanel2.add(getJTextFieldCodigoConsulta(),null);
					jpanel2.add(getJTextFieldNomeConsulta(),null);
					jpanel2.add(getJButtonNomeConsulta(),null);
					jpanel2.add(getJButtonPesquisaCodigo(),null);
					jpanel2.add(getJScrollPane(),null);
					jLabelResultado = new JLabel();
					jLabelResultado.setBounds(new Rectangle(306, 3, 71, 20));
					jLabelResultado.setText("Resultado :");
					jLabelNomeConsulta = new JLabel();
					jLabelNomeConsulta.setBounds(new Rectangle(15, 59, 45, 16));
					jLabelNomeConsulta.setText("Nome :");
					jLabelCodigoConsulta = new JLabel();
					jLabelCodigoConsulta.setBounds(new Rectangle(16, 30, 46, 16));
					jLabelCodigoConsulta.setText("Codigo :");
					jpanel2.add(jLabelCodigoConsulta, null);
					jpanel2.add(jLabelNomeConsulta, null);
					jpanel2.add(jLabelResultado, null);
					}
					
					
					
				}
			});
			
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
			jButton7.setText("Novo");
			jButton7.setToolTipText("Novo registro.");
			jButton7.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					limpar();
				}
			});
			
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
	public void limpar(){
		
		getJTextFieldNome().setText("");
		 getJTextFieldContato().setText("");
		 getJTextFieldCPFCGC().setText("");
		 getJTextFieldTelFax().setText("");
		 getJTextFieldEndereco().setText("");
		 getJTextFieldBairro().setText("");
		 getJTextFieldCidade().setText("");
		 getTfCep().setText("");
		 getJComboBox1().setSelectedIndex(0);
		 getJTextFieldIE().setText("");
		 getJTextFieldEmail().setText("");
		
		
		
		
	}


	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(6, 140, 61, 19));
			jLabel.setText("E-mail :");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBackground(Color.white);
			jPanel1.setBounds(new Rectangle(0, 48, 790, 330));
			jPanel1.add(jLabelNome, null);
			jPanel1.add(getJTextFieldNome(), null);
			jPanel1.add(getJTextFieldCodigo(), null);
			jPanel1.add(jLabelCodigo, null);
			jPanel1.add(getJTextFieldCPFCGC(), null);
			jPanel1.add(jLabelCPFCGC, null);
			jPanel1.add(jLabelIE, null);
			jPanel1.add(getJTextFieldIE(), null);
			jPanel1.add(jLabelEndereco, null);
			jPanel1.add(getJTextFieldEndereco(), null);
			jPanel1.add(jLabelCEP, null);
			jPanel1.add(getTfCep(), null);
			jPanel1.add(jLabelBairro, null);
			jPanel1.add(getJTextFieldBairro(), null);
			jPanel1.add(jLabelCidade, null);
			jPanel1.add(getJTextFieldCidade(), null);
			jPanel1.add(jLabelUF, null);
			jPanel1.add(getJComboBox1(), null);
			jPanel1.add(jLabelTelFax, null);
			jPanel1.add(getJTextFieldTelFax(), null);
			jPanel1.add(jLabelContato, null);
			jPanel1.add(getJTextFieldContato(), null);
			jPanel1.add(jLabel, null);
			jPanel1.add(getJTextFieldEmail(), null);
			
			
		}
		return jPanel1;
	}
	
	
	public JPanel getJpanel2(){
		if(jpanel2 ==null){
			jpanel2= new JPanel();
			jpanel2.setLayout(null);
			jpanel2.setBackground(Color.WHITE);
			jpanel2.setBounds(new Rectangle(0, 51, 790, 155));
			jpanel2.add(getJButtonOk(),null);
			jpanel2.add(getJButtonCancel(),null);
			
			jpanel2.add(getJTextFieldCodigoConsulta(),null);
			jpanel2.add(getJTextFieldNomeConsulta(),null);
			jpanel2.add(getJButtonNomeConsulta(),null);
			jpanel2.add(getJButtonPesquisaCodigo(),null);
			jLabelResultado = new JLabel();
			jLabelResultado.setBounds(new Rectangle(306, 3, 71, 20));
			jLabelResultado.setText("Resultado :");
			jLabelNomeConsulta = new JLabel();
			jLabelNomeConsulta.setBounds(new Rectangle(15, 59, 45, 16));
			jLabelNomeConsulta.setText("Nome :");
			jLabelCodigoConsulta = new JLabel();
			jLabelCodigoConsulta.setBounds(new Rectangle(16, 30, 46, 16));
			jLabelCodigoConsulta.setText("Codigo :");
			jpanel2.add(jLabelCodigoConsulta, null);
			jpanel2.add(jLabelNomeConsulta, null);
			jpanel2.add(jLabelResultado, null);
			jpanel2.add(getJScrollPane(), null);
		}
			
		return jpanel2;
	}

	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JButton getJButtonOk() {
		if (jButtonOk == null) {
			jButtonOk = new JButton();
			jButtonOk.setBackground(Color.white);
			Icon image = new ImageIcon("imagens/confirmado.gif");
			jButtonOk.setIcon(image);
			jButtonOk.setBounds(new Rectangle(666, 65, 52, 52));
			jButtonOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					FornecedorFacade facade = new FornecedorFacade();
					DadosFornecedor fornecedor = new DadosFornecedor();
					
					if(jList.getSelectedValue() != null){
						fornecedor.setFornecedorNome((String)(jList.getSelectedValue()));
		             	facade.pesquisaNomeJlist(fornecedor);
		             	mostrarValores(fornecedor);
		             	subir();
						jpanel2.removeAll();
						abre++;
						desbloquear();
		             	
		             	
		             	//System.out.println(valorsel);
		             	}
		             	else{ JOptionPane.showMessageDialog(null, "É necessário selecionar um item");}
		                     	
		             	}

				}
			);
		}
		return jButtonOk;
	}
	private JButton getJButtonPesquisaCodigo() {
		if (jButtonPesquisaCodigo == null) {
			jButtonPesquisaCodigo = new JButton();
			jButtonPesquisaCodigo.setText("Pesquisar");
			jButtonPesquisaCodigo.setBackground(Color.white);
			
			jButtonPesquisaCodigo.setBounds(new Rectangle(190, 29, 107, 22));
			jButtonPesquisaCodigo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFornecedor fornecedor = new DadosFornecedor();
					FornecedorFacade  facade = new FornecedorFacade();
					fornecedor.setFornecedorCodigo(Integer.parseInt(getJTextFieldCodigoConsulta().getText()));
					facade.pesquisaCodigo(fornecedor);
					getModelo().addElement(fornecedor.getFornecedorNome());
					
					
					
					
					
				}
			});
		}
		return jButtonPesquisaCodigo;
	}
	
	private JButton getJButtonNomeConsulta() {
		if (jButtonNomeConsulta == null) {
			jButtonNomeConsulta = new JButton();
			jButtonNomeConsulta.setText("Pesquisar");
			jButtonNomeConsulta.setBackground(Color.white);
			jButtonNomeConsulta.setBounds(new Rectangle(191, 59, 107, 22));
			jButtonNomeConsulta.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					
					DadosFornecedor fornecedor = new DadosFornecedor();
					FornecedorFacade  facade = new FornecedorFacade();
					Collection<DadosFornecedor> lista = new LinkedList<DadosFornecedor>();
					HashMap<String, String> map = new HashMap<String, String>();
					map.put("fornecedor_nome", getJTextFieldNomeConsulta().getText());
					String resultado = "";
					try {
						lista = facade.buscaPorParametroNome(map);
						if(lista==null){
							JOptionPane.showMessageDialog(null,"Nenhum registro encontrado com o parametro solicitado.");
						}else{
							for (DadosFornecedor dadosFornecedor : lista) {
								getModelo().addElement(dadosFornecedor .getFornecedorNome());
								
								
							}
							
						}
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null,e1.getMessage());
					} 
					
					
					
					
					
					
					
				}
			});
		}return	jButtonNomeConsulta;
		}
	
	private JList getJList() {
		if (jList == null) {
			jList = new JList(getModelo());
			jList.setBounds(new Rectangle(307, 25, 355, 91));
			jList.setBackground(new Color(238, 238, 238));
			jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			jList.setLayoutOrientation(JList.VERTICAL);
			
	        

			jList.setVisibleRowCount(5);
			

			jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
				public void valueChanged(javax.swing.event.ListSelectionEvent e) {
					String []item = null;
					int i= jList.getSelectedIndex();
					
					
				}
			});
			
			
		}
		return jList;
	}

	
	
	
	
	private JButton getJButtonCancel() {
		if (jButtonCancel == null) {
			jButtonCancel = new JButton();
			jButtonCancel.setBackground(Color.white);
			Icon image2 = new ImageIcon("imagens/negado.gif");
			jButtonCancel.setIcon(image2);
			jButtonCancel.setBounds(new Rectangle(724, 64, 52, 52));
			jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					getJpanel2().remove(getJList());
					getModelo().clear();
					getJTextFieldNomeConsulta().setText("");
					getJTextFieldCodigoConsulta().setText("");
					subir();
					jpanel2.removeAll();
					abre++;
					desbloquear();
					
					
								
					
													
				}
			});
		}
		return jButtonCancel;
	}
	private JTextField getJTextFieldNomeConsulta() {
		if (jTextFieldNomeConsulta == null) {
			jTextFieldNomeConsulta = new JTextField();
			jTextFieldNomeConsulta.setBounds(new Rectangle(64, 59, 122, 20));
			jTextFieldNomeConsulta.setBackground(new Color(238, 238, 238));
			jTextFieldNomeConsulta.setToolTipText("Digite aqui o nome do cliente, mas você deverá levar em considereções as letras maiusculas.");
			
		}
		return jTextFieldNomeConsulta;
	}
	
	public void subir (){
		
		
		getJPanel1().setBounds(new Rectangle(0, 48, 790, 330));		
		
		
		
			
	}
	public void mostrarValores(DadosFornecedor f){
		 getJTextFieldNome().setText(f.getFornecedorNome());
		 getJTextFieldContato().setText(f.getFornecedorContato());
		 getJTextFieldCPFCGC().setText(f.getFornecedorCGCCPF());
		 getJTextFieldTelFax().setText(f.getFornecedorTELFAX());
		 getJTextFieldEndereco().setText(f.getFornecedorEndereco());
		 getJTextFieldBairro().setText(f.getFornecedorBairro());
		 getJTextFieldCidade().setText(f.getFornecedorCidade());
		 getTfCep().setText(f.getFornecedorCep());
		 getJComboBox1().setSelectedItem(f.getFornecedorUF());
		 getJTextFieldIE().setText(f.getFornecedorIE());
		 getJTextFieldEmail().setText(f.getFornecedorEmail());
		 getJTextFieldCodigo().setText(""+f.getFornecedorCodigo());
		
			
		
	}
	
	public void bloquear(){
		 getJTextFieldNome().setEditable(false);
		 getJTextFieldContato().setEditable(false);
		 getJTextFieldCPFCGC().setEditable(false);
		 getJTextFieldTelFax().setEditable(false);
		 getJTextFieldEndereco().setEditable(false);
		 getJTextFieldBairro().setEditable(false);
		 getJTextFieldCidade().setEditable(false);
		 getTfCep().setEditable(false);
		 
		 getJTextFieldIE().setEditable(false);
		 getJTextFieldEmail().setEditable(false);
		 getJTextFieldCodigo().setEditable(false);
		
		
		
	}
	
	public void desbloquear(){
		getJTextFieldNome().setEditable(true);
		 getJTextFieldContato().setEditable(true);
		 getJTextFieldCPFCGC().setEditable(true);
		 getJTextFieldTelFax().setEditable(true);
		 getJTextFieldEndereco().setEditable(true);
		 getJTextFieldBairro().setEditable(true);
		 getJTextFieldCidade().setEditable(true);
		 getTfCep().setEditable(true);
		 
		 getJTextFieldIE().setEditable(true);
		 getJTextFieldEmail().setEditable(true);
		 getJTextFieldCodigo().setEditable(true);
		
		
		
	}
	
	public DefaultListModel getModelo() {
		if(modelo == null){
			modelo = new DefaultListModel();
			
			
		}return modelo ;
	}
	
	private JTextField getJTextFieldCodigoConsulta() {
		if (jTextFieldCodigoConsulta == null) {
			jTextFieldCodigoConsulta = new JTextField();
			jTextFieldCodigoConsulta.setBounds(new Rectangle(64, 30, 123, 20));
			jTextFieldCodigoConsulta.setBackground(new Color(238, 238, 238));
			jTextFieldCodigoConsulta.setToolTipText("Digite aqui o codigo para a consulta.");
			
			
		}
		return jTextFieldCodigoConsulta;
	}
	
	public void limparConsulta(){
		getJTextFieldCodigoConsulta().setText("");
		getJTextFieldNomeConsulta().setText("");
			
		
	}


	/**
	 * This method initializes jTextFieldEmail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEmail() {
		if (jTextFieldEmail == null) {
			jTextFieldEmail = new JTextField();
			jTextFieldEmail.setBounds(new Rectangle(70, 140, 227, 20));
			jTextFieldEmail.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldEmail;
	}


	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane(getJList());
			jScrollPane.setBounds(new Rectangle(307, 25, 355, 91));
			jScrollPane.setViewportView(getJList());
		}
		return jScrollPane;
	}
	
	
				
		
			
	
	

}
