import java.util.Scanner;        //PROGRAMA QUE SOMA SÃO OS VALORES MULTIPLOS 

public class VetMultiplos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetorA = new int [10];

        for (int i=0; i<vetorA.length; i++ ) {
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = input.nextInt();    
        }
        int soma =0;

        for (int i=0; i<vetorA.length; i++ ) {
            if (vetorA[i] %5 == 0){
                soma += vetorA[i];
            }
        }

        System.out.print ("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print (vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de pares: " +soma);

            input.close();
    }
}