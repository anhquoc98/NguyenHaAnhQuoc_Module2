package ss5_access_modifier.Student.Student;

public class Student {
    private String name;


    public Student(String name, String classStudent) {
        this.name = name;
        this.classStudent = classStudent;
    }

    private String classStudent;

    public Student() {
        this("John", "C02");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStudent(String c10) {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }
}
