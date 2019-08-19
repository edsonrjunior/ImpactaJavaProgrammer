
package ado1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Deise
 */
public class Ado1 {
    
    static List <Pib> pibEstado = new ArrayList(); 
    static ArrayList<regioes> regiao = new ArrayList ();
    
    //ler endereço do arquvo
    public static String lerDados (){
        String endereco;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite endereço do arquivo .txt: ");
        endereco=leitor.next();
        return endereco;
    }
        
    //Exercício A ok
    public static void lerArquivo (String x) {
       
        double soma=0;
        
        try (BufferedReader br = new BufferedReader (new FileReader(x))){
            String line = br.readLine();
            
            while(line != null){
                String [] pib = line.split(";");
                double nPib = Double.parseDouble(pib[1]);
                soma=soma+nPib;
                line=br.readLine();
                
            }
        }
        catch(IOException ex){
            System.out.println("Error: "+ ex.getMessage());
        }
        
     try (BufferedReader br = new BufferedReader (new FileReader(x))){
            String line = br.readLine();
            
            while(line != null){
                String [] pib = line.split(";");
                String estado = pib [0];
                double nPib = Double.parseDouble(pib[1]);
                double pib2 = (nPib/soma)*100;
                pibEstado.add(new Pib(estado, pib2));
               System.out.println(estado + " "+ pib2);
                line=br.readLine();
                
            }
            
            
        }
        catch(IOException ex){
            System.out.println("Error: "+ ex.getMessage());
        }
     
     
     }
     
    

    
    //tartar os arquivos pib de acordo com as regioes
    public static void tratarDados (String a){
        try {
            
            BufferedReader br1 = new BufferedReader (new FileReader(a));
            
            String line = br1.readLine();
            
            while (line != null){
                String []estadosRegiao=line.split(";\\s");
                System.out.println(line);
                line = br1.readLine();
            }
            
            
        }
        catch(IOException ex){
            System.out.println("Error: "+ ex.getMessage());
        }
        
        
        
        
    }
    
        
       
    //gerar arquivo final
    public void gerarArquivo (String x, List <Pib> pibEstado){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(x))){
            for (Pib line : pibEstado){
                
                //bw.write(line);
                //bw.newLine();
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        
        //C:\Users\deise.mfarias\Desktop\pib.txt
        //C:\Users\deise.mfarias\Desktop\regiao.txt
        
        /*Exercício A
        lerArquivo(lerDados());*/
        
         //File arquivo = new File("C:\\Users\\Deise\\Desktop\\pib.txt");
         //File arquivo = new File("C:\\Users\\Deise\\Desktop\\regioes.txt");
         
         //lerArquivo(lerDados());   
         
         
         tratarDados(lerDados());
         
         
         }
    
    
         
            
        }
        
        
        
        
 
    

