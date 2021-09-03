
public class CalcArray {

    public static void main(String[] args) {
        

        final int ARRAY_LENGHT = 5;

        int [] array = new int[ARRAY_LENGHT];

        for(int counter = 0; counter<array.length; counter++)
        array[counter] = 2 + 2 * counter; //calcula valor de cada elemento do array

        System.out.printf ("%s%8s%n", "Index", "Value");
    

        for(int counter =0; counter < array.length; counter ++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
        
}

}



