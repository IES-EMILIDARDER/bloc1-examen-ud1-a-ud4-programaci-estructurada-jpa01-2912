package PROVA;

import java.util.ArrayList;

public class EX_3 {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4, 2, 5, 0, 8, 6};
        ArrayList<Integer> resultat;

        resultat = UtilExamen.ordenaArray(array);

        System.out.print("Array ordenado: ");
        UtilExamen.mostraArrayListInt(resultat);
    }
}
