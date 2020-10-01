package ifp.Tema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Cesar3Decodificar {

	public static void main(String[] args) {
		
		char caracter;
		BufferedReader leer;
		BufferedWriter bw;
		File fichero1= new File(args[0]);
		File fichero2= new File(args[1]);
		String linea;
		StringBuilder total = new StringBuilder("");
		String total2;
		
		try {
			leer = new BufferedReader(new FileReader (fichero1));
			bw = new BufferedWriter(new FileWriter(fichero2,true));
			while (leer.read()!=-1) {
				//linea=leer.readLine();
				caracter=(char) leer.read();
				caracter=decodificar(caracter);
				total.append(caracter);
				//System.out.println(linea);
				
					bw = new BufferedWriter(new FileWriter(fichero2,true));
					//bw.write(linea+"\n");
					
			}
			
			total2=total.toString();
			bw.write(total2);
			bw.close();
			leer.close();
		} catch (Exception e) {
			System.out.println("Se ha producido un error en "+e);
		}
		


	}
	
	public static char decodificar (char caracter) {
		int ascii;
		
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
		return caracter;
	}

}
