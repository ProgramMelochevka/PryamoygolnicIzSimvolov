package by.home.maxzzzit;

import java.util.Scanner;

public class PryamoygolnicIzSimvolov {

	// Напишите класс, который выводит на экран прямоугольник из символов #. При этом размеры прямоугольника, то есть количество строк
	// и количество знаков в каждой строке указывает введением с клавиатуры двух чисел: первое - количество строк, 
	// второе - количество знаков в каждой строке!
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int strok=0, znakov=0;
		System.out.println("Введите количество строк в прямоугольнике: ");
		strok = scn.nextInt();
		System.out.println("Введите количество знаков в строке: ");
		znakov = scn.nextInt();
		for (int i=1; i<=strok; i++) {
			for (int j=1; j<=znakov; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
