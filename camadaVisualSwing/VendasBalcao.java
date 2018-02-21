package camadaVisualSwing;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTextPane;
import javax.swing.text.MaskFormatter;
import javax.swing.JDesktopPane;


public class VendasBalcao extends JInternalFrame {

	public static final long serialVersionUID = 1L;

	public JPanel jContentPane = null;

	public JTextField jTextFieldData = null;

	public JTextField jTextFieldCodigo = null;

	public JLabel jLabelCodigo = null;

	public JTextField jTextFieldPeca1 = null;

	public JLabel jLabelPeca = null;

	public JComboBox jComboBoxPeca1 = null;

	public JLabel jLabelBairro = null;

	public JTextField jTextFieldBairro = null;

	public JLabel jLabelValorUnitario = null;

	public JTextField jTextFieldCidade = null;

	public JLabel jLabelUF = null;

	public JComboBox jComboBox1 = null;

	public JLabel jLabelContato = null;

	public JTextField jTextFieldValorTotal = null;

	public JPanel jPanel = null;

	public JButton jButton = null;

	public JButton jButton1Incluir = null;

	public JButton jButton1 = null;

	public JButton jButton2 = null;

	public JButton jButton3 = null;

	public JButton jButton4 = null;

	public JButton jButton6 = null;

	public JButton jButton7 = null;

	public JButton jButton8 = null;
	
	public JFormattedTextField tfData = null;

	public JLabel jLabelData = null;

	public JTextField jTextFieldNome = null;

	public JPanel jPanel1 = null;

	public JDesktopPane jDesktopPane = null;
	public boolean abrirConsulta =false; 
	
	

