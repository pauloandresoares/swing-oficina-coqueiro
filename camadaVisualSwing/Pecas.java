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
import dto.DadosPecas;
import facade.ClienteFacade;
import facade.DiscricaoFacade;
import facade.EstoqueFacade;
import facade.FornecedorFacade;
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

public class Pecas extends JInternalFrame {

	
	private static final long serialVersionUID = 1L;
	private DefaultListModel modelo = null;

	private JPanel jContentPane = null;

	private JLabel jLabelNome = null;

	private JTextField jTextFieldCodigo = null;

	private JLabel jLabelCodigo = null;

	private JTextField jTextFieldModelo = null;

	private JLabel jLabelModelo = null;

	private JLabel jLabelDescricao = null;

	private JLabel jLabelCL = null;

	private JTextField jTextFieldClFiscal = null;

	private JLabel jLabelTributario = null;

	private JTextField jTextFieldSitTributario = null;

	private JLabel jLabelEstoque = null;

	private JTextField jTextFieldEstoque = null;

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

	private JTextField jTextFieldAliqIpi = null;

	private JTextField jTextField1AliqIcms = null;

	private JLabel jLabelAliIPI = null;

	private JLabel jLabelAliICMS = null;

	private JTextField jTextFieldLocal = null;

	private JLabel jLabelLocal = null;

	private JPanel jPanelCusto = null;

	private JLabel jLabelPrecoAqui = null;

	
	private JFormattedTextField jTextFieldFrete1 = null;

	private JFormattedTextField jTextFieldSeguro1 = null;

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

	private JFormattedTextField jTextFieldICMS11 = null;

	private JFormattedTextField jTextFieldIPI11 = null;

	private JFormattedTextField jTextFieldFrete11 = null;

	private JFormattedTextField jTextFieldSeguro11 = null;

	private JLabel jLabelPrecoICMS1 = null;

	private JLabel jLabelPrecoporcentagem4 = null;

	private JLabel jLabelPrecoporcentagem11 = null;

	private JLabel jLabelPrecoporcentagem21 = null;

	private JLabel jLabelPrecoporcentagem31 = null;

	private JLabel jLabelPrecoIPICompra1 = null;

	private JLabel jLabelPrecoFrete1 = null;

	private JLabel jLabelPrecoSeguro1 = null;

	private JLabel jLabelPrecoPecoCusto1 = null;
	private JPanel jpanel2;
	private JButton jButtonCancel = null;
	private JButton jButtonOk =  null;
	private int abre = 0;
	
	private JLabel jLabelResultado;
	
	private JPanel jPanel1 = null;  //  @jve:decl-index=0:visual-constraint="528,1194"
	private JComboBox jComboBoxPeca = null;
	private JScrollPane jScrollPaneDiscricao = null;
	private JTextArea jTextArea = null;
	private JTextField jTextFieldMarca = null;
	private JLabel jLabelMarca = null;
	private JLabel jLabelDataEntrada = null;
	private JScrollPane jScrollPane = null;
	private JFormattedTextField jFormattedTextFieldPecoAquisicao = null;
	private JFormattedTextField jFormattedTextFieldICMSCompra = null;
	private JFormattedTextField jFormattedTextFieldIPICompra = null;
	private JFormattedTextField jFormattedTextFieldFreteCompra = null;
	private JFormattedTextField jFormattedTextFieldSeguroCompra = null;
	private JFormattedTextField jFormattedTextFieldPecoCusto = null;
	private JFormattedTextField jFormattedTextFieldICMSVenda = null;
	private JFormattedTextField jFormattedTextFieldIPIVenda = null;
	private JFormattedTextField jFormattedTextFieldFreteVenda = null;
	private JFormattedTextField jFormattedTextFieldSeguroVenda = null;
	private JFormattedTextField jFormattedTextFieldPecoVenda = null;
	private JFormattedTextField jTextFieldICMS1 = null;
	private JFormattedTextField jTextFieldIPI1 = null;
	private DateField dateFieldDataDeEntrada = null;
	private JButton jButton7 = null;
	private JLabel jLabel = null;
	private JScrollPane jScrollPane1 = null;
	private JTable jTable = null;
	private JTable jTable1 = null;
	private DefaultTableModel dtm = null;
	private JButton jButtonEcluir = null;
	private JFormattedTextField jTextFieldQuantidade = null;
	private JLabel jLabelQuantidade = null;
	
	
	

	public Pecas() {
		super();
		initialize();
		pegarPeca();
	}

	
	private void initialize() {
		this.setSize(800, 600);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastrar/Editar - Peças");
		this.setVisible(true); 
		
	}
	
	public void setUILanguage() {
		   ResourceBundle rb;
		   Locale locale = new Locale("JOptionPane_pt.properties"); 
		   rb = ResourceBundle.getBundle("JOptionPane", locale);

		   UIManager.put("OptionPane.yesButtonText", rb.getString("Yes"));
		   UIManager.put("OptionPane.noButtonText", rb.getString("No"));
		   UIManager.put("OptionPane.cancelButtonText", rb.getString("Cancel"));
		   
		   }
	
