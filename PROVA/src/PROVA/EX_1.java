package PROVA;

import java.util.ArrayList;

public class EX_1 {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        ArrayList<Integer> arrayL;

        arrayL = UtilExamen.arrayToArrayList(array);

        UtilExamen.mostraArrayListInt(arrayL);
    }
}
