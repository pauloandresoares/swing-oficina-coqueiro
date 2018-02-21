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
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

import daoJdbc.ItensDAO;
import dto.DadosCliente;
import dto.DadosConvenio;
import dto.DadosDescricaoDePecas;
import dto.DadosEstoque;
import dto.DadosFornecedor;
import dto.DadosFuncionarios;
import dto.DadosItem;
import dto.DadosOrdemDeServico;
import dto.DadosPecas;


import facade.ClienteFacade;
import facade.ConvenioFacade;
import facade.DiscricaoFacade;
import facade.EstoqueFacade;
import facade.FuncionarioFacade;
import facade.ItensFacade;
import facade.OSFacade;
import facade.PecasFacade;

import javax.swing.JDesktopPane;
import javax.swing.JRadioButton;

import util.Conexao;
import net.sf.nachocalendar.components.DateField;
import javax.swing.JTable;



public class OrdemDeServico extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelResultado = null;
	private JPanel jContentPane = null;
	private JButton jButtonCancel = null;
	
	private DefaultListModel modelo = null;
	private DefaultTableModel dtm = null;
	private int abre = 0;

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
	

	private JPanel jPanel1 = null;

	
	private JPanel jpanel2;
	private JButton jButtonOk =  null;
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

	private JTextField jTextFieldChassis = null;

	private JLabel jLabel1Chassis = null;

	private JTextField jTextFieldKm = null;

	private JLabel jLabelKm = null;

	private JComboBox jComboBoxTecnico = null;

	private JLabel jLabelTecnico = null;

	private JPanel jPanelItems = null;

	private JPanel jPanelTipo = null;

	private JComboBox jComboBoxtipo = null;

	private JLabel jLabelCodigo = null;

	private JTextField jTextFieldCodigoItem = null;

	private JTextField jTextFieldQHoras = null;

	private JLabel jLabel1 = null;

	private JTextField jTextFieldValorUnitario = null;

	private JComboBox jComboBoxEstoque = null;

	private JLabel jLabelQuantidade = null;

	private JFormattedTextField jTextFieldValorTotal = null;

	private JFormattedTextField jTextFieldCustoTotal = null;

	private JLabel jLabelValorTotal = null;

	private JLabel jLabelCustoTotal = null;

	private JTextField jTextFieldISS = null;

	private JLabel jLabelIss = null;

	private JLabel jLabelICMS = null;

	private JTextField jTextFieldICMS = null;

	private JLabel jLabelIPI = null;

	private JTextField jTextFieldIPI = null;

	private JButton jButtonPrimeiro = null;

	private JButton jButtonAnterior = null;

	private JButton jButtonProximo = null;

	private JButton jButtonUltimo = null;

	private JButton jButtonIncluir = null;

	private JButton jButtonAlterar = null;

	private JButton jButtonExcluir = null;

	private JLabel jLabelAbertura = null;

	private JTextField jTextFieldISS2 = null;

	private JTextField jTextFieldICMS2 = null;

	private JTextField jTextFieldIPI2 = null;

	private JLabel jLabelFechamento = null;

	private JLabel jLabelISS = null;

	private JLabel jLabelICMS2 = null;

	private JLabel jLabelIPI2 = null;

	private JTextField jTextFieldCustoMaoDeObra = null;

	private JTextField jTextFieldCustoPecas = null;

	private JTextField jTextFieldHoras = null;

	private JFormattedTextField jTextFieldCustoTotal2 = null;

	private JLabel jLabelCustoMaoDeObra = null;

	private JLabel jLabelCustoPecas = null;

	private JLabel jLabelHoras = null;

	private JLabel jLabelCustoTotal2 = null;

	private JTextField jTextFieldValorMaoDeObra = null;

	private JLabel jLabelValorMaoDeObra = null;

	private JTextField jTextFieldValorPecas = null;

	private JLabel jLabelValorPecas = null;

	private JLabel jLabelMatconsumo = null;

	private JTextField jTextFieldDesconto = null;

	private JTextField jTextFieldConsumo = null;

	private JLabel jLabelDesconto = null;

	private JLabel jLabelpor = null;

	private JFormattedTextField jTextFieldValorTotal2 = null;

	private JLabel jLabelValorTotal2 = null;

	private JTextField jTextFieldNumeroDeParcelas = null;

	private JLabel jLabelNumeroDeParcelas = null;

	private JTextField jTextFieldPrimeira = null;

	private JLabel jLabelPrimeira = null;

	private JLabel jLabelPerc2 = null;

	private JTextField jTextFieldValorParcela = null;

	private JLabel jLabelValorParcela = null;

	private JLabel jLabelValorPagamento = null;

	private JTextField jTextFieldFormaDePagamento = null;

	private JLabel jLabelRessalvas = null;

	private JTextArea jTextAreaRessalvas = null;

	private JTextField jTextFieldCodigo = null;

	private JLabel jLabelCodigo1 = null;

	private JButton jButtonExcluirLista = null;

	private DateField dateFieldAbertura = null;

	private DateField dateField = null;

	private JScrollPane jScrollPane = null;

	private JScrollPane jScrollPane1 = null;

	private JScrollPane jScrollPane2 = null;

	private JTable jTable = null;
	private JPanel jPanel2 = null;
	private JLabel jLabel2Data1 = null;
	private JLabel jLabelFechamento2 = null;
	private JButton jButton9 = null;
	private JPanel jPanel3 = null;
	private JButton jButton10 = null;
	private JTextField jTextFieldNome = null;
	private JTextField jTextFieldCodigo3 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private DateField dateFieldFinal = null;
	private DateField dateFieldInicial = null;
	private int NomeCodigo = 0;
	private JButton jButtonLimpar = null;
	public OrdemDeServico() {
		super();
		initialize();
		
		
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar/Emitir - Ordem de Fornecimento");
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
		
		pegarClientes();
		pegarTecnico();
		pegarEstoque();
		pegarConvenio();
		
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
			jLabelQueixas.setBounds(new Rectangle(7, 129, 63, 19));
			jLabelQueixas.setText("Queixas :");
			jLabelCotacao = new JLabel();
			jLabelCotacao.setBounds(new Rectangle(510, 12, 63, 19));
			jLabelCotacao.setText("Cotação :");
			jLabelPrisma = new JLabel();
			jLabelPrisma.setBounds(new Rectangle(378, 12, 54, 19));
			jLabelPrisma.setText("Prisma:");
			jLabelCPFCGC = new JLabel();
			jLabelCPFCGC.setBounds(new Rectangle(6, 36, 107, 19));
			jLabelCPFCGC.setText("Numero de Serie :");
			jLabelOrcamento = new JLabel();
			jLabelOrcamento.setBounds(new Rectangle(189, 11, 78, 22));
			jLabelOrcamento.setText("Orçamento :");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
						
			jContentPane.add(getJPanel(), null);
			
			jContentPane.add(getJPanel1(), null);
			
		}
		return jContentPane;
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
	/**
	 * This method initializes jTextFieldOrcamento	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldOrcamento() {
		if (jTextFieldOrcamento == null) {
			jTextFieldOrcamento = new JTextField(8);
			jTextFieldOrcamento.setBounds(new Rectangle(269, 12, 104, 21));
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
			jComboBoxConvennio.setBounds(new Rectangle(168, 59, 479, 19));
			jComboBoxConvennio.setToolTipText("Selecione Aqui o convênio");
			jComboBoxConvennio.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					DadosConvenio convenio = new DadosConvenio();
					ConvenioFacade facade = new ConvenioFacade();
						String item = getJComboBoxConvennio().getSelectedItem().toString();
						convenio.setConvenioNome(item);
						facade.pesquisaNome(convenio);
						getJTextFieldConvenio().setText(""+convenio.getConvenioCodigo());
				}
			});
			
			
			
		
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
			jTextFieldNumeroDeSerie.setBounds(new Rectangle(118, 36, 110, 20));
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
			jTextFieldPrisma.setBounds(new Rectangle(435, 11, 74, 21));
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
			jComboBoxCliente.setBounds(new Rectangle(168, 81, 479, 20));
			jComboBoxCliente.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
				 String item = getJComboBoxCliente().getSelectedItem().toString();
				 
				 DadosCliente cliente = new DadosCliente();
				 ClienteFacade facade = new ClienteFacade();
				 cliente.setClienteNome(item);
				 facade.pesquisaNomeJlist(cliente);
				 getJTextFieldCliente().setText(""+cliente.getClienteCodigo());
				
				}
			});
			
			
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
					if (!(getJTextFieldCodigo().getText()).equals("")){
						DadosOrdemDeServico os = new DadosOrdemDeServico();
						OSFacade facade = new OSFacade();

						int resposta = JOptionPane.showConfirmDialog(null,"Você deseja deletar esse registro ? ");
						
						if (resposta== 0){ 
						  os.setCodigo(Integer.parseInt(getJTextFieldCodigo().getText()));
						  facade.excluir(os);
						}else{
							JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'Lista' o registro, seleciona-lo para poder exclui-lo em seguida. ");
						}
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
					String valorCliente = "Escolha aqui o Cliente";
					
					String nada = "";
					if((!valorCliente.equals((String) getJComboBoxCliente().getSelectedItem())) && (!nada.equals(getJTextFieldPlaca().getText())) && (!nada.equals(getJTextFieldVeiculo().getText()))){
							if ((getJTextFieldCodigo().getText()).equals(nada)){
								try{
										DadosOrdemDeServico os = new DadosOrdemDeServico();
										OSFacade facade = new OSFacade();
										
									    if(!(getJTextFieldOrcamento().getText()).equals("")) os.setOrcamento(Integer.parseInt(getJTextFieldOrcamento().getText()));
										os.setPrisma(getJTextFieldPrisma().getText());
										os.setCotacao(getJTextFieldCotacao().getText());
										os.setNumeroDeSerie(getJTextFieldNumeroDeSerie().getText());
										os.setPlaca(getJTextFieldPlaca().getText());
										os.setChassis(getJTextFieldChassis().getText());
										os.setTipoDeOS(getJTextFieldTipoDeOs().getText());
										os.setConvenio(getJComboBoxConvennio().getSelectedItem().toString());
										os.setCliente(getJComboBoxCliente().getSelectedItem().toString());
										os.setVeiculo(getJTextFieldVeiculo().getText());
										os.setKm(getJTextFieldKm().getText());
										os.setTecnico(getJComboBoxTecnico().getSelectedItem().toString());
										os.setQueixas(getJTextAreaQueixas().getText());
										SimpleDateFormat formatoBanco = new SimpleDateFormat("dd/MM/yyyy");
										java.util.Date data2 = (java.util.Date) getDateFieldAbertura().getValue();
										
										String formatada = formatoBanco.format(data2);
										
										String data [] = formatada.split("/");
										int ano = Integer.parseInt(data[2])-1900;
										int mes = Integer.parseInt(data[1])-1;
										int dia = Integer.parseInt(data[0]);
										Date dataAbertura = new Date(ano, mes, dia);
																				
										os.setAbertura(dataAbertura);
										
										java.util.Date data3 = (java.util.Date) getDateField().getValue();
										String formatada2 = formatoBanco.format(data3);
										
										String data4 [] = formatada2.split("/");
										int ano2 = Integer.parseInt(data4[2])-1900;
										int mes2 = Integer.parseInt(data4[1])-1;
										int dia2 = Integer.parseInt(data4[0]);
										Date dataFechamento = new Date(ano2, mes2, dia2);
																				
										os.setFechamento(dataFechamento);
										
										os.setIss(getJTextFieldISS2().getText());
									    os.setIcms(getJTextFieldICMS2().getText());
										os.setIpi(getJTextFieldIPI2().getText());
										os.setCustoMaoDeObra(getJTextFieldCustoMaoDeObra().getText());
										os.setCustoPecas(getJTextFieldCustoPecas().getText());
										os.setHoras(getJTextFieldHoras().getText());
										
										String text = 	getJTextFieldCustoTotal2().getText();
										String valorPecoAquisicao = text.replaceAll( ",", "." );
										
										os.setCustoTotal(Float.parseFloat(valorPecoAquisicao));
										os.setValorMaoDeObra(getJTextFieldValorMaoDeObra().getText());
										os.setValorPecas(getJTextFieldValorPecas().getText());
										os.setMaterialDeConsulmo(getJTextFieldConsumo().getText());
										os.setDesconto(getJTextFieldDesconto().getText());
										
										text = 	getJTextFieldValorTotal2().getText();
										String valorTotal = text.replaceAll( ",", "." );
										
									    os.setValorTotal(Float.parseFloat(valorTotal));
									    os.setNumeroDeParcelas(getJTextFieldNumeroDeParcelas().getText());
									    os.setPrimeira(getJTextFieldNumeroDeParcelas().getText());
									    os.setValorDasParcelas(getJTextFieldValorParcela().getText());
									    os.setFormaDePagamento(getJTextFieldFormaDePagamento().getText());
									    os.setRessalvas(getJTextAreaRessalvas().getText());
									    facade.incluir(os);
									    facade.ultimo(os);
									     JOptionPane.showMessageDialog(null, "O codigo da Ordem de Serviço foi : "+os.getCodigo());
									
								}catch(NumberFormatException e2){
									
								}								
									
									
									
									
								}else{  JOptionPane.showMessageDialog(null, "O registro não pode ser inserido, ele já existe!");}
						}else{
						JOptionPane.showMessageDialog(null, "Informe os campos obrigatórios. ");
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
						//mostrarValores(cliente);
						
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
						//mostrarValores(cliente);
						
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
					//mostrarValores(cliente);
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
			jTextAreaQueixas.setBounds(new Rectangle(72, 129, 577, 56));
			jTextAreaQueixas.setBackground(new Color(238, 238, 238));
			jTextAreaQueixas.setToolTipText("Observaçoes sobre o cliente.");
			jTextAreaQueixas.setRows(3);
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
					String valor = getJComboBoxCliente().getSelectedItem().toString();
					if ((!(getJTextFieldCodigo().getText()).equals("")) && (!valor.equals(""))){
						DadosOrdemDeServico os = new DadosOrdemDeServico();
						OSFacade facade = new OSFacade();
						os.setPrisma(getJTextFieldPrisma().getText());
						os.setCotacao(getJTextFieldCotacao().getText());
						os.setNumeroDeSerie(getJTextFieldNumeroDeSerie().getText());
						os.setPlaca(getJTextFieldPlaca().getText());
						os.setChassis(getJTextFieldChassis().getText());
						os.setTipoDeOS(getJTextFieldTipoDeOs().getText());
						os.setConvenio(getJComboBoxConvennio().getSelectedItem().toString());
						os.setCliente(getJComboBoxCliente().getSelectedItem().toString());
						os.setVeiculo(getJTextFieldVeiculo().getText());
						os.setKm(getJTextFieldKm().getText());
						os.setTecnico(getJComboBoxTecnico().getSelectedItem().toString());
						os.setQueixas(getJTextAreaQueixas().getText());
						SimpleDateFormat formatoBanco = new SimpleDateFormat("dd/MM/yyyy");
						java.util.Date data2 = (java.util.Date) getDateFieldAbertura().getValue();
						
						String formatada = formatoBanco.format(data2);
						
						String data [] = formatada.split("/");
						int ano = Integer.parseInt(data[2])-1900;
						int mes = Integer.parseInt(data[1])-1;
						int dia = Integer.parseInt(data[0]);
						Date dataAbertura = new Date(ano, mes, dia);
																
						os.setAbertura(dataAbertura);
						
						java.util.Date data3 = (java.util.Date) getDateField().getValue();
						String formatada2 = formatoBanco.format(data3);
						
						String data4 [] = formatada2.split("/");
						int ano2 = Integer.parseInt(data4[2])-1900;
						int mes2 = Integer.parseInt(data4[1])-1;
						int dia2 = Integer.parseInt(data4[0]);
						Date dataFechamento = new Date(ano2, mes2, dia2);
																
						os.setFechamento(dataFechamento);
						
						os.setIss(getJTextFieldISS2().getText());
					    os.setIcms(getJTextFieldICMS2().getText());
						os.setIpi(getJTextFieldIPI2().getText());
						os.setCustoMaoDeObra(getJTextFieldCustoMaoDeObra().getText());
						os.setCustoPecas(getJTextFieldCustoPecas().getText());
						os.setHoras(getJTextFieldHoras().getText());
						
						String text = 	getJTextFieldCustoTotal().getText();
						String valorPecoAquisicao = text.replaceAll( ",", "." );
						
						os.setCustoTotal(Float.parseFloat(valorPecoAquisicao));
						os.setValorMaoDeObra(getJTextFieldValorMaoDeObra().getText());
						os.setValorPecas(getJTextFieldValorPecas().getText());
						os.setMaterialDeConsulmo(getJTextFieldConsumo().getText());
						os.setDesconto(getJTextFieldDesconto().getText());
						
						text = 	getJTextFieldValorTotal().getText();
						String valorTotal = text.replaceAll( ",", "." );
						
					    os.setValorTotal(Float.parseFloat(valorTotal));
					    os.setNumeroDeParcelas(getJTextFieldNumeroDeParcelas().getText());
					    os.setPrimeira(getJTextFieldNumeroDeParcelas().getText());
					    os.setValorDasParcelas(getJTextFieldValorParcela().getText());
					    os.setFormaDePagamento(getJTextFieldFormaDePagamento().getText());
					    os.setRessalvas(getJTextAreaRessalvas().getText());
					    os.setCodigo(Integer.parseInt(getJTextFieldCodigo().getText()));
					    facade.alterar(os);
						
						
					}else{
						JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'listar' o registro, seleciona-lo para poder altera-lo em seguida. ");
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
			jButton6.setText("Listar");
			jButton6.setIcon(consulta);
			jButton6.setToolTipText("Consultar");
			jButton6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					limpar();
					getJPanel1().setBounds(new Rectangle(0, 560, 790, 515));
					getJPanel1().setVisible(false);
					
					getJContentPane().add(getJpanel2(),null);
					
					
					
					if(abre > 0){
					
					getJpanel2().add(getJButtonOk(),null);
					getJpanel2().add(getJButtonCancel(),null);
					
					jLabelResultado = new JLabel();
					jLabelResultado.setBounds(new Rectangle(19, 3, 99, 20));
					jLabelResultado.setText("Lista de peças :");
					getJpanel2().add(getJScrollPane2(),null);
					
					getJpanel2().add(jLabelResultado, null);
					
					getJpanel2().add(getJButtonExcluirLista(),null);
					getJpanel2().add(getJPanel2(), null);
					getJpanel2().add(getJPanel3(), null);
					dtm.setNumRows(0);
					pegarLista();
					}else{
						pegarLista();
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
		
		 getJComboBoxConvennio().setSelectedIndex(0);
		 getJTextFieldNumeroDeSerie().setText("");
		 
		 getJTextAreaQueixas().setText("");
		 
		 getJComboBoxCliente().setSelectedIndex(0);
		 
		 
		 
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
			jLabelCodigo1 = new JLabel();
			jLabelCodigo1.setBounds(new Rectangle(7, 12, 56, 20));
			jLabelCodigo1.setText("Código :");
			jLabelRessalvas = new JLabel();
			jLabelRessalvas.setBounds(new Rectangle(7, 463, 78, 16));
			jLabelRessalvas.setText("Ressalvas :");
			jLabelValorPagamento = new JLabel();
			jLabelValorPagamento.setBounds(new Rectangle(469, 439, 130, 20));
			jLabelValorPagamento.setText("Forma de pagamento :");
			jLabelValorParcela = new JLabel();
			jLabelValorParcela.setBounds(new Rectangle(256, 439, 122, 20));
			jLabelValorParcela.setText("Valor das parcelas :");
			jLabelPerc2 = new JLabel();
			jLabelPerc2.setBounds(new Rectangle(229, 439, 20, 21));
			jLabelPerc2.setText("%");
			jLabelPrimeira = new JLabel();
			jLabelPrimeira.setBounds(new Rectangle(128, 441, 55, 18));
			jLabelPrimeira.setText("Primeira");
			jLabelNumeroDeParcelas = new JLabel();
			jLabelNumeroDeParcelas.setBounds(new Rectangle(7, 441, 91, 20));
			jLabelNumeroDeParcelas.setText("N. de parcelas :");
			jLabelValorTotal2 = new JLabel();
			jLabelValorTotal2.setBounds(new Rectangle(7, 418, 75, 21));
			jLabelValorTotal2.setText("Valor total :");
			jLabelpor = new JLabel();
			jLabelpor.setBounds(new Rectangle(708, 391, 16, 22));
			jLabelpor.setText("%");
			jLabelDesconto = new JLabel();
			jLabelDesconto.setBounds(new Rectangle(604, 392, 64, 20));
			jLabelDesconto.setText("Desconto :");
			jLabelMatconsumo = new JLabel();
			jLabelMatconsumo.setBounds(new Rectangle(424, 393, 95, 22));
			jLabelMatconsumo.setText("Mat. consumo :");
			jLabelValorPecas = new JLabel();
			jLabelValorPecas.setBounds(new Rectangle(235, 394, 85, 21));
			jLabelValorPecas.setText("Valor peças :");
			jLabelValorMaoDeObra = new JLabel();
			jLabelValorMaoDeObra.setBounds(new Rectangle(6, 395, 120, 21));
			jLabelValorMaoDeObra.setText("Valor mão de obra :");
			jLabelCustoTotal2 = new JLabel();
			jLabelCustoTotal2.setBounds(new Rectangle(513, 370, 73, 21));
			jLabelCustoTotal2.setText("Custo total :");
			jLabelHoras = new JLabel();
			jLabelHoras.setBounds(new Rectangle(424, 371, 43, 19));
			jLabelHoras.setText("Horas :");
			jLabelCustoPecas = new JLabel();
			jLabelCustoPecas.setBounds(new Rectangle(236, 372, 81, 18));
			jLabelCustoPecas.setText("Custo peças :");
			jLabelCustoMaoDeObra = new JLabel();
			jLabelCustoMaoDeObra.setBounds(new Rectangle(7, 370, 120, 21));
			jLabelCustoMaoDeObra.setText("Custo mão de obra :");
			jLabelIPI2 = new JLabel();
			jLabelIPI2.setBounds(new Rectangle(577, 344, 26, 19));
			jLabelIPI2.setText("IPI.:");
			jLabelICMS2 = new JLabel();
			jLabelICMS2.setBounds(new Rectangle(451, 344, 39, 19));
			jLabelICMS2.setText("ICMS.:");
			jLabelISS = new JLabel();
			jLabelISS.setBounds(new Rectangle(330, 345, 33, 18));
			jLabelISS.setText("ISS.:");
			jLabelFechamento = new JLabel();
			jLabelFechamento.setBounds(new Rectangle(158, 343, 80, 23));
			jLabelFechamento.setText("Fechamento :");
			jLabelAbertura = new JLabel();
			jLabelAbertura.setBounds(new Rectangle(7, 345, 62, 20));
			jLabelAbertura.setText("Abertura :");
			jLabelTecnico = new JLabel();
			jLabelTecnico.setBounds(new Rectangle(405, 105, 53, 20));
			jLabelTecnico.setText("Tecnico :" );
			jLabelKm = new JLabel();
			jLabelKm.setBounds(new Rectangle(280, 105, 25, 20));
			jLabelKm.setText("km");
			jLabel1Chassis = new JLabel();
			jLabel1Chassis.setBounds(new Rectangle(374, 37, 55, 16));
			jLabel1Chassis.setText("Chassis :");
			jLabelVeiculo = new JLabel();
			jLabelVeiculo.setBounds(new Rectangle(7, 104, 68, 20));
			jLabelVeiculo.setText("Veiculo :");
			jLabelCliente = new JLabel();
			jLabelCliente.setBounds(new Rectangle(6, 82, 71, 19));
			jLabelCliente.setText("Cliente :");
			jLabelPlaca = new JLabel();
			jLabelPlaca.setBounds(new Rectangle(232, 36, 47, 19));
			jLabelPlaca.setText("Placa :");
			jLabelTipo = new JLabel();
			jLabelTipo.setBounds(new Rectangle(582, 38, 74, 16));
			jLabelTipo.setText("Tipo de OS :");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBackground(Color.white);
			jPanel1.setBounds(new Rectangle(0, 48, 790, 515));
			jPanel1.add(getJTextFieldOrcamento(), null);
			jPanel1.add(jLabelOrcamento, null);
			jPanel1.add(getJComboBoxConvennio(), null);
			jPanel1.add(getJTextFieldNumeroDeSerie(), null);
			jPanel1.add(jLabelCPFCGC, null);
			jPanel1.add(jLabelPrisma, null);
			jPanel1.add(getJTextFieldPrisma(), null);
			jPanel1.add(jLabelCotacao, null);
			jPanel1.add(getJComboBoxCliente(), null);
			
			jPanel1.add(jLabelQueixas, null);
			
			
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
			jPanel1.add(getJTextFieldChassis(), null);
			jPanel1.add(jLabel1Chassis, null);
			jPanel1.add(getJTextFieldKm(), null);
			jPanel1.add(jLabelKm, null);
			jPanel1.add(getJComboBoxTecnico(), null);
			jPanel1.add(jLabelTecnico, null);
			jPanel1.add(getJPanelItems(), null);
			jPanel1.add(jLabelAbertura, null);
			jPanel1.add(getJTextFieldISS2(), null);
			jPanel1.add(getJTextFieldICMS2(), null);
			jPanel1.add(getJTextFieldIPI2(), null);
			jPanel1.add(jLabelFechamento, null);
			jPanel1.add(jLabelISS, null);
			jPanel1.add(jLabelICMS2, null);
			jPanel1.add(jLabelIPI2, null);
			jPanel1.add(getJTextFieldCustoMaoDeObra(), null);
			jPanel1.add(getJTextFieldCustoPecas(), null);
			jPanel1.add(getJTextFieldHoras(), null);
			jPanel1.add(getJTextFieldCustoTotal2(), null);
			jPanel1.add(jLabelCustoMaoDeObra, null);
			jPanel1.add(jLabelCustoPecas, null);
			jPanel1.add(jLabelHoras, null);
			jPanel1.add(jLabelCustoTotal2, null);
			jPanel1.add(getJTextFieldValorMaoDeObra(), null);
			jPanel1.add(jLabelValorMaoDeObra, null);
			jPanel1.add(getJTextFieldValorPecas(), null);
			jPanel1.add(jLabelValorPecas, null);
			jPanel1.add(jLabelMatconsumo, null);
			jPanel1.add(getJTextFieldDesconto(), null);
			jPanel1.add(getJTextFieldConsumo(), null);
			jPanel1.add(jLabelDesconto, null);
			jPanel1.add(jLabelpor, null);
			jPanel1.add(getJTextFieldValorTotal2(), null);
			jPanel1.add(jLabelValorTotal2, null);
			jPanel1.add(getJTextFieldNumeroDeParcelas(), null);
			jPanel1.add(jLabelNumeroDeParcelas, null);
			jPanel1.add(getJTextFieldPrimeira(), null);
			jPanel1.add(jLabelPrimeira, null);
			jPanel1.add(jLabelPerc2, null);
			jPanel1.add(getJTextFieldValorParcela(), null);
			jPanel1.add(jLabelValorParcela, null);
			jPanel1.add(jLabelValorPagamento, null);
			jPanel1.add(getJTextFieldFormaDePagamento(), null);
			jPanel1.add(jLabelRessalvas, null);
			
			jPanel1.add(getJTextFieldCodigo(), null);
			jPanel1.add(jLabelCodigo1, null);
			jPanel1.add(getDateFieldAbertura(), null);
			jPanel1.add(getDateField(), null);
			jPanel1.add(getJScrollPane(), null);
			jPanel1.add(getJScrollPane1(), null);
			
		}
		return jPanel1;
	}
	
	
	public JPanel getJpanel2(){
		if(jpanel2 ==null){
			jpanel2= new JPanel();
			jpanel2.setLayout(null);
			jpanel2.setBackground(Color.WHITE);
			jpanel2.setBounds(new Rectangle(0, 51, 790, 515));
			jpanel2.add(getJButtonOk(),null);
			jpanel2.add(getJButtonCancel(),null);
			jpanel2.add(getJButtonExcluirLista(), null);
			jpanel2.add(getJScrollPane2(), null);
			jpanel2.add(getJPanel2(), null);
			jpanel2.add(getJPanel3(), null);
			
			
			jpanel2.add(getJScrollPane2(),null);
			
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
			jButtonOk.setBounds(new Rectangle(667, 13, 52, 52));
			jButtonOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosOrdemDeServico os = new DadosOrdemDeServico();
					OSFacade facade = new OSFacade();
					
					int l = getJTable().getSelectedRow();
					if(l<0){
						JOptionPane.showMessageDialog(null, "Primeiro, selecione um valor na Tabela");
						
					}else{
					String codigo = ""+getJTable().getValueAt(l, 4);
										
					os.setCodigo(Integer.parseInt(codigo));
					
					facade.pesquisaCodigo(os);
					mostrarValores(os);
		            
					getJpanel2().removeAll();
					getJPanel1().setVisible(true);
		             	subir();
		             	abre++;
		             	
					} }}	

				
			);
		}
		return jButtonOk;
	}
	private JButton getJButtonCancel() {
		if (jButtonCancel == null) {
			jButtonCancel = new JButton();
			jButtonCancel.setBackground(Color.white);
			Icon image2 = new ImageIcon("imagens/negado.gif");
			jButtonCancel.setIcon(image2);
			jButtonCancel.setBounds(new Rectangle(723, 13, 52, 52));
			jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					getJPanel1().setVisible(true);
					subir();
					getJpanel2().removeAll();
					abre++;
					
					
					
								
					
													
				}
			});
		}
		return jButtonCancel;
	}
	public void subir (){
		
		
		getJPanel1().setBounds(new Rectangle(0, 48, 790, 515));
		
		
		
			
	}
	public void mostrarValores(DadosOrdemDeServico os){
		
			getJTextFieldCodigo().setText(""+os.getCodigo());
		    getJTextFieldOrcamento().setText(""+os.getOrcamento());
			getJTextFieldPrisma().setText(os.getPrisma());
			getJTextFieldCotacao().setText(os.getCotacao());
			getJTextFieldNumeroDeSerie().setText(os.getNumeroDeSerie());
			getJTextFieldPlaca().setText(os.getPlaca());
			getJTextFieldChassis().setText(os.getChassis());
			getJTextFieldTipoDeOs().setText(os.getTipoDeOS());
			getJComboBoxConvennio().setSelectedItem(os.getConvenio());
			getJComboBoxCliente().setSelectedItem(os.getCliente());
			getJTextFieldVeiculo().setText(os.getVeiculo());
			getJTextFieldKm().setText(os.getKm());
			getJComboBoxTecnico().setSelectedItem(os.getTecnico());
			getJTextAreaQueixas().setText(os.getQueixas());
			
			java.sql.Date data = os.getAbertura();
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			String dataData = formato.format(data);
			
			getDateFieldAbertura().setValue(dataData);
			
			java.sql.Date data1 = os.getFechamento();
			
			SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
			String dataData1 = formato.format(data1);
		
			getDateField().setValue(dataData1);
			
			getJTextFieldISS2().setText(os.getIss());
			getJTextFieldICMS2().setText(os.getIcms());
			getJTextFieldIPI2().setText(os.getIpi());
			getJTextFieldCustoMaoDeObra().setText(os.getCustoMaoDeObra());
			getJTextFieldCustoPecas().setText(os.getCustoPecas());
			getJTextFieldHoras().setText(os.getHoras());
			getJTextFieldCustoTotal2().setText(""+os.getCustoTotal());
			getJTextFieldValorMaoDeObra().setText(os.getValorMaoDeObra());
			getJTextFieldValorPecas().setText(os.getValorPecas());
			getJTextFieldConsumo().setText(os.getMaterialDeConsulmo());
			getJTextFieldDesconto().setText(os.getDesconto());
		    getJTextFieldValorTotal2().setText(""+os.getValorTotal());
		    getJTextFieldNumeroDeParcelas().setText(os.getNumeroDeParcelas());
		    getJTextFieldPrimeira().setText(os.getPrimeira());
		    getJTextFieldValorParcela().setText(os.getValorDasParcelas());
		    getJTextFieldFormaDePagamento().setText(os.getFormaDePagamento());
		    getJTextAreaRessalvas().setText(os.getRessalvas());
	
	}
	
	
	


	/**
	 * This method initializes jTextFieldCotacao	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCotacao() {
		if (jTextFieldCotacao == null) {
			jTextFieldCotacao = new JTextField(75);
			jTextFieldCotacao.setBounds(new Rectangle(579, 11, 71, 21));
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
			jTextFieldTipoDeOs.setBounds(new Rectangle(659, 37, 120, 20));
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
			jTextFieldPlaca.setBounds(new Rectangle(282, 36, 89, 20));
			
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
			jTextFieldConvenio.setBounds(new Rectangle(79, 60, 84, 20));
			jTextFieldConvenio.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldConvenio.setEditable(false);
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
			jTextFieldCliente.setBounds(new Rectangle(79, 81, 84, 20));
			
			jTextFieldCliente.setEditable(false);
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
			jLabel.setBounds(new Rectangle(6, 59, 73, 20));
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
			jTextFieldVeiculo.setBounds(new Rectangle(79, 105, 197, 20));
			jTextFieldVeiculo.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldVeiculo.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldVeiculo;
	}


	/**
	 * This method initializes jTextFieldChassis	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldChassis() {
		if (jTextFieldChassis == null) {
			jTextFieldChassis = new JTextField(75);
			jTextFieldChassis.setBounds(new Rectangle(433, 36, 143, 20));
			jTextFieldChassis.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldChassis.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldChassis;
	}


	/**
	 * This method initializes jTextFieldKm	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldKm() {
		if (jTextFieldKm == null) {
			jTextFieldKm = new JTextField(75);
			jTextFieldKm.setBounds(new Rectangle(308, 105, 93, 20));
			jTextFieldKm.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldKm.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldKm;
	}


	/**
	 * This method initializes jComboBoxTecnico	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxTecnico() {
		if (jComboBoxTecnico == null) {
			jComboBoxTecnico = new JComboBox();
			jComboBoxTecnico.setBounds(new Rectangle(468, 105, 178, 20));
		}
		return jComboBoxTecnico;
	}


	/**
	 * This method initializes jPanelItems	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelItems() {
		if (jPanelItems == null) {
			jLabelIPI = new JLabel();
			jLabelIPI.setBounds(new Rectangle(281, 76, 29, 19));
			jLabelIPI.setText("IPI.:");
			jLabelICMS = new JLabel();
			jLabelICMS.setBounds(new Rectangle(148, 75, 42, 21));
			jLabelICMS.setText("ICMS.:");
			jLabelIss = new JLabel();
			jLabelIss.setBounds(new Rectangle(15, 77, 43, 19));
			jLabelIss.setText("ISS.:");
			jLabelCustoTotal = new JLabel();
			jLabelCustoTotal.setBounds(new Rectangle(480, 53, 75, 20));
			jLabelCustoTotal.setText("Custo total :");
			jLabelValorTotal = new JLabel();
			jLabelValorTotal.setBounds(new Rectangle(327, 53, 72, 19));
			jLabelValorTotal.setText(" Valor total :");
			jLabelQuantidade = new JLabel();
			jLabelQuantidade.setBounds(new Rectangle(15, 54, 76, 20));
			jLabelQuantidade.setText("Quantidade :");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(148, 54, 88, 18));
			jLabel1.setText(" Valor unitário :");
			jLabelCodigo = new JLabel();
			jLabelCodigo.setBounds(new Rectangle(128, 28, 54, 22));
			jLabelCodigo.setText("Codigo :");
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridy = 0;
			jPanelItems = new JPanel();
			jPanelItems.setLayout(null);
			jPanelItems.setBackground(Color.white);
			jPanelItems.setBounds(new Rectangle(17, 191, 752, 133));
			jPanelItems.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Item"),BorderFactory.createEmptyBorder(5,5,5,5)));
			jPanelItems.setEnabled(true);
			jPanelItems.add(getJPanelTipo(), gridBagConstraints1);
			jPanelItems.add(getJComboBoxtipo(), null);
			jPanelItems.add(jLabelCodigo, null);
			jPanelItems.add(getJTextFieldCodigoItem(), null);
			jPanelItems.add(getJTextFieldQHoras(), null);
			jPanelItems.add(jLabel1, null);
			jPanelItems.add(getJTextFieldValorUnitario(), null);
			jPanelItems.add(getJComboBoxEstoque(), null);
			jPanelItems.add(jLabelQuantidade, null);
			jPanelItems.add(getJTextFieldValorTotal(), null);
			jPanelItems.add(getJTextFieldCustoTotal(), null);
			jPanelItems.add(jLabelValorTotal, null);
			jPanelItems.add(jLabelCustoTotal, null);
			jPanelItems.add(getJTextFieldISS(), null);
			jPanelItems.add(jLabelIss, null);
			jPanelItems.add(jLabelICMS, null);
			jPanelItems.add(getJTextFieldICMS(), null);
			jPanelItems.add(jLabelIPI, null);
			jPanelItems.add(getJTextFieldIPI(), null);
			jPanelItems.add(getJButtonPrimeiro(), null);
			jPanelItems.add(getJButtonAnterior(), null);
			jPanelItems.add(getJButtonProximo(), null);
			jPanelItems.add(getJButtonUltimo(), null);
			jPanelItems.add(getJButtonIncluir(), null);
			jPanelItems.add(getJButtonAlterar(), null);
			jPanelItems.add(getJButtonExcluir(), null);
			jPanelItems.add(getJButtonLimpar(), null);
		}
		return jPanelItems;
	}


	/**
	 * This method initializes jPanelTipo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelTipo() {
		if (jPanelTipo == null) {
			jPanelTipo = new JPanel();
			jPanelTipo.setLayout(null);
			jPanelTipo.setBackground(Color.white);
			jPanelTipo.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Tipo"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		}
		return jPanelTipo;
	}


	/**
	 * This method initializes jComboBoxtipo	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxtipo() {
		if (jComboBoxtipo == null) {
			jComboBoxtipo = new JComboBox();
			jComboBoxtipo.setBounds(new Rectangle(14, 29, 107, 20));
			jComboBoxtipo.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					String item = getJComboBoxtipo().getSelectedItem().toString();
					String peca ="Peça";
					String servico ="Serviço";
					if(item.equals(peca)){
						
						jLabelQuantidade.setText("Quantidade");
					}
					if(item.equals(servico)){
						jLabelQuantidade.setText("Horas");
						
					}
					
					
				}
			});
			jComboBoxtipo.addItem("Peça");
			jComboBoxtipo.addItem("Serviço");
		}
		return jComboBoxtipo;
	}


	/**
	 * This method initializes jTextFieldCodigoItem	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodigoItem() {
		if (jTextFieldCodigoItem == null) {
			jTextFieldCodigoItem = new JTextField(75);
			jTextFieldCodigoItem.setBounds(new Rectangle(190, 29, 90, 20));
			jTextFieldCodigoItem.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldCodigoItem.setEditable(false);
			jTextFieldCodigoItem.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCodigoItem;
	}


	/**
	 * This method initializes jTextFieldQHoras	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldQHoras() {
		if (jTextFieldQHoras == null) {
			jTextFieldQHoras = new JTextField(75);
			jTextFieldQHoras.setBounds(new Rectangle(96, 54, 45, 20));
			jTextFieldQHoras.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldQHoras.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldQHoras;
	}


	/**
	 * This method initializes jTextFieldValorUnitario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldValorUnitario() {
		if (jTextFieldValorUnitario == null) {
			jTextFieldValorUnitario = new JTextField(75);
			jTextFieldValorUnitario.setBounds(new Rectangle(238, 53, 87, 20));
			jTextFieldValorUnitario.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldValorUnitario.setEditable(true);
			jTextFieldValorUnitario.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldValorUnitario;
	}


	/**
	 * This method initializes jComboBoxEstoque	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxEstoque() {
		if (jComboBoxEstoque == null) {
			jComboBoxEstoque = new JComboBox();
			jComboBoxEstoque.setBounds(new Rectangle(283, 29, 425, 20));
			jComboBoxEstoque.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					DadosEstoque estoque = new DadosEstoque();
					EstoqueFacade facade = new EstoqueFacade();
					String item = jComboBoxEstoque.getSelectedItem().toString();
					estoque.setEstoquePeca(item);
					facade.pesquisaNome(estoque);
					getJTextFieldCodigoItem().setText(""+estoque.getEstoqueCodigoDaAquisicao());
					
					
					if (estoque.getEstoquePreco()!=null)
					getJTextFieldValorUnitario().setText("R$"+estoque.getEstoquePreco());
					else getJTextFieldValorUnitario().setText("");
				}
			});
		}
		return jComboBoxEstoque;
	}


	/**
	 * This method initializes jTextFieldValorTotal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	
	public JFormattedTextField getJTextFieldValorTotal(){
		if(jTextFieldValorTotal==null){
			jTextFieldValorTotal = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("####.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldValorTotal.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldValorTotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldValorTotal.setBounds(new Rectangle(403, 53, 75, 20));
			jTextFieldValorTotal.setBackground(new Color(238, 238, 238));	
			jTextFieldValorTotal.setText("0");
			
			
		}
		
		return	jTextFieldValorTotal;
	
	}


	/**
	 * This method initializes jTextFieldCustoTotal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCustoTotal() {
		if(jTextFieldCustoTotal==null){
				jTextFieldCustoTotal = new JFormattedTextField();
				DecimalFormat decimal = new DecimalFormat("####.00");
				NumberFormatter numFormatter = new NumberFormatter(decimal);
				numFormatter.setFormat(decimal);
				numFormatter.setAllowsInvalid(false);
				jTextFieldCustoTotal.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
				jTextFieldCustoTotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
				jTextFieldCustoTotal.setBounds(new Rectangle(558, 53, 84, 20));
				jTextFieldCustoTotal.setBackground(new Color(238, 238, 238));
				jTextFieldCustoTotal.setText("0");
				
				
			}
			
			return	jTextFieldCustoTotal;
		
		}


	/**
	 * This method initializes jTextFieldISS	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldISS() {
		if (jTextFieldISS == null) {
			jTextFieldISS = new JTextField(75);
			jTextFieldISS.setBounds(new Rectangle(64, 77, 76, 20));
			jTextFieldISS.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldISS.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldISS;
	}


	/**
	 * This method initializes jTextFieldICMS	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldICMS() {
		if (jTextFieldICMS == null) {
			jTextFieldICMS = new JTextField(75);
			jTextFieldICMS.setBounds(new Rectangle(196, 76, 80, 20));
			jTextFieldICMS.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
			jTextFieldICMS.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldICMS;
	}


	/**
	 * This method initializes jTextFieldIPI	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIPI() {
		if (jTextFieldIPI == null) {
			jTextFieldIPI = new JTextField();
			jTextFieldIPI.setBounds(new Rectangle(317, 76, 81, 20));
			jTextFieldIPI.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldIPI;
	}


	/**
	 * This method initializes jButtonPrimeiro	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonPrimeiro() {
		if (jButtonPrimeiro == null) {
			jButtonPrimeiro = new JButton();
			jButtonPrimeiro.setBackground(Color.white);
			jButtonPrimeiro.setText("<<");
			jButtonPrimeiro.setBounds(new Rectangle(14, 100, 54, 24));
		}
		return jButtonPrimeiro;
	}


	/**
	 * This method initializes jButtonAnterior	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAnterior() {
		if (jButtonAnterior == null) {
			jButtonAnterior = new JButton();
			jButtonAnterior.setBounds(new Rectangle(71, 100, 54, 24));
			jButtonAnterior.setText("<");
			jButtonAnterior.setBackground(Color.white);
		}
		return jButtonAnterior;
	}


	/**
	 * This method initializes jButtonProximo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonProximo() {
		if (jButtonProximo == null) {
			jButtonProximo = new JButton();
			jButtonProximo.setBounds(new Rectangle(128, 100, 54, 24));
			jButtonProximo.setText(">");
			jButtonProximo.setBackground(Color.white);
		}
		return jButtonProximo;
	}


	/**
	 * This method initializes jButtonUltimo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonUltimo() {
		if (jButtonUltimo == null) {
			jButtonUltimo = new JButton();
			jButtonUltimo.setBounds(new Rectangle(186, 100, 54, 24));
			jButtonUltimo.setText(">>");
			jButtonUltimo.setBackground(Color.white);
		}
		return jButtonUltimo;
	}


	/**
	 * This method initializes jButtonIncluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonIncluir() {
		if (jButtonIncluir == null) {
			jButtonIncluir = new JButton();
			jButtonIncluir.setBounds(new Rectangle(468, 98, 88, 26));
			jButtonIncluir.setText("Incluir");
			jButtonIncluir.setBackground(Color.white);
			jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(!(getJTextFieldCodigo().getText()).equals("")){
						DadosItem item = new DadosItem();
						ItensFacade facade = new ItensFacade();
						item.setCodigoOS(Integer.parseInt(getJTextFieldCodigo().getText()));
						
						facade.ultimo(item);
						int itemNum = item.getNumeroItem();
						itemNum++;
						
						item.setTipo(getJComboBoxtipo().getSelectedItem().toString());
						item.setNome(getJComboBoxEstoque().getSelectedItem().toString());
						item.setCodigoOS(Integer.parseInt(getJTextFieldCodigo().getText()));
						item.setCodigoPeca(Integer.parseInt(getJTextFieldCodigoItem().getText()));
						item.setQuantidade(getJTextFieldQHoras().getText());
						item.setValorUnitario(getJTextFieldValorUnitario().getText());
						String text = getJTextFieldValorTotal().getText();
						String valorTotal = text.replaceAll( ",", "." );
						item.setValorTotal(Float.parseFloat(valorTotal));
						text = getJTextFieldCustoTotal().getText();
						String custoTotal = text.replaceAll( ",", "." );
						
						item.setCustoTotal(Float.parseFloat(custoTotal));
						item.setIss(getJTextFieldISS().getText());
						item.setIcms(getJTextFieldICMS().getText());
						item.setIpi(getJTextFieldIPI().getText());
						item.setNumeroItem(itemNum);
						facade.incluir(item);
						
						DadosEstoque estoque = new DadosEstoque();
						EstoqueFacade facadeEstoque = new EstoqueFacade();
						estoque.setEstoqueCodigoDaAquisicao(Integer.parseInt(getJTextFieldCodigoItem().getText()));
						facadeEstoque.excluir(estoque);
						
						
						pegarEstoque();
					}else{
						JOptionPane.showMessageDialog(null,"Primeiro você deve Cadastrar a OS");
						
						
					}
				}
			});
		}
		return jButtonIncluir;
	}


	/**
	 * This method initializes jButtonAlterar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAlterar() {
		if (jButtonAlterar == null) {
			jButtonAlterar = new JButton();
			jButtonAlterar.setBounds(new Rectangle(559, 98, 88, 26));
			jButtonAlterar.setText("Alterar");
			jButtonAlterar.setBackground(Color.white);
		}
		return jButtonAlterar;
	}


	/**
	 * This method initializes jButtonExcluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonExcluir() {
		if (jButtonExcluir == null) {
			jButtonExcluir = new JButton();
			jButtonExcluir.setBackground(Color.white);
			jButtonExcluir.setText("Excluir");
			jButtonExcluir.setBounds(new Rectangle(650, 98, 88, 26));
		}
		return jButtonExcluir;
	}


	/**
	 * This method initializes jTextFieldISS2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldISS2() {
		if (jTextFieldISS2 == null) {
			jTextFieldISS2 = new JTextField();
			jTextFieldISS2.setBounds(new Rectangle(364, 345, 83, 20));
			jTextFieldISS2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldISS2;
	}


	/**
	 * This method initializes jTextFieldICMS2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldICMS2() {
		if (jTextFieldICMS2 == null) {
			jTextFieldICMS2 = new JTextField();
			jTextFieldICMS2.setBounds(new Rectangle(492, 344, 83, 20));
			jTextFieldICMS2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldICMS2;
	}


	/**
	 * This method initializes jTextFieldIPI2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldIPI2() {
		if (jTextFieldIPI2 == null) {
			jTextFieldIPI2 = new JTextField();
			jTextFieldIPI2.setBounds(new Rectangle(605, 344, 83, 20));
			jTextFieldIPI2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldIPI2;
	}


	/**
	 * This method initializes jTextFieldCustoMaoDeObra	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCustoMaoDeObra() {
		if (jTextFieldCustoMaoDeObra == null) {
			jTextFieldCustoMaoDeObra = new JTextField();
			jTextFieldCustoMaoDeObra.setBounds(new Rectangle(131, 371, 99, 20));
			jTextFieldCustoMaoDeObra.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCustoMaoDeObra;
	}


	/**
	 * This method initializes jTextFieldCustoPecas	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCustoPecas() {
		if (jTextFieldCustoPecas == null) {
			jTextFieldCustoPecas = new JTextField();
			jTextFieldCustoPecas.setBounds(new Rectangle(320, 370, 100, 20));
			jTextFieldCustoPecas.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCustoPecas;
	}


	/**
	 * This method initializes jTextFieldHoras	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldHoras() {
		if (jTextFieldHoras == null) {
			jTextFieldHoras = new JTextField();
			jTextFieldHoras.setBounds(new Rectangle(469, 370, 36, 20));
			jTextFieldHoras.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldHoras;
	}


	/**
	 * This method initializes jTextFieldCustoTotal2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldCustoTotal2() {
		if (jTextFieldCustoTotal2 == null) {
						
			jTextFieldCustoTotal2 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("####.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldCustoTotal2.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldCustoTotal2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldCustoTotal2.setBounds(new Rectangle(585, 370, 84, 20));
			jTextFieldCustoTotal2.setBackground(new Color(238, 238, 238));	
			jTextFieldCustoTotal2.setText("0");
			
		}
		return jTextFieldCustoTotal2;
	}


	/**
	 * This method initializes jTextFieldValorMaoDeObra	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldValorMaoDeObra() {
		if (jTextFieldValorMaoDeObra == null) {
			jTextFieldValorMaoDeObra = new JTextField();
			jTextFieldValorMaoDeObra.setBounds(new Rectangle(132, 395, 97, 20));
			jTextFieldValorMaoDeObra.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldValorMaoDeObra;
	}


	/**
	 * This method initializes jTextFieldValorPecas	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldValorPecas() {
		if (jTextFieldValorPecas == null) {
			jTextFieldValorPecas = new JTextField();
			jTextFieldValorPecas.setBounds(new Rectangle(320, 395, 99, 20));
			jTextFieldValorPecas.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldValorPecas;
	}


	/**
	 * This method initializes jTextFieldDesconto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldDesconto() {
		if (jTextFieldDesconto == null) {
			jTextFieldDesconto = new JTextField();
			jTextFieldDesconto.setBounds(new Rectangle(673, 392, 29, 20));
			jTextFieldDesconto.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldDesconto;
	}


	/**
	 * This method initializes jTextFieldConsumo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldConsumo() {
		if (jTextFieldConsumo == null) {
			jTextFieldConsumo = new JTextField();
			jTextFieldConsumo.setBounds(new Rectangle(523, 393, 77, 20));
			jTextFieldConsumo.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldConsumo;
	}


	/**
	 * This method initializes jTextFieldValorTotal2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldValorTotal2() {
		if (jTextFieldValorTotal2 == null) {
			jTextFieldValorTotal2 = new JFormattedTextField();
			jTextFieldValorTotal2.setBounds(new Rectangle(84, 418, 98, 20));
			
			DecimalFormat decimal = new DecimalFormat("####.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldValorTotal2.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldValorTotal2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			
			jTextFieldValorTotal2.setBackground(new Color(238, 238, 238));	
			jTextFieldValorTotal2.setText("0");
		}
		return jTextFieldValorTotal2;
	}


	/**
	 * This method initializes jTextFieldNumeroDeParcelas	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNumeroDeParcelas() {
		if (jTextFieldNumeroDeParcelas == null) {
			jTextFieldNumeroDeParcelas = new JTextField();
			jTextFieldNumeroDeParcelas.setBounds(new Rectangle(100, 441, 25, 20));
			jTextFieldNumeroDeParcelas.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldNumeroDeParcelas;
	}


	/**
	 * This method initializes jTextFieldPrimeira	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPrimeira() {
		if (jTextFieldPrimeira == null) {
			jTextFieldPrimeira = new JTextField();
			jTextFieldPrimeira.setBounds(new Rectangle(184, 440, 43, 20));
			jTextFieldPrimeira.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldPrimeira;
	}


	/**
	 * This method initializes jTextFieldValorParcela	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldValorParcela() {
		if (jTextFieldValorParcela == null) {
			jTextFieldValorParcela = new JTextField();
			jTextFieldValorParcela.setBounds(new Rectangle(377, 439, 89, 20));
			jTextFieldValorParcela.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldValorParcela;
	}


	/**
	 * This method initializes jTextFieldFormaDePagamento	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFormaDePagamento() {
		if (jTextFieldFormaDePagamento == null) {
			jTextFieldFormaDePagamento = new JTextField();
			jTextFieldFormaDePagamento.setBounds(new Rectangle(600, 439, 125, 20));
			jTextFieldFormaDePagamento.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldFormaDePagamento;
	}


	/**
	 * This method initializes jTextAreaRessalvas	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaRessalvas() {
		if (jTextAreaRessalvas == null) {
			jTextAreaRessalvas = new JTextArea();
			jTextAreaRessalvas.setBounds(new Rectangle(88, 463, 546, 44));
			jTextAreaRessalvas.setBackground(new Color(238, 238, 238));
		}
		return jTextAreaRessalvas;
	}
	
	public void pegarClientes(){
		
		DadosCliente cliente = new DadosCliente();
	ClienteFacade  facade = new ClienteFacade();
	Collection<DadosCliente> lista = new LinkedList<DadosCliente>();
	HashMap<String, String> map = new HashMap<String, String>();
	cliente.setClienteCodigo(0);
	String valor = ""+cliente.getClienteCodigo();
	map.put("cliente_codigo",valor );
	
	String resultado = "";
	try {
		lista = facade.buscaTudoCliente(map);
		if(lista==null){
			
		}else{
			getJComboBoxCliente().addItem("Escolha aqui o Cliente");
			for (DadosCliente dadosCliente : lista) {
				
				getJComboBoxCliente().addItem(dadosCliente.getClienteNome());
				
				
			}
			
		}
	} catch (SQLException e1) {
		
	} 
	
	
	
    }
	public void pegarConvenio(){
		DadosConvenio convenio = new DadosConvenio();
		ConvenioFacade facade = new ConvenioFacade();
		Collection<DadosConvenio> lista = new LinkedList<DadosConvenio>();
		HashMap<String, String> map = new HashMap<String, String>();
		
		String valor = "0";
		map.put("convenio_codigo",valor );
		
		String resultado = "";
		try {
			lista = facade.buscaLista(map);
			if(lista==null){
				
			}else{
				getJComboBoxConvennio().addItem("Escolha aqui o convênio");
				for (DadosConvenio dadosConvenio : lista) {
					
					getJComboBoxConvennio().addItem(dadosConvenio.getConvenioNome());
					
					
				}
				
			}
		} catch (SQLException e1) {
			
		} 
		
			
		
	}
	
	
	
	
	
	public void pegarTecnico(){
		
    DadosFuncionarios func = new DadosFuncionarios();
	FuncionarioFacade  facade = new FuncionarioFacade();
	Collection<DadosFuncionarios> lista = new LinkedList<DadosFuncionarios>();
	HashMap<String, String> map = new HashMap<String, String>();
	
	String valor = "0";
	map.put("funcionario_codigo",valor );
	
	String resultado = "";
	try {
		lista = facade.buscaTudoFuncionario(map);
		if(lista==null){
			
		}else{
			getJComboBoxTecnico().addItem("Escolha aqui o Técnico");
			for (DadosFuncionarios dadosFuncionarios : lista) {
				
				getJComboBoxTecnico().addItem(dadosFuncionarios.getFuncionarioNome());
				
				
			}
			
		}
	} catch (SQLException e1) {
		
	} 
	
	
	
    }
	public void pegarEstoque(){
		
	    DadosEstoque estoque = new DadosEstoque();
		EstoqueFacade facade = new EstoqueFacade();
		Collection<DadosEstoque> lista = new LinkedList<DadosEstoque>();
		HashMap<String, String> map = new HashMap<String, String>();
		estoque.setEstoqueCodigoDaAquisicao(0);
		
		map.put("estoque_codigo","0");
		
		
		try {
			lista = facade.buscaTudo(map);
			if(lista==null){
				
			}else{
				
				getJComboBoxEstoque().addItem("Escolha aqui uma peça");
				for (DadosEstoque dadosEstoque : lista) {
					
					getJComboBoxEstoque().addItem(dadosEstoque.getEstoquePeca());
					
					
				}
				
			}
		} catch (SQLException e1) {
			
		} 
		
		
		
	    }


	/**
	 * This method initializes jTextFieldCodigo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodigo() {
		if (jTextFieldCodigo == null) {
			jTextFieldCodigo = new JTextField(8);
			jTextFieldCodigo.setBounds(new Rectangle(64, 12, 123, 21));
			jTextFieldCodigo.setEditable(false);
			jTextFieldCodigo.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCodigo;
	}


	/**
	 * This method initializes jButtonExcluirLista	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonExcluirLista() {
		if (jButtonExcluirLista == null) {
			jButtonExcluirLista = new JButton();
			jButtonExcluirLista.setBackground(Color.white);
			jButtonExcluirLista.setBounds(new Rectangle(668, 70, 108, 33));
			jButtonExcluirLista.setText("Excluir");
			jButtonExcluirLista.setToolTipText("Com este botão você exclui um item da lista.");
			jButtonExcluirLista.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosOrdemDeServico os = new DadosOrdemDeServico();
					OSFacade facade = new OSFacade();
						             	
						int l = getJTable().getSelectedRow();
						if(l<0){
							JOptionPane.showMessageDialog(null, "Primeiro, selecione um valor na Tabela");
							
						}else{

							int resposta = JOptionPane.showConfirmDialog(null,"Você deseja deletar esse registro ?");
							
							if (resposta== 0){ 	
						String codigo = ""+getJTable().getValueAt(l, 4);
											
						os.setCodigo(Integer.parseInt(codigo));
						
						facade.excluir(os); 
						
							dtm.removeRow(l);
			            
							}
			             	
						} 
		             	
		             	
		             	//System.out.println(valorsel);
		             	
		             	
		                     	
		             	}});
		
		
	}
		return jButtonExcluirLista;		
		
			
	
	
	}


	/**
	 * This method initializes dateFieldAbertura	
	 * 	
	 * @return net.sf.nachocalendar.components.DateField	
	 */
	private DateField getDateFieldAbertura() {
		if (dateFieldAbertura == null) {
			dateFieldAbertura = new DateField();
			dateFieldAbertura.setBounds(new Rectangle(70, 344, 84, 20));
			dateFieldAbertura.setShowOkCancel(true);
			dateFieldAbertura.setShowToday(false);
			dateFieldAbertura.setDateFormat(DateFormat.getDateInstance(DateFormat.MEDIUM));
		}
		return dateFieldAbertura;
	}


	/**
	 * This method initializes dateField	
	 * 	
	 * @return net.sf.nachocalendar.components.DateField	
	 */
	private DateField getDateField() {
		if (dateField == null) {
			dateField = new DateField();
			dateField.setBounds(new Rectangle(240, 344, 87, 20));
			dateField.setShowOkCancel(true);
			dateField.setDateFormat(DateFormat.getDateInstance(DateFormat.MEDIUM));
			dateField.addPropertyChangeListener("value", new java.beans.PropertyChangeListener() {
						public void propertyChange(java.beans.PropertyChangeEvent e) {
							java.util.Date data1 = (java.util.Date) getDateFieldAbertura().getValue();
							java.util.Date data3 =  (java.util.Date) getDateField().getValue();
							
							SimpleDateFormat formatoBanco = new SimpleDateFormat("dd/MM/yyyy");
							
							
							String formatada = formatoBanco.format(data1);
							
							String data [] = formatada.split("/");
							int ano = Integer.parseInt(data[2])-1900;
							int mes = Integer.parseInt(data[1])-1;
							int dia = Integer.parseInt(data[0]);
												
							String formatada2 = formatoBanco.format(data3);
							String data2 [] = formatada2.split("/");
							int ano2 = Integer.parseInt(data2[2])-1900;
							int mes2 = Integer.parseInt(data2[1])-1;
							int dia2 = Integer.parseInt(data2[0]);
											
							int ok =0;
							if((dia>dia2) && (mes>=mes2) &&(ano>=ano2) ){
								JOptionPane.showMessageDialog(null, "A data do fechamento não poder ser menor que a data de abertura ");
								ok++;
								getDateField().setValue(formatada);
							}
							if((ok<1) && (mes>mes2) && (ano>=ano2) ){
								JOptionPane.showMessageDialog(null, "A data do fechamento não poder ser menor que a data de abertura ");
								ok++;
								getDateField().setValue(formatada);
							}
							if((ok<1) && (ano>ano2) ){
								JOptionPane.showMessageDialog(null, "A data do fechamento não poder ser menor que a data de abertura ");
								ok++;
								getDateField().setValue(formatada);
							}
						}
					});
			
			
		}
		return dateField;
	}


	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane(getJTextAreaQueixas());
			jScrollPane.setBounds(new Rectangle(72, 129, 577, 56));
		}
		return jScrollPane;
	}


	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane(getJTextAreaRessalvas());
			jScrollPane1.setBounds(new Rectangle(88, 463, 546, 44));
		}
		return jScrollPane1;
	}


	/**
	 * This method initializes jScrollPane2	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setBounds(new Rectangle(18, 25, 644, 309));
			jScrollPane2.setViewportView(getJTable());
		}
		return jScrollPane2;
	}


	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable() {
		if (jTable == null) {
			jTable = new JTable();
			jTable.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] { },
		            new String [] {"Cliente","Data do fechamento","Convenio","Veiculo","Código"}));
			
			
        			jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		}
		return jTable;
	}
	
	public void pegarLista(){
		DadosOrdemDeServico os = new DadosOrdemDeServico();
		OSFacade facade = new OSFacade();
		Collection<DadosOrdemDeServico> lista = new LinkedList<DadosOrdemDeServico>();
		HashMap<String, String> map = new HashMap<String, String>();
		String valor ="0";
		map.put("codigo",valor );
		String resultado = "";
		try {
			lista = facade.buscaLista(map);
			if(lista==null){
								
             	JOptionPane.showMessageDialog(null,"Nenhum registro encontrado !");
			}else{
				
				dtm = (DefaultTableModel) getJTable().getModel();
				
				java.sql.Date data = null;
				
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				String dataData = null;
			
				String valor1="";
				
								
				for (DadosOrdemDeServico dadosOrdemDeServico : lista) {
					//getModelo().addElement(listaPecas.getPecaNome());
					data = dadosOrdemDeServico.getFechamento();
					dataData = formato.format(data);
					
					
					
										
					dtm.addRow(new Object[]{dadosOrdemDeServico.getCliente(),dataData,dadosOrdemDeServico.getConvenio(), dadosOrdemDeServico.getVeiculo(), dadosOrdemDeServico.getCodigo()});
					
				}
				
				
			}
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null,e1.getMessage());
		} 
		
		
		
		
		
	}


	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jLabelFechamento2 = new JLabel();
			jLabelFechamento2.setBounds(new Rectangle(174, 25, 66, 21));
			jLabelFechamento2.setText("Data final :");
			jLabel2Data1 = new JLabel();
			jLabel2Data1.setBounds(new Rectangle(9, 26, 72, 21));
			jLabel2Data1.setText("Data inicial :");
			
			jPanel2 = new JPanel();
			jPanel2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Pesquisas (Data de fechamento)"),BorderFactory.createEmptyBorder(5,5,5,5)));
			jPanel2.setLayout(null);
			jPanel2.setBounds(new Rectangle(19, 346, 642, 69));
			jPanel2.setBackground(Color.white);
			
			jPanel2.add(jLabel2Data1, null);
			jPanel2.add(jLabelFechamento2, null);
			jPanel2.add(getJButton9(), null);
			jPanel2.add(getDateFieldFinal(), null);
			jPanel2.add(getDateFieldInicial(), null);
		}
		return jPanel2;
	}


	/**
	 * This method initializes jButton9	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton9() {
		if (jButton9 == null) {
			jButton9 = new JButton();
			jButton9.setBounds(new Rectangle(502, 25, 124, 22));
			jButton9.setBackground(Color.white);
			jButton9.setText("Pesquisar");
			jButton9.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					
					DadosOrdemDeServico os = new DadosOrdemDeServico();
					OSFacade facade = new OSFacade();
					Collection<DadosOrdemDeServico> lista = new LinkedList<DadosOrdemDeServico>();
					HashMap<String, String> map = new HashMap<String, String>();
					
					SimpleDateFormat formatoBanco = new SimpleDateFormat("yyyy-MM-dd");
					java.util.Date data1 = (java.util.Date) getDateFieldInicial().getValue();
					java.util.Date data2 = (java.util.Date) getDateFieldFinal().getValue();
					String formatada = formatoBanco.format(data1);
					String formatada2 = formatoBanco.format(data2);
					
					
					
					map.put("fechamento", formatada );
					map.put("fechamento", formatada2);
					String resultado = "";
					try {
						lista = facade.buscaData(map);
						if(lista==null){
											
			             	JOptionPane.showMessageDialog(null,"Nenhum registro encontrado !");
						}else{
							dtm.setNumRows(0);
							dtm = (DefaultTableModel) getJTable().getModel();
							
							java.sql.Date data = null;
							
							SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
							String dataData = null;
						
							String valor1="";
							
											
							for (DadosOrdemDeServico dadosOrdemDeServico : lista) {
								//getModelo().addElement(listaPecas.getPecaNome());
								data = dadosOrdemDeServico.getFechamento();
								dataData = formato.format(data);
															
													
								dtm.addRow(new Object[]{dadosOrdemDeServico.getCliente(),dataData,dadosOrdemDeServico.getConvenio(), dadosOrdemDeServico.getVeiculo(), dadosOrdemDeServico.getCodigo()});
								
							}
							
							
						}
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null,e1.getMessage());
					} 
					
					
					
				}
			});
		}
		return jButton9;
	}


	/**
	 * This method initializes jPanel3	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(262, 23, 56, 22));
			jLabel3.setText("Codigo :");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(8, 23, 51, 21));
			jLabel2.setText("Nome :");
			jPanel3 = new JPanel();
			jPanel3.setLayout(null);
			jPanel3.setBounds(new Rectangle(20, 428, 644, 69));
			jPanel3.setBackground(Color.white);
			jPanel3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Pesquisas (Nome ou codigo)"),BorderFactory.createEmptyBorder(5,5,5,5)));
			jPanel3.add(getJButton10(), null);
			jPanel3.add(getJTextFieldNome(), null);
			jPanel3.add(getJTextFieldCodigo3(), null);
			jPanel3.add(jLabel2, null);
			jPanel3.add(jLabel3, null);
		}
		return jPanel3;
	}


	/**
	 * This method initializes jButton10	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton10() {
		if (jButton10 == null) {
			jButton10 = new JButton();
			jButton10.setBounds(new Rectangle(505, 21, 124, 22));
			jButton10.setBackground(Color.white);
			jButton10.setText("Pesquisar");
			jButton10.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					DadosOrdemDeServico os = new DadosOrdemDeServico();
					OSFacade facade = new OSFacade();
					
					if(NomeCodigo ==1 ){
					Collection<DadosOrdemDeServico> lista = new LinkedList<DadosOrdemDeServico>();
					HashMap<String, String> map = new HashMap<String, String>();
							
					String nome = getJTextFieldNome().getText();
					
					map.put("cliente",nome);
					
					String resultado = "";
					try {
						lista = facade.buscaNome(map);
						if(lista==null){
											
			             	JOptionPane.showMessageDialog(null,"Nenhum registro encontrado !");
						}else{
							dtm.setNumRows(0);
							dtm = (DefaultTableModel) getJTable().getModel();
							
							java.sql.Date data = null;
							
							SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
							String dataData = null;
						
							String valor1="";
							
											
							for (DadosOrdemDeServico dadosOrdemDeServico : lista) {
								//getModelo().addElement(listaPecas.getPecaNome());
								data = dadosOrdemDeServico.getFechamento();
								dataData = formato.format(data);
														
													
								dtm.addRow(new Object[]{dadosOrdemDeServico.getCliente(),dataData,dadosOrdemDeServico.getConvenio(), dadosOrdemDeServico.getVeiculo(), dadosOrdemDeServico.getCodigo()});
								
							}
							
							getJTextFieldCodigo3().setText("");
						}
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null,e1.getMessage());
					} 
					}else{
						os.setCodigo(Integer.parseInt(getJTextFieldCodigo3().getText()));
						
						facade.pesquisaCodigo(os);
						java.sql.Date data = os.getFechamento();
						
						SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
						String 	dataData = formato.format(data);
						dtm.setNumRows(0);
						dtm.addRow(new Object[]{os.getCliente(),dataData,os.getConvenio(), os.getVeiculo(), os.getCodigo()});
						getJTextFieldNome().setText("");
					}
				}
			});
		}
		return jButton10;
	}


	/**
	 * This method initializes jTextFieldNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNome() {
		if (jTextFieldNome == null) {
			jTextFieldNome = new JTextField();
			jTextFieldNome.setBounds(new Rectangle(67, 23, 182, 22));
			jTextFieldNome.setBackground(new Color(238, 238, 238));
			jTextFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusGained(java.awt.event.FocusEvent e) {
					
					NomeCodigo=1;
				
				}
			});
		}
		return jTextFieldNome;
	}


	/**
	 * This method initializes jTextFieldCodigo3	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodigo3() {
		if (jTextFieldCodigo3 == null) {
			jTextFieldCodigo3 = new JTextField();
			jTextFieldCodigo3.setBounds(new Rectangle(319, 22, 88, 23));
			jTextFieldCodigo3.setBackground(new Color(238, 238, 238));
			jTextFieldCodigo3.addFocusListener(new java.awt.event.FocusAdapter() {
				public void focusGained(java.awt.event.FocusEvent e) {
					NomeCodigo=0;
				}
			});
		}
		return jTextFieldCodigo3;
	}


	/**
	 * This method initializes dateFieldFinal	
	 * 	
	 * @return net.sf.nachocalendar.components.DateField	
	 */
	private DateField getDateFieldFinal() {
		if (dateFieldFinal == null) {
			dateFieldFinal = new DateField();
			dateFieldFinal.setBounds(new Rectangle(240, 26, 87, 20));
			dateFieldFinal.setDateFormat(DateFormat.getDateInstance(DateFormat.MEDIUM));
			dateFieldFinal.setShowOkCancel(true);
			dateFieldFinal.setEnabled(true);
			dateFieldFinal.setFirstDayOfWeek(0);
			
			dateFieldFinal.setShowToday(false);
			dateFieldFinal.addPropertyChangeListener("value",
					new java.beans.PropertyChangeListener() {
						public void propertyChange(java.beans.PropertyChangeEvent e) {
							java.util.Date data1 = (java.util.Date) getDateFieldInicial().getValue();
							java.util.Date data3 =  (java.util.Date) getDateFieldFinal().getValue();
							
							SimpleDateFormat formatoBanco = new SimpleDateFormat("dd/MM/yyyy");
							
							
							String formatada = formatoBanco.format(data1);
							
							String data [] = formatada.split("/");
							int ano = Integer.parseInt(data[2])-1900;
							int mes = Integer.parseInt(data[1])-1;
							int dia = Integer.parseInt(data[0]);
												
							String formatada2 = formatoBanco.format(data3);
							String data2 [] = formatada2.split("/");
							int ano2 = Integer.parseInt(data2[2])-1900;
							int mes2 = Integer.parseInt(data2[1])-1;
							int dia2 = Integer.parseInt(data2[0]);
											
							int ok =0;
							if((dia>dia2) && (mes>=mes2) &&(ano>=ano2) ){
								JOptionPane.showMessageDialog(null, "A data do fechamento não poder ser menor que a data de abertura ");
								ok++;
								getDateFieldFinal().setValue(formatada);
							}
							if((ok<1) && (mes>mes2) && (ano>=ano2) ){
								JOptionPane.showMessageDialog(null, "A data do fechamento não poder ser menor que a data de abertura ");
								ok++;
								getDateFieldFinal().setValue(formatada);
							}
							if((ok<1) && (ano>ano2) ){
								JOptionPane.showMessageDialog(null, "A data do fechamento não poder ser menor que a data de abertura ");
								ok++;
								getDateFieldFinal().setValue(formatada);
							}
						}
					});
		}
		return dateFieldFinal;
	}


	/**
	 * This method initializes dateFieldInicial	
	 * 	
	 * @return net.sf.nachocalendar.components.DateField	
	 */
	private DateField getDateFieldInicial() {
		if (dateFieldInicial == null) {
			dateFieldInicial = new DateField();
			dateFieldInicial.setBounds(new Rectangle(84, 26, 87, 20));
			dateFieldInicial.setDateFormat(DateFormat.getDateInstance(DateFormat.MEDIUM));
			dateFieldInicial.setShowOkCancel(true);
			dateFieldInicial.setEnabled(true);
			
			dateFieldInicial.setShowToday(false);
			
		}
		return dateFieldInicial;
	}


	/**
	 * This method initializes jButtonLimpar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonLimpar() {
		if (jButtonLimpar == null) {
			jButtonLimpar = new JButton();
			jButtonLimpar.setBackground(Color.white);
			jButtonLimpar.setText("Limpar");
			jButtonLimpar.setBounds(new Rectangle(376, 98, 88, 26));
		}
		return jButtonLimpar;
	}
  public void limparItens(){
	  
	  
	  
	  
	  
	  
  }



}
