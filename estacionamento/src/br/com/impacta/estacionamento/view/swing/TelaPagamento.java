package br.com.impacta.estacionamento.view.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.impacta.estacionamento.model.Movimentacao;

public class TelaPagamento extends JFrame {

	private JPanel contentPane;
	private JFrame principal;
	private Movimentacao movimentacao;
	

	public TelaPagamento(JFrame principal, Movimentacao movimentacao) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				principal.setVisible(true);
			}
		});
		setTitle("Resumo do Pagamento");
		setResizable(false);
		this.principal = principal;
		this.movimentacao = movimentacao;
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlSul = new JPanel();
		contentPane.add(pnlSul, BorderLayout.SOUTH);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.setVisible(true);
				dispose();
			}
		});
		btnOK.setPreferredSize(new Dimension(75, 23));
		pnlSul.add(btnOK);
		
		JPanel pnlCentro = new JPanel();
		contentPane.add(pnlCentro, BorderLayout.CENTER);
		pnlCentro.setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlaca.setBounds(69, 35, 71, 14);
		pnlCentro.add(lblPlaca);
		
		JLabel lblEntrada = new JLabel("Entrada:");
		lblEntrada.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEntrada.setBounds(69, 84, 71, 14);
		pnlCentro.add(lblEntrada);
		
		JLabel lblSaida = new JLabel("Sa\u00EDda:");
		lblSaida.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSaida.setBounds(69, 133, 71, 14);
		pnlCentro.add(lblSaida);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValor.setBounds(69, 182, 71, 14);
		pnlCentro.add(lblValor);
		
		String placa = movimentacao.getVeiculo().getPlaca();
		JLabel movPlaca = new JLabel(placa);
		movPlaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		movPlaca.setBounds(196, 37, 228, 12);
		pnlCentro.add(movPlaca);
		
		String entrada = format(movimentacao.getDataHoraEntrada());
		JLabel movEntrada = new JLabel(entrada);
		movEntrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		movEntrada.setBounds(196, 86, 212, 14);
		pnlCentro.add(movEntrada);
		
		String saida = format(movimentacao.getDataHoraSaida());
		JLabel movSaida = new JLabel(saida);
		movSaida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		movSaida.setBounds(196, 135, 212, 14);
		pnlCentro.add(movSaida);
		
		String valor = String.format("R$ %.2f", movimentacao.getValor());
		JLabel movValor = new JLabel(valor);
		movValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		movValor.setBounds(196, 184, 212, 14);
		pnlCentro.add(movValor);
		
		this.setLocationRelativeTo(null);//centralizar
	}

	private String format(LocalDateTime data) {
		return data.format
				(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}

}
