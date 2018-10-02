import java.util.Scanner;

//Buscar substring 

public class ContarSubstrings {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String cadena = scn.nextLine().toLowerCase();
		System.out.println("Introduzca una subcadena");
		String cadena2 = scn.nextLine().toLowerCase();
		int contador = 0;
		int resultado = 0;
		
		while (contador < cadena.length()-cadena2.length()+1) {
			if (cadena.substring(contador, contador+cadena2.length()).equals(cadena2)) {
				resultado++;
			}
			contador++;
		}
		
		System.out.println("La subcadena " + cadena2 + " aparece " + resultado + " veces.");
		

	}

}