	public VendasBalcao() {
		super();
		initialize();
		
		
	}
	
	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Cliente");
		this.setVisible(true); 
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
			public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
				subir();
				System.out.println("Subir JInternalFame");
			}
		});
		
		
		
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelData = new JLabel();
			jLabelData.setText("Data :");
			jLabelData.setBounds(new Rectangle(499, 14, 43, 20));
			jLabelContato = new JLabel();
			jLabelContato.setText("Valor Total :");
			jLabelContato.setBounds(new Rectangle(560, 68, 70, 19));
			jLabelUF = new JLabel();
			jLabelUF.setText("Estoque :");
			jLabelUF.setBounds(new Rectangle(153, 66, 64, 19));
			jLabelValorUnitario = new JLabel();
			jLabelValorUnitario.setText("Valor unitário :");
			jLabelValorUnitario.setBounds(new Rectangle(382, 66, 89, 19));
			jLabelBairro = new JLabel();
			jLabelBairro.setText("Quantidade :");
			jLabelBairro.setBounds(new Rectangle(6, 64, 76, 19));
			jLabelPeca = new JLabel();
			jLabelPeca.setText("Peça :");
			jLabelPeca.setBounds(new Rectangle(6, 41, 52, 19));
			jLabelCodigo = new JLabel();
			jLabelCodigo.setText("Código :");
			jLabelCodigo.setBounds(new Rectangle(6, 15, 52, 22));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getTfData(), null);
			jContentPane.add(getJPanel1(), null);
		}
		return jContentPane;
	}

	
	
	
	
	
	private static MaskFormatter setMascara(String mascara){
		MaskFormatter mask = null;
		try {
		mask = new MaskFormatter(mascara);
		mask.setPlaceholderCharacter('_');
		}
		catch (java.text.ParseException exc) { }
		return mask;
		}
	
	
	
	
	public JFormattedTextField getTfData(){
		if(tfData==null){
			tfData= new JFormattedTextField(setMascara("##/##/####"));
			
			tfData.setBounds(new Rectangle(540, 14, 74, 21));
			tfData.setBackground(new Color(238, 238, 238));
		}
			
		return tfData;
	}


	/**
	 * This method initializes jTextFieldCodigo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodigo() {
		if (jTextFieldCodigo == null) {
			jTextFieldCodigo = new JTextField(8);
			jTextFieldCodigo.setBackground(new Color(238, 238, 238));
			jTextFieldCodigo.setBounds(new Rectangle(60, 15, 129, 21));
			
			
		}
		return jTextFieldCodigo;
	}


	/**
	 * This method initializes jTextFieldPeca1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPeca1() {
		if (jTextFieldPeca1 == null) {
			jTextFieldPeca1 = new JTextField();
			jTextFieldPeca1.setBackground(new Color(238, 238, 238));
			jTextFieldPeca1.setBounds(new Rectangle(60, 41, 85, 20));
		}
		return jTextFieldPeca1;
	}


	/**
	 * This method initializes jComboBoxPeca1	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxPeca1() {
		if (jComboBoxPeca1 == null) {
			jComboBoxPeca1 = new JComboBox();
			jComboBoxPeca1.setBounds(new Rectangle(149, 40, 430, 21));
			String listaTipo [] = {"","",""};
			jComboBoxPeca1.addItem(listaTipo[0]);
			jComboBoxPeca1.addItem(listaTipo[1]);
			jComboBoxPeca1.addItem(listaTipo[2]);
			
		}
		return jComboBoxPeca1;
	}


	/**
	 * This method initializes jTextFieldBairro	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldBairro() {
		if (jTextFieldBairro == null) {
			jTextFieldBairro = new JTextField();
			jTextFieldBairro.setBackground(new Color(238, 238, 238));
			jTextFieldBairro.setBounds(new Rectangle(85, 65, 64, 20));
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
			jTextFieldCidade.setBackground(new Color(238, 238, 238));
			jTextFieldCidade.setBounds(new Rectangle(473, 67, 82, 20));
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
			jComboBox1.setBounds(new Rectangle(222, 65, 156, 19));
			String listaUF [] = {""};
			
			for(int i=0; i < listaUF.length; i ++ ){
				jComboBox1.addItem(listaUF[i]);
			}
		}
		return jComboBox1;
	}


	/**
	 * This method initializes jTextFieldValorTotal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldValorTotal() {
		if (jTextFieldValorTotal == null) {
			jTextFieldValorTotal = new JTextField();
			jTextFieldValorTotal.setBackground(new Color(238, 238, 238));
			jTextFieldValorTotal.setBounds(new Rectangle(631, 68, 78, 19));
		}
		return jTextFieldValorTotal;
	}


	public JPanel getJPanel() {
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
			jPanel.add(getJButton6(), null);
			jPanel.add(getJButton7(), null);
			jPanel.add(getJButton8(), null);
			jPanel.add(getJDesktopPane(), null);
			
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
			jButton.setBounds(new Rectangle(148, 0, 135, 48));
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
			jButton1Incluir.setBounds(new Rectangle(0, 0, 148, 48));
			Icon incluir = new ImageIcon("imagens/Applications.gif");
			jButton1Incluir.setIcon(incluir);
			jButton1Incluir.setText("Incluir");
			jButton1Incluir.setToolTipText("Incluir Registro");
			jButton1Incluir.setBackground(Color.white);
			jButton1Incluir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					
					subir();
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
	 * This method initializes jButton6	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setBounds(new Rectangle(283, 0, 149, 48));
			jButton6.setBackground(Color.white);
			Icon consulta = new ImageIcon("imagens/find.gif");
			jButton6.setText("Consultar");
			jButton6.setIcon(consulta);
			jButton6.setToolTipText("Consultar");
			jButton6.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					getJPanel1().setBounds(new Rectangle(0, 205, 790, 330));
				
					getJContentPane().add(getJDesktopPane(),null);
					getJDesktopPane().removeAll();
					
					
					
				
				
					
					
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
			jButton7.setBounds(new Rectangle(431, 0, 124, 48));
			jButton7.setBackground(Color.white);
			Icon listar = new ImageIcon("imagens/Filestext.gif");
			jButton7.setIcon(listar);
			jButton7.setText("Ticket");
			
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
	 * This method initializes jTextFieldNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	JTextField getJTextFieldNome() {
		if (jTextFieldNome == null) {
			jTextFieldNome = new JTextField();
			
			jTextFieldNome.setEditable(false);
			jTextFieldNome.setBounds(new Rectangle(192, 14, 302, 21));
			jTextFieldNome.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldNome;
	}


	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	public JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBackground(Color.white);
			jPanel1.setBounds(new Rectangle(0, 48, 790, 330));
			jPanel1.add(jLabelCodigo, null);
			jPanel1.add(getJTextFieldCodigo(), null);
			jPanel1.add(getJTextFieldNome(), null);
			jPanel1.add(jLabelData, null);
			jPanel1.add(jLabelPeca, null);
			jPanel1.add(getJTextFieldPeca1(), null);
			jPanel1.add(getJComboBoxPeca1(), null);
			jPanel1.add(jLabelBairro, null);
			jPanel1.add(getJTextFieldBairro(), null);
			jPanel1.add(jLabelUF, null);
			jPanel1.add(getJComboBox1(), null);
			jPanel1.add(jLabelValorUnitario, null);
			jPanel1.add(getJTextFieldCidade(), null);
			jPanel1.add(jLabelContato, null);
			jPanel1.add(getJTextFieldValorTotal(), null);
			jPanel1.add(getTfData(),null);
		}
		return jPanel1;
	}


	/**
	 * This method initializes jDesktopPane	
	 * 	
	 * @return javax.swing.JDesktopPane	
	 */
	public JDesktopPane getJDesktopPane() {
		if (jDesktopPane == null) {
			jDesktopPane = new JDesktopPane();

			jDesktopPane.setBounds(new Rectangle(0, 51, 790, 155));
			
		}
		return jDesktopPane;
	}
	public void subir(){
		
		
		getJPanel1().setBounds(new Rectangle(0, 48, 790, 330));		
		
		
		
		
	}
	
	

}
