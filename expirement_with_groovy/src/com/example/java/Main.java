package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal giraffe = new Animal();
        giraffe.x=1;
        giraffe.y=2;
        System.out.println("Hello, world. "+giraffe.x+"+"+giraffe.y+"="+giraffe.sum());
    }
}
