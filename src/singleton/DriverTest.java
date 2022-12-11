package singleton;

public class DriverTest {
    public static void main(String[] args) {
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();

        Driver d1 = Driver.getDriver(); // an object
        Driver d2 = Driver.getDriver(); // same object


        System.out.println(d1); // singleton.Driver@1540e19d
        System.out.println(d2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
