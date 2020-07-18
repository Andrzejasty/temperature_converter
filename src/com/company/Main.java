package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double celsiusDegre;
	Scanner input = new Scanner(System.in);
	System.out.println("Podaj stopnie w C: ");
    celsiusDegre = input.nextDouble();
    System.out.println("Wynik: "+(celsiusDegre*1.8 + 32));
    }

}
