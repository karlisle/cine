
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
import java.io.*;
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
	
		/*
		Con este ciclo que sepide indefinidamente, hasta que se le indique que debe terminar
		nos aseguramos que el programa este funcionando y 	
		*/

		Peliculas pelicula = new Peliculas();				// Instancioamos un objeto de la clase Peliculas, paro poder hacer uso de 

		pelicula.menuSeleccion();					// Por medio del objeto 'pelicula', llamamos al metodo menúSeleccion de la 
										// clase Peliculas


	}
}



class Peliculas
	{
		void menuSeleccion()
		{

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
				carteleraEstrenos();							// Llamos al metodo cartelraEstrenos
			}

			else if( opcion == 2)
			{
				System.out.println("Ha seleccionado la opcion: " + opcion);
				carteleraGeneral();							// Llamamos al metodo carteleraGeneral


			}

		}

		/* 
		Metodo con el cual se manejara los elementos de las peliculas de estreno
		*/

		void carteleraEstrenos()
		{

			//String estrenos[][] = new String[10][2];					// Arreglo en el que pondemos las 

			

			System.out.println("Las mejores peliculas del momento!");
			
			System.out.println("Peliculas de estreno:");
			System.out.println("Seleccione del menú, alguna opción:");


			String estrenos = leer("estrenos.txt");
			System.out.println(estrenos);



			limpiarPantalla();
			menuSeleccion();								// Invocamos de nuevo al metodo menuGeneral
		}

		/* 
		Metodo con el cual se manejara los elementos de las peliculas que esten en cartelera,
		no solo las de estreno.
		*/

		void carteleraGeneral()
		{
			System.out.println("\t Cartelera general!");
			System.out.println("\t Seleccione del menú, alguna pelicula");

			limpiarPantalla();
			menuSeleccion();								// Invocamos de nuevo al metodo menuGeneral
		}

		/*
		Método que nos proporciona el manejo de laspolomitas y sus diferentes opciones
		*/
		void palomitas()
		{
			System.out.println("Ahora esta en la seccion de palomitas \n elija su paquete!");
		}

		/*
		Método p que permite controlar la venta de dulces.
		*/

		void dulces()
		{
			System.out.println("Los dulces hacen del cine algo mas dulce!");

		}

		/* 
		Este metodo ermite leer un archivo, es generico (plomorfico), por lo cual lo usaremos para leer cualquier tipo de archivo 
		que nececitemos.
		La idea es tener en un archivo externo, las peliculas y su precio, los consumibles y sus precios, para que de esta forma solo se llame 
		a cada archivo segun se requiera.
		*/

		public String leer(String nombre)
		{
			/*
			Por medio de la siguiente estructura manejamos el archovo en cuestion, son el 'try' tratamos de leer el archivo
			y en caso de fallar, erroja un mensaje de error.
			*/
			try
			{
				File f;
				FileReader lectorArchivo;;

				f = new File(nombre);					   		// Creamos el archivo que se ha de leer

				lectorArchivo = new FileReader(f);					// Creamos un objeto FIleReader que abrira el flujo des stream de 
													// datos para realizar la lectura

				BufferedReader br = new BufferedReader(lectorArchivo);		// Creamos un bufer, para recopilar los datos que erroje lectorArchivo
				
				String l = " ";								// Es esta variable guardaremos todo lo que tenga el archivo

				String aux = " ";

				/*
				Con este ciclo, repetimos la lectura, pues cada archivo se lee una linea
				a la vez
				*/
				while (true) 
				{
					aux = br.readLine();
					if (aux != null)
					{
						l = l + aux + "\n";					// Si la variable aux tiene datos, se almacenan en la va rable l, caso contrario es que ya se ha leido todo.
					}
					else
					{
						break;							// Si aux es nula o no contiene nada, simpemente terminamos el ciclo while
					}
				}

				br.close();								// Cerramos el bufer donde se recopilaban los datos
				lectorArchivo.close();							//  Cerramos el archivo.
				return l;								// Regresamos el contenido de la variable 'l', a donde sea que sehaya invocado.
			}
			catch(IOException e)
			{
				System.out.println("Error: " + e.getMessage());
			}
			return null;


		}


		

		/*
		Con este metodo limpiamos la pantalla cada que se llama al metodo
		menuGeneral, o cualquier otro.
		Por cuestiones esteticas es recomendable.
		*/
		void limpiarPantalla()
		{
			for (int i = 0; i <=5; i++ ) 
			{
				System.out.println("\n");
			}
		}
	}
