package lesson27;

public class Student extends Person{

    private int studentId;
    public Student(String name){
        super(name);
    }

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void display() {
        System.out.println("имя: " + getName() + "номер студента: " + getStudentId());
    }
    }

