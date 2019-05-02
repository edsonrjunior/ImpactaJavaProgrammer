package br.com.impacta.estacionamento.view.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import br.com.impacta.estacionamento.controller.Controlador;
import br.com.impacta.estacionamento.model.Movimentacao;
import br.com.impacta.estacionamento.model.exceptions.MovimentacaoException;
import br.com.impacta.estacionamento.model.exceptions.VagaException;
import br.com.impacta.estacionamento.model.exceptions.VeiculoException;


public class TelaSaida extends JFrame {
	
	private JFrame principal;
	private JFormattedTextField ftfPlaca;
 
	public TelaSaida(TelaPrincipal telaPrincipal) {
		this.principal = telaPrincipal;
		

		setTitle("Sa\u00EDda de Ve\u00EDculo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 208);
		this.setLocationRelativeTo(null);//centralizar
		
		JPanel pnlSul = new JPanel();
		getContentPane().add(pnlSul, BorderLayout.SOUTH);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controlador control = new Controlador();
				String placa = ftfPlaca.getText();
				
				try {
					Movimentacao movimentacao = 
							control.efetivarSaida(placa);
					TelaPagamento tp = 
							new TelaPagamento(principal,movimentacao);
					
					tp.setVisible(true);
					dispose();
					
				} catch (VagaException | VeiculoException
						| MovimentacaoException e1) {
					
					e1.printStackTrace();
				}
				
			}
		});
		btnOK.setPreferredSize(new Dimension(77, 23));
		pnlSul.add(btnOK);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.setVisible(true);
				dispose();
			}
		});
		pnlSul.add(btnCancel);
		
		JPanel pnlCentral = new JPanel();
		getContentPane().add(pnlCentral, BorderLayout.CENTER);
		pnlCentral.setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa :");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlaca.setBounds(107, 66, 77, 17);
		pnlCentral.add(lblPlaca);

		try {
			MaskFormatter format = new MaskFormatter("UUU-####");
			ftfPlaca = new JFormattedTextField(format);
			ftfPlaca.setFont(new Font("Tahoma", Font.BOLD, 16));
			ftfPlaca.setBounds(190, 60, 99, 31);
			pnlCentral.add(ftfPlaca);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
