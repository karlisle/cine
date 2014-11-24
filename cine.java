
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

		
		/*
		Con este ciclo que sepide indefinidamente, hasta que se le indique que debe terminar
		nos aseguramos que el programa este funcionando y 	
		*/

		Peliculas pelicula = new Peliculas();				// Instancioamos un objeto de la clase Peliculas, paro poder hacer uso de 
										// sus metodos.

		int opcion ;							// Variable que almacenara la selección del usuario.

		Scanner entrada = new Scanner(System.in);			// Creamou una instacia de Scanner, llamada 'ingreso'
		
		opcion = entrada.nextInt();					// Se lee la selcción del usuario y se guarda en 'opcion'

		/*
		Comenzamos a comparar las opciones,  y de acuerdo al caso se llama a uno u otro metodo de la clase
		Peliculas()
		*/
		if (opcion == 1) 
		{
			System.out.println("Ha seleccionado la opcion: " + opcion);
		}
		else if( opcion == 2)
		{
			System.out.println("Ha seleccionado la opcion: " + opcion);

		}
		


	}
}



class Peliculas
	{
		void menuPeliculas()
		{
			System.out.println("Las mejores peliculas del momento!");
			
			System.out.println("Peliculas de estreno:");
			System.out.println("Seleccione del menú, alguna opción:");

		}
	}
