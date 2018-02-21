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
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

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

import javax.swing.JTextPane;
import javax.swing.text.MaskFormatter;


import dto.DadosFornecedor;
import dto.DadosSenha;



import facade.FornecedorFacade;
import facade.SenhaFacade;

import javax.swing.JDesktopPane;



public class Senha extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	private JLabel jLabelNome = null;
	private JTextField jTextFieldNome = null;

	private JTextField jTextFieldCPF = null;

	private JLabel jLabelCPF = null;

	private JLabel jLabelBairro = null;

	private JPasswordField jTextFieldSenha1 = null;

	private JPanel jPanel = null;

	private JButton jButton = null;
	private JButton jButton1Incluir = null;

	private JButton jButton5 = null;

	private JButton jButton6 = null;

	private JButton jButton7 = null;

	private JButton jButton8 = null;
	private JPanel jPanel1 = null;

	private JDesktopPane jDesktopPane = null;

	private JTextField jTextFieldRg = null;

	private JLabel jLabelRG = null;

	private JTextField jTextFieldUsuario = null;

	private JLabel jLabelUsuario = null;

	private JPasswordField jTextFieldSenha2 = null;

	private JLabel jLabelsenha2 = null;
	public Senha() {
		super();
		initialize();
		
		
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Fornecedor");
		this.setVisible(true); 
		
		
		
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelBairro = new JLabel();
			jLabelBairro.setBounds(new Rectangle(6, 115, 153, 19));
			jLabelBairro.setText("Digite aqui a nova senha :");
			jLabelCPF = new JLabel();
			jLabelCPF.setBounds(new Rectangle(6, 49, 60, 19));
			jLabelCPF.setText("CPF.:");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(7, 25, 47, 20));
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
			jTextFieldNome.setBounds(new Rectangle(70, 25, 299, 21));
			jTextFieldNome.setBackground(new Color(238, 238, 238));
			jTextFieldNome.setToolTipText("Digito aqui o nome do cliente. Ex: José da Silva ou Nome da Empresa LTDA.");
		}
		return jTextFieldNome;
	}
	/**
	 * This method initializes jTextFieldCPF	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCPF() {
		if (jTextFieldCPF == null) {
			jTextFieldCPF = new JTextField(15);
			jTextFieldCPF.setBounds(new Rectangle(70, 49, 179, 20));
			jTextFieldCPF.setBackground(new Color(238, 238, 238));
			jTextFieldCPF.setToolTipText("Digite aqui o CPF ou CGC da empresa.");
		}
		return jTextFieldCPF;
	}


	/**
	 * This method initializes jTextFieldSenha1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JPasswordField getJTextFieldSenha1() {
		if (jTextFieldSenha1 == null) {
			jTextFieldSenha1 = new JPasswordField();
			jTextFieldSenha1.setBounds(new Rectangle(165, 115, 123, 20));
			jTextFieldSenha1.setBackground(new Color(238, 238, 238));
			jTextFieldSenha1.setToolTipText("Digite sua senha");
		}
		return jTextFieldSenha1;
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
			jButton.setBounds(new Rectangle(269, 0, 125, 48));
			Icon excluir = new ImageIcon("imagens/Trashfull.gif");
			jButton.setBackground(Color.white);
			jButton.setText("Excluir");
			jButton.setToolTipText("Excluir registro");
			jButton.setIcon(excluir);
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosSenha senha = new DadosSenha();
					SenhaFacade facade = new SenhaFacade();		
					senha.setSenhaUsuario(getJTextFieldUsuario().getText());
					String senhaForm = getJTextFieldSenha1().getText();
					String usuario = getJTextFieldUsuario().getText();
					String nada = "";
					if(!usuario.equals(nada)){
						facade.pegarUsuario(senha);
						String senhaDTO = senha.getSenhaSenha();
					
						if(senhaForm.equals(senhaDTO)){
							facade.excluirUsuario(senha);
							limpar();
							JOptionPane.showMessageDialog(null, "O usuario "+senha.getSenhaUsuario()+ ", foi excluido com sucesso !");
						
						}else{
							JOptionPane.showMessageDialog(null,"Dados não conferem (usuario ou senha), faça uma nova consulta do usuario.");
							
						}
					
					}else{
						
						JOptionPane.showMessageDialog(null,"Você deve fazer uma consulta, para expecificar o registro e logo exclui-lo !");
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
			jButton1Incluir.setBounds(new Rectangle(20, 0, 125, 48));
			Icon incluir = new ImageIcon("imagens/Applications.gif");
			jButton1Incluir.setIcon(incluir);
			jButton1Incluir.setText("Incluir");
			jButton1Incluir.setToolTipText("Incluir Registro");
			jButton1Incluir.setBackground(Color.white);
			jButton1Incluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
						String senha1 = getJTextFieldSenha1().getText();
						String senha2 = getJTextFieldSenha2().getText();
						if(senha1.equals(senha2)){		
						 SenhaFacade facade = new SenhaFacade();
						 DadosSenha ds = new DadosSenha();
						 ds.setSenhaNome(getJTextFieldNome().getText());
						 ds.setSenhaSenha(getJTextFieldSenha1().getText());
						 ds.setSenhaRG(getJTextFieldRg().getText());
						 ds.setSenhaCPF(getJTextFieldCPF().getText());
						 ds.setSenhaUsuario(getJTextFieldUsuario().getText());
				 		
						 facade.incluirUsuario(ds);
						 JOptionPane.showMessageDialog(null,"Usuário inserido com sucesso !!");
						 	
						 limpar();
						}else{
							
							JOptionPane.showMessageDialog(null,"A senha não confere, digite novamente");
							getJTextFieldSenha1().setText("");
							getJTextFieldSenha2().setText("");
							
						}
					}
				 	 
							
			});
		}
		return jButton1Incluir;
	}


	/**
	 * This method initializes jButton5	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setBounds(new Rectangle(145, 0, 125, 48));
			jButton5.setBackground(Color.white);
			Icon alterar = new ImageIcon("imagens/Filesedit.gif"); 
			jButton5.setIcon(alterar);
			jButton5.setText("Alterar");
			jButton5.setToolTipText("Alterar dados");
			jButton5.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosSenha senha = new DadosSenha();
					SenhaFacade facade = new SenhaFacade();		
					senha.setSenhaUsuario(getJTextFieldUsuario().getText());
					
					String usuario = getJTextFieldUsuario().getText();
					
					String nada = "";
					if(!usuario.equals(nada)){
						senha.setSenhaUsuario(getJTextFieldUsuario().getText());
						senha.setSenhaNome(getJTextFieldUsuario().getText());
						senha.setSenhaCPF(getJTextFieldCPF().getText());
						senha.setSenhaRG(getJTextFieldRg().getText());
						senha.setSenhaSenha(getJTextFieldSenha1().getText());
						facade.pegarUsuario(senha);
						String usuarioAntigo = senha.getSenhaUsuario();
						String senhaDTO = senha.getSenhaSenha();
						String senhaForm = JOptionPane.showInputDialog( "Digite a sua senha atual");
						if(senhaForm.equals(senhaDTO)){
							facade.alterarUsuario(senha);
							facade.pegarUsuario(senha);
							
							String usuarioAtual = senha.getSenhaUsuario();
							if(usuarioAntigo.equals(usuarioAtual)){
								JOptionPane.showMessageDialog(null,"O usuario permace o mesmo :  "+usuarioAntigo);
								
							}
							
							limpar();
							
						
						}else{
							JOptionPane.showMessageDialog(null,"Dados não conferem (usuario ou senha), faça uma nova consulta do usuario.");
							
						}		
					}else{
						
						JOptionPane.showMessageDialog(null,"Você deve fazer uma consulta, para expecificar o registro e logo exclui-lo !");
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
			jButton6.setBounds(new Rectangle(394, 0, 125, 48));
			jButton6.setBackground(Color.white);
			Icon consulta = new ImageIcon("imagens/find.gif");
			jButton6.setText("Consultar");
			jButton6.setIcon(consulta);
			jButton6.setToolTipText("Consultar");
			jButton6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					DadosSenha senha = new DadosSenha();
					SenhaFacade facade = new SenhaFacade();
								
								senha.setSenhaUsuario(JOptionPane.showInputDialog("Digite o usuario"));
								String senhaFormulario = JOptionPane.showInputDialog("Digite a sua senha");
								
								facade.pegarUsuario(senha);
								String senhaDTO = senha.getSenhaSenha();
								if(senhaDTO.equals(senhaFormulario)){
								mostrarValores(senha);
								}else{
									JOptionPane.showMessageDialog(null,"Senha ou usuario invalido !");
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
			jButton7.setBounds(new Rectangle(518, 0, 125, 48));
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
			jButton8.setBounds(new Rectangle(642, 0, 125, 48));
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
		getJTextFieldCPF().setText("");
		getJTextFieldRg().setText("");
		getJTextFieldUsuario().setText("");
		getJTextFieldSenha1().setText("");
		getJTextFieldSenha2().setText("");
		getJTextFieldUsuario().setEditable(true);
		 
		
		
		
		
	}


	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabelsenha2 = new JLabel();
			jLabelsenha2.setBounds(new Rectangle(5, 137, 190, 21));
			jLabelsenha2.setText("Digite aqui novamente a senha :");
			jLabelUsuario = new JLabel();
			jLabelUsuario.setBounds(new Rectangle(6, 95, 156, 16));
			jLabelUsuario.setText("Digite aqui o novo usuario:");
			jLabelRG = new JLabel();
			jLabelRG.setBounds(new Rectangle(6, 71, 59, 19));
			jLabelRG.setText("RG.:");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBackground(Color.white);
			jPanel1.setBounds(new Rectangle(0, 48, 790, 330));
			jPanel1.add(jLabelNome, null);
			jPanel1.add(getJTextFieldNome(), null);
			jPanel1.add(getJTextFieldCPF(), null);
			jPanel1.add(jLabelCPF, null);
			jPanel1.add(jLabelBairro, null);
			jPanel1.add(getJTextFieldSenha1(), null);
			jPanel1.add(getJTextFieldRg(), null);
			jPanel1.add(jLabelRG, null);
			jPanel1.add(getJTextFieldUsuario(), null);
			jPanel1.add(jLabelUsuario, null);
			jPanel1.add(getJTextFieldSenha2(), null);
			jPanel1.add(jLabelsenha2, null);
			
			
		}
		return jPanel1;
	}
	
	
		public void mostrarValores(DadosSenha s){
			 getJTextFieldNome().setText(s.getSenhaNome());
			 getJTextFieldSenha1().setText(s.getSenhaSenha());
			 getJTextFieldRg().setText(s.getSenhaRG());
			 getJTextFieldCPF().setText(s.getSenhaCPF());
			 getJTextFieldUsuario().setText(s.getSenhaUsuario());
			 getJTextFieldUsuario().setEditable(false);
			
			
			
			
		}
		
		
		
		
		
	public void limparConsulta(){
		
			
		
	}


	/**
	 * This method initializes jTextFieldRg	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRg() {
		if (jTextFieldRg == null) {
			jTextFieldRg = new JTextField(20);
			jTextFieldRg.setBounds(new Rectangle(70, 71, 180, 20));
			jTextFieldRg.setToolTipText("Digite aqui o nome do bairro");
			jTextFieldRg.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldRg;
	}


	/**
	 * This method initializes jTextFieldUsuario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldUsuario() {
		if (jTextFieldUsuario == null) {
			jTextFieldUsuario = new JTextField(20);
			jTextFieldUsuario.setBounds(new Rectangle(165, 93, 124, 20));
			jTextFieldUsuario.setToolTipText("Digite aqui o nome do bairro");
			jTextFieldUsuario.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldUsuario;
	}


	/**
	 * This method initializes jTextFieldSenha2	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getJTextFieldSenha2() {
		if (jTextFieldSenha2 == null) {
			jTextFieldSenha2 = new JPasswordField();
			jTextFieldSenha2.setBounds(new Rectangle(199, 137, 122, 20));
			jTextFieldSenha2.setToolTipText("Digite sua senha");
			jTextFieldSenha2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldSenha2;
	}
	
	
				
		
			
	
	

}
