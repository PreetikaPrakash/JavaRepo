package coreJava;

import java.util.ArrayList;
public class Student {

    int id;
    String name;
    int[] marks;

    public Student(){ }
    public Student(int id, String name, int marks){
        super();
        this.id = id;
        this.name = name;
     //   this.marks = marks;
    }
    //public int student_Marks(){



    public static void main(String[] args) {
        ArrayList<Student> arrStudent = new ArrayList<>();
        Student stu;
            stu = new Student(1,"ABC",10);
            arrStudent.add(stu);
            stu = new Student(2,"ABC",20);
            arrStudent.add(stu);
            stu = new Student(3,"ABC",30);
            arrStudent.add(stu);
            stu = new Student(4,"ABC",40);
            arrStudent.add(stu);
            stu = new Student(5,"ABC",50);
            arrStudent.add(stu);
    }
}

