package padrão;
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
import javax.swing.JDesktopPane;



public class OrdemDeServiço extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	private JButton jButtonCancel = null;
	private JList jList = null;
	private DefaultListModel modelo = null;

	private JLabel jLabelOs = null;
	private int abre = 0;

	private JTextField jTextFieldOs = null;

	private JTextField jTextFieldOrcamento = null;

	private JLabel jLabelOrcamento = null;

	private JComboBox jComboBoxConvennio = null;

	private JTextField jTextFieldNumeroDeSerie = null;

	private JLabel jLabelCPFCGC = null;

	private JLabel jLabelPrisma = null;

	private JTextField jTextFieldPrisma = null;

	private JLabel jLabelCotacao = null;

	private JComboBox jComboBoxCliente = null;

	private String msg; 

	private JLabel jLabelQueixas = null;

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

	private JTextArea jTextAreaQueixas = null;

	private JButton jButton5 = null;

	private JButton jButton6 = null;

	private JButton jButton7 = null;

	private JButton jButton8 = null;
	private JFormattedTextField tfCep =null;
	private JFormattedTextField tfDataNascimento = null;

	private JPanel jPanel1 = null;

	private JDesktopPane jDesktopPane = null;
	private JPanel jpanel2;
	private JButton jButtonOk =  null;
	private JButton jButtonPesquisaCodigo = null;
	private JButton jButtonNomeConsulta = null;
	private JTextField jTextFieldCodigoConsulta = null;
	private JTextField  jTextFieldNomeConsulta = null;

	private JTextField jTextFieldCotacao = null;

	private JTextField jTextFieldTipoDeOs = null;

	private JLabel jLabelTipo = null;

	private JLabel jLabelPlaca = null;

	private JTextField jTextFieldPlaca = null;

	private JTextField jTextFieldConvenio = null;

	private JTextField jTextFieldCliente = null;

	private JLabel jLabelCliente = null;

	private JLabel jLabel = null;

	private JTextField jTextFieldVeiculo = null;

	private JLabel jLabelVeiculo = null;

	public OrdemDeServiço() {
		super();
		initialize();
		
		
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Cliente");
		this.setVisible(true); 
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
			public void internalFrameClosing(javax.swing.event.InternalFrameEvent e) {
				setUILanguage(); 
				int resposta = JOptionPane.showConfirmDialog(null,msg);
				if (resposta== JOptionPane.YES_OPTION){ 
				      
				    System.exit(0); 
				    } 
				    if (resposta== JOptionPane.NO_OPTION){ 
				    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
				    } 
			}
		});
		
		
		
	}
	public void setUILanguage() {
		   ResourceBundle rb;
		   Locale locale = new Locale("JOptionPane_pt.properties"); 
		   rb = ResourceBundle.getBundle("JOptionPane", locale);

		   UIManager.put("OptionPane.yesButtonText", rb.getString("Yes"));
		   UIManager.put("OptionPane.noButtonText", rb.getString("No"));
		   UIManager.put("OptionPane.cancelButtonText", rb.getString("Cancel"));
		   msg = rb.getString("ExitMsg");
		   }
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelQueixas = new JLabel();
			jLabelQueixas.setBounds(new Rectangle(4, 140, 63, 19));
			jLabelQueixas.setText("Queixas :");
			jLabelCotacao = new JLabel();
			jLabelCotacao.setBounds(new Rectangle(439, 23, 63, 19));
			jLabelCotacao.setText("Cotação :");
			jLabelPrisma = new JLabel();
			jLabelPrisma.setBounds(new Rectangle(306, 24, 54, 19));
			jLabelPrisma.setText("Prisma:");
			jLabelCPFCGC = new JLabel();
			jLabelCPFCGC.setBounds(new Rectangle(6, 49, 107, 19));
			jLabelCPFCGC.setText("Numero de Serie :");
			jLabelOrcamento = new JLabel();
			jLabelOrcamento.setBounds(new Rectangle(7, 24, 74, 22));
			jLabelOrcamento.setText("Orçamento :");
			jLabelOs = new JLabel();
			jLabelOs.setBounds(new Rectangle(176, 24, 34, 20));
			jLabelOs.setText("OS.:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
						
			jContentPane.add(getJPanel(), null);
			
			jContentPane.add(getJPanel1(), null);
			
		}
		return jContentPane;
	}

	
	
	
	private JTextField getJTextFieldOs() {
		if (jTextFieldOs == null) {
			jTextFieldOs = new JTextField(75);
			jTextFieldOs.setBounds(new Rectangle(214, 23, 89, 21));
			jTextFieldOs.setBackground(new Color(238, 238, 238));
			jTextFieldOs.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
		}
		return jTextFieldOs;
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
	private JFormattedTextField getTfDataNascimento(){
		if(tfDataNascimento==null){
			tfDataNascimento= new JFormattedTextField(setMascara("##/##/####"));
			
			tfDataNascimento.setBounds(new Rectangle(655, 117, 70, 20));
			tfDataNascimento.setBackground(new Color(238, 238, 238));
		}
			
		return tfDataNascimento;
	}


	/**
	 * This method initializes jTextFieldOrcamento	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldOrcamento() {
		if (jTextFieldOrcamento == null) {
			jTextFieldOrcamento = new JTextField(8);
			jTextFieldOrcamento.setBounds(new Rectangle(83, 24, 89, 21));
			jTextFieldOrcamento.setEditable(true);
			jTextFieldOrcamento.setBackground(new Color(238, 238, 238));
			
			
			
			
		}
		return jTextFieldOrcamento;
	}


	/**
	 * This method initializes jComboBoxConvennio	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxConvennio() {
		if (jComboBoxConvennio == null) {
			jComboBoxConvennio = new JComboBox();
			jComboBoxConvennio.setBounds(new Rectangle(167, 71, 479, 19));
			jComboBoxConvennio.setToolTipText("Informe aqui o tipo da pessoa (fisica ou juridica)");
			jComboBoxConvennio.addItem("Pessoa Fisica");
			jComboBoxConvennio.addItem("Pessoa Jurídica");
			
			
		
		}
		return jComboBoxConvennio;
	}


	/**
	 * This method initializes jTextFieldNumeroDeSerie	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumeroDeSerie() {
		if (jTextFieldNumeroDeSerie == null) {
			jTextFieldNumeroDeSerie = new JTextField(15);
			jTextFieldNumeroDeSerie.setBounds(new Rectangle(118, 49, 110, 20));
			jTextFieldNumeroDeSerie.setBackground(new Color(238, 238, 238));
			jTextFieldNumeroDeSerie.setToolTipText("Digite aqui o CPF ou CGC da empresa.");
		}
		return jTextFieldNumeroDeSerie;
	}


	/**
	 * This method initializes jTextFieldPrisma	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrisma() {
		if (jTextFieldPrisma == null) {
			jTextFieldPrisma = new JTextField(20);
			jTextFieldPrisma.setBounds(new Rectangle(361, 23, 74, 20));
			jTextFieldPrisma.setBackground(new Color(238, 238, 238));
			jTextFieldPrisma.setToolTipText("Digite aqui a Inscrição Estadual");
		}
		return jTextFieldPrisma;
	}


	/**
	 * This method initializes jComboBoxCliente	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxCliente() {
		if (jComboBoxCliente == null) {
			jComboBoxCliente = new JComboBox();
			jComboBoxCliente.setBounds(new Rectangle(167, 93, 479, 20));
			String listaTipo [] = {"Conveniadas","Final","Revendas"};
			jComboBoxCliente.addItem(listaTipo[0]);
			jComboBoxCliente.addItem(listaTipo[1]);
			jComboBoxCliente.addItem(listaTipo[2]);
			
		}
		return jComboBoxCliente;
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
					DadosCliente cliente = new DadosCliente();
					ClienteFacade facade = new ClienteFacade();
					facade.primeiro(cliente);
					mostrarValores(cliente);
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
					DadosCliente cliente = new DadosCliente();
					ClienteFacade facade = new ClienteFacade();
					
					if(getJTextFieldOrcamento().getText() != ""){
						int codigo =Integer.parseInt(getJTextFieldOrcamento().getText());
						codigo--;
						cliente.setClienteCodigo(codigo);
						facade.pesquisaComum(cliente);
						mostrarValores(cliente);
						
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
					DadosCliente cliente = new DadosCliente();
					ClienteFacade facade = new ClienteFacade();
					
					if(getJTextFieldOrcamento().getText() != ""){
						int codigo =Integer.parseInt(getJTextFieldOrcamento().getText());
						codigo++;
						cliente.setClienteCodigo(codigo);
						facade.pesquisaComum(cliente);
						mostrarValores(cliente);
						
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
					DadosCliente cliente = new DadosCliente();
					ClienteFacade facade = new ClienteFacade();
					facade.ultimo(cliente);
					mostrarValores(cliente);
				}
			});
		}
		return jButton4;
	}


	/**
	 * This method initializes jTextAreaQueixas	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaQueixas() {
		if (jTextAreaQueixas == null) {
			jTextAreaQueixas = new JTextArea();
			jTextAreaQueixas.setBounds(new Rectangle(70, 141, 366, 35));
			jTextAreaQueixas.setBackground(new Color(238, 238, 238));
			jTextAreaQueixas.setToolTipText("Observaçoes sobre o cliente.");
			jTextAreaQueixas.setRows(2);
		}
		return jTextAreaQueixas;
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
					
					getJPanel1().setBounds(new Rectangle(0, 205, 790, 330));
				
					getJContentPane().add(getJpanel2(),null);
					if(abre > 0){
					
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
		 getJTextFieldOs().setText("");
		 getJComboBoxConvennio().setSelectedIndex(0);
		 getJTextFieldNumeroDeSerie().setText("");
		 
		 getJTextAreaQueixas().setText("");
		 
		 getJComboBoxCliente().setSelectedIndex(0);
		 getTfCep().setText("");
		 
		 getTfDataNascimento().setText("");
		 getJTextFieldPrisma().setText("");
		 getJTextFieldOrcamento().setText("");
		 
		
		
		
		
		
	}


	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabelVeiculo = new JLabel();
			jLabelVeiculo.setBounds(new Rectangle(5, 115, 68, 20));
			jLabelVeiculo.setText("Veiculo :");
			jLabelCliente = new JLabel();
			jLabelCliente.setBounds(new Rectangle(5, 94, 71, 19));
			jLabelCliente.setText("Cliente :");
			jLabelPlaca = new JLabel();
			jLabelPlaca.setBounds(new Rectangle(232, 49, 47, 19));
			jLabelPlaca.setText("Placa :");
			jLabelTipo = new JLabel();
			jLabelTipo.setBounds(new Rectangle(582, 24, 74, 16));
			jLabelTipo.setText("Tipo de OS :");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBackground(Color.white);
			jPanel1.setBounds(new Rectangle(0, 48, 790, 330));
			jPanel1.add(jLabelOs, null);
			jPanel1.add(getJTextFieldOs(), null);
			jPanel1.add(getJTextFieldOrcamento(), null);
			jPanel1.add(jLabelOrcamento, null);
			jPanel1.add(getJComboBoxConvennio(), null);
			jPanel1.add(getJTextFieldNumeroDeSerie(), null);
			jPanel1.add(jLabelCPFCGC, null);
			jPanel1.add(jLabelPrisma, null);
			jPanel1.add(getJTextFieldPrisma(), null);
			jPanel1.add(jLabelCotacao, null);
			jPanel1.add(getJComboBoxCliente(), null);
			jPanel1.add(getTfCep(), null);
			jPanel1.add(jLabelQueixas, null);
			jPanel1.add(getJTextAreaQueixas(), null);
			jPanel1.add(getTfDataNascimento(), null);
			jPanel1.add(getJTextFieldCotacao(), null);
			jPanel1.add(getJTextFieldTipoDeOs(), null);
			jPanel1.add(jLabelTipo, null);
			jPanel1.add(jLabelPlaca, null);
			jPanel1.add(getJTextFieldPlaca(), null);
			jPanel1.add(getJTextFieldConvenio(), null);
			jPanel1.add(getJTextFieldCliente(), null);
			jPanel1.add(jLabelCliente, null);
			jPanel1.add(getJLabel(), null);
			jPanel1.add(getJTextFieldVeiculo(), null);
			jPanel1.add(jLabelVeiculo, null);
			
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
			jpanel2.add(getJList(),null);
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
					DadosCliente cliente = new DadosCliente();
					ClienteFacade cf = new ClienteFacade();
					
					if(jList.getSelectedValue() != null){
		             	cliente.setClienteNome((String)(jList.getSelectedValue()));
		             	cf.pesquisaNomeJlist(cliente);
		             	mostrarValores(cliente);
		             	
		             	//System.out.println(valorsel);
		             	}
		             	else{ JOptionPane.showMessageDialog(null, "È necessário selecionar um item");}
		                     	
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
					DadosCliente cliente = new DadosCliente();
					ClienteFacade  facade = new ClienteFacade();
					cliente.setClienteCodigo(Integer.parseInt(getJTextFieldCodigoConsulta().getText()));
					facade.pesquisaCodigo(cliente);
					getModelo().addElement(cliente.getClienteNome());
					
					
					
					
					
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
					
					
					DadosCliente cliente = new DadosCliente();
					ClienteFacade  facade = new ClienteFacade();
					Collection<DadosCliente> lista = new LinkedList<DadosCliente>();
					HashMap<String, String> map = new HashMap<String, String>();
					map.put("cliente_nome", getJTextFieldNomeConsulta().getText());
					String resultado = "";
					try {
						lista = facade.buscaPorParametroNome(map);
						if(lista==null){
							JOptionPane.showMessageDialog(null,"Nenhum registro encontrado com o parametro solicitado.");
						}else{
							for (DadosCliente dadosCliente : lista) {
								getModelo().addElement(dadosCliente.getClienteNome());
								
								
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
	public void mostrarValores(DadosCliente cliente){
		 getJTextFieldOs().setText(cliente.getClienteNome());
		 getJComboBoxConvennio().setSelectedItem(cliente.getClientePessoa());
		 
		 getJTextFieldNumeroDeSerie().setText(cliente.getClienteCpfCgc());
		 
		 getJTextAreaQueixas().setText(cliente.getClienteObservacoes());
		 
		 getJComboBoxCliente().setSelectedItem(cliente.getClienteTipo());
		 getTfCep().setText(cliente.getClienteCep());
		
		 getTfDataNascimento().setText(cliente.getClienteDataDeNascimento());
		 getJTextFieldPrisma().setText(cliente.getClienteIe());
		 getJTextFieldOrcamento().setText(""+cliente.getClienteCodigo());
		 
		
		
		
		
		
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
	 * This method initializes jTextFieldCotacao	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCotacao() {
		if (jTextFieldCotacao == null) {
			jTextFieldCotacao = new JTextField(75);
			jTextFieldCotacao.setBounds(new Rectangle(506, 24, 71, 20));
			jTextFieldCotacao.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldCotacao.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCotacao;
	}


	/**
	 * This method initializes jTextFieldTipoDeOs	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTipoDeOs() {
		if (jTextFieldTipoDeOs == null) {
			jTextFieldTipoDeOs = new JTextField(75);
			jTextFieldTipoDeOs.setBounds(new Rectangle(659, 23, 120, 20));
			jTextFieldTipoDeOs.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldTipoDeOs.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldTipoDeOs;
	}


	/**
	 * This method initializes jTextFieldPlaca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPlaca() {
		if (jTextFieldPlaca == null) {
			jTextFieldPlaca = new JTextField(75);
			jTextFieldPlaca.setBounds(new Rectangle(282, 49, 89, 20));
			jTextFieldPlaca.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldPlaca.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldPlaca;
	}


	/**
	 * This method initializes jTextFieldConvenio	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldConvenio() {
		if (jTextFieldConvenio == null) {
			jTextFieldConvenio = new JTextField(75);
			jTextFieldConvenio.setBounds(new Rectangle(79, 72, 84, 20));
			jTextFieldConvenio.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldConvenio.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldConvenio;
	}


	/**
	 * This method initializes jTextFieldCliente	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCliente() {
		if (jTextFieldCliente == null) {
			jTextFieldCliente = new JTextField(75);
			jTextFieldCliente.setBounds(new Rectangle(79, 93, 84, 20));
			jTextFieldCliente.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldCliente.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCliente;
	}


	/**
	 * This method initializes jLabel	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel() {
		if (jLabel == null) {
			jLabel = new JLabel();
			jLabel.setText("Convênio :");
			jLabel.setBounds(new Rectangle(5, 71, 73, 20));
		}
		return jLabel;
	}


	/**
	 * This method initializes jTextFieldVeiculo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldVeiculo() {
		if (jTextFieldVeiculo == null) {
			jTextFieldVeiculo = new JTextField(75);
			jTextFieldVeiculo.setBounds(new Rectangle(79, 115, 197, 20));
			jTextFieldVeiculo.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldVeiculo.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldVeiculo;
	}
	
	
				
		
			
	
	

}
