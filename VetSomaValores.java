import java.util.Scanner;        //PROGRAMA QUE MOSTRA QUAIS SÃO OS VALORES PARES ARMAZENADOS

public class VetSomaValores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetorA = new int [5];

        for (int i=0; i<vetorA.length; i++ ) {
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = input.nextInt(); 
        }

        int soma =0;

        for (int i=0; i<vetorA.length; i++){
            soma += vetorA[i];
        }

        System.out.print ("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print (vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma total do VETOR A: " +soma);


        input.close();

        }


    }
