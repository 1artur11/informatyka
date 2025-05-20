public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Andrzej", "Nowak", 1, 3.6);
        Student student2 = new Student("Patryk", "Kowalski", 2, 4.1);
        Student student3 = new Student("Joanna", "Chorwat", 3, 4.9);

        student1.wypiszDane();
        student2.wypiszDane();
        student3.wypiszDane();
    }
}
