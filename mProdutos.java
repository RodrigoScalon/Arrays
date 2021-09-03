
//o programa le um numero n de dados (nome e preço) e n produtos
//o programa armazena n produtos em um vetor 
//em seguida o programa mostra o preço medio dos produtos
import java.util.Scanner;

public class mProdutos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        pProdutos[] vect = new pProdutos[n]; // vetor do tipo referencia, aponta para um vetor lá no heap, n ponteiros
                                             // vazios. deve instanciar.

        for (int i = 0; i < vect.length; i++) {
            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();

            vect[i] = new pProdutos(name, price);
        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();

        }

        double media = sum / n;

        System.out.printf("PREÇO MÉDIO: %.2f%n", +media);

        input.close();

    }
}
