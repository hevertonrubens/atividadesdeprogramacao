package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a base ");
        base = sc.nextDouble();
        System.out.println ("Informe a altura ");
        altura = sc.nextDouble();
        area =(base*altura)/2;
        System.out.println("A area do triangulo é " + area);
    }
	// write your code here

}
