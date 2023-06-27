import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejerciciostrings {

    public static void main(String[] args) {


        // 1 | ARRAY DE STRINGS
        // 1.1: Creamos array de Strings:
        String[] arrayStrings = {"Sombrilla", "Toalla", "Cubo", "Pala"};


        // 1.2: Recorremos el array de Strings, mostrando sus valores:
        for (String playa : arrayStrings) {
            System.out.println("A la playa debes llevar: " + playa);
        }

        // 2 ARRAY BIDIMENSIONAL (O MULTIDIMENSIONAL)
        // 2.1: Declaramos el array bidimensional de enteros:
        int[][] arrayBidiUno = new int[2][4];

        // 2.2: Asignamos los valores:
        arrayBidiUno[0][0] = 1;
        arrayBidiUno[0][1] = 2;
        arrayBidiUno[0][2] = 3;
        arrayBidiUno[0][3] = 4;

        arrayBidiUno[1][0] = 10;
        arrayBidiUno[1][1] = 20;
        arrayBidiUno[1][2] = 30;
        arrayBidiUno[1][3] = 40;

        // 2.3: Recorremos el array:
        for (int i = 0; i < arrayBidiUno.length; i++) {
            for (int j = 0; j < arrayBidiUno[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiUno[i][j]);
            }
        }


        // 4 VECTORES
        // 4.1: Creamos el vector:
        Vector<Integer> vector = new Vector<>();

        // 4.3: Aañadimos elementos al vector:
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Contenido del vector: " + vector);

        // 4.4: Eliminamos un elemento del vector:
        vector.remove(2);
        vector.remove(3);
        System.out.println("Contenido del vector: " + vector);

        /** 4.5: La capacidad se duplicaría automáticamente si no la especificamos
         * previamente (capacityIncrement) lo cual supondría desperdiciar la memoria del ordenador.
         */

        //5 | LINKEDLIST
        //5.1: Creamos ArrayList tipo String de 4 elementos:
        ArrayList<String> lista = new ArrayList<>();

        // 5.2: Añadimos los 4 elementos
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        System.out.println("Contenido de la lista: " + lista);

        // 5.3: Recorremos la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Hola, soy el número " + i + " de la lista: " + lista.get(i));
        }

        // 5.4: Copiamos la lista en una LinkedList
        LinkedList<String> listaEnlazadaDos = new LinkedList<>(lista);

        // 5.5: Recorremos la lista
        for (String elemento : listaEnlazadaDos) {
            System.out.println("Elemento actual en la lista que hemos enlazado en el paso 5.4: " + elemento);
        }

        // 6 | ARRAYLIST TIPO INT
        // 6.1: Crear ArrayList tipo Int
        ArrayList<Integer> numeros = new ArrayList<>();

        // 6.2: Rellenamos el ArrayList con valores del 1 al 10
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // 6.3: Quitamos los números pares utilizando otro bucle
        ArrayList<Integer> impares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        // 6.4: Mostramos el ArrayList final con los números impares
        for (int numero : impares) {
            System.out.println(numero);
        }

        // 7 | THROWS
        // 7.1: Creamos La función Divide por Cero
        try {
            DividePorCero();
            System.out.println("Demo de código");
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
            System.out.println("Demo de código");
        }

        // 8 | INPUSTREAM Y PRINTSTREAM
        String fileIn = "input.txt";
        String fileOut = "output.txt";
        copiaArchivo(fileIn, fileOut);
    }

    public static void DividePorCero() throws ArithmeticException {
        throw new ArithmeticException();
    }

    public static void copiaArchivo(String fileIn, String fileOut) {
        try {
            FileInputStream fis = new FileInputStream(fileIn);
            FileOutputStream fos = new FileOutputStream(fileOut);
            int byteData;

            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            fos.close();
            fis.close();

            System.out.println("Se copió el archivo y nadie murió en el intento");
        } catch (IOException e) {
            System.out.println("Ops, esto falló y vamos a morir todos: " + e.getMessage());
        }
    }
}
