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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.com.impacta.estacionamento.controller.Controlador;
import br.com.impacta.estacionamento.model.exceptions.VagaException;
import br.com.impacta.estacionamento.model.exceptions.VeiculoException;


public class TelaEntrada extends JFrame {

	private JPanel contentPane;
	private JFrame principal;
	
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtCor;
	private JButton btnOK = new JButton("OK");
	private JButton btnCancel = new JButton("Cancelar");
	private JFormattedTextField ftfPlaca;

	public TelaEntrada(JFrame telaPrincipal) {
		
		this.principal = telaPrincipal;
		
		setTitle("Entrada de Ve\u00EDculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String placa = ftfPlaca.getText();
				String marca = txtMarca.getText();
				String modelo = txtModelo.getText();
				String cor = txtCor.getText();
				
				Controlador control = new Controlador();
				try {
					control.registraEntrada(placa,marca,modelo,cor);
					String msg = 
			 	  String.format("Veiculo placa %s registrado!",placa);
					
					JOptionPane.showMessageDialog
						(null, msg, "Veículo Registrado",
							JOptionPane.INFORMATION_MESSAGE );
				
				} catch (VagaException | VeiculoException ve) {
					
					JOptionPane.showMessageDialog
						(null, ve.getMessage(), "Um erro ocorreu",
								JOptionPane.ERROR_MESSAGE );
				}
				
				voltar();
			}
		});
		
		btnOK.setMinimumSize(new Dimension(77, 23));
		btnOK.setMaximumSize(new Dimension(77, 23));
		btnOK.setPreferredSize(new Dimension(77, 23));
		panel.add(btnOK);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				voltar();
			}
		});
		
		panel.add(btnCancel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblPlaca = new JLabel("Placa :");
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlaca.setBounds(62, 34, 82, 17);
		panel_1.add(lblPlaca);
		
		try {
			MaskFormatter format = new MaskFormatter("UUU-####");
			ftfPlaca = new JFormattedTextField(format);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		ftfPlaca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ftfPlaca.setColumns(40);
		ftfPlaca.setBounds(190, 25, 128, 26);
		
		panel_1.add(ftfPlaca);
		
		JLabel lblMarca = new JLabel("Marca :");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMarca.setBounds(62, 85, 82, 14);
		panel_1.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo :");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblModelo.setBounds(62, 133, 82, 14);
		panel_1.add(lblModelo);
		
		JLabel lblCor = new JLabel("Cor : ");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCor.setBounds(62, 181, 82, 14);
		panel_1.add(lblCor);
		
		txtMarca = new JTextField();
		txtMarca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMarca.setBounds(190, 76, 128, 26);
		panel_1.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtModelo.setBounds(190, 127, 128, 26);
		panel_1.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCor.setBounds(190, 178, 128, 26);
		panel_1.add(txtCor);
		txtCor.setColumns(10);
		
		setLocationRelativeTo(null);//centralizar
	}

	protected void voltar() {
		principal.setVisible(true);
		dispose();
	}
}
