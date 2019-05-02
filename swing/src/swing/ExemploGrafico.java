package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ExemploGrafico {
	
	public static void main(String[] args) {
		
		JFrame frm = new JFrame();
		
		frm.setTitle("Meu Swing!");
		frm.setSize(800, 400);
		
		frm.getContentPane().setBackground(Color.BLUE);
		
		JButton btn1 = new JButton("OK");
		btn1.setBounds(0, 0, 396, 124);
		btn1.setPreferredSize(new Dimension(250,85));
		JButton btn2 = new JButton("SAIR");
		btn2.setBounds(396, 0, 396, 124);
		btn2.setPreferredSize(new Dimension(100,60));
		JButton btn3 = new JButton("CANCELAR");
		btn3.setBounds(65, 147, 288, 38);
		btn3.setPreferredSize(new Dimension(120,60));
		JButton btn4 = new JButton("EDITAR");
		btn4.setBounds(396, 124, 396, 124);
		btn4.setPreferredSize(new Dimension(90,30));
		JButton btn5 = new JButton("BUSCA");
		btn5.setBounds(0, 248, 396, 124);
		btn5.setPreferredSize(new Dimension(90,30));
		frm.getContentPane().setLayout(null);
		
		frm.getContentPane().add(btn1);
		frm.getContentPane().add(btn2);
		frm.getContentPane().add(btn3);
		frm.getContentPane().add(btn4);
		frm.getContentPane().add(btn5);
		
		frm.setLocationRelativeTo(null); //centralizacao
		frm.setVisible(true);
		
		
	}

}
