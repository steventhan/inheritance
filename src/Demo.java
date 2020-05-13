import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        // s = set()
        Set<Student> set = new HashSet<>();
        Student stu1 = new Student("12345", "Kelly", "Tran");
        Student stu2 = new Student("1234", "Kelly", "Nguyen");
        Teacher teacher = new Teacher("Steve", "Than");

        set.add(stu1);
        set.add(stu2);
        System.out.println(set.contains(stu1));
        System.out.println(set.size());

//        System.out.println(stu1.getFullName());
//        System.out.println(teacher.getFullName());
    }
}
