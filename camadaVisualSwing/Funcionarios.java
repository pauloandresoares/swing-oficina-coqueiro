package camadaVisualSwing;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JTextPane;
import javax.swing.JToolBar;

import dto.DadosCliente;
import dto.DadosDescricaoDePecas;
import dto.DadosEstoque;
import dto.DadosFornecedor;
import dto.DadosFuncionarios;
import dto.DadosPecas;
import facade.ClienteFacade;
import facade.DiscricaoFacade;
import facade.EstoqueFacade;
import facade.FornecedorFacade;
import facade.FuncionarioFacade;
import facade.PecasFacade;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import net.sf.nachocalendar.components.DateField;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.ComponentOrientation;

public class Funcionarios extends JInternalFrame {

	
	private static final long serialVersionUID = 1L;
	private DefaultListModel modelo = null;

	private JPanel jContentPane = null;

	private JPanel jPanel = null;

	private JButton jButton = null;

	private JButton jButton1Incluir = null;

	private JButton jButton1 = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JButton jButton4 = null;

	private JButton jButton5 = null;

	private JButton jButton6 = null;

	private JButton jButton8 = null;

	private JPanel jpanel2;
	private JButton jButtonCancel = null;
	private JButton jButtonOk =  null;
	private int abre = 0;
	
	private JLabel jLabelResultado;
	
	private JPanel jPanel1 = null;  //  @jve:decl-index=0:visual-constraint="528,1194"
	private JTextArea jTextArea = null;
	private JScrollPane jScrollPane = null;

	private JButton jButton7 = null;

	
	private JTable jTable1 = null;
	private DefaultTableModel dtm = null;
	private JButton jButtonEcluir = null;
	private JLabel jLabelNome = null;

	private JTextField jTextFieldNome = null;

	private JTextField jTextFieldCodigo = null;

	private JLabel jLabelCodigo = null;

	private JLabel jLabelEndereco = null;

	private JTextField jTextFieldEndereco = null;

	private JLabel jLabelTelFax = null;

	private JTextField jTextFieldTelFax = null;
	
	
	

