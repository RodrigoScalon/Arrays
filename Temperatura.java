import java.text.ParseException;
public class Temperatura {

        public static void main(String[] args) throws ParseException {
                 


            double [] temperaturas = new double[5]; //declara a quantidade de Array a ser lido //
            
            temperaturas [0] = 31.3;
            temperaturas [1] = 32; 
            temperaturas [2] = 33.5; 
            temperaturas [3] = 34; 
            temperaturas [4] = 32; 
 
            System.out.println("O valor da tempetura do dia 1 é: " + temperaturas[0]);
            System.out.println("O tamanho do array é: " +temperaturas.length);
            System.out.println("Valores do Array: " );

            for (int i=0; i<temperaturas.length; i++) {
                System.out.println("O valor da tempetura do dia " + (i+1) + " é " + temperaturas[i]);

            }

               for (double temp : temperaturas) { //acessar diretamente uma posição com esse FOR "melhorado"
                System.out.println("O valor das temperaturas é: " +temp);

            }

        }

}