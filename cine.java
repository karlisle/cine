
/*
EL siguiemte programa es un sistema mcon el cual se  pretende
llevar el contro de una taquilla de cisne, en el que se le permita se 
cumplan los siguientes puntos:

1ª  Cartelera, donde se cotemplen:
	A) Estrenos.
	B) Anteriores
2º Costo de cada una de las peliculas.
3º Botanas, donde:
	A) Dulces
	B) Refreso
	C) Palomtas
	Cada producto mostrara su precio.
4º Cada una de las selecciones que se hagan se carguen en un solo recivo.



*/

import java.util.*;						// Importamos la libreria util del core de java

/* 
Clase principal, dentro de ella crearemos las clases y metodos necesarios para 
cumplir con las especificaciones.
*/
public class cine 						
{

	public static void main(String[] args) 
	{
		System.out.println("\t###################################");
		System.out.println("\t#    Bienvenido a Cines Premiere #");
		System.out.println("\t###################################");
		System.out.println("\t# Cargando, por favor espere!!   #");
		System.out.println("\t###################################");
		System.out.println("\t###################################");
		System.out.println("\t###################################");
		System.out.println("\t# Seleccione una opción del menú:#");
	


		// Creamos un menú, donde se listen las opciones disponibles :)!
		System.out.println(" ____________________________________________________________________");
		System.out.println("|------------------------------  Menú --------------------------------|");
		System.out.println("|-- -1-  Ver Estrenos ------------------------------------------------|");
		System.out.println("|-- -2-  Ver Cartelara general----------------------------------------|");
		System.out.println("|-- -3-  Comprar botanas ---------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|---------------------------------------------------------------------|");
		System.out.println("|-- -S/s- Para salir    ----------------------------------------------|");
		System.out.println(" ____________________________________________________________________");

		String opcion = "";							// Variable que almacenara la selección del usuario.

		Scanner ingreso = new Scanner(System.in);			// Creamou una instacia de Scanner, llamada 'ingreso'
		
		/*
		Con este ciclo que sepide indefinidamente, hasta que se le indique que debe terminar
		nos aseguramos que el programa este funcionando y 	
		*/
		while (opcion != "S" || opcion != "s") 
		{
			if (opcion == "s" || opcion == "e") 
			{
				break;				
			}
			
		}


	}
}



class Peliculas
	{
		void menuPeliculas()
		{
			System.out.println("Las mejores peliculas del momento!");
			
			System.out.println("Peliculas de estreno:")

		}
	}
