public class main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student();
        }

        StudentCompare sort = new StudentCompare(students);
        System.out.println("Unsorted: ");
        System.out.println(sort);

        sort.quick(0, students.length - 1);
        System.out.println();

        System.out.println("Sorted: ");
        System.out.print(sort);
    }
}
