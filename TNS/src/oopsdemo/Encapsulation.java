package oopsdemo;

class Student {
    private int studentId;
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int id) {
        studentId = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setStudentId(11);
        s.setStudentName("janu");

        System.out.println("Student ID: " + s.getStudentId());
        System.out.println("Student Name: " + s.getStudentName());
    }
}