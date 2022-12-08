package ss5_access_modifier.Student.Student;

public class ClassStudent {
    public static void main(String[] args) {
        Student student=new Student("Quoc","C10");
        System.out.println(student);
        Student student1=new Student("Van","C02");
        student1.setClassStudent("C10");
        System.out.println(student1);
    }
}
