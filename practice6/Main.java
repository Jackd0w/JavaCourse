public class Main {
    
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Name1", 76),
            new Student("Name2", 67),
            new Student("Name3", 54),
            new Student("Name4", 99),
            new Student("Name5", 87)
        };

        StudentCompare sort = new StudentCompare(students);
        System.out.println("Unsorted: ");
        System.out.println(sort);

        sort.QuickSort(0, students.length - 1);
        System.out.println();

        System.out.println("Sorted: ");
        System.out.print(sort);
    }
}
