package capitulo04;

public class CondicionalIf {
	
	public static void main(String[] args) {
		
		/*
		 *  Estrutura mínima do if
		 *  
		 *  if(<expressao_booleana){
		 *  
		 *  }
		 */
		int num = 10;
		if(num < 20){
			System.out.printf("Número é %d \n",num);
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
			System.out.printf("O número %d é maior que 20\n",num);
		}else{
			System.out.printf("O número %d NÃO É maior que 20\n",num);
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
			System.out.printf("O número %d é maior que 20\n",num);
		}else if(num < 20){
			System.out.printf("O número %d é menor que 20\n",num);
		}else{
			System.out.printf("O número %d é igual a 20\n",num);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
