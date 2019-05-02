package misc;

public class UsaString {
	
	public static void main(String[] args) {
		
		char ch = "Curso Java".charAt(0);
		System.out.println(ch);
		
		String s1 = "Java";
		String s4 = "Java";
		
		if(s4 == s1){
			System.out.println("IGUAIS");
		}else{
			System.out.println("DIFERENTES");
		}

			
		s1.replace('a', 'o');
		System.out.println(s1);
		
		String s2 = new String("Java");
		String s3 = new String("Java");
		
		if(s2 == s3){
			System.out.println("IGUAIS");
		}else{
			System.out.println("DIFERENTES");
		}
		
		if(s2.equals(s3)){
			System.out.println("IGUAIS");
		}else{
			System.out.println("DIFERENTES");
		}
		
		String miniCsv = "joao;mendes;rua a 75;54;dentista";
		String[] dadosDaLinha = miniCsv.split(";");
		for(String s : dadosDaLinha){
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
