package com.TechQuieroTareaString.org;
import java.util.Scanner;
import java.util.ArrayList;

public class Nombre {

	public Nombre() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int numberofLetters;
		System.out.println("Ingrese el numero de Palabras que conforman su nombre: ");
		numberofLetters = sc.nextInt();
		String names;
		ArrayList<String> ArraydeNombre = new ArrayList<String>();
		
		for (int i=0; i<numberofLetters; i++) {
			System.out.println("Ingrese cada una de las Palabras de su nombre: ");
			names = sc.next();
			ArraydeNombre.add(names);
			}
		System.out.println("Su nombre es"+ ArraydeNombre);
		
	}

}
