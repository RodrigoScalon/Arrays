public class GradeBookTest {

    public static void main(String[] args) {

        int[] gradesArray = { 87, 42, 94, 100, 83, 78, 85, 100, 76, 87 };

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the Grade Book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();

    }
}
