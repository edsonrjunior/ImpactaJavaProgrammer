package capitulo13;

public class MaioresSalarios {

    public static void main(String[] args) {

        double[] salariosBrutos = 
        	{ 1350.0, 4320.15, 8235.25, 2500.55, 
        		1830.0, 850.26, 3614.29, 12500.0 };
        
        double[] salariosTop = DoubleArrayUtils.filtraValores
        						(salariosBrutos, x-> x>3000);
        
        System.out.println("*** TODOS OS SALARIOS *** ");
        DoubleArrayUtils.processaValores(salariosBrutos,
						s -> System.out.printf("R$ %.2f ; ",s));
        
        System.out.println("\n\n*** OS MAIORES SALARIOS *** ");
        
        DoubleArrayUtils.processaValores(salariosTop,
        					s -> System.out.printf("R$ %.2f\n",s));
    }
}
