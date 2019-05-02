package capitulo04;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		/*
		 *  switch(var){
		 *  	case valor1:
		 *  		//codigo
		 *  		[break;]
		 *  	case valor2:
		 *  		//codigo
		 *  		[break;]
		 *   	...
		 *   	default:
		 *   		//codigo
		 *  }
		 */
		char nota = 'C';
		switch(nota){
		case 'A':
			System.out.println("Nota Excelente!");
			break;
		case 'B':
			System.out.println("Nota Boa!");
			break;
		case 'C':
			System.out.println("Nota Regular");
			//break;
		case 'D':
			System.out.println("Pode ser melhor");
			//break;
		default:
			System.out.println("Exame Especial!");
		}
		
		
		
		
	}
	

}
