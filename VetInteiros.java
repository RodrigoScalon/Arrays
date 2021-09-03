import java.util.Scanner;        //PROGRAMA QUE MOSTRA QUAIS SÃO OS VALORES PARES ARMAZENADOS

public class VetInteiros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetorA = new int [10];

        for (int i=0; i<vetorA.length; i++ ) {
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = input.nextInt();    
        }
        int qtdPares =0;

        for (int i=0; i<vetorA.length; i++ ) {
            if (vetorA[i] %2 == 0){
                qtdPares++;
            }
        }

        System.out.print ("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print (vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Quantidade de pares: " +qtdPares);

            input.close();
    }
}

