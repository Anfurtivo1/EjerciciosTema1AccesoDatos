package ifp.Tema1;

import java.io.File;
import java.util.Scanner;

public class LeerDirectorios {

	public static void main(String[] args) {
		String nombreD;
		File directorio;
		String[] arrayFicheros;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("\tIndica el nombre del directorio");
		nombreD = leer.nextLine();
		directorio = new File(nombreD);
		if (!directorio.exists() && !directorio.isDirectory()) {
			System.out.println("\tEse directorio no se ha encontrado o no es un directorio");
			
		}
		if (directorio.exists() && directorio.isDirectory()) {
			System.out.println("\tLos ficheros en el directorio "+nombreD+" son:");
			arrayFicheros=directorio.list();
			for (int i = 0; i < arrayFicheros.length; i++) {
				System.out.println("\t"+arrayFicheros[i]+"");
			}
		}
		

	}

}
