package Homework29022020;

public abstract class Exe_16_Shape {

    public abstract void draw();
}
class Rectangle extends Exe_16_Shape {
    public void draw() {//instance method
        System.out.println("Drawing rectangle");
    }
}
class Circle1 extends Exe_16_Shape {//extends parent class to child class

    public void draw() {//instance method
        System.out.println("Circle");
    }
}
class TestAbstraction1 {//class
    public static void main(String[] args) {
        Exe_16_Shape e = new Circle1();
        e.draw();
    }
}
