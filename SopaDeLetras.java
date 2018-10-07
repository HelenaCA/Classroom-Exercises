import java.util.Arrays;
import java.util.Random; 

import java.util.Scanner;

//Crear una matriz 10x10, con chars, pedirle al usuario una palabra y mostrar al usuario cu√°ntas veces sale y en qu√© posici√≥n

public class SopaDeLetras {

	public static void main(String[] args) {
	
		// Inicializo mi matriz, y las variables que voy a usar
				char [][] crucigrama = new char [1000][1000];
				Random r = new Random();
				Scanner sc = new Scanner(System.in);
				
		// Relleno la matriz de chars aleatorios		
				for (int row = 0; row < 1000; row++) {
					for(int col = 0; col < 1000; col++) {
						crucigrama[row][col] = (char) (r.nextInt(26) +97);
						System.out.print(crucigrama[row][col] + " ");
					}
					System.out.println(" ");
				}
				
		// Le pido al usuario que introduzca la palabra a buscar		
				System.out.println("Introduzca una palabra");	
				String cadena = sc.nextLine();
			
		//B˙squeda en horizontal		
				for (int row = 0; row < 1000; row ++) {
					String str = new String(crucigrama[row]);
					int pos = str.indexOf(cadena);
					
					while (str.indexOf(cadena)!= -1) {	
						str=str.substring(pos+cadena.length(),str.length());
						System.out.println("La palabra " + cadena + " aparece en la lÌnea " + (row+1) + " en la posiciÛn " + (pos+1));
						pos = str.indexOf(cadena);
						}
					}
				
		//B˙squeda en vertical		
				char [][] copiaVertical = new char[1000][1000];
			
				for (int row = 0; row < 1000; row++) {
					for (int col = 0; col < 1000; col ++) {
						copiaVertical[row][col] = crucigrama[col][row];	
					}
				}
				
				for (int row = 0; row < 1000; row ++) {
					String str2 = new String(copiaVertical[row]);
					int pos = str2.indexOf(cadena);
					
					while (str2.indexOf(cadena)!= -1) {	
						str2=str2.substring(pos+cadena.length(),str2.length());
						System.out.println("La palabra " + cadena + " aparece en la columna " + (row+1) + " en la posiciÛn " + (pos+1));
						pos = str2.indexOf(cadena);
						}
					}
				
		
		
		
		
		}
	
		
		

	}


