//El programa debía regresar la capital del país que se ingresaba.

package com.generation;

//Se importó Scanner y HashMap
import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
	// Se cambió s por scanner
	//Faltaba escribir System.in para que se pueda leer en consola
	 Scanner scanner = new Scanner(System.in);
	 	// Cambio de ca --> capitales
	   // Se cambio el tipo de dato Byte por un String
	   // Se cambio el tipo de dato Double por un String
	    HashMap<String, String> capitales = new HashMap<>();

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador"); // Faltaba la capital
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	  
	    //Faltaba una r en string
	    String c = "";

	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      c = scanner.nextLine();
	      //Faltaba uns s en equals
	      if (!c.equals("salir")) {
	        if (capitales.containsValue(c)) {
	        	//Faltaba out en la línea 35
	          System.out.print("La capital de " + c);
	          System.out.println(" es " + capitales.put(c, capitales));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String capitales = scanner.nextLine();
	          capitales.put(c, capitales);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	      //Faltaba una h en while
	    } while (!c.equals("salir")); //Faltaba cerrar un paréntesis 
	  }

}
