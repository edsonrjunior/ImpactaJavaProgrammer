package capitulo04;

public class CopasDoMundo {

	public static void main(String[] args) {
		System.out.println("****Os Anos das Copas do Mundo ****");
	
		for(int ano=1930 ; ano < 2019 ; ano+=4){
			if(ano == 1942 || ano == 1946){
				continue;
			}
			System.out.printf("Copa de %d \n",ano);
		}
	}
}
