package com.chipfody;

public class Playground {

    static int x = 11;
    private int y = 33;

    public void method1(int x)
    {
        Playground t = new Playground();
        this.x = 22;
        y = 44;

        System.out.println("x: " + x);
        System.out.println("Test.x: " + Playground.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[])
    {
        Playground t = new Playground();
        t.method1(5);
    }

}

