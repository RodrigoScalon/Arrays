public class GradeBook {

    private String courseName; // nome do curso que essa Grade Book representa
    private int[] grades; // array de notas dos alunos

    // construtor

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;

    }

    public void setCourseName(String courseName) // método para configurar o nome do Curso
    {
        this.courseName = courseName;

    }

    public String getCourseName() { // método para recuperar o nome do curso

        return courseName;
    }

    public void processGrades() { // realiza várias operações nos dados

        outputGrades(); // gera saiída de array de notas

        // chama o método get avarage para calcular a nota media
        System.out.printf("%nClass avarage is %.2f%n", getAverage());
        // chama os métodos get minumum e get maximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        // chama o output bar para imprimir gráfico de distribuicao de nota
        outputBarChart();

    }

    // localiza a nota mínima
    public int getMinimum() {

        int lowGrade = grades[0]; // supõe que grade zero é a menor nota

        // faz um loop pelo array de notas
        for (int grade : grades) {
            if (grade < lowGrade) // se nota for mais baixa que low grade, atribui essa nota a low grade
                lowGrade = grade; // nova nota mais baixa
        }

        return lowGrade;
    }

    public int getMaximum() { // localizar a nota mais alta

        int highGrade = grades[0]; // supor que a nota maior

        for (int grade : grades) {
            if (grade > highGrade)
                highGrade = grade;
        }

        return highGrade;
    }

    public double getAverage() { // determinar a média para o teste

        int total = 0;
        for (int grade : grades)
            total += grade;

        return (double) total / grades.length; // retornar a média de notas
    }

    public void outputBarChart() {

        System.out.println("Grade distribuction: "); // gera a saída do gráfico de barras exibindo distruibuição de
                                                     // notas

        int[] frequency = new int[11]; // armazena a frequencia de notas em cada intervalo de 10 notas

        for (int grade : grades) // para cada nota, incrementa a frenquecia apropriada
            ++frequency[grade / 10];

        for (int count = 0; count < frequency.length; count++) {
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void outputGrades() { // gera a saída do array notas

        System.out.println("The Grades Are:");
        System.out.println();

        for (int student = 0; student < grades.length; student++) // gera a saída de notas de cada aluno
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);

    }

}
