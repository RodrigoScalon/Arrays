
// programa que le n pessoas e a altura de n pessoas e armazena em um vetor
//mostrando a média das alturas 
import java.util.Scanner;

public class mMedia {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        double[] vect = new double [n]; //double aciona o vetor novo vetor double n elementos (int)

        for (int i=0; i<n; i++ ) {
            vect [i] = input.nextDouble();
        }

        double soma=0;

        for (int i=0; i<n; i++ ) {
            soma += vect [i];
        }

        double media = soma/n;

        System.out.printf("MEDIA: %.2f%n", +media);

        input.close();

    }
}
