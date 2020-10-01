package ifp.Tema1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopiaPegaDeFicheros {

	public static void main(String[] args) {
		BufferedReader leer;
		BufferedWriter bw;
		File fichero1= new File(args[0]);
		File fichero2= new File(args[1]);
		String linea;
		char caracter;
		boolean salir=true;
		
		if (!fichero1.exists()) {
			try {
				fichero1.createNewFile();
			}catch(Exception e) {
				System.out.println("Se ha producido un error en "+e);
			}
		}
		if (fichero1.exists()) {
			// && fichero2.exists()
			try {
				leer = new BufferedReader(new FileReader (fichero1));
				bw = new BufferedWriter(new FileWriter(fichero2,true));
				while (leer.read()!=-1) {
					linea=leer.readLine();
					caracter=(char) leer.read();
					//System.out.println(linea);
					bw = new BufferedWriter(new FileWriter(fichero2,true));
					bw.write(linea+"\n");
					//bw.write(caracter);
						
				}
				bw.close();
				leer.close();
			} catch (Exception e) {
				System.out.println("Se ha producido un error en "+e);
			}
			
		}


		
	}

}
