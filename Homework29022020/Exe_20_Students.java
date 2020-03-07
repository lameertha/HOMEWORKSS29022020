package Homework29022020;

public class Exe_20_Students {
    int id;
    String name;
    int age;
    //creating two argument constructor
    Exe_20_Students(int i, String n) {
        id = i;
        name = n;
    }
    //creating three arguments constructor
    Exe_20_Students(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    public void display() {
        System.out.println(id + "" + name + "" + age);
    }
    public static void main(String[] args) {
        Exe_20_Students s1 = new Exe_20_Students(111, "Karan");
        Exe_20_Students s2 = new Exe_20_Students(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
