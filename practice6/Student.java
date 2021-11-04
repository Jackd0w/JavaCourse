public class Student implements Comparable<Student>{
    private final String name;
    private final Integer finalScore;

    public String getName() {
        return name;
    }

    public Integer getFinalScore() {
        return finalScore;
    }

    public Student(String name, int finalScore) {
        this.name = name;
        this.finalScore = finalScore;
    }

    @Override
    public int compareTo(Student student) {
        return this.finalScore.compareTo(student.finalScore);
    }
}
