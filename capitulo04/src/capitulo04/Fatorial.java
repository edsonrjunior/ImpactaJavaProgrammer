package capitulo04;

import javax.swing.JOptionPane;

public class Fatorial {
	
	public static void main(String[] args) {
		//Pega o valor pela caixa de texto
		String sNumero = JOptionPane.showInputDialog("Digite o número:");
		int numero = Integer.parseInt(sNumero);//converte String em int
		
		double fatorial = 1;
		
		for(int i=numero ; i > 1 ; i--){
			fatorial *= i;
		}
		
		String texto = "O fatorial de " + numero + " é " + fatorial;
		
		//Exibe uma mensagem informativa
		JOptionPane.showMessageDialog(null, texto, "Fatorial",
									  JOptionPane.INFORMATION_MESSAGE);
	}

}
