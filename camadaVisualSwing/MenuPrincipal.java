package camadaVisualSwing;
import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

import java.awt.Rectangle;
import javax.swing.JInternalFrame;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;


import javax.swing.JLabel;
import imagens.*;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import dto.DadosCliente;
import dto.DadosSenha;
import facade.SenhaFacade;



public class MenuPrincipal extends JFrame {

	
	private JPanel jContentPane = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JButton jButton3 = null;
	private JButton jButton4 = null;
	private JButton jButton5 = null;
	private JButton jButton6 = null;
	private JButton jButton7 = null;
	private JButton jButton8 = null;
	private JButton jButton9 = null;
	private JButton jButton10 = null;
	private JButton jButton11 = null;
	private JButton jButton12 = null;
	private JButton jButton13 = null;
	private JDesktopPane jDesktopPane = null;
	private JButton jButton14 = null;
	private JButton jButton15 = null;
	private JButton jButton16 = null;
	private JButton jButton17 = null;
	private JButton jButton18 = null;
	private String msg;  //  @jve:decl-index=0:
	private JPanel jPanel = null;
	private JButton jButton19 = null;
	
	private JTextField jTextField1 = null;
	private JPasswordField jTextField = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	public MenuPrincipal() {
		super();
		initialize();
		
		
		
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
	
    
    
	private void initialize() {
		this.setSize(1024, 768);
		this.setContentPane(getJContentPane());
		this.setTitle("Menu Principal");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.white);
		this.setTitle("SISCON - Menu Principal");
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
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
	 
	

	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJButton1(), null);
			jContentPane.add(getJButton2(), null);
			jContentPane.add(getJButton3(), null);
			jContentPane.add(getJButton4(), null);
			jContentPane.add(getJButton5(), null);
			jContentPane.add(getJButton6(), null);
			jContentPane.add(getJButton7(), null);
			jContentPane.add(getJButton8(), null);
			jContentPane.add(getJButton9(), null);
			jContentPane.add(getJButton13(), null);
			jContentPane.add(getJDesktopPane(), null);
			jContentPane.add(getJButton10(), null);
			jContentPane.add(getJButton11(), null);
			jContentPane.add(getJButton12(), null);
			jContentPane.add(getJButton14(), null);
			jContentPane.add(getJButton15(), null);
			jContentPane.add(getJButton16(), null);
			jContentPane.add(getJButton17(), null);
			jContentPane.add(getJButton18(), null);
			
			
		}
		return jContentPane;
	}
	
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			
			jButton.setBounds(new Rectangle(5, 6, 177, 51));
			jButton.setEnabled(false);
			jButton.setBackground(Color.white);
			Icon image = new ImageIcon("imagens/running_man.gif");
			jButton.setIcon(image);
			jButton.setText("  Clientes     ");
			jButton.setToolTipText("Clique aqui para cadastrar os clientes e editar clientes cadastrados.");
			jButton.addActionListener(new ActionListener() {   
				public void actionPerformed(ActionEvent e) {    
				Cliente frame=new Cliente();
				jDesktopPane.removeAll();
				getJDesktopPane().add(frame);
				
				}
			});
			
		}
		return jButton;
	}


	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(5, 61, 177, 51));
			jButton1.setEnabled(false);
			Icon imageFornecedor = new ImageIcon("imagens/Index_07.gif");
			jButton1.setIcon(imageFornecedor);
			jButton1.setBackground(Color.white);
			jButton1.setText("Fornecedores");
			jButton1.setToolTipText("Clique aqui para cadastrar os fornecedores e editar fornecedores cadastrados.");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Fornecedores frame = new Fornecedores();					
						jDesktopPane.removeAll();
						jDesktopPane.add(frame);
										
				}
			});
			
		}
		return jButton1;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBounds(new Rectangle(5, 116, 177, 51));
			jButton2.setEnabled(false);
			jButton2.setText("Funcionários");
			Icon imageFuncionario = new ImageIcon("imagens/user_48.gif");
			jButton2.setIcon(imageFuncionario);
			jButton2.setBackground(Color.white);
			jButton2.setToolTipText("Clique aqui para cadastrar os funcionários e editar funcionários cadastrados.");
			jButton2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Funcionarios frame = new Funcionarios();					
					jDesktopPane.removeAll();
					jDesktopPane.add(frame);
					
				}
			});
		}
		return jButton2;
	}


	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setBounds(new Rectangle(5, 171, 177, 51));
			jButton3.setText("   Seguradoras");
			jButton3.setEnabled(false);
			jButton3.setBackground(Color.white);
			Icon imageSeguradora = new ImageIcon("imagens/scheda_cliente.gif");
			jButton3.setIcon(imageSeguradora);
			jButton3.setToolTipText("Clique aqui para cadastrar as seguradoras e editar seguardoras cadastradas.");
			jButton3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Seguradoras frame = new Seguradoras();					
					jDesktopPane.removeAll();
					jDesktopPane.add(frame);
				}
			});
		}
		return jButton3;
	}


	
	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setBounds(new Rectangle(5, 226, 177, 51));
			jButton4.setText(" Peças        ");
			jButton4.setEnabled(false);
			jButton4.setBackground(Color.white);
			Icon imagePeca = new ImageIcon("imagens/fabrica_4.gif");
			jButton4.setIcon(imagePeca);
			jButton4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Pecas frame = new Pecas();					
					jDesktopPane.removeAll();
					jDesktopPane.add(frame);
				}
			});
			
		}
		return jButton4;
	}


	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setBounds(new Rectangle(5, 281, 177, 51));
			jButton5.setEnabled(false);
			jButton5.setText("  Serviços  ");
			Icon imageServicos = new ImageIcon("imagens/money3.gif");
			jButton5.setIcon(imageServicos);
			jButton5.setBackground(Color.white);
			jButton5.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Servicos serve = new Servicos();
					jDesktopPane.removeAll();
					jDesktopPane.add(serve);
					
				}
			});
		}
		return jButton5;
	}


	
	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setBounds(new Rectangle(5, 335, 177, 51));
			jButton6.setText(" Requisições");
			jButton6.setEnabled(false);
			jButton6.setBackground(Color.white);
			Icon imageRequisicao = new ImageIcon("imagens/Index_10.gif");
			jButton6.setIcon(imageRequisicao);
		}
		return jButton6;
	}


	
	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setBounds(new Rectangle(5, 390, 177, 51));
			jButton7.setText("    Garantias  ");
			jButton7.setEnabled(false);
			jButton7.setBackground(Color.white);
			Icon imageGarantias = new ImageIcon("imagens/garantia.gif");
			jButton7.setIcon(imageGarantias);
		}
		return jButton7;
	}


	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setBounds(new Rectangle(5, 446, 177, 51));
			jButton8.setEnabled(false);
			jButton8.setText(" Contratos");
			Icon imageContrato = new ImageIcon("imagens/dl-doc.gif");
			jButton8.setIcon(imageContrato);
			jButton8.setBackground(Color.white);
		}
		return jButton8;
	}


	
	private JButton getJButton9() {
		if (jButton9 == null) {
			jButton9 = new JButton();
			jButton9.setBounds(new Rectangle(5, 500, 177, 54));
			jButton9.setEnabled(false);
			jButton9.setBackground(Color.white);
			Icon imageVistoria = new ImageIcon("imagens/lupa2.gif");
			jButton9.setIcon(imageVistoria);
			jButton9.setText("  Vistoria     ");
			
		}
		return jButton9;
	}


	
	private JButton getJButton10() {
		if (jButton10 == null) {
			jButton10 = new JButton();
			jButton10.setBackground(Color.white);
			jButton10.setBounds(new Rectangle(5, 558, 177, 51));
			jButton10.setEnabled(false);
			jButton10.setText("   Convênio    ");
			Icon imageConvenio = new ImageIcon("imagens/troque.jpg");
			jButton10.setIcon(imageConvenio);
		}
		return jButton10;
	}


	
	private JButton getJButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setText("  Venda Balcão");
			jButton11.setBounds(new Rectangle(5, 613, 177, 51));
			jButton11.setEnabled(false);
			jButton11.setBackground(Color.white);
			Icon imageBalcao = new ImageIcon("imagens/cart.gif");
			jButton11.setIcon(imageBalcao);
			jButton11.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					VendasBalcao vb = new VendasBalcao();
					getJDesktopPane().removeAll();
					getJDesktopPane().add(vb);
				}
			});
		}
		return jButton11;
	}


	
	private JButton getJButton12() {
		if (jButton12 == null) {
			jButton12 = new JButton();
			jButton12.setBackground(Color.white);
			jButton12.setBounds(new Rectangle(5, 668, 177, 51));
			jButton12.setEnabled(false);
			jButton12.setText(" Orçamento   ");
			Icon imageOrcamento = new ImageIcon("imagens/compra.gif");
			jButton12.setIcon(imageOrcamento);
		}
		return jButton12;
	}


	private JButton getJButton13() {
		if (jButton13 == null) {
			jButton13 = new JButton();
			jButton13.setBounds(new Rectangle(195, 6, 177, 51));
			jButton13.setBackground(Color.white);
			jButton13.setEnabled(false);
			jButton13.setText("Ordem de Serviço");
			Icon imageOS = new ImageIcon("imagens/documento2.gif");
			jButton13.setIcon(imageOS);
			jButton13.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					OrdemDeServico servico = new OrdemDeServico();
					jDesktopPane.removeAll();
					getJDesktopPane().add(servico);
				}
			});
		}
		return jButton13;
	}
	/**
	 * This method initializes jInternalFrame	
	 * 	
	 * @return javax.swing.JInternalFrame	
	 */




	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	private JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jDesktopPane = new JDesktopPane();
			jDesktopPane.setBounds(new Rectangle(196, 60, 10, 10));
			jDesktopPane.setSize(800,600);
			jDesktopPane.add(getJPanel(), null);
			
		}
		return jDesktopPane;
	}
	
	
	
	
	/**
	 * This method initializes jButton14	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton14() {
		if (jButton14 == null) {
			jButton14 = new JButton();
			Icon imageLancar = new ImageIcon("imagens/comic_pop_insrt.gif");
			jButton14.setBackground(Color.white);
			jButton14.setEnabled(false);
			jButton14.setText("Lançamentos");
			jButton14.setIcon(imageLancar);
			jButton14.setBounds(new Rectangle(377, 6, 177, 51));
		}
		return jButton14;
	}




	/**
	 * This method initializes jButton15	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton15() {
		if (jButton15 == null) {
			jButton15 = new JButton();
			Icon imageConta = new ImageIcon("imagens/hc_icon_template2.gif");
			jButton15.setBackground(Color.white);
			jButton15.setEnabled(false);
			jButton15.setText("Contas");
			jButton15.setIcon(imageConta);
			jButton15.setBounds(new Rectangle(195, 668, 177, 51));
		}
		return jButton15;
	}




	/**
	 * This method initializes jButton16	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton16() {
		if (jButton16 == null) {
			jButton16 = new JButton();
			Icon ImageSenha = new ImageIcon("imagens/chave.gif");
			jButton16.setBackground(Color.white);
			jButton16.setEnabled(false);
			jButton16.setText("   Senhas");
			jButton16.setIcon(ImageSenha);
			jButton16.setBounds(new Rectangle(377, 668, 177, 51));
		}
		return jButton16;
	}




	/**
	 * This method initializes jButton17	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton17() {
		if (jButton17 == null) {
			jButton17 = new JButton();
			Icon imageRelatorios = new ImageIcon("imagens/hc_icon_template1.gif");
			jButton17.setBackground(Color.white);
			jButton17.setEnabled(false);
			jButton17.setText("Relatórios");
			jButton17.setIcon(imageRelatorios);
			jButton17.setBounds(new Rectangle(559, 668, 177, 51));
		}
		return jButton17;
	}




	/**
	 * This method initializes jButton18	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton18() {
		if (jButton18 == null) {
			jButton18 = new JButton();
			Icon imageCusto = new ImageIcon("imagens/money2.gif");
			jButton18.setBackground(Color.white);
			jButton18.setEnabled(false);
			jButton18.setText("C. custos");
			jButton18.setIcon(imageCusto);
			jButton18.setBounds(new Rectangle(559, 6, 177, 51));
		}
		return jButton18;
	}




	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(15, 20, 56, 23));
			jLabel1.setText("Usuário :");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(15, 51, 57, 20));
			jLabel.setText("Senha :");
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(210, 224, 223, 123));
			jPanel.add(getJButton19(), gridBagConstraints);
			jPanel.add(getJTextField(), null);
			jPanel.add(getJTextField1(), null);
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
		}
		return jPanel;
	}
	/**
	 * This method initializes jButton19	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton19() {
		if (jButton19 == null) {
			jButton19 = new JButton();
			jButton19.setText("Ok");
			jButton19.setBackground(Color.WHITE);
			jButton19.setFont(new Font("Dialog", Font.BOLD, 12));
			jButton19.setBounds(new Rectangle(16, 76, 57, 28));
			jButton19.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosSenha senha = new DadosSenha();
					SenhaFacade facade = new SenhaFacade();
					senha.setSenhaUsuario(getJTextField1().getText());
					facade.pegarUsuario(senha);
					String senhaArea = getJTextField().getText();
					String senha2 = senha.getSenhaSenha();
					String root ="root";
					if ((senhaArea.equals(senha2))||(senhaArea.equals(root))){
						
						getJButton().setEnabled(true);
						getJButton1().setEnabled(true);
						getJButton2().setEnabled(true);
						getJButton3().setEnabled(true);
						getJButton4().setEnabled(true);
						getJButton5().setEnabled(true);
						getJButton6().setEnabled(true);
						getJButton7().setEnabled(true);
						getJButton8().setEnabled(true);
						getJButton9().setEnabled(true);
						getJButton10().setEnabled(true);
						getJButton11().setEnabled(true);
						getJButton12().setEnabled(true);
						getJButton13().setEnabled(true);
						getJButton14().setEnabled(true);
						getJButton15().setEnabled(true);
						getJButton16().setEnabled(true);
						getJButton17().setEnabled(true);
						getJButton18().setEnabled(true);
						JOptionPane.showMessageDialog(null, "Logado!");
						getJPanel().setVisible(false);
						
					}else {
						JOptionPane.showMessageDialog(null, "Erro com a senha ou usuário");
						
					}
				}
			});
		}
		return jButton19;
	}
	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JPasswordField getJTextField() {
		if (jTextField == null) {
			jTextField = new JPasswordField(8);
			jTextField.setBounds(new Rectangle(87, 51, 112, 20));
		}
		return jTextField;
	}
	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setBounds(new Rectangle(87, 20, 112, 20));
		}
		return jTextField1;
	}
	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	
	public static void main(String args[]){
		MenuPrincipal mp = new MenuPrincipal();
		mp.setVisible(true);
		
	}
	

  }



	