	private JFormattedTextField getJFormattedTextFieldPecoAquisicao(){
		if(jFormattedTextFieldPecoAquisicao == null){
			jFormattedTextFieldPecoAquisicao = new JFormattedTextField();
			
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldPecoAquisicao.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldPecoAquisicao.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldPecoAquisicao.setBounds(new Rectangle(130, 23, 94, 20));
			jFormattedTextFieldPecoAquisicao.setBackground(new Color(238, 238, 238));	
		}return jFormattedTextFieldPecoAquisicao;
	}
	
			
	public JFormattedTextField getJFormattedTextFieldICMSCompra(){
		if(jFormattedTextFieldICMSCompra==null){
			jFormattedTextFieldICMSCompra = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("####.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldICMSCompra.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldICMSCompra.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldICMSCompra.setBounds(new Rectangle(193, 46, 68, 20));
			jFormattedTextFieldICMSCompra.setBackground(new Color(238, 238, 238));	
			
			
		}
		
		return	jFormattedTextFieldICMSCompra;
	
	}
	
	public JFormattedTextField getJFormattedTextFieldIPICompra(){
		if(jFormattedTextFieldIPICompra== null){
			jFormattedTextFieldIPICompra = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldIPICompra.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldIPICompra.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldIPICompra.setBounds(new Rectangle(193, 67, 68, 20));
			jFormattedTextFieldIPICompra.setBackground(new Color(238, 238, 238));	
		}return jFormattedTextFieldIPICompra;
	}
	
	
	public JFormattedTextField getJFormattedTextFieldFreteCompra(){
		if(jFormattedTextFieldFreteCompra == null){
			jFormattedTextFieldFreteCompra = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldFreteCompra.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldFreteCompra.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldFreteCompra.setBounds(new Rectangle(193, 90, 68, 20));
			jFormattedTextFieldFreteCompra.setBackground(new Color(238, 238, 238));	
			
			
		}return jFormattedTextFieldFreteCompra;
	}
	
	public JFormattedTextField getJFormattedTextFieldSeguroCompra(){
		if(jFormattedTextFieldSeguroCompra==null){
			jFormattedTextFieldSeguroCompra = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldSeguroCompra.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldSeguroCompra.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldSeguroCompra.setBounds(new Rectangle(193, 112, 68, 20));
			jFormattedTextFieldSeguroCompra.setBackground(new Color(238, 238, 238));	
			
		
		}return jFormattedTextFieldSeguroCompra;
	}
	
	public JFormattedTextField getJFormattedTextFieldPecoCusto(){
		if(jFormattedTextFieldPecoCusto==null){
			jFormattedTextFieldPecoCusto = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldPecoCusto.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldPecoCusto.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldPecoCusto.setBounds(new Rectangle(130, 135, 94, 20));
			jFormattedTextFieldPecoCusto.setBackground(new Color(238, 238, 238));
			jFormattedTextFieldPecoCusto.addFocusListener(new java.awt.event.FocusAdapter() {
						public void focusLost(java.awt.event.FocusEvent e) {
							getJTextFieldPrecoAqui2().setText(getJFormattedTextFieldPecoCusto().getText());
						}
					});
			
			
		}
		
		return jFormattedTextFieldPecoCusto;
	}
	
	private JFormattedTextField getJFormattedTextFieldICMSVenda(){
		if (jFormattedTextFieldICMSVenda ==null){	
			jFormattedTextFieldICMSVenda = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldICMSVenda.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldICMSVenda.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldICMSVenda.setBounds(new Rectangle(193, 46, 68, 20));
			jFormattedTextFieldICMSVenda.setBackground(new Color(238, 238, 238));
			
	}return jFormattedTextFieldICMSVenda;
	} 
	
	private JFormattedTextField getJFormattedTextFieldFreteVenda(){
		if(jFormattedTextFieldFreteVenda==null){
			jFormattedTextFieldFreteVenda= new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldFreteVenda.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldFreteVenda.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldFreteVenda.setBounds(new Rectangle(193, 90, 68, 20));
			jFormattedTextFieldFreteVenda.setBackground(new Color(238, 238, 238));
		}
		return jFormattedTextFieldFreteVenda;
	}
	private JFormattedTextField getJFormattedTextFieldIPIVenda(){
		if(jFormattedTextFieldIPIVenda==null){
			jFormattedTextFieldIPIVenda= new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldIPIVenda.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldIPIVenda.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldIPIVenda.setBounds(new Rectangle(193, 67, 68, 20));
			jFormattedTextFieldIPIVenda.setBackground(new Color(238, 238, 238));
		}
		return jFormattedTextFieldIPIVenda;
	}
	
	
	private JFormattedTextField getJFormattedTextFieldSeguroVenda(){
		if(jFormattedTextFieldSeguroVenda==null){
			jFormattedTextFieldSeguroVenda= new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldSeguroVenda.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldSeguroVenda.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldSeguroVenda.setBounds(new Rectangle(193, 112, 68, 20));
			jFormattedTextFieldSeguroVenda.setBackground(new Color(238, 238, 238));
		}
		return jFormattedTextFieldSeguroVenda;
	}
	
	private JFormattedTextField getJFormattedTextFieldPecoVenda(){
		if(jFormattedTextFieldPecoVenda==null){
			jFormattedTextFieldPecoVenda= new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jFormattedTextFieldPecoVenda.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jFormattedTextFieldPecoVenda.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jFormattedTextFieldPecoVenda.setBounds(new Rectangle(131, 134, 99, 20));
			jFormattedTextFieldPecoVenda.setBackground(new Color(238, 238, 238));
		}
		return jFormattedTextFieldPecoVenda;
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


	/**
	 * This method initializes jTextFieldCodigo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCodigo() {
		if (jTextFieldCodigo == null) {
			jTextFieldCodigo = new JTextField(8);
			jTextFieldCodigo.setBounds(new Rectangle(135, 10, 121, 21));
			jTextFieldCodigo.setEditable(false);
			jTextFieldCodigo.setBackground(new Color(238, 238, 238));
			
			
		}
		return jTextFieldCodigo;
	}


	/**
	 * This method initializes jTextFieldModelo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldModelo() {
		if (jTextFieldModelo == null) {
			jTextFieldModelo = new JTextField();
			jTextFieldModelo.setBounds(new Rectangle(62, 36, 121, 20));
			jTextFieldModelo.setEditable(false);
			jTextFieldModelo.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldModelo;
	}


	/**
	 * This method initializes jTextFieldClFiscal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldClFiscal() {
		if (jTextFieldClFiscal == null) {
			jTextFieldClFiscal = new JTextField();
			jTextFieldClFiscal.setBounds(new Rectangle(71, 130, 121, 20));
			jTextFieldClFiscal.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldClFiscal;
	}


	/**
	 * This method initializes jTextFieldSitTributario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSitTributario() {
		if (jTextFieldSitTributario == null) {
			jTextFieldSitTributario = new JTextField();
			jTextFieldSitTributario.setBounds(new Rectangle(287, 130, 104, 20));
			jTextFieldSitTributario.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldSitTributario;
	}


	/**
	 * This method initializes jTextFieldEstoque	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEstoque() {
		if (jTextFieldEstoque == null) {
			jTextFieldEstoque = new JTextField();
			jTextFieldEstoque.setBounds(new Rectangle(71, 153, 69, 20));
			jTextFieldEstoque.setEditable(false);
			jTextFieldEstoque.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldEstoque;
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
					DadosPecas pecas = new DadosPecas();
					PecasFacade facade = new PecasFacade();
					
					
					try{
						int valorCodigo = Integer.parseInt(getJTextFieldCodigo().getText());
						if(valorCodigo>0){
							
							int resposta = JOptionPane.showConfirmDialog(null,"Você deseja deletar esse registro ? \nOBS.: As peças serão excluidas do estoque também!");
							
							if (resposta== 0){ 
							DadosEstoque estoque = new DadosEstoque();
							EstoqueFacade facade2 = new EstoqueFacade();
							pecas.setPecaCodigo(Integer.parseInt(getJTextFieldCodigo().getText()));
							facade.excluir(pecas); 
							
								estoque.setEstoqueCodigoDaAquisicao(Integer.parseInt(getJTextFieldCodigo().getText()));
								facade2.excluir(estoque);
							
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
					DadosPecas pecas = new DadosPecas();
					PecasFacade facade = new PecasFacade();
					DadosEstoque estoque = new DadosEstoque();
					EstoqueFacade facadeEstoque = new EstoqueFacade();
					String valor = "Escolha a peça";
					String nada = "";
					if((!valor.equals((String) getJComboBoxPeca().getSelectedItem()))&&(!nada.equals((String) getJComboBoxPeca().getSelectedItem()))){
					
						try{
						pecas.setPecaNome((String) getJComboBoxPeca().getSelectedItem());
						pecas.setPecaModelo(getJTextFieldModelo().getText());
						pecas.setPecaDiscricao(getJTextArea().getText());
						pecas.setPecaClFiscal(getJTextFieldClFiscal().getText());
						pecas.setPecaSitTributario(getJTextFieldSitTributario().getText());
						pecas.setPecaAliqIpi(getJTextFieldAliqIpi().getText());
						pecas.setPecaAliqIcms(getJTextField1AliqIcms().getText());
						pecas.setPecaQuantidade(Integer.parseInt(getJTextFieldQuantidade().getText()));
						SimpleDateFormat formatoBanco = new SimpleDateFormat("dd/MM/yyyy");
						java.util.Date data2 = (java.util.Date) getDateFieldDataDeEntrada().getValue();
						
						String formatada = formatoBanco.format(data2);
						
						String data [] = formatada.split("/");
						int ano = Integer.parseInt(data[2])-1900;
						int mes = Integer.parseInt(data[1])-1;
						int dia = Integer.parseInt(data[0]);
						Date datEstoque = new Date(ano, mes, dia);
						
						
						pecas.setPecaDataEstoque(datEstoque);
						pecas.setPecaEstoque(1);
						
						pecas.setPecaMarca(getJTextFieldMarca().getText());
						pecas.setPecaLocal(getJTextFieldLocal().getText());
						
						String text = getJFormattedTextFieldPecoAquisicao().getText();
						String valorPecoAquisicao = text.replaceAll( ",", "." );
						pecas.setPecaPrecoAquisicao(Float.parseFloat(valorPecoAquisicao));
						
						text = getJTextFieldICMS1().getText();
						String valorPorcentagemICMSCompra = text.replaceAll( ",", "." );
						pecas.setPecaPorcentagemIcmsCompra(Float.parseFloat(valorPorcentagemICMSCompra));
						
						text = getJFormattedTextFieldICMSCompra().getText();
						String valorPrecoIcmsCompra = text.replaceAll( ",", "." );
						pecas.setPecaIcmsCompra(Float.parseFloat(valorPrecoIcmsCompra));
						
						text = getJTextFieldIPI1().getText();
						String valorPorcentagemIPICompra = text.replaceAll( ",", "." );
						pecas.setPecaPorcentagemIpiCompra(Float.parseFloat(valorPorcentagemIPICompra));
						
						
						text = getJFormattedTextFieldIPICompra().getText();
						String valorPrecoIpiCompra = text.replaceAll( ",", "." );
						pecas.setPecaIpiCompra(Float.parseFloat(valorPrecoIpiCompra));
						
						text = getJTextFieldFrete1().getText();
						String valorPorcentagemFreteCompra = text.replaceAll( ",", "." );
						pecas.setPecaFretePorcentagemCompra(Float.parseFloat(valorPorcentagemFreteCompra));
						
						text = getJFormattedTextFieldFreteCompra().getText();
						String valorPrecoFreteCompra = text.replaceAll( ",", "." );
						pecas.setPecaFreteCompra(Float.parseFloat(valorPrecoFreteCompra));
						
						text = getJTextFieldSeguro1().getText();
						String valorPorcentageSeguroCompra = text.replaceAll( ",", "." );
						pecas.setPecaSeguroPorcentagemCompra(Float.parseFloat(valorPorcentageSeguroCompra));
						
						text = getJFormattedTextFieldSeguroCompra().getText();
						String valorPrecoSeguroCompra = text.replaceAll( ",", "." );
						pecas.setPecaSeguroCompra(Float.parseFloat(valorPrecoSeguroCompra));
						
						text = getJFormattedTextFieldPecoCusto().getText();
						String valorPrecoCusto = text.replaceAll( ",", "." );
						pecas.setPecaPrecoCusto(Float.parseFloat(valorPrecoCusto));
						
						text = getJTextFieldICMS11().getText();
						String valorICMSVenda = text.replaceAll( ",", "." );
						pecas.setPecaPorcentagemIcmsVenda(Float.parseFloat(valorICMSVenda));
						
						text = getJFormattedTextFieldICMSVenda().getText();
						String valorPrecoIcmsVenda = text.replaceAll( ",", "." );
						pecas.setPecaIcmsVenda(Float.parseFloat(valorPrecoIcmsVenda));
						
						text = getJTextFieldIPI11().getText();
						String valorIPIVenda = text.replaceAll( ",", "." );
						pecas.setPecaPorcentagemIpiVenda(Float.parseFloat(valorIPIVenda));
						
						text = getJFormattedTextFieldIPIVenda().getText();
						String valorPrecoIpiVenda = text.replaceAll( ",", "." );
						pecas.setPecaIpiVenda(Float.parseFloat(valorPrecoIpiVenda));
						
						text = getJTextFieldFrete11().getText();
						String FreteVenda = text.replaceAll( ",", "." );
						pecas.setPecaFretePorcentagemVenda(Float.parseFloat(FreteVenda));
						
						text = getJFormattedTextFieldFreteVenda().getText();
						String valorPrecoFreteVenda = text.replaceAll( ",", "." );
						pecas.setPecaFreteVenda(Float.parseFloat(valorPrecoFreteVenda));
						
						text = getJTextFieldSeguro11().getText();
						String seguroVenda = text.replaceAll( ",", "." );
						pecas.setPecaSeguroPorcentagemVenda(Float.parseFloat(seguroVenda));
						
						text = getJFormattedTextFieldSeguroVenda().getText();
						String valorPrecoSeguroVenda = text.replaceAll( ",", "." );
						pecas.setPecaSeguroVenda(Float.parseFloat(valorPrecoSeguroVenda));
						
						text = getJFormattedTextFieldSeguroVenda().getText();
						String valorPrecoPecoVenda = text.replaceAll( ",", "." );
						
						pecas.setPecaPrecoVenda(Float.parseFloat(valorPrecoPecoVenda));
						
						
						// Incluir primeiro as pecas
						facade.incluir(pecas);
						facade.ultimo(pecas);
						
						estoque.setEstoqueDataEntrada(datEstoque);
						estoque.setEstoquePreco(Float.parseFloat(valorPrecoPecoVenda));
						estoque.setEstoquePeca((String)getJComboBoxPeca().getSelectedItem());
						estoque.setEstoqueMarca(getJTextFieldMarca().getText());
						estoque.setEstoqueModelo(getJTextFieldModelo().getText());
						estoque.setEstoqueCodigoDaAquisicao(pecas.getPecaCodigo());
						estoque.setEstoqueQuantidade(Integer.parseInt(getJTextFieldQuantidade().getText()));
						facadeEstoque.incluir(estoque);
						limpar();
						
						JOptionPane.showMessageDialog(null, "O codigo da aquisicao foi : "+pecas.getPecaCodigo());
						}catch(NumberFormatException e1){
							JOptionPane.showMessageDialog(null, "Digite um valor valido para os campos de valores!");
						}
						}else{
						JOptionPane.showMessageDialog(null, "Selecione uma Peça. ");
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
					DadosPecas pecas = new DadosPecas();
					PecasFacade facade = new PecasFacade();
					facade.primeiro(pecas);
					mostrarValores(pecas);
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
					DadosPecas pecas = new DadosPecas();
					PecasFacade facade = new PecasFacade();
					if(getJTextFieldCodigo().getText() != ""){
						getJButton3().setEnabled(true);
						getJButton4().setEnabled(true);
						int codigo =Integer.parseInt(getJTextFieldCodigo().getText());
						String nada ="";
						String nome = "";
						facade.primeiro(pecas);
						int codigoPrimeiro = pecas.getPecaCodigo();					
						pecas = new DadosPecas();
						
						do{
							codigo--;
							pecas.setPecaCodigo(codigo);
							facade.pegarCodigo(pecas);
							nome = pecas.getPecaNome();
							if(nome==null)nome ="";
																			
						
						}while((nome.equals(nada)&&(codigo>=codigoPrimeiro)) );
						if(codigo>=codigoPrimeiro){
						mostrarValores(pecas);
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
					DadosPecas pecas = new DadosPecas();
					PecasFacade facade = new PecasFacade();
					if(getJTextFieldCodigo().getText() != ""){
						getJButton2().setEnabled(true);
						getJButton1().setEnabled(true);
						int codigo =Integer.parseInt(getJTextFieldCodigo().getText());
						String nada ="";
						String nome = "";
						facade.ultimo(pecas);
						int codigoUltimo = pecas.getPecaCodigo();					
						pecas = new DadosPecas();
						
						do{
							codigo++;
							pecas.setPecaCodigo(codigo);
							facade.pegarCodigo(pecas);
							nome = pecas.getPecaNome();
							if(nome==null)nome ="";
																			
						
						}while((nome.equals(nada)&&(codigo<=codigoUltimo)) );
						if(codigo<=codigoUltimo){
						mostrarValores(pecas);
						}else{
							
							jButton3.setEnabled(false);
							getJButton4().setEnabled(false);
							getJButton2().setEnabled(true);
							getJButton1().setEnabled(true);
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
				DadosPecas pecas = new DadosPecas();
				PecasFacade facade = new PecasFacade();
				facade.ultimo(pecas);
				mostrarValores(pecas);
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
					DadosPecas pecas = new DadosPecas();
					PecasFacade facade = new PecasFacade();
					DadosEstoque estoque = new DadosEstoque();
					EstoqueFacade facadeEstoque = new EstoqueFacade();
					try{
						if(!(getJComboBoxPeca().getSelectedItem().toString()).equals("Escolha a peça")){
						int valorCodigo = Integer.parseInt(getJTextFieldCodigo().getText());
					pecas.setPecaNome((String) getJComboBoxPeca().getSelectedItem());
					pecas.setPecaModelo(getJTextFieldModelo().getText());
					pecas.setPecaDiscricao(getJTextArea().getText());
					pecas.setPecaClFiscal(getJTextFieldClFiscal().getText());
					pecas.setPecaSitTributario(getJTextFieldSitTributario().getText());
					pecas.setPecaAliqIpi(getJTextFieldAliqIpi().getText());
					pecas.setPecaAliqIcms(getJTextField1AliqIcms().getText());
					pecas.setPecaQuantidade(Integer.parseInt(getJTextFieldQuantidade().getText()));
					
					SimpleDateFormat formatoBanco = new SimpleDateFormat("dd/MM/yyyy");
					java.util.Date data2 = (java.util.Date) getDateFieldDataDeEntrada().getValue();
					
					String formatada = formatoBanco.format(data2);
					
					String data [] = formatada.split("/");
					int ano = Integer.parseInt(data[2])-1900;
					int mes = Integer.parseInt(data[1])-1;
					int dia = Integer.parseInt(data[0]);
					Date datEstoque = new Date(ano, mes, dia);
					
					
					pecas.setPecaDataEstoque(datEstoque);
					pecas.setPecaEstoque(1);
					
					pecas.setPecaMarca(getJTextFieldMarca().getText());
					pecas.setPecaLocal(getJTextFieldLocal().getText());
					String text = getJFormattedTextFieldPecoAquisicao().getText();
					String valorPecoAquisicao = text.replaceAll( ",", "." );
					pecas.setPecaPrecoAquisicao(Float.parseFloat(valorPecoAquisicao));
					pecas.setPecaPorcentagemIcmsCompra(Float.parseFloat(getJTextFieldICMS1().getText()));
					
					text = getJFormattedTextFieldICMSCompra().getText();
					String valorPrecoIcmsCompra = text.replaceAll( ",", "." );
					pecas.setPecaIcmsCompra(Float.parseFloat(valorPrecoIcmsCompra));
					
					pecas.setPecaPorcentagemIpiCompra(Float.parseFloat(getJTextFieldIPI1().getText()));
					
					
					text = getJFormattedTextFieldIPICompra().getText();
					String valorPrecoIpiCompra = text.replaceAll( ",", "." );
					pecas.setPecaIpiCompra(Float.parseFloat(valorPrecoIpiCompra));
					pecas.setPecaFretePorcentagemCompra(Float.parseFloat(getJTextFieldFrete1().getText()));
					
					text = getJFormattedTextFieldFreteCompra().getText();
					String valorPrecoFreteCompra = text.replaceAll( ",", "." );
					pecas.setPecaFreteCompra(Float.parseFloat(valorPrecoFreteCompra));
					pecas.setPecaSeguroPorcentagemCompra(Float.parseFloat(getJTextFieldSeguro1().getText()));
					
					text = getJFormattedTextFieldSeguroCompra().getText();
					String valorPrecoSeguroCompra = text.replaceAll( ",", "." );
					pecas.setPecaSeguroCompra(Float.parseFloat(valorPrecoSeguroCompra));
					
					text = getJFormattedTextFieldPecoCusto().getText();
					String valorPrecoCusto = text.replaceAll( ",", "." );
					pecas.setPecaPrecoCusto(Float.parseFloat(valorPrecoCusto));
					pecas.setPecaPorcentagemIcmsVenda(Float.parseFloat(getJTextFieldICMS11().getText()));
					
					text = getJFormattedTextFieldICMSVenda().getText();
					String valorPrecoIcmsVenda = text.replaceAll( ",", "." );
					pecas.setPecaIcmsVenda(Float.parseFloat(valorPrecoIcmsVenda));
					pecas.setPecaPorcentagemIpiVenda(Float.parseFloat(getJTextFieldIPI11().getText()));
					
					text = getJFormattedTextFieldIPIVenda().getText();
					String valorPrecoIpiVenda = text.replaceAll( ",", "." );
					pecas.setPecaIpiVenda(Float.parseFloat(valorPrecoIpiVenda));
					
					pecas.setPecaFretePorcentagemVenda(Float.parseFloat(getJTextFieldFrete11().getText()));
					
					text = getJFormattedTextFieldFreteVenda().getText();
					String valorPrecoFreteVenda = text.replaceAll( ",", "." );
					pecas.setPecaFreteVenda(Float.parseFloat(valorPrecoFreteVenda));
					
					pecas.setPecaSeguroPorcentagemVenda(Float.parseFloat(getJTextFieldSeguro11().getText()));
					
					text = getJFormattedTextFieldSeguroVenda().getText();
					String valorPrecoSeguroVenda = text.replaceAll( ",", "." );
					pecas.setPecaSeguroVenda(Float.parseFloat(valorPrecoSeguroVenda));
					
					text = getJFormattedTextFieldSeguroVenda().getText();
					String valorPrecoPecoVenda = text.replaceAll( ",", "." );
					
					pecas.setPecaPrecoVenda(Float.parseFloat(valorPrecoPecoVenda));
					pecas.setPecaCodigo(Integer.parseInt(getJTextFieldCodigo().getText()));
					
					facade.alterar(pecas);
					estoque.setEstoqueDataEntrada(datEstoque);
					estoque.setEstoquePreco(Float.parseFloat(valorPrecoPecoVenda));
					estoque.setEstoquePeca((String)getJComboBoxPeca().getSelectedItem());
					estoque.setEstoqueMarca(getJTextFieldMarca().getText());
					estoque.setEstoqueModelo(getJTextFieldModelo().getText());
					estoque.setEstoqueCodigoDaAquisicao(pecas.getPecaCodigo());
					estoque.setEstoqueQuantidade(Integer.parseInt(getJTextFieldQuantidade().getText()));
					facadeEstoque.Alterar(estoque);
					limpar();
					}
					}catch(NumberFormatException e1){
						JOptionPane.showMessageDialog(null, "Primeiro você deve procura em 'Consultar' o registro, seleciona-lo para poder altera-lo em seguida e digite valores válidos nos campos. ");
						
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
					
					jpanel2.add(getJButtonOk(),null);
					jpanel2.add(getJButtonCancel(),null);
					
					jLabelResultado = new JLabel();
					jLabelResultado.setBounds(new Rectangle(19, 3, 99, 20));
					jLabelResultado.setText("Lista de peças :");
					jpanel2.add(getJScrollPane(),null);
					
					jpanel2.add(jLabelResultado, null);
					jpanel2.add(getJButtonEcluir(), null);
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
	 * This method initializes jTextFieldAliqIpi	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldAliqIpi() {
		if (jTextFieldAliqIpi == null) {
			jTextFieldAliqIpi = new JTextField();
			jTextFieldAliqIpi.setBounds(new Rectangle(453, 129, 71, 20));
			jTextFieldAliqIpi.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldAliqIpi;
	}


	/**
	 * This method initializes jTextField1AliqIcms	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1AliqIcms() {
		if (jTextField1AliqIcms == null) {
			jTextField1AliqIcms = new JTextField();
			jTextField1AliqIcms.setBounds(new Rectangle(600, 129, 87, 20));
			jTextField1AliqIcms.setBackground(new Color(238, 238, 238));
		}
		return jTextField1AliqIcms;
	}


	/**
	 * This method initializes jTextFieldLocal	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocal() {
		if (jTextFieldLocal == null) {
			jTextFieldLocal = new JTextField();
			jTextFieldLocal.setBounds(new Rectangle(554, 151, 227, 20));
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
			jPanelCusto.setBounds(new Rectangle(6, 181, 334, 185));
			jPanelCusto.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Custo de Aquisição"),BorderFactory.createEmptyBorder(5,5,5,5)));
			jPanelCusto.setBackground(Color.white);
			jPanelCusto.add(jLabelPrecoAqui, gridBagConstraints1);
			jPanelCusto.add(getJTextFieldICMS1(), null);
			jPanelCusto.add(getJTextFieldIPI1(), null);
			jPanelCusto.add(getJTextFieldFrete1(), null);
			jPanelCusto.add(getJTextFieldSeguro1(), null);
			jPanelCusto.add(jLabelPrecoICMS, null);
			jPanelCusto.add(jLabelPrecoporcentagem, null);
			jPanelCusto.add(jLabelPrecoporcentagem1, null);
			jPanelCusto.add(jLabelPrecoporcentagem2, null);
			jPanelCusto.add(jLabelPrecoporcentagem3, null);
			jPanelCusto.add(jLabelPrecoIPICompra, null);
			jPanelCusto.add(jLabelPrecoFrete, null);
			jPanelCusto.add(jLabelPrecoSeguro, null);
			jPanelCusto.add(jLabelPrecoPecoCusto, null);
			jPanelCusto.add(getJFormattedTextFieldPecoAquisicao(), null);
			jPanelCusto.add(getJFormattedTextFieldICMSCompra(), null);
			jPanelCusto.add(getJFormattedTextFieldIPICompra(), null);
			jPanelCusto.add(getJFormattedTextFieldFreteCompra(), null);
			jPanelCusto.add(getJFormattedTextFieldSeguroCompra(), null);
			jPanelCusto.add(getJFormattedTextFieldPecoCusto(), null);
		}
		return jPanelCusto;
	}


	/**
	 * This method initializes jTextFieldICMS1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldICMS1() {
		if (jTextFieldICMS1 == null) {
			jTextFieldICMS1 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldICMS1.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldICMS1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			
			jTextFieldICMS1.setBounds(new Rectangle(130, 45, 36, 20));
			jTextFieldICMS1.setBackground(new Color(238, 238, 238));
			
			
		}
		return jTextFieldICMS1;
	}


	/**
	 * This method initializes jTextFieldIPI1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldIPI1() {
		if (jTextFieldIPI1 == null) {
			jTextFieldIPI1 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldIPI1.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldIPI1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldIPI1.setBounds(new Rectangle(130, 67, 36, 20));
			jTextFieldIPI1.setBackground(new Color(238, 238, 238));
			
			
			
		}
		return jTextFieldIPI1;
	}


	/**
	 * This method initializes jTextFieldFrete1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldFrete1() {
		if (jTextFieldFrete1 == null) {
			jTextFieldFrete1 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldFrete1.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldFrete1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldFrete1.setBounds(new Rectangle(130, 90, 36, 20));
			jTextFieldFrete1.setBackground(new Color(238, 238, 238));
			
			
		}
		return jTextFieldFrete1;
	}


	/**
	 * This method initializes jTextFieldSeguro1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldSeguro1() {
		if (jTextFieldSeguro1 == null) {
			jTextFieldSeguro1 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldSeguro1.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldSeguro1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldSeguro1.setBounds(new Rectangle(130, 112, 36, 20));
			jTextFieldSeguro1.setBackground(new Color(238, 238, 238));
			
			
		}
		return jTextFieldSeguro1;
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
			jPanelCusto1.setBounds(new Rectangle(362, 181, 328, 185));
			jPanelCusto1.setBackground(Color.white);
			jPanelCusto1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Formação de Preço"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			jPanelCusto1.add(jLabelPrecoCusto1, gridBagConstraints11);
			jPanelCusto1.add(getJTextFieldPrecoAqui2(), null);
			jPanelCusto1.add(getJTextFieldICMS11(), null);
			jPanelCusto1.add(getJTextFieldIPI11(), null);
			jPanelCusto1.add(getJTextFieldFrete11(), null);
			jPanelCusto1.add(getJTextFieldSeguro11(), null);
			jPanelCusto1.add(jLabelPrecoICMS1, null);
			jPanelCusto1.add(jLabelPrecoporcentagem4, null);
			jPanelCusto1.add(jLabelPrecoporcentagem11, null);
			jPanelCusto1.add(jLabelPrecoporcentagem21, null);
			jPanelCusto1.add(jLabelPrecoporcentagem31, null);
			jPanelCusto1.add(jLabelPrecoIPICompra1, null);
			jPanelCusto1.add(jLabelPrecoFrete1, null);
			jPanelCusto1.add(jLabelPrecoSeguro1, null);
			jPanelCusto1.add(jLabelPrecoPecoCusto1, null);
			jPanelCusto1.add(getJFormattedTextFieldICMSVenda(), null);
			jPanelCusto1.add(getJFormattedTextFieldIPIVenda(), null);
			jPanelCusto1.add(getJFormattedTextFieldFreteVenda(), null);
			jPanelCusto1.add(getJFormattedTextFieldSeguroVenda(), null);
			jPanelCusto1.add(getJFormattedTextFieldPecoVenda(), null);
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
			jTextFieldPrecoAqui2.setEditable(false);
			jTextFieldPrecoAqui2.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldPrecoAqui2;
	}


	/**
	 * This method initializes jTextFieldICMS11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldICMS11() {
		if (jTextFieldICMS11 == null) {
			jTextFieldICMS11 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldICMS11.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldICMS11.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldICMS11.setBounds(new Rectangle(130, 45, 36, 20));
			jTextFieldICMS11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldICMS11;
	}


	/**
	 * This method initializes jTextFieldIPI11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldIPI11() {
		if (jTextFieldIPI11 == null) {
			jTextFieldIPI11 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldIPI11.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldIPI11.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldIPI11.setBounds(new Rectangle(130, 67, 36, 20));
			jTextFieldIPI11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldIPI11;
	}


	/**
	 * This method initializes jTextFieldFrete11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldFrete11() {
		if (jTextFieldFrete11 == null) {
			jTextFieldFrete11 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldFrete11.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldFrete11.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldFrete11.setBounds(new Rectangle(130, 90, 36, 20));
			jTextFieldFrete11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldFrete11;
	}


	/**
	 * This method initializes jTextFieldSeguro11	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldSeguro11() {
		if (jTextFieldSeguro11 == null) {
			jTextFieldSeguro11 = new JFormattedTextField();
			DecimalFormat decimal = new DecimalFormat("###.00");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldSeguro11.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldSeguro11.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
			jTextFieldSeguro11.setBounds(new Rectangle(130, 112, 36, 20));
			jTextFieldSeguro11.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldSeguro11;
	}


	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jLabelQuantidade = new JLabel();
			jLabelQuantidade.setBounds(new Rectangle(7, 107, 80, 19));
			jLabelQuantidade.setText("Quantidade :");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(145, 152, 358, 21));
			jLabel.setText("");
			jLabelDataEntrada = new JLabel();
			jLabelDataEntrada.setBounds(new Rectangle(7, 83, 108, 21));
			jLabelDataEntrada.setText("Data de entrada :");
			jLabelMarca = new JLabel();
			jLabelMarca.setBounds(new Rectangle(7, 59, 50, 21));
			jLabelMarca.setText("Marca:");
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(0, 48, 790, 510));
			jPanel1.setBackground(Color.white);
			jLabelLocal = new JLabel();
			jLabelLocal.setBounds(new Rectangle(508, 151, 42, 19));
			jLabelLocal.setText("Local:");
			jLabelAliICMS = new JLabel();
			jLabelAliICMS.setBounds(new Rectangle(538, 130, 60, 16));
			jLabelAliICMS.setText("Aliq. ICMS:");
			jLabelAliIPI = new JLabel();
			jLabelAliIPI.setBounds(new Rectangle(396, 130, 54, 16));
			jLabelAliIPI.setText("Aliq. IPI:");
			jLabelEstoque = new JLabel();
			jLabelEstoque.setBounds(new Rectangle(6, 153, 62, 19));
			jLabelEstoque.setText("Estoque:");
			jLabelTributario = new JLabel();
			jLabelTributario.setBounds(new Rectangle(194, 130, 91, 19));
			jLabelTributario.setText("Sit. Tributário:");
			jLabelCL = new JLabel();
			jLabelCL.setBounds(new Rectangle(7, 130, 61, 19));
			jLabelCL.setText("Cl. fiscal :");
			jLabelDescricao = new JLabel();
			jLabelDescricao.setBounds(new Rectangle(194, 35, 60, 19));
			jLabelDescricao.setText("Discrição:");
			jLabelModelo = new JLabel();
			jLabelModelo.setBounds(new Rectangle(6, 35, 53, 19));
			jLabelModelo.setText("Modelo:");
			jLabelCodigo = new JLabel();
			jLabelCodigo.setBounds(new Rectangle(7, 10, 122, 22));
			jLabelCodigo.setText("Código da aquisição:");
			jLabelNome = new JLabel();
			jLabelNome.setBounds(new Rectangle(264, 10, 42, 20));
			jLabelNome.setText("Peça :");
			
			jPanel1.add(jLabelNome, null);
			jPanel1.add(getJTextFieldCodigo(), null);
			jPanel1.add(jLabelCodigo, null);
			jPanel1.add(getJTextFieldModelo(), null);
			jPanel1.add(jLabelModelo, null);
			jPanel1.add(jLabelDescricao, null);
			jPanel1.add(jLabelCL, null);
			jPanel1.add(getJTextFieldClFiscal(), null);
			jPanel1.add(jLabelTributario, null);
			jPanel1.add(getJTextFieldSitTributario(), null);
			jPanel1.add(jLabelEstoque, null);
			jPanel1.add(getJTextFieldEstoque(), null);
			
			jPanel1.add(getJTextFieldAliqIpi(), null);
			jPanel1.add(getJTextField1AliqIcms(), null);
			jPanel1.add(jLabelAliIPI, null);
			jPanel1.add(jLabelAliICMS, null);
			jPanel1.add(getJTextFieldLocal(), null);
			jPanel1.add(jLabelLocal, null);
			jPanel1.add(getJPanelCusto(), null);
			jPanel1.add(getJPanelCusto1(), null);
			
			jPanel1.add(getJComboBoxPeca(), null);
			jPanel1.add(getJScrollPaneDiscricao(), null);
			jPanel1.add(getJTextFieldMarca(), null);
			jPanel1.add(jLabelMarca, null);
			jPanel1.add(jLabelDataEntrada, null);
			jPanel1.add(getDateFieldDataDeEntrada(), null);
			jPanel1.add(jLabel, null);
			jPanel1.add(getJTextFieldQuantidade(), null);
			jPanel1.add(jLabelQuantidade, null);
			
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
					PecasFacade facade = new PecasFacade();
					DadosPecas pecas = new DadosPecas();
					
					int l = getJTable1().getSelectedRow();
					if(l<0){
						JOptionPane.showMessageDialog(null, "Primeiro, selecione um valor na Tabela");
						
					}else{
					String codigo = ""+getJTable1().getValueAt(l, 4);
										
					pecas.setPecaCodigo(Integer.parseInt(codigo));
					facade.pegarCodigo(pecas);
					mostrarValores(pecas);
		            
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


	public void mostrarValores(DadosPecas pecas){
		 
		getJTextFieldCodigo().setText(""+pecas.getPecaCodigo());
		getJComboBoxPeca().setSelectedItem(pecas.getPecaNome());
		getJTextFieldModelo().setText(pecas.getPecaModelo());
		getJTextFieldMarca().setText(pecas.getPecaMarca());
		java.sql.Date data = pecas.getPecaDataEstoque();
				
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataData = formato.format(data);
		getDateFieldDataDeEntrada().setValue(dataData);
		getJTextFieldClFiscal().setText(pecas.getPecaClFiscal());
		getJTextFieldSitTributario().setText(pecas.getPecaSitTributario());
		getJTextFieldAliqIpi().setText(pecas.getPecaAliqIpi());
		getJTextField1AliqIcms().setText(pecas.getPecaAliqIcms());
		getJTextFieldLocal().setText(pecas.getPecaLocal());
		getJFormattedTextFieldPecoAquisicao().setText(""+pecas.getPecaPrecoAquisicao());
		getJTextFieldICMS1().setText(""+pecas.getPecaPorcentagemIcmsCompra());
		getJFormattedTextFieldICMSCompra().setText(""+pecas.getPecaIcmsCompra());
		getJTextFieldIPI1().setText(""+pecas.getPecaPorcentagemIpiCompra());
		getJFormattedTextFieldIPICompra().setText(""+pecas.getPecaIpiCompra());
		getJTextFieldFrete1().setText(""+pecas.getPecaFretePorcentagemCompra());
		getJFormattedTextFieldFreteCompra().setText(""+pecas.getPecaFreteCompra());
		getJTextFieldSeguro1().setText(""+pecas.getPecaSeguroPorcentagemCompra());
		getJFormattedTextFieldSeguroCompra().setText(""+pecas.getPecaSeguroCompra());
		getJFormattedTextFieldPecoCusto().setText(""+pecas.getPecaPrecoCusto());
		getJTextFieldICMS11().setText(""+pecas.getPecaPorcentagemIcmsVenda());
		getJFormattedTextFieldICMSVenda().setText(""+pecas.getPecaIcmsVenda());
		getJTextFieldIPI11().setText(""+pecas.getPecaIpiVenda());
		getJFormattedTextFieldIPIVenda().setText(""+pecas.getPecaIpiVenda());
		getJTextFieldFrete11().setText(""+pecas.getPecaFreteVenda());
		getJFormattedTextFieldFreteVenda().setText(""+pecas.getPecaFreteVenda());
		getJTextFieldSeguro11().setText(""+pecas.getPecaSeguroPorcentagemCompra());
		getJFormattedTextFieldSeguroVenda().setText(""+pecas.getPecaSeguroVenda());
		getJFormattedTextFieldPecoVenda().setText(""+pecas.getPecaPrecoVenda());
		getJTextFieldQuantidade().setText(""+pecas.getPecaQuantidade());
		
		
	}


	/**
	 * This method initializes jComboBoxPeca	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxPeca() {
		if (jComboBoxPeca == null) {
			jComboBoxPeca = new JComboBox();
			jComboBoxPeca.setBounds(new Rectangle(309, 9, 451, 20));
			jComboBoxPeca.setFont(new Font("Dialog", Font.BOLD, 12));
			jComboBoxPeca.addItem("Escolha a peça");
			jComboBoxPeca.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					String item = getJComboBoxPeca().getSelectedItem().toString();
					
					//Descricao
					DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
					DiscricaoFacade facade = new DiscricaoFacade(); 
					
					//Pecas
					DadosPecas pecasDados = new DadosPecas();
					PecasFacade facadeDados = new PecasFacade();
				
					if(!item.equals("Escolha a peça")){
						 jLabel.setText("");
					 
					 pecas.setDadosDiscricaoDePecasNome(item);
					 facade.pesquisaSimples(pecas);
					 
					 pecasDados.setPecaNome(item);
					 facadeDados.pegarEstoque(pecasDados);
					 getJTextFieldEstoque().setText(""+pecasDados.getPecaTotalEstoque());
					 getJTextFieldModelo().setText(pecas.getDadosDiscricaoDePecasModelo());
					 getJTextArea().setText(pecas.getDadosDiscricaoDePecasDescricao());
					 getJTextFieldMarca().setText(pecas.getDadosDiscricaoDePecasMarca());
					 
                     //	 Estoque
						DadosEstoque estoqueDados = new DadosEstoque();
						EstoqueFacade estoqueFacade = new EstoqueFacade();
						Collection<DadosEstoque> lista = new LinkedList<DadosEstoque>();
						HashMap<String, String> map = new HashMap<String, String>();
						map.put("estoque_nome_peca",item );		 
					
						try {
						
							lista = estoqueFacade.pegarQuantidade(map);
							if(lista==null){
								getJTextFieldEstoque().setText("0");			
				             	System.out.println("null");
							}else{
								
								int quantidade=0;				
								for (DadosEstoque listaEstoque : lista) {
								quantidade +=listaEstoque.getEstoqueQuantidade();
							    
							    System.out.println("Ok");
							    }
								
								getJTextFieldEstoque().setText(""+quantidade);
																
								int minima = pecas.getDadosDiscricaoDePecasMinima();
								int maxima = pecas.getDadosDiscricaoDePecasMaxima();
								
								if(quantidade<=minima){
									
								jLabel.setText("<-A quantidade no estoque está abaixo do nescessário.");	
								}
								
								if(quantidade>=maxima){
								
									jLabel.setText("<-Não é nescessário comprar mais peças, o estoque esta cheio.");
									
								}
								
								if (quantidade==0){
									jLabel.setText("<-Não há peças no estoque.");
									
								}
								
								
								
							}	
						} catch (SQLException e2) {
							JOptionPane.showMessageDialog(null,e2.getMessage());
						} 
				 
					}	 
				
				
				}});
			
		}
		return jComboBoxPeca;
	}
	
	
	
	public void pegarPeca(){
		DadosDescricaoDePecas pecas = new DadosDescricaoDePecas();
		DiscricaoFacade facade = new DiscricaoFacade();
		Collection<DadosDescricaoDePecas> lista = new LinkedList<DadosDescricaoDePecas>();
		HashMap<String, String> map = new HashMap<String, String>();
		
		String valor = "rtsgdhywsuias";
		map.put("discricao_nome",valor );
		
		String resultado = "";
		try {
			lista = facade.buscaTudo(map);
			if(lista==null){
				
			}else{
				for (DadosDescricaoDePecas dadosDescricaoDePecas : lista) {
					
					getJComboBoxPeca().addItem(dadosDescricaoDePecas.getDadosDiscricaoDePecasNome());
					
					
				}
				
			}
		} catch (SQLException e1) {
			
		} 
		
						
	}


	/**
	 * This method initializes jScrollPaneDiscricao	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneDiscricao() {
		if (jScrollPaneDiscricao == null) {
			jScrollPaneDiscricao = new JScrollPane(getJTextArea());
			jScrollPaneDiscricao.setBounds(new Rectangle(258, 36, 501, 80));
			jScrollPaneDiscricao.setViewportView(getJTextArea());
		}
		return jScrollPaneDiscricao;
	}


	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBackground(new Color(238, 238, 238));
			jTextArea.setEditable(false);
			
		}
		return jTextArea;
	}


	/**
	 * This method initializes jTextFieldMarca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMarca() {
		if (jTextFieldMarca == null) {
			jTextFieldMarca = new JTextField();
			jTextFieldMarca.setBounds(new Rectangle(62, 60, 121, 20));
			jTextFieldMarca.setEditable(false);
			jTextFieldMarca.setBackground(new Color(238, 238, 238));
		}
		return jTextFieldMarca;
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
		getJComboBoxPeca().setSelectedIndex(0);
		getJTextFieldModelo().setText("");
		getJTextFieldMarca().setText("");
		getJTextArea().setText("");
		
		dateFieldDataDeEntrada = new DateField();
		getJTextFieldClFiscal().setText("");
		getJTextFieldSitTributario().setText("");
		getJTextFieldAliqIpi().setText("");
		getJTextField1AliqIcms().setText("");
		getJTextFieldLocal().setText("");
		getJFormattedTextFieldPecoAquisicao().setText("0");
		getJTextFieldICMS1().setText("0");
		getJFormattedTextFieldICMSCompra().setText("0");
		getJTextFieldIPI1().setText("0");
		getJFormattedTextFieldIPICompra().setText("0");
		getJTextFieldFrete1().setText("0");
		getJFormattedTextFieldFreteCompra().setText("0");
		getJTextFieldSeguro1().setText("0");
		getJFormattedTextFieldSeguroCompra().setText("0");
		getJFormattedTextFieldPecoCusto().setText("0");
		getJTextFieldICMS11().setText("0");
		getJFormattedTextFieldICMSVenda().setText("0");
		getJTextFieldIPI11().setText("0");
		getJFormattedTextFieldIPIVenda().setText("0");
		getJTextFieldFrete11().setText("0");
		getJFormattedTextFieldFreteVenda().setText("0");
		getJTextFieldSeguro11().setText("0");
		getJFormattedTextFieldSeguroVenda().setText("0");
		getJFormattedTextFieldPecoVenda().setText("0");
		getJTextFieldEstoque().setText("");
		getJTextFieldQuantidade().setText("");
		jLabel.setText("");
		
	}


	/**
	 * This method initializes dateFieldDataDeEntrada	
	 * 	
	 * @return net.sf.nachocalendar.components.DateField	
	 */
	private DateField getDateFieldDataDeEntrada() {
		if (dateFieldDataDeEntrada == null) {
			dateFieldDataDeEntrada = new DateField();
			dateFieldDataDeEntrada.setBounds(new Rectangle(119, 83, 107, 20));
			dateFieldDataDeEntrada.setShowOkCancel(true);
			dateFieldDataDeEntrada.setDateFormat(DateFormat.getDateInstance(DateFormat.MEDIUM));
			
		}
		return dateFieldDataDeEntrada;
	}
	public void pegarLista(){
		DadosPecas pecas = new DadosPecas();
		PecasFacade  facade = new PecasFacade();
		Collection<DadosPecas> lista = new LinkedList<DadosPecas>();
		HashMap<String, String> map = new HashMap<String, String>();
		String valor ="asxerftgdsdsx";
		map.put("peca_nome",valor );
		String resultado = "";
		try {
			lista = facade.buscaLista(map);
			if(lista==null){
								
             	JOptionPane.showMessageDialog(null,"Nenhum registro encontrado !");
			}else{
				
				dtm = (DefaultTableModel) getJTable1().getModel();
				
				java.sql.Date data = null;
				
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				String dataData = null;
			
				String valor1="";
				
								
				for (DadosPecas listaPecas : lista) {
					//getModelo().addElement(listaPecas.getPecaNome());
					data = listaPecas.getPecaDataEstoque();
					dataData = formato.format(data);
					
					
					
										
					dtm.addRow(new Object[]{listaPecas.getPecaNome(),listaPecas.getPecaMarca(),dataData,"R$"+listaPecas.getPecaPrecoVenda(), listaPecas.getPecaCodigo(),listaPecas.getPecaQuantidade()});
					
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
		            new String [] {"Peça ","Data da aquisição","Marca", "Preço de Venda","Código", "Quantidade"}));
			
			
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
					PecasFacade facade = new PecasFacade();
					DadosPecas pecas = new DadosPecas();
					
					int l = getJTable1().getSelectedRow();
					if(l<0){
						JOptionPane.showMessageDialog(null, "Primeiro, selecione um valor na Tabela");
						
					}else{

						int resposta = JOptionPane.showConfirmDialog(null,"Você deseja deletar esse registro ?");
						
						if (resposta== 0){ 	
					String codigo = ""+getJTable1().getValueAt(l, 4);
										
					pecas.setPecaCodigo(Integer.parseInt(codigo));
					
					DadosEstoque estoque = new DadosEstoque();
					EstoqueFacade facade2 = new EstoqueFacade();
					
					
					facade.excluir(pecas); 
					
						estoque.setEstoqueCodigoDaAquisicao(Integer.parseInt(codigo));
						facade2.excluir(estoque);
					
						dtm.removeRow(l);
		            
						}
		             	
					} 
					
					
					
				}
			});
		}
		return jButtonEcluir;
	}


	/**
	 * This method initializes jTextFieldQuantidade	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JFormattedTextField getJTextFieldQuantidade() {
		if (jTextFieldQuantidade == null) {
			jTextFieldQuantidade = new JFormattedTextField();
			jTextFieldQuantidade.setBounds(new Rectangle(89, 107, 91, 20));
			jTextFieldQuantidade.setBackground(new Color(238, 238, 238));
			DecimalFormat decimal = new DecimalFormat("###");
			NumberFormatter numFormatter = new NumberFormatter(decimal);
			numFormatter.setFormat(decimal);
			numFormatter.setAllowsInvalid(false);
			jTextFieldQuantidade.setFormatterFactory(new DefaultFormatterFactory(numFormatter));
			jTextFieldQuantidade.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
		}
		return jTextFieldQuantidade;
	}
	
	 
	/**
	 * This method initializes jScrollPane1	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	


	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
		
	
}
