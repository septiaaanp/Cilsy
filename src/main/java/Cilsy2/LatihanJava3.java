package Cilsy2;


import Cilsy.LatihanJava1;

public class LatihanJava3 extends LatihanJava1 {
    private int grade;

    public void Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void study() {
        System.out.println("I'm studying hard to get good grades!");
    }

    public void showInfo() {
        introduce();
        System.out.println("I'm a student in grade " + grade);
    }
    public static void main(String[] args) {
        LatihanJava3 dp = new LatihanJava3();


        //PROTECTED METHOD YANG DIPANGGIL
        dp.Student("alicia2", 10);
        dp.study();
        dp.showInfo();
    }
}
