public class StudentCompare {
    private final Student[] students;

    public StudentCompare(Student[] students) {
        this.students = students;
    }

    public void QuickSort (int left, int right) {
        Student pivot = students[left];

        int leftHold = left;
        int rightHold = right;

        while (left < right) {
            while ((students[right].compareTo(pivot) <= 0) && (left < right)) {
                right --;
            }
            if (left != right) {
                students[left] = students[right];
                left++;
            }

            while ((students[left].compareTo(pivot) >= 0) && (left < right)) {
                left++;
            }

            if (left != right) {
                students[right] = students[left];
                right--;
            }
        }

        students[left] = pivot;
        int indexPivot = left;
        left = leftHold;
        right = rightHold;

        if (left < indexPivot) {
            QuickSort(left, right);
        }
        if (right > indexPivot) {
            QuickSort(left, right);
        }

    }

    private void permutation(int index0, int index1) {
        Student temp = students[index1];
        students[index1] = students[index0];
        students[index0] = temp;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Student s : students) {
            result.append(String.format("Name: %s; Final Score: %d; \n", s.getName(), s.getFinalScore()));
        }
        return result.toString();
    }
}
