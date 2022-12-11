package singleton;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        Student s3 = Student.getStudent();
        Student s4 = Student.getStudent();
        Student s5 = Student.getStudent();
        Student s6 = Student.getStudent();

        System.out.println(s1); // singleton.Student@1540e19d
        System.out.println(s2); // singleton.Student@1540e19d
        System.out.println(s3); // singleton.Student@1540e19d
        System.out.println(s4); // singleton.Student@1540e19d
        System.out.println(s5); // singleton.Student@1540e19d
        System.out.println(s6); // singleton.Student@1540e19d


    }
}