	public Funcionarios() {
		super();
		initialize();
		
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Funcionários");
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
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(getJPanel(),null);
			jContentPane.add(getJPanel1(),null);
			
			
			
		}
		return jContentPane;
	}


	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(0, 0, 791, 49));
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
			jPanel.add(getJButton7(), null);
			
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
						DadosFuncionarios func = new DadosFuncionarios();
						FuncionarioFacade facade = new FuncionarioFacade();
						func.setFuncionarioCodigo(valorCodigo);
						facade.excluirFuncionario(func);
						JOptionPane.showMessageDialog(null, "Registro com o codigo numero "+valorCodigo +", excluido com sucesso!");
						limpar();
						}
						}catch(Exception e2) {
							
							JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'Consultar' o registro, seleciona-lo para poder deleta-lo em seguida. ");
						}
				}
			});
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
			jButton1Incluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					 try{
						 int codigo = Integer.parseInt(getJTextFieldCodigo().getText());
						 JOptionPane.showMessageDialog(null, "Registro não pode ser inserido, ele já existe!");
					 
					 }
				catch(Exception e2){}
				String nome = getJTextFieldNome().getText();
				
				
				
				if (!nome.equals("")) {
					DadosFuncionarios func = new DadosFuncionarios();
					FuncionarioFacade facade = new FuncionarioFacade();
					func.setFuncionarioNome(getJTextFieldNome().getText());
					func.setFuncionarioEndereco(getJTextFieldEndereco().getText());
					func.setFuncionarioTel(getJTextFieldTelFax().getText());
					facade.incluirFuncionario(func);
					facade.ultimo(func);
								
					JOptionPane.showMessageDialog(null, "O codigo do funcionário é :"+func.getFuncionarioCodigo());
					limpar();
					
				 }else{
					 JOptionPane.showMessageDialog(null, "Os campos obrigatórios devem ser preenchidos !");
					 
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
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFuncionarios func = new DadosFuncionarios();
					FuncionarioFacade facade = new FuncionarioFacade();
					facade.primeiro(func);
					mostrarValores(func);
					getJButton1().setEnabled(false);
					getJButton4().setEnabled(true);
					getJButton3().setEnabled(true);
					
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
			jButton2.setBounds(new Rectangle(683, 0, 36, 48));
			Icon voltar = new ImageIcon("imagens/anterior2.gif");
			jButton2.setIcon(voltar);
			jButton2.setBackground(Color.white);
			jButton2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFuncionarios func = new DadosFuncionarios();
					FuncionarioFacade facade = new FuncionarioFacade();
					if(getJTextFieldCodigo().getText() != ""){
						getJButton3().setEnabled(true);
						getJButton4().setEnabled(true);
						int codigo =Integer.parseInt(getJTextFieldCodigo().getText());
						String nada ="";
						String nome = "";
						facade.primeiro(func);
						int codigoPrimeiro = func.getFuncionarioCodigo();					
						func = new DadosFuncionarios();
						
						do{
							codigo--;
							func.setFuncionarioCodigo(codigo);
							facade.pesquisaCodigo(func);
							
							nome = func.getFuncionarioNome();
							if(nome==null)nome ="";
																			
						
						}while((nome.equals(nada)&&(codigo>=codigoPrimeiro)) );
						if(codigo>=codigoPrimeiro){
						mostrarValores(func);
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
			jButton3.setBounds(new Rectangle(719, 0, 36, 48));
			Icon avancar = new ImageIcon("imagens/proxime.gif");
			jButton3.setIcon(avancar);
			jButton3.setBackground(Color.white);
			jButton3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFuncionarios func = new DadosFuncionarios();
					FuncionarioFacade facade = new FuncionarioFacade();
					if(getJTextFieldCodigo().getText() != ""){
						getJButton2().setEnabled(true);
						getJButton1().setEnabled(true);
						int codigo =Integer.parseInt(getJTextFieldCodigo().getText());
						String nada ="";
						String nome = "";
						facade.ultimo(func);
						int codigoUltimo = func.getFuncionarioCodigo();					
						func = new DadosFuncionarios();
						
						do{
							codigo++;
							func.setFuncionarioCodigo(codigo);
							facade.pesquisaCodigo(func);
							nome = func.getFuncionarioNome();
							if(nome==null)nome ="";
																			
						
						}while((nome.equals(nada)&&(codigo<=codigoUltimo)) );
						if(codigo<=codigoUltimo){
						mostrarValores(func);
						}else{
							
							jButton3.setEnabled(false);
							getJButton4().setEnabled(false);
						}
						
						
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
			Icon ultimo =  new ImageIcon("imagens/fin.gif");
			jButton4.setIcon(ultimo);
			jButton4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				//DadosPecas pecas = new DadosPecas();
				//PecasFacade facade = new PecasFacade();
				//facade.ultimo(func);
				//mostrarValores(func);
				getJButton1().setEnabled(true);
				getJButton3().setEnabled(false);
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
					DadosFuncionarios func = new DadosFuncionarios();
					FuncionarioFacade facade = new FuncionarioFacade();
					func.setFuncionarioCodigo(valorCodigo);
					func.setFuncionarioNome(getJTextFieldNome().getText());
					func.setFuncionarioTel(getJTextFieldTelFax().getText());
					func.setFuncionarioEndereco(getJTextFieldEndereco().getText());
					facade.alterarFuncionario(func);
					
					int codigo = Integer.parseInt(getJTextFieldCodigo().getText());
					 JOptionPane.showMessageDialog(null, "Registro com o codigo "+codigo+", foi alterado com sucesso!"); 
					}
					limpar();
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
			jButton6.setBounds(new Rectangle(324, 0, 110, 48));
			jButton6.setBackground(Color.white);
			Icon consulta = new ImageIcon("imagens/find.gif");
			jButton6.setText("Listar");
			jButton6.setIcon(consulta);
			jButton6.setToolTipText("Consultar");
			jButton6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					limpar();
					getJPanel1().setBounds(new Rectangle(0, 580, 790, 515));
					
					getJContentPane().add(getJpanel2(),null);
					
					
					if(abre > 0){
					
					dtm.setNumRows(0);
						
					jpanel2.add(getJButtonOk(),null);
					jpanel2.add(getJButtonCancel(),null);
					
					jLabelResultado = new JLabel();
					jLabelResultado.setBounds(new Rectangle(19, 3, 99, 20));
					jLabelResultado.setText("Lista de peças :");
					jpanel2.add(getJScrollPane(),null);
					
					jpanel2.add(jLabelResultado, null);
					jpanel2.add(getJButtonEcluir(), null);
					
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
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(1, 49, 790, 510));
			jPanel1.setBackground(Color.white);
			
			jLabelTelFax = new JLabel();
			jLabelTelFax.setBounds(new Rectangle(7, 36, 62, 19));
			jLabelTelFax.setText("Tel/Fax :");
			jLabelEndereco = new JLabel();
			jLabelEndereco.setBounds(new Rectangle(8, 58, 60, 19));
			jLabelEndereco.setText("Endereço :");
			jLabelCodigo = new JLabel();
			jLabelCodigo.setBounds(new Rectangle(7, 9, 59, 22));
			jLabelCodigo.setText("Código :");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(202, 12, 47, 20));
			jLabelNome.setText("Nome :");
			
			
			jPanel1.add(jLabelNome, null);
			jPanel1.add(getJTextFieldNome(), null);
			jPanel1.add(getJTextFieldCodigo(), null);
			jPanel1.add(jLabelCodigo, null);
			jPanel1.add(jLabelEndereco, null);
			jPanel1.add(getJTextFieldEndereco(), null);
			jPanel1.add(jLabelTelFax, null);
			jPanel1.add(getJTextFieldTelFax(), null);
			
			
			
			
		}
		return jPanel1;
	}
	
	private JTextField getJTextFieldNome() {
		if (jTextFieldNome == null) {
			jTextFieldNome = new JTextField(40);
			jTextFieldNome.setBounds(new Rectangle(256, 11, 350, 21));
			jTextFieldNome.setBackground(new Color(238, 238, 238));
			jTextFieldNome.setToolTipText("Digito aqui o nome do funcionario. Ex: José da Silva ou Nome da Empresa LTDA.");
		}
		return jTextFieldNome;
	}
	
	private JTextField getJTextFieldCodigo() {
		if (jTextFieldCodigo == null) {
			jTextFieldCodigo = new JTextField(8);
			jTextFieldCodigo.setBounds(new Rectangle(72, 10, 121, 21));
			jTextFieldCodigo.setEditable(false);
			jTextFieldCodigo.setBackground(new Color(238, 238, 238));
			
			
		}
		return jTextFieldCodigo;
	}
	private JTextField getJTextFieldEndereco() {
		if (jTextFieldEndereco == null) {
			jTextFieldEndereco = new JTextField();
			jTextFieldEndereco.setBounds(new Rectangle(71, 57, 445, 20));
			jTextFieldEndereco.setBackground(new Color(238, 238, 238));
			jTextFieldEndereco.setToolTipText("Digite aqui o endereço");
		}
		return jTextFieldEndereco;
	}


	/**
	 * This method initializes jTextFieldTelFax	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelFax() {
		if (jTextFieldTelFax == null) {
			jTextFieldTelFax = new JTextField();
			jTextFieldTelFax.setBounds(new Rectangle(72, 35, 181, 20));
			jTextFieldTelFax.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldTelFax;
	}



	public JPanel getJpanel2(){
		if(jpanel2 ==null){
			jpanel2= new JPanel();
			jpanel2.setLayout(null);
			jpanel2.setBackground(Color.WHITE);
			jpanel2.setBounds(new Rectangle(0, 51, 790, 515));
			jpanel2.add(getJButtonOk(),null);
			jpanel2.add(getJButtonCancel(),null);
			
			jLabelResultado = new JLabel();
			jLabelResultado.setBounds(new Rectangle(18, 2, 171, 20));
			jLabelResultado.setText("Lista de peças :");
			jpanel2.add(jLabelResultado, null);
			jpanel2.add(getJScrollPane(), null);
			jpanel2.add(getJButtonEcluir(), null);
		}
			
		return jpanel2;
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
					subir();
					getJpanel2().removeAll();
					abre++;
					
					
								
					
													
				}
			});
		}
		return jButtonCancel;
	}
	private JButton getJButtonOk() {
		if (jButtonOk == null) {
			jButtonOk = new JButton();
			jButtonOk.setBackground(Color.white);
			Icon image = new ImageIcon("imagens/confirmado.gif");
			jButtonOk.setIcon(image);
			jButtonOk.setBounds(new Rectangle(667, 13, 52, 52));
			jButtonOk.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFuncionarios func = new DadosFuncionarios();
					FuncionarioFacade facade = new FuncionarioFacade();
					
					int l = getJTable1().getSelectedRow();
					if(l<0){
						JOptionPane.showMessageDialog(null, "Primeiro, selecione um valor na Tabela");
						
					}else{
					String codigo = ""+getJTable1().getValueAt(l, 2);
								
					func.setFuncionarioCodigo(Integer.parseInt(codigo));
					facade.pesquisaCodigo(func);
			
					mostrarValores(func);
		            
					getJpanel2().removeAll();
		             	subir();
		             	abre++;
		             	
					} 	
		             	

				}}
			);
		}
		return jButtonOk;
	}
	public DefaultListModel getModelo() {
		if(modelo == null){
			modelo = new DefaultListModel();
			
			
		}return modelo ;
	}


	public void mostrarValores(DadosFuncionarios func){
		getJTextFieldCodigo().setText(""+func.getFuncionarioCodigo());
		getJTextFieldNome().setText(func.getFuncionarioNome());
		getJTextFieldEndereco().setText(func.getFuncionarioEndereco());
		getJTextFieldTelFax().setText(func.getFuncionarioTel());
		
		
	}


	


	
	


	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			
			jScrollPane.setBounds(new Rectangle(18, 25, 644, 403));
			jScrollPane.setViewportView(getJTable1());
		}
		return jScrollPane;
	}


	public void subir (){
		
		
		getJPanel1().setBounds(new Rectangle(0, 48, 790, 515));	
		
		
		
			
	}
	public void limpar(){
		getJTextFieldCodigo().setText("");
		getJTextFieldNome().setText("");
		getJTextFieldEndereco().setText("");
		getJTextFieldTelFax().setText("");
		
	}


	public void pegarLista(){
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
								
             	JOptionPane.showMessageDialog(null,"Nenhum registro encontrado !");
			}else{
				
				dtm = (DefaultTableModel) getJTable1().getModel();
				
				
				
								
				for (DadosFuncionarios dadosFuncionarios : lista) {
					//getModelo().addElement(listaPecas.getPecaNome());
					
					
					
										
					dtm.addRow(new Object[]{dadosFuncionarios.getFuncionarioNome(),dadosFuncionarios.getFuncionarioEndereco(),dadosFuncionarios.getFuncionarioCodigo()});
					
				}
				
				
			}
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null,e1.getMessage());
		} 
		
		
		
		
		
	}


	/**
	 * This method initializes jButton7	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setBounds(new Rectangle(433, 0, 121, 48));
			Icon image = new ImageIcon("imagens/files2.gif");
			jButton7.setIcon(image);
			jButton7.setText("Novo");
			
			jButton7.setBackground(Color.white);
			jButton7.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					limpar();
				}
			});
		}
		return jButton7;
	}


	/**
	 * This method initializes jTable1	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable1() {
		if (jTable1 == null) {
			jTable1 = new JTable();
			jTable1.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] { },
		            new String [] {"Nome","Endereço","Código"}));
			
			
        			jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			
		}
		return jTable1;
	}


	/**
	 * This method initializes jButtonEcluir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonEcluir() {
		if (jButtonEcluir == null) {
			jButtonEcluir = new JButton();
			jButtonEcluir.setBounds(new Rectangle(667, 72, 108, 28));
			jButtonEcluir.setBackground(Color.white);
			jButtonEcluir.setText("Excluir");
			jButtonEcluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosFuncionarios func = new DadosFuncionarios();
					FuncionarioFacade facade = new FuncionarioFacade();
					
					int l = getJTable1().getSelectedRow();
					if(l<0){
						JOptionPane.showMessageDialog(null, "Primeiro, selecione um valor na Tabela");
						
					}else{
					String codigo = ""+getJTable1().getValueAt(l, 2);
										
					
					func.setFuncionarioCodigo(Integer.parseInt(codigo));
					
					facade.excluirFuncionario(func);
					
						
					
					dtm.removeRow(l);
		            
					
		             	
					} 
		            
					
		             	
					} 
					
					
					
				
			});
		}
		return jButtonEcluir;
	}
	
	
		
	
}
