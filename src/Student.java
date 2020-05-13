public class Student extends Person {
    private String studentId;

    public Student(String studentId, String firstName, String lastName) {
        // super();
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }
}
