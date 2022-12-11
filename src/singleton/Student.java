package singleton;

public class Student {

    private static Student student;

    private Student(){}

    public static Student getStudent(){
        if(student == null) student = new Student();
        return student;
    }

}
