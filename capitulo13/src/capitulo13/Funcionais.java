package capitulo13;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Funcionais {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = x -> { 
								System.out.println(x.toUpperCase());
		};
		
		consumer.accept("abcefg");
		
		
		BiConsumer<Integer,Integer> biconsumer = 
				(x,y) -> System.out.println("Soma: " + (x+y));
		
		biconsumer.accept(50, 60);		
				
	}

}
