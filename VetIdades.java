import java.util.Scanner;        //Idade do grupo de pessoas e informa a quantidade de pessoas com idade superior a 35.

public class VetIdades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetorA = new int [5];

        for (int i=0; i < vetorA.length; i++) {
            System.out.println("Entre com a idade " +(i+1));
            vetorA[i] = input.nextInt();
        }

        int somaMenor35 =0; 

        for (int i=0; i <vetorA.length; i++){
            if(vetorA[i] > 35){
                somaMenor35++;
            }
        }
        System.out.print ("Idades Lançadas = ");
        for (int i=0; i< vetorA.length; i++){
        System.out.print (vetorA[i] + " ");
        }
        
        System.out.println();
        System.out.println("Pessoas maiores que 35 anos: " +somaMenor35);





        input.close();
    }

}


