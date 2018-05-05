package com.hackom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner leer = new Scanner(System.in);
        double monto = 0;

        System.out.println("Ingrese el monto a pagar...");
        monto = leer.nextDouble();

        if (monto>2500) {
            System.out.println("Tendras un descuento del 15% y pagaras " + (monto * 0.85));
        } else {
            System.out.println("Tendras un descuento del 8% y pagaras " + (monto * 0.92));
        }
    }
}
