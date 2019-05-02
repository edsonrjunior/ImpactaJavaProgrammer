package capitulo14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import cap6lab1.Funcionario;

public class MapaFuncionario {
	
	public static void main(String[] args) {
		
		Map<String,Funcionario> mapaFunc = new HashMap<>();
		
		Funcionario f1 = 
				new Funcionario("Joao","Silva","Enfermeiro",3333);
		
		Funcionario f2 = 
				new Funcionario("Maria","Souza","Professora",4567.32);
		
		Funcionario f3 = 
				new Funcionario("Silvana","Barbosa","Policial",3876.22);

		mapaFunc.put("111.111.111-11",f1);
		mapaFunc.put("222.222.222-22",f2);
		mapaFunc.put("333.333.333-33",f3);
		
		//Recupero o valor associado 'a chave
		Funcionario recuperado = mapaFunc.get("222.222.222-22");
		System.out.println("Recuperado: " + recuperado.getNome());
		
		//Listando todas as chaves presentes no map
		System.out.println("*** CPFS REGISTRADOS ***");
		Set<String> cpfs = mapaFunc.keySet();
		for(String cpf : cpfs){
			System.out.println(cpf);
		}
		
		//Listando somente os valores
		System.out.println("*** Funcionarios Registrados ***");
		Collection<Funcionario> funcionarios = mapaFunc.values();
		funcionarios.forEach(x->System.out.println(x));
		
		
		
		
		
		
		
		
		
		
		
	}

}
