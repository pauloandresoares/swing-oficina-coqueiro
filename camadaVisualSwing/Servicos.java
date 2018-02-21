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

public class Servicos extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JLabel jLabelNome = null;

	private JTextField jTextFieldNome = null;

	private JTextField jTextFieldCodigo = null;

	private JLabel jLabelCodigo = null;

	private JLabel jLabelEndereco = null;

	private JTextField jTextFieldCobrar = null;

	private JLabel jLabelUltima = null;

	private JTextField jTextFieldUltima = null;

	private JLabel jLabelCidade = null;

	private JTextField jTextFieldCidade = null;

	private JLabel jLabelExecucao = null;

	private JTextField jTextFieldExecucao = null;

	private JLabel jLabelCusto = null;

	private JTextField jTextFieldCusto = null;

	private JPanel jPanel = null;

	private JButton jButton = null;

	private JButton jButton1Incluir = null;

	private JButton jButton1 = null;

	private JButton jButton2 = null;

	private JButton jButton3 = null;

	private JButton jButton4 = null;

	private JButton jButton5 = null;

	private JButton jButton7 = null;

	private JButton jButton8 = null;
	

	public Servicos() {
		super();
		initialize();
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Serviços");
		this.setVisible(true); 
		
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelCusto = new JLabel();
			jLabelCusto.setBounds(new Rectangle(203, 100, 42, 19));
			jLabelCusto.setText("Custo :");
			jLabelExecucao = new JLabel();
			jLabelExecucao.setBounds(new Rectangle(7, 101, 132, 19));
			jLabelExecucao.setText("Horas para execução:");
			jLabelCidade = new JLabel();
			jLabelCidade.setBounds(new Rectangle(7, 124, 79, 19));
			jLabelCidade.setText("Aliquota ISS:");
			jLabelUltima = new JLabel();
			jLabelUltima.setBounds(new Rectangle(476, 100, 119, 19));
			jLabelUltima.setText("Ultima atualização :");
			jLabelEndereco = new JLabel();
			jLabelEndereco.setBounds(new Rectangle(338, 100, 48, 19));
			jLabelEndereco.setText("Cobrar :");
			jLabelCodigo = new JLabel();
			jLabelCodigo.setBounds(new Rectangle(7, 75, 59, 22));
			jLabelCodigo.setText("Código :");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(202, 75, 44, 20));
			jLabelNome.setText("Nome :");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBackground(Color.white);
			jContentPane.add(jLabelNome, null);
			jContentPane.add(getJTextFieldNome(), null);
			jContentPane.add(getJTextFieldCodigo(), null);
			jContentPane.add(jLabelCodigo, null);
			jContentPane.add(jLabelEndereco, null);
			jContentPane.add(getJTextFieldCobrar(), null);
			jContentPane.add(jLabelUltima, null);
			jContentPane.add(getJTextFieldUltima(), null);
			jContentPane.add(jLabelCidade, null);
			jContentPane.add(getJTextFieldCidade(), null);
			jContentPane.add(jLabelExecucao, null);
			jContentPane.add(getJTextFieldExecucao(), null);
			jContentPane.add(jLabelCusto, null);
			jContentPane.add(getJTextFieldCusto(), null);
			jContentPane.add(getJPanel(), null);
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
			jTextFieldNome.setBounds(new Rectangle(248, 75, 351, 21));
			jTextFieldNome.setBackground(new Color(238, 238, 238));
			jTextFieldNome.setToolTipText("Digito aqui o nome do funcionario. Ex: José da Silva ou Nome da Empresa LTDA.");
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
			jTextFieldCodigo.setBounds(new Rectangle(71, 75, 122, 21));
			jTextFieldCodigo.setBackground(new Color(238, 238, 238));
			
			
		}
		return jTextFieldCodigo;
	}


	/**
	 * This method initializes jTextFieldCobrar	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCobrar() {
		if (jTextFieldCobrar == null) {
			jTextFieldCobrar = new JTextField();
			jTextFieldCobrar.setBounds(new Rectangle(389, 100, 84, 20));
			jTextFieldCobrar.setBackground(new Color(238, 238, 238));
			jTextFieldCobrar.setToolTipText("Digite aqui o endereço");
		}
		return jTextFieldCobrar;
	}


	/**
	 * This method initializes jTextFieldUltima	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldUltima() {
		if (jTextFieldUltima == null) {
			jTextFieldUltima = new JTextField();
			jTextFieldUltima.setBounds(new Rectangle(600, 99, 78, 20));
			jTextFieldUltima.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldUltima;
	}


	/**
	 * This method initializes jTextFieldCidade	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCidade() {
		if (jTextFieldCidade == null) {
			jTextFieldCidade = new JTextField();
			jTextFieldCidade.setBounds(new Rectangle(90, 123, 84, 20));
			jTextFieldCidade.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCidade;
	}


	/**
	 * This method initializes jTextFieldExecucao	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldExecucao() {
		if (jTextFieldExecucao == null) {
			jTextFieldExecucao = new JTextField();
			jTextFieldExecucao.setBounds(new Rectangle(143, 100, 50, 20));
			jTextFieldExecucao.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldExecucao;
	}


	/**
	 * This method initializes jTextFieldCusto	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCusto() {
		if (jTextFieldCusto == null) {
			jTextFieldCusto = new JTextField();
			jTextFieldCusto.setBounds(new Rectangle(248, 100, 84, 20));
			jTextFieldCusto.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldCusto;
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
			jButton.setBounds(new Rectangle(276, 0, 141, 48));
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
			jButton1Incluir.setBounds(new Rectangle(0, 0, 147, 48));
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
			jButton5.setBounds(new Rectangle(147, 0, 129, 48));
			jButton5.setBackground(Color.white);
			Icon alterar = new ImageIcon("imagens/Filesedit.gif"); 
			jButton5.setIcon(alterar);
			jButton5.setText("Alterar");
			jButton5.setToolTipText("Alterar dados");
			
		}
		return jButton5;
	}


	/**
	 * This method initializes jButton7	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setBounds(new Rectangle(417, 0, 138, 48));
			jButton7.setBackground(Color.white);
			Icon listar = new ImageIcon("imagens/Filestext.gif");
			jButton7.setIcon(listar);
			jButton7.setText("Listar");
			
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
			jButton8.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
				}

				
			});
		}
		return jButton8;
	}

}
