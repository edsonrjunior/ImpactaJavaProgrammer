package br.com.impacta.estacionamento.view.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JPanel inOutPanel;
	private JPanel reportPanel;
	private JButton btnEntrada = new JButton("");
	private JButton btnSaida = new JButton("");
	private JButton btnReport = new JButton("Relatório de Faturamento");

	public static void main(String[] args) {
		TelaPrincipal frame = new TelaPrincipal();
		frame.setVisible(true);
	}

	public TelaPrincipal() {
		setTitle("Sistema de Estacionamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		inOutPanel = new JPanel();
		reportPanel = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		btnEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEntrada telaEntrada = 
						new TelaEntrada(TelaPrincipal.this);
				telaEntrada.setVisible(true);
				dispose();//some
			}
		});
		contentPane.setLayout(new BorderLayout(0, 0));
		inOutPanel.setLayout(new GridLayout(1,2));
		reportPanel.setLayout(new BorderLayout());
		
		btnEntrada.setIcon(new ImageIcon(getClass().getResource("/recursos/entrar.png")));
		inOutPanel.add(btnEntrada);
		btnSaida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSaida telaSair = new TelaSaida(TelaPrincipal.this);
				telaSair.setVisible(true);
				dispose();
			}
		});
				
		btnSaida.setIcon(new ImageIcon(getClass().getResource("/recursos/sair.png")));
		inOutPanel.add(btnSaida);
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaRelatorioFaturamento telaFaturamento = new TelaRelatorioFaturamento(TelaPrincipal.this);
				telaFaturamento.setVisible(true);
				dispose();
			}
		});
		btnReport.setForeground(Color.BLUE);
		btnReport.setFont(new Font("Tahoma", Font.BOLD, 12));
		reportPanel.add(btnReport);
		
		contentPane.add(inOutPanel,BorderLayout.CENTER);
		contentPane.add(reportPanel,BorderLayout.SOUTH);
		
		
		this.setLocationRelativeTo(null); //centralizar o frame
	}

}
