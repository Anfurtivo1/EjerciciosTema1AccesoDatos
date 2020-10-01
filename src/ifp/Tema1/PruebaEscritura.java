package ifp.Tema1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class PruebaEscritura {

	public static void main(String[] args) {
		int ascii;
		char caracter='D';
		System.out.println(caracter);
		ascii = (int) caracter;
		System.out.println(ascii);
		
		if (ascii >=88 && ascii <=90) {
			ascii=ascii+23;
		}

		
		if (ascii >=65 && ascii <=87) {
			ascii = ascii-3;
		}
		
		caracter = (char) ascii;
		System.out.println(ascii);
		System.out.println(caracter);
	}

}
