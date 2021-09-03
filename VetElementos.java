import java.util.Scanner;        //PROGRAMA QUE MOSTRA QUAIS SÃO IGUAIS AS 15 e a soma dos menores e maiores q o mesmo.

public class VetElementos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetorA = new int [10];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = input.nextInt();    
        }
        int somaMenor15 =0;
        int somaMaior15 =0;
        int qtdMaior15 =0;
        int igual15 =0;

        for(int i=0; i<vetorA.length; i++ ){
            if (vetorA[i] == 15 ){
                igual15++;

            } else if (vetorA[i] < 15 ){
                somaMenor15 += vetorA[i];
            } else {
                somaMaior15++;
                somaMaior15 += vetorA[i];
            }
        }

        System.out.print ("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print (vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Quantidade de números iguais a 15 : " +igual15);
        System.out.println("Soma menores que 15 = " +somaMenor15);
        System.out.println("Soma maiores que 15 = " +somaMaior15);
        System.out.println("Média números > 15: " + (somaMaior15/qtdMaior15));


            input.close();
    }
}