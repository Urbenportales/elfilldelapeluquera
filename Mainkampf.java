import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Mainkampf {

    public static void main(String[] args) {
        // Paso 1: HashMap para almacenar nombres y edades
        HashMap<String, Integer> personas = new HashMap<>();

        // Paso 2: Agregamos datos al HashMap
        personas.put("Osvaldo José", 25);
        personas.put("Clodobaldo", 30);
        personas.put("Plutarco", 40);

        // Paso 3: ArrayList para almacenar nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Paso 4: Agregamos nombres al ArrayList
        nombres.add("Osvaldo José");
        nombres.add("Clodobaldo");
        nombres.add("Plutarco");

        // Paso 5: Creamos LinkedList para almacenar edades
        LinkedList<Integer> edades = new LinkedList<>();

        // Paso 6: Agregamos las edades al LinkedList
        edades.add(25);
        edades.add(30);
        edades.add(40);

        // Paso 7: Excepciones al leer los datos dle usuario.
        try {
            // Paso 8: Creamos un objeto BufferedReader para leer el input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Paso 9: Solicitamos al usuario que ponga un nombre
            System.out.print("¿Cómo te llamas, hijo de puta?: ");
            String nombre = br.readLine();

            // Paso 10: Verificamos si el nombre existe en el ArrayList
            if (nombres.contains(nombre)) {
                // Paso 11: Obtener la edad correspondiente desde el LinkedList utilizando el índice
                int indice = nombres.indexOf(nombre);
                int edad = edades.get(indice);

                // Paso 12: Mostramos el nombre y la edad y un consejo
                System.out.println("A ver, has dicho: " + nombre + ", vaya puta mierda de nombre tienes, ¿no?");
                System.out.println("Joder, que tiens: " + edad + " años, parece que vas a morir pronto, aprovecha tu vida y " +
                        "no estudies programación.");
            } else {
                // Paso 13: Mostramos un mensaje si el nombre no existe en el ArrayList. Pongo ejemplo.
                System.out.println("Pon un nombre de la lista o te mataremos (ej: Clodobaldo)");
            }
        } catch (IOException e) {
            // Paso 14: Mensaje de erro en caso de excepción
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
