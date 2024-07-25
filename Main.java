/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	  
		System.out.println("Ivan Fernando Usaquen Forero");
		System.out.println("Convertir cordenadas polares y rectangulares");
		System.out.println("Ingrese el tipo de conversion que desea realizar:");
		System.out.println("1. Polares a rectangulares");
		System.out.println("2.Rectangulares a polares");
		int opcion = scanner.nextInt());
		
		switch (opcion) {
		    case 1:
		        convertirPolaresaRectangulares(scanner);
		        break;
		    case 2:
		        convertirRectangularesaPolares(scanner);
		        break;
		    default:
		    System.out.println("Opcion invalida");
		}
	}
	
}
