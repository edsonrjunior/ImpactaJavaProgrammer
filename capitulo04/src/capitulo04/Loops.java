package capitulo04;

public class Loops {
	
	public static void main(String[] args) {
		
		/*
		 *  while(<expressao_booleana) {
		 *  	//bloco de codigo
		 *  }
		 *  
		 */
		int i = 10;
		
//		for(i=0;i<4;i++){
//			
//		}
		
		while(i > 0 ){
			System.out.println("i= "+i);
			i--;
		}
		
		System.out.println("----------------------");
		
		/*
		 *  do{
		 *  	//bloco de codigo
		 *  }while(<expressao_booleana>);
		 */
		int j = 10;
		do{
			System.out.println("j= "+j);
			j--;
		} while(j > 0);
		
		System.out.println("----------------------");
		
		/*
		 *  for(<inicializacao>;<condicional>;<incremento>){
		 *  	//bloco de codigo
		 *  }
		 * 
		 */
		for(int k=0; k<=10 ; k++){
			System.out.println("k= "+k);
		}
		
		System.out.println("----------------------");
		/*
		 * break : estrutura que encerra prematuramente um loop
		 */
		for(int k=1; k<1000; k++ ){
			if(k % 37 == 0){
				break;
			}
			System.out.println("k = "+k);
		}
		
		System.out.println("----------------------");
		
		/*
		 * continue : estrutura que encerra prematuramente 
		 * 			  o laço corrente
		 */
		
		for(int k=1; k<100; k++ ){
			if(k % 37 == 0){
				continue;
			}
			System.out.println("k = "+k);
		}
		
		
		/*
		 *  Enhanced-for ou "foreach"
		 *  
		 */
		for(String s : args){
			System.out.println("texto= "+s);
		}
		
		
		System.out.println("---------------------------");
		
		externo:
		for(int k=1; k<40; k++ ){
			
			for(int z=0; z<3; z++){
				if(k % 37 == 0){
					break externo;
				}
				System.out.println("k = "+k+",z= "+z);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
