package PROVA;

import java.util.ArrayList;

public class EX_2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 7, 4, 9, 1, 2, 5, 0, 8};
        int[] array2 = {4, 3, 7, 1, 0, 2, 6, 5, 8, 9};
        ArrayList<Integer> resultat;

        resultat = UtilExamen.obteRepetits(array1, array2);

        System.out.print("Array1: ");
        for (int i : array1) System.out.print(i + " ");
        System.out.println();

        System.out.print("Array2: ");
        for (int i : array2) System.out.print(i + " ");
        System.out.println();

        System.out.print("Repetidos: ");
        UtilExamen.mostraArrayListInt(resultat);
    }
}
