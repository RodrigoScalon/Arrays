import java.text.ParseException;
import java.util.Scanner;


    public class MRent {

        public static void main(String[] args) throws ParseException {

            Scanner sc = new Scanner(System.in);

            PRent[] vect = new PRent[10]; //máximo de 10 quartos 

            System.out.print("How many rooms will be rented? ");
            int n = sc.nextInt(); //le o numero de quartos que serão alugados e grava no "N"

            for (int i=1; i<=n; i++) { // i deve ser maior ou igual a quantidade de quartos solicitados

            System.out.println(); //nova linha
            System.out.println("Rent #" + i + ":"); //imprime na tela o quarto  i ou seja o primeiro
            System.out.print("Name: "); //pede o nome do locador
            sc.nextLine();

            String name = sc.nextLine(); //grava o nome do locador
            
            System.out.print("Email: "); //pede o email
            String email = sc.nextLine(); // grava o email do locador

            System.out.print("Room: "); //pede o numero do quarto de 1 a 10 para alugar.
            int room = sc.nextInt();

            vect[room] = new PRent(name, email); //guarda o nome e email do locador no vetor "room"

            }
            
            System.out.println();
            System.out.println("Busy rooms:"); //informa os quartos alugados
            
                for (int i=0; i<10; i++) {
                if (vect[i] != null) {
                
                System.out.println(i + ": " + vect[i]); //imprime o i (numero quarto) e o vetor vect room com nome, email.
            }
            }
            sc.close();
            }
}
