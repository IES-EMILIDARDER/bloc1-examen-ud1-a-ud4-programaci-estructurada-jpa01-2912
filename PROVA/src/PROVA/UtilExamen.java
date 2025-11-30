package PROVA;

import java.util.ArrayList;

public class UtilExamen {

    //Ejercicio 1.
        //Ejercicio A)
        public static int[] arrayListToArray(ArrayList<Integer> llista) {
            int[] resultat = new int[llista.size()];
            for (int i = 0; i < llista.size(); i++) {
                resultat[i] = llista.get(i);
            }
            return resultat;
        }

        //Ejercicio B)
        public static ArrayList<Integer> arrayToArrayList(int[] array) {
            ArrayList<Integer> llista = new ArrayList<>();
            for (int valor : array) {
                llista.add(valor);
            }
            return llista;
        }

        //Ejercicio C)
        public static void mostraArrayListInt(ArrayList<Integer> llista) {
            for (Integer valor : llista) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

    //Ejercicio 2.
    public static ArrayList<Integer> obteRepetits(int[] array1, int[] array2) {
        ArrayList<Integer> repetits = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) { // && !repetits.contains(array1[i])) {  // CORRECCIO: varem quedar que 'contains()' no es pot emprar
                    repetits.add(array1[i]);                                          //            a més, no cal en aquest metode
                    break;
                }
            }
        }
        return repetits;
    }

    //Ejercicio 3.
    public static ArrayList<Integer> ordenaArray(int[] array) {
        ArrayList<Integer> llista = arrayToArrayList(array);
        return llista;
    }

    //Ejercicio 4.
    //Sin hacer
}
