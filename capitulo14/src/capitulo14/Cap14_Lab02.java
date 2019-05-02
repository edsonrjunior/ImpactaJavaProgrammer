package capitulo14;

import java.util.ArrayList;

public class Cap14_Lab02 {
	
	public static void main(String[] args) {
		ArrayList<Estudante> estudanteList = new ArrayList<>();
		
		estudanteList.add(new Estudante("Joana",8.5,8.5));
		estudanteList.add(new Estudante("Antonio",6.0,9.0));
		estudanteList.add(new Estudante("Mariana",7.5,9.0));
		estudanteList.add(new Estudante("Ricardo",7.0,9.0));
		estudanteList.add(new Estudante("Gustavo",9.5,10.0));
		
		estudanteList.forEach(e -> {
			double media = 
				(e.getNotaMatematica()+ e.getNotaPortugues())/2;

			e.setMedia(media);
		});
		
		System.out.println("Média dos alunos:");
		System.out.println("------------------");
		estudanteList.forEach(e -> System.out.printf
							   ("%s: %.2f%n",e.getNome(),e.getMedia()));
		
	}
}
