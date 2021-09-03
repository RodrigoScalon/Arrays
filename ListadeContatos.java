import java.util.ArrayList;
import java.text.ParseException;


public class ListadeContatos {


    public static void main(String[] args) throws ParseException {
        
        ArrayList <contato> contatos = new ArrayList<>(); //nao aceita tipos primitvos, só aceita objetos

        contato contato = new contato("Rodrigo Fraga", "rodrigoscalon@Gmail.com", "997757026");
        contato contato1 = new contato("Luiz Fraga", "luizscalon@Gmail.com", "997757026");
        contato contato2 = new contato("Iluni Scalon", "iluniscalon@Gmail.com", "997757026");
        contato contato3 = new contato("Claudia Scalon", "claudiascalon@Gmail.com", "997757026");


        contatos.add(contato);
        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);


            for (contato c: contatos) {
                System.out.println(c);
            }

            System.out.println("Total de itens da lista: " +contatos.size());
            System.out.println(contatos.contains(contato2));
            }            
}
