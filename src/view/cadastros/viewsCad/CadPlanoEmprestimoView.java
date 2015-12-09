package view.cadastros.viewsCad;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import view.InterfaceUsuario;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class CadPlanoEmprestimoView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCodPlano;
	private JFormattedTextField formattedFieldDataNascimento;
	private JTextField textFieldPlanoEmprestimo;
	private JTextField textFieldValorMinimo;
	private JTextField textFieldValorMaximo;
	private JTextField textFieldNumMinimoParcelas;
	private JTextField textFieldNumMaxParcelas;
	private JTextField textFieldJurosValorTotal;
	private JTextField textFieldJurosMensal;
	private JTextField textFieldObservacoes;
	private boolean edicao;
	private String formatString = "##/##/####";

	/**
	 * Create the frame.
	 */
	public CadPlanoEmprestimoView() {
		edicao = false;
		init();
	}
	
	public void init(){
		setTitle("Novo Plano de Emprestimo");
		setBounds(100, 100, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCodigoPlano = new JLabel("Codigo Plano");
		lblCodigoPlano.setBounds(10, 21, 103, 14);
		contentPane.add(lblCodigoPlano);

		textFieldCodPlano = new JTextField();
		textFieldCodPlano.setBackground(SystemColor.control);
		textFieldCodPlano.setBounds(10, 39, 103, 20);
		contentPane.add(textFieldCodPlano);
		textFieldCodPlano.setColumns(10);

		JLabel lblDataDeCadastro = new JLabel("* Data de Cadastro");
		lblDataDeCadastro.setBounds(388, 21, 103, 14);
		contentPane.add(lblDataDeCadastro);

		MaskFormatter maskData = InterfaceUsuario.createFormatter(formatString);
		formattedFieldDataNascimento = new JFormattedTextField(maskData);
		formattedFieldDataNascimento.setBounds(388, 39, 103, 20);
		contentPane.add(formattedFieldDataNascimento);
		formattedFieldDataNascimento.setColumns(10);

		JLabel lblPlanoDeEmprstimo = new JLabel("* Plano de Emprestimo");
		lblPlanoDeEmprstimo.setBounds(10, 89, 103, 14);
		contentPane.add(lblPlanoDeEmprstimo);

		textFieldPlanoEmprestimo = new JTextField();
		textFieldPlanoEmprestimo.setBounds(10, 115, 477, 20);
		contentPane.add(textFieldPlanoEmprestimo);
		textFieldPlanoEmprestimo.setColumns(10);

		JLabel lblJurosValorTotal = new JLabel("* Taxa de Juros valor total");
		lblJurosValorTotal.setBounds(238, 273, 131, 14);
		contentPane.add(lblJurosValorTotal);

		JLabel lblValorMnimoDe = new JLabel(
				"Valor minimo de emprestimo");
		lblValorMnimoDe.setBounds(10, 154, 138, 14);
		contentPane.add(lblValorMnimoDe);

		textFieldValorMinimo = new JTextField();
		textFieldValorMinimo.setBounds(34, 172, 131, 20);
		contentPane.add(textFieldValorMinimo);
		textFieldValorMinimo.setColumns(10);

		JLabel lblR = new JLabel("R$");
		lblR.setBounds(10, 175, 19, 14);
		contentPane.add(lblR);

		JLabel lblValorMaximoDe = new JLabel(
				"Valor maximo de emprestimo");
		lblValorMaximoDe.setBounds(238, 154, 170, 14);
		contentPane.add(lblValorMaximoDe);

		JLabel label = new JLabel("R$");
		label.setBounds(238, 175, 19, 14);
		contentPane.add(label);

		textFieldValorMaximo = new JTextField();
		textFieldValorMaximo.setBounds(260, 172, 125, 20);
		contentPane.add(textFieldValorMaximo);
		textFieldValorMaximo.setColumns(10);

		JLabel lblNmeroMnimoDe = new JLabel(
				"* Numero minimo de parcelas");
		lblNmeroMnimoDe.setBounds(10, 215, 131, 14);
		contentPane.add(lblNmeroMnimoDe);

		textFieldNumMinimoParcelas = new JTextField();
		textFieldNumMinimoParcelas.setBounds(10, 236, 103, 20);
		contentPane.add(textFieldNumMinimoParcelas);
		textFieldNumMinimoParcelas.setColumns(10);

		JLabel lblNmeroMximoDe = new JLabel(
				"Numero maximo de parcelas");
		lblNmeroMximoDe.setBounds(238, 215, 159, 14);
		contentPane.add(lblNmeroMximoDe);

		textFieldNumMaxParcelas = new JTextField();
		textFieldNumMaxParcelas.setBounds(238, 236, 103, 20);
		contentPane.add(textFieldNumMaxParcelas);
		textFieldNumMaxParcelas.setColumns(10);

		textFieldJurosValorTotal = new JTextField();
		textFieldJurosValorTotal.setBounds(238, 291, 103, 20);
		contentPane.add(textFieldJurosValorTotal);
		textFieldJurosValorTotal.setColumns(10);

		JLabel label_1 = new JLabel("%");
		label_1.setBounds(351, 298, 46, 14);
		contentPane.add(label_1);

		JLabel lblTaxaDeJuros = new JLabel("* Taxa de juros mensal");
		lblTaxaDeJuros.setBounds(10, 273, 103, 14);
		contentPane.add(lblTaxaDeJuros);

		textFieldJurosMensal = new JTextField();
		textFieldJurosMensal.setBounds(10, 291, 103, 20);
		contentPane.add(textFieldJurosMensal);
		textFieldJurosMensal.setColumns(10);

		JLabel label_2 = new JLabel("%");
		label_2.setBounds(119, 294, 46, 14);
		contentPane.add(label_2);

		JLabel lblObservaes = new JLabel("Observacoes");
		lblObservaes.setBounds(10, 322, 87, 14);
		contentPane.add(lblObservaes);

		textFieldObservacoes = new JTextField();
		textFieldObservacoes.setBounds(10, 341, 481, 74);
		contentPane.add(textFieldObservacoes);
		textFieldObservacoes.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(435, 477, 89, 23);
		contentPane.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				salvar();
			}
		});

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(336, 477, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				fechar();
			}
		});

	}

	public CadPlanoEmprestimoView(int idPlanoEmprestimo, String nome,
			Date dataCadastro, double jurosTotal, double jurosMensal,
			double valorMinimo, double valorMaximo, int minParcelas,
			int maxParcelas, String observacao) {
		init();
		edicao = true;
		textFieldCodPlano.setText("" + idPlanoEmprestimo);
		textFieldPlanoEmprestimo.setText(nome);
		formattedFieldDataNascimento.setText("" + dataCadastro);
		textFieldJurosValorTotal.setText("" + jurosTotal);
		textFieldJurosMensal.setText("" + jurosMensal);
		textFieldValorMinimo.setText("" + valorMinimo);
		textFieldValorMaximo.setText("" + valorMaximo);
		textFieldNumMinimoParcelas.setText("" + minParcelas);
		textFieldNumMaxParcelas.setText("" + maxParcelas);
		textFieldObservacoes.setText(observacao);
	}

	protected void salvar() {
		if (edicao) {

			InterfaceUsuario
					.editarPlano(
							InterfaceUsuario
									.transformaStringInt(textFieldCodPlano
											.getText()),
							textFieldPlanoEmprestimo.getText(),
							formattedFieldDataNascimento.getText(),
							InterfaceUsuario
									.transformaStringDouble(textFieldJurosValorTotal
											.getText()),
							InterfaceUsuario
									.transformaStringDouble(textFieldJurosMensal
											.getText()),
							InterfaceUsuario
									.transformaStringDouble(textFieldValorMinimo
											.getText()),
							InterfaceUsuario
									.transformaStringDouble(textFieldValorMaximo
											.getText()),
							InterfaceUsuario
									.transformaStringInt(textFieldNumMinimoParcelas
											.getText()),
							InterfaceUsuario
									.transformaStringInt(textFieldNumMaxParcelas
											.getText()), textFieldObservacoes
									.getText());
		} else {
			InterfaceUsuario
					.cadastrarPlano(
							textFieldPlanoEmprestimo.getText(),
							formattedFieldDataNascimento.getText(),
							InterfaceUsuario
									.transformaStringDouble(textFieldJurosValorTotal
											.getText()),
							InterfaceUsuario
									.transformaStringDouble(textFieldJurosMensal
											.getText()),
							InterfaceUsuario
									.transformaStringDouble(textFieldValorMinimo
											.getText()),
							InterfaceUsuario
									.transformaStringDouble(textFieldValorMaximo
											.getText()),
							InterfaceUsuario
									.transformaStringInt(textFieldNumMinimoParcelas
											.getText()),
							InterfaceUsuario
									.transformaStringInt(textFieldNumMaxParcelas
											.getText()), textFieldObservacoes
									.getText());
		}

	}

	public void mostrarMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	protected void fechar() {
		this.dispose();
	}

}
