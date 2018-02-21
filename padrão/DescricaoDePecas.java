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


import dto.DadosDescricaoDePecas;
import dto.DadosFornecedor;


import facade.ClienteFacade;
import facade.DiscricaoFacade;

import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.JEditorPane;



public class DescricaoDePecas extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	private JButton jButtonCancel = null;
	private JList jList = null;
	private DefaultListModel modelo = null;

	private JLabel jLabelNome = null;
	private int abre = 0;

	private JTextField jTextFieldNomeDaPeca = null;

	private JTextField jTextFieldMarca = null;

	private JLabel jLabelCPFCGC = null;

	private JLabel jLabelEndereco = null;

	private JTextField jTextFieldModelo = null;

	private String msg;  //  @jve:decl-index=0:

	private JLabel jLabelDiscricao = null;

	private JPanel jPanel = null;

	private JButton jButton = null;
	private JLabel jLabelResultado = null;
	private JButton jButton1Incluir = null;

	private JTextArea jTextArea = null;

	private JButton jButton5 = null;

	private JButton jButton6 = null;

	private JButton jButton7 = null;

	private JButton jButton8 = null;
	private JFormattedTextField tfCep =null;
	private JFormattedTextField tfDataNascimento = null;

	private JPanel jPanel1 = null;

	private JDesktopPane jDesktopPane = null;
	private JPanel jpanel2;  //  @jve:decl-index=0:visual-constraint="10,620"
	private JButton jButtonOk =  null;

	private JScrollPane jScrollPane = null;

	private JLabel jLabelIformacoes = null;

	private JLabel jLabelResultadoList = null;

	private JButton jButtonExcluirLista = null;

	private JLabel jLabelQuantidadeMinima = null;

	private JTextField jTextFieldMinima = null;

	private JTextField jTextFieldMaxima = null;

	private JLabel jLabelQuantidadeMaxima = null;
	public DescricaoDePecas() {
		super();
		initialize();
		
		
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Itens(Peças)");
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
		   msg = rb.getString("ExitMsg");
		   }
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelDiscricao = new JLabel();
			jLabelDiscricao.setBounds(new Rectangle(5, 71, 73, 19));
			jLabelDiscricao.setText("Discrição :");
			jLabelEndereco = new JLabel();
			jLabelEndereco.setBounds(new Rectangle(170, 49, 53, 19));
			jLabelEndereco.setText("Modelo:");
			jLabelCPFCGC = new JLabel();
			jLabelCPFCGC.setBounds(new Rectangle(6, 49, 60, 19));
			jLabelCPFCGC.setText("Marca :");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(7, 24, 95, 20));
			jLabelNome.setText("Nome da peça:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
						
			jContentPane.add(getJPanel(), null);
			
			jContentPane.add(getJPanel1(), null);
			
		}
		return jContentPane;
	}

	
	
	
	private JTextField getJTextFieldNomeDaPeca() {
		if (jTextFieldNomeDaPeca == null) {
			jTextFieldNomeDaPeca = new JTextField(75);
			jTextFieldNomeDaPeca.setBounds(new Rectangle(105, 24, 383, 21));
			jTextFieldNomeDaPeca.setBackground(new Color(238, 238, 238));
			jTextFieldNomeDaPeca.setToolTipText("Digite aqui o nome da Peça.");
		}
		return jTextFieldNomeDaPeca;
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
	 * This method initializes jTextFieldMarca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMarca() {
		if (jTextFieldMarca == null) {
			jTextFieldMarca = new JTextField(15);
			jTextFieldMarca.setBounds(new Rectangle(70, 49, 94, 20));
			jTextFieldMarca.setBackground(new Color(238, 238, 238));
			jTextFieldMarca.setToolTipText("Digite aqui o CPF ou CGC da empresa.");
		}
		return jTextFieldMarca;
	}


	/**
	 * This method initializes jTextFieldModelo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldModelo() {
		if (jTextFieldModelo == null) {
			jTextFieldModelo = new JTextField();
			jTextFieldModelo.setBounds(new Rectangle(224, 48, 98, 20));
			jTextFieldModelo.setBackground(new Color(238, 238, 238));
			jTextFieldModelo.setToolTipText("Digite aqui o endereço");
		}
		return jTextFieldModelo;
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
			jButton.setBounds(new Rectangle(278, 0, 125, 48));
			Icon excluir = new ImageIcon("imagens/Trashfull.gif");
			jButton.setBackground(Color.white);
			jButton.setText("Excluir");
			jButton.setToolTipText("Excluir registro");
			jButton.setIcon(excluir);
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					String nome = getJTextFieldNomeDaPeca().getText();	
					String marca = getJTextFieldMarca().getText();
					String modelo = getJTextFieldModelo().getText();
					String disc = getJTextArea().getText();
					
					
					if((!nome.equals(""))&&(!marca.equals(""))&&(!modelo.equals(""))&&(!disc.equals(""))){
							
							DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
							DiscricaoFacade facade = new DiscricaoFacade();
							int resposta = JOptionPane.showConfirmDialog(null,"Você deseja deletar esse registro ?");
							
							if (resposta== 0){ 
							      
								pecas.setDadosDiscricaoDePecasNome(getJTextFieldNomeDaPeca().getText());
								
								facade.excluir(pecas);
								
								limpar();
								getJTextFieldNomeDaPeca().setEditable(true);
								
							    } 
							     
							
							
						}else{
							JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'Listar' o registro, seleciona-lo para poder deleta-lo em seguida. ");
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
			jButton1Incluir.setBounds(new Rectangle(1, 0, 130, 48));
			Icon incluir = new ImageIcon("imagens/Applications.gif");
			jButton1Incluir.setIcon(incluir);
			jButton1Incluir.setText("Incluir");
			jButton1Incluir.setToolTipText("Incluir Registro");
			jButton1Incluir.setBackground(Color.white);
			jButton1Incluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				
				String nome = getJTextFieldNomeDaPeca().getText();	
				String marca = getJTextFieldMarca().getText();
				String modelo = getJTextFieldModelo().getText();
				if((nome.equals(""))||(marca.equals(""))||(modelo.equals(""))){
					JOptionPane.showMessageDialog(null, "Os campos obrigatório não foram todos digitados(nome, marca, modelo)");
					
				}
				
				if((!nome.equals(""))&&(!marca.equals(""))&&(!modelo.equals(""))){
					
				 DiscricaoFacade facade = new DiscricaoFacade();
				 DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
				 DadosFornecedor df = new DadosFornecedor();
				 pecas.setDadosDiscricaoDePecasNome(getJTextFieldNomeDaPeca().getText());
				 pecas.setDadosDiscricaoDePecasDescricao(getJTextArea().getText());
				 pecas.setDadosDiscricaoDePecasMarca(getJTextFieldMarca().getText());
				 pecas.setDadosDiscricaoDePecasModelo(getJTextFieldModelo().getText());
				 pecas.setDadosDiscricaoDePecasMinima(Integer.parseInt(getJTextFieldMinima().getText()));
				 pecas.setDadosDiscricaoDePecasMaxima(Integer.parseInt(getJTextFieldMaxima().getText()));
				 facade.incluir(pecas);
				 limpar();
				 getJTextFieldNomeDaPeca().setEditable(true);
					}
						
				}	 
						
			});
		}
		return jButton1Incluir;
	}


	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(81, 71, 501, 109));
			jTextArea.setBackground(new Color(238, 238, 238));
			jTextArea.setToolTipText("Observaçoes sobre o cliente.");
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
			jButton5.setBounds(new Rectangle(130, 0, 149, 48));
			jButton5.setBackground(Color.white);
			Icon alterar = new ImageIcon("imagens/Filesedit.gif"); 
			jButton5.setIcon(alterar);
			jButton5.setText("Alterar");
			jButton5.setToolTipText("Alterar dados");
			jButton5.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String nome = getJTextFieldNomeDaPeca().getText();	
					String marca = getJTextFieldMarca().getText();
					String modelo = getJTextFieldModelo().getText();
					
										
					if((!nome.equals(""))&&(!marca.equals(""))&&(!modelo.equals(""))){
						
						DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
						DiscricaoFacade facade = new DiscricaoFacade();
						int resposta = JOptionPane.showConfirmDialog(null,"Você deseja deletar esse registro ?");
						
						if (resposta== 0){ 
						      
							pecas.setDadosDiscricaoDePecasNome(getJTextFieldNomeDaPeca().getText());
							pecas.setDadosDiscricaoDePecasMarca(getJTextFieldMarca().getText());
							pecas.setDadosDiscricaoDePecasModelo(getJTextFieldModelo().getText());
							pecas.setDadosDiscricaoDePecasDescricao(getJTextArea().getText());
							pecas.setDadosDiscricaoDePecasMinima(Integer.parseInt(getJTextFieldMinima().getText()));
							pecas.setDadosDiscricaoDePecasMaxima(Integer.parseInt(getJTextFieldMaxima().getText()));
							
							facade.atualizar(pecas);
							
							limpar();
							getJTextFieldNomeDaPeca().setEditable(true);
							
						    } 
						     
						
						
					}else{
						JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'Listar' o registro, seleciona-lo para poder deleta-lo em seguida. ");
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
			jButton6.setBounds(new Rectangle(403, 0, 125, 48));
			jButton6.setBackground(Color.white);
			Icon consulta = new ImageIcon("imagens/find.gif");
			jButton6.setText("Listar");
			jButton6.setIcon(consulta);
			jButton6.setToolTipText("Consultar");
			jButton6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					limpar();
					getJPanel1().setBounds(new Rectangle(0, 545, 790, 515));
					
					getJContentPane().add(getJpanel2(),null);
					getModelo().clear();
					pegarLista();
					if(abre > 0){
					
					jpanel2.add(getJButtonOk(),null);
					jpanel2.add(getJButtonCancel(),null);
					
					jLabelResultado = new JLabel();
					jLabelResultado.setBounds(new Rectangle(19, 3, 99, 20));
					jLabelResultado.setText("Lista de peças :");
					jpanel2.add(getJScrollPane(),null);
					
					jpanel2.add(jLabelResultado, null);
					jpanel2.add(jLabelResultadoList,null);
					jpanel2.add(jLabelIformacoes,null);
					jpanel2.add(getJButtonExcluirLista(),null);
					
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
			jButton7.setBounds(new Rectangle(528, 0, 121, 48));
			jButton7.setBackground(Color.white);
			Icon listar = new ImageIcon("imagens/Filestext.gif");
			jButton7.setIcon(listar);
			jButton7.setText("Novo");
			jButton7.setToolTipText("Novo registro.");
			jButton7.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					limpar();
					getJTextFieldNomeDaPeca().setEditable(true);
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
			jButton8.setBounds(new Rectangle(648, 0, 141, 48));
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
		 getJTextArea().setText("");
		 getJTextFieldMarca().setText("");
		 getJTextFieldModelo().setText("");
		 getJTextFieldNomeDaPeca().setText("");
		
		
		
		
		
	}


	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabelQuantidadeMaxima = new JLabel();
			jLabelQuantidadeMaxima.setBounds(new Rectangle(516, 47, 125, 20));
			jLabelQuantidadeMaxima.setText("Quantitade máxima :");
			jLabelQuantidadeMinima = new JLabel();
			jLabelQuantidadeMinima.setBounds(new Rectangle(333, 48, 114, 16));
			jLabelQuantidadeMinima.setText("Quantitade mínima :");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBackground(Color.white);
			jPanel1.setBounds(new Rectangle(0, 48, 790, 515));
			jPanel1.add(jLabelNome, null);
			jPanel1.add(getJTextFieldNomeDaPeca(), null);
			jPanel1.add(getJTextFieldMarca(), null);
			jPanel1.add(jLabelCPFCGC, null);
			jPanel1.add(jLabelEndereco, null);
			jPanel1.add(getJTextFieldModelo(), null);
			
			jPanel1.add(jLabelDiscricao, null);
			jPanel1.add(getJTextArea(), null);
			jPanel1.add(jLabelQuantidadeMinima, null);
			jPanel1.add(getJTextFieldMinima(), null);
			jPanel1.add(getJTextFieldMaxima(), null);
			jPanel1.add(jLabelQuantidadeMaxima, null);
			
			
		}
		return jPanel1;
	}
	
	
	public JPanel getJpanel2(){
		if(jpanel2 ==null){
			jLabelResultadoList = new JLabel();
			jLabelResultadoList.setBounds(new Rectangle(117, 447, 518, 23));
			jLabelResultadoList.setText("");
			jLabelIformacoes = new JLabel();
			jLabelIformacoes.setBounds(new Rectangle(19, 449, 89, 19));
			jLabelIformacoes.setText("Informações :");
			jpanel2= new JPanel();
			jpanel2.setLayout(null);
			jpanel2.setBackground(Color.WHITE);
			jpanel2.setBounds(new Rectangle(0, 51, 790, 515));
			jpanel2.add(getJButtonOk(),null);
			jpanel2.add(getJButtonCancel(),null);
			
			jLabelResultado = new JLabel();
			jLabelResultado.setBounds(new Rectangle(19, 3, 99, 20));
			jLabelResultado.setText("Lista de peças :");
			jpanel2.add(jLabelResultado, null);
			jpanel2.add(getJScrollPane(), null);
			jpanel2.add(jLabelIformacoes, null);
			jpanel2.add(jLabelResultadoList, null);
			jpanel2.add(getJButtonExcluirLista(), null);
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
					DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
					DiscricaoFacade facade = new DiscricaoFacade();
					if(jList.getSelectedValue() != null){
		             	pecas.setDadosDiscricaoDePecasNome((String)(jList.getSelectedValue()));
		             	
		             	
		             	facade.pesquisaSimples(pecas);
		             	mostrarValores(pecas);
		             	
		             	subir();
		             	abre++;
		             	jpanel2.removeAll();
		             	getJTextFieldNomeDaPeca().setEditable(false);
		             	
		             	//System.out.println(valorsel);
		             	}
		             	else{ JOptionPane.showMessageDialog(null, "É necessário selecionar um item");}
		                     	
		             	}

				}
			);
		}
		return jButtonOk;
	}
	private JList getJList() {
		if (jList == null) {
			jList = new JList(getModelo());
			jList.setBounds(new Rectangle(18, 25, 644, 456));
			
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
							
			jList.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyPressed(java.awt.event.KeyEvent e) {
					String valor = (String)(jList.getSelectedValue());
					DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
					DiscricaoFacade facade = new DiscricaoFacade();
					pecas.setDadosDiscricaoDePecasNome(valor);
					facade.pesquisaSimples(pecas);
					jLabelResultadoList.setText("nome : "+pecas.getDadosDiscricaoDePecasNome()+" |  modelo : "+pecas.getDadosDiscricaoDePecasModelo()+"\n marca : "+pecas.getDadosDiscricaoDePecasMarca() );
				}
			});
			jList.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String valor = (String)(jList.getSelectedValue());
					DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
					DiscricaoFacade facade = new DiscricaoFacade();
					pecas.setDadosDiscricaoDePecasNome(valor);
					facade.pesquisaSimples(pecas);
					jLabelResultadoList.setText("nome : "+pecas.getDadosDiscricaoDePecasNome()+" |  modelo : "+pecas.getDadosDiscricaoDePecasModelo()+" |  marca : "+pecas.getDadosDiscricaoDePecasMarca() );
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
			jButtonCancel.setBounds(new Rectangle(723, 13, 52, 52));
			jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					getJpanel2().remove(getJList());
					getModelo().clear();
					
					subir();
					jpanel2.removeAll();
					abre++;
					
					
								
					
													
				}
			});
		}
		return jButtonCancel;
	}
	public void subir (){
		
		
		getJPanel1().setBounds(new Rectangle(0, 48, 790, 515));	
		
		
		
			
	}
	public void mostrarValores(DadosDescricaoDePecas pecas){
		 getJTextArea().setText(pecas.getDadosDiscricaoDePecasDescricao());
		 getJTextFieldMarca().setText(pecas.getDadosDiscricaoDePecasMarca());
		 getJTextFieldModelo().setText(pecas.getDadosDiscricaoDePecasModelo());
		 getJTextFieldNomeDaPeca().setText(pecas.getDadosDiscricaoDePecasNome());
		 getJTextFieldMinima().setText(""+pecas.getDadosDiscricaoDePecasMinima());
		 getJTextFieldMaxima().setText(""+pecas.getDadosDiscricaoDePecasMaxima());
		
		
		
		
	}
	public DefaultListModel getModelo() {
		if(modelo == null){
			modelo = new DefaultListModel();
			
			
		}return modelo ;
	}
	
	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane(getJList());
			jScrollPane.setBounds(new Rectangle(18, 25, 644, 419));
			jScrollPane.setViewportView(getJList());
		}
		return jScrollPane;
	}
	
	
				
		
			
	public void pegarLista(){
		DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
		DiscricaoFacade  facade = new DiscricaoFacade();
		Collection<DadosDescricaoDePecas> lista = new LinkedList<DadosDescricaoDePecas>();
		HashMap<String, String> map = new HashMap<String, String>();
		String valor ="asxerftgdsdsx";
		map.put("discricao_nome",valor );
		String resultado = "";
		try {
			lista = facade.buscaTudo(map);
			if(lista==null){
				JOptionPane.showMessageDialog(null,"Nenhum registro encontrado com o parametro solicitado.");
			}else{
				for (DadosDescricaoDePecas listaPecas : lista) {
					getModelo().addElement(listaPecas.getDadosDiscricaoDePecasNome());
					
					
				}
				
			}
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null,e1.getMessage());
		} 
		
		
		
		
		
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
					DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
					DiscricaoFacade facade = new DiscricaoFacade();
					if(jList.getSelectedValue() != null){
		             	
		             	int resposta = JOptionPane.showConfirmDialog(null,"Você deseja deletar esse registro ?");
						
						if (resposta== 0){ 
						      
							pecas.setDadosDiscricaoDePecasNome((String)(jList.getSelectedValue()));
			             	
			             	
			             	facade.excluir(pecas);
			             	
			             	getModelo().clear();
			             	pegarLista();
							
						    } 
		             	
		             	
		             	//System.out.println(valorsel);
		             	}
		             	else{ JOptionPane.showMessageDialog(null, "É necessário selecionar um item");}
		                     	
		             	}
				
			});
		
		
		}
		return jButtonExcluirLista;
	}


	/**
	 * This method initializes jTextFieldMinima	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMinima() {
		if (jTextFieldMinima == null) {
			jTextFieldMinima = new JTextField();
			jTextFieldMinima.setBounds(new Rectangle(453, 47, 60, 20));
			jTextFieldMinima.setBackground(new Color(238, 238, 238));
			
		}
		return jTextFieldMinima;
	}


	/**
	 * This method initializes jTextFieldMaxima	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMaxima() {
		if (jTextFieldMaxima == null) {
			jTextFieldMaxima = new JTextField();
			jTextFieldMaxima.setBounds(new Rectangle(644, 47, 52, 20));
			jTextFieldMaxima.setToolTipText("Digite aqui o endereço");
			jTextFieldMaxima.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldMaxima;
	}
	
	
}
