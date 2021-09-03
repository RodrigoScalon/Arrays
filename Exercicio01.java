import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int [] vetorA = new int [5];
        int [] vetorB = new int [vetorA.length];

        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = input.nextInt();

            vetorB[i] = vetorA[i];
        }
        
        /*for (int i=0; i<vetorA.length; i++){
            vetorB[i] =vetorA[i];  */
            System.out.print("Vetor A = ");

            for (int i=0; i<vetorA.length; i++){
                System.out.printf(vetorA[i] + " ");
            }
            System.out.println();

            System.out.print("Vetor B = ");

            for (int i=0; i<vetorB.length; i++){
                System.out.printf(vetorB[i] + " ");
            }
            System.out.println();

        input.close();
    }

}




