package capitulo04;

public class CondicionalIf {
	
	public static void main(String[] args) {
		
		/*
		 *  Estrutura m�nima do if
		 *  
		 *  if(<expressao_booleana){
		 *  
		 *  }
		 */
		int num = 10;
		if(num < 20){
			System.out.printf("N�mero � %d \n",num);
		}
		
		
		/*
		 *  Estrutura if-else
		 *  
		 *  if(<expressao_booleana>){
		 *  	//codigo se verdadeiro
		 *  }else{
		 *  	//codigo se falso
		 *  }
		 */
		if(num > 20){
			System.out.printf("O n�mero %d � maior que 20\n",num);
		}else{
			System.out.printf("O n�mero %d N�O � maior que 20\n",num);
		}
		
		/*
		 *  Estrutura if-elseif-else
		 * 	if(<expressao_booleana1>){
		 *  	//codigo se verdadeiro
		 *  }else if(<expressao_booleana2>){
		 *  	//codigo se verdadeiro
		 *  }
		 *  ...
		 *  }else{
		 *  	//codigo se falso
		 *  }
		 */  
		if(num > 20){
			System.out.printf("O n�mero %d � maior que 20\n",num);
		}else if(num < 20){
			System.out.printf("O n�mero %d � menor que 20\n",num);
		}else{
			System.out.printf("O n�mero %d � igual a 20\n",num);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
