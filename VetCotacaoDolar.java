import java.util.Scanner;  //calcula as notas alunos e se for -7 reprovado e maior que 7 aprovado 

public class VetCotacaoDolar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double [] vetorA = new double [5];

        double cotacao;

        System.out.println("Entre com a cotação do Dólar: ");
        cotacao = input.nextDouble();


        for (int i=0; i<vetorA.length; i++){

            vetorA[i] = cotacao * (i+1); 
        }

        System.out.print ("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
        System.out.print (vetorA[i] + " ");
        }
        
        input.close();

    }


}

