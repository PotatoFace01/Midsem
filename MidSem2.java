
package midsem;
import java.util.Random;

public class MidSemAns {
    public static void main(String[] args) {
        int[] array = { 9, 7, 1, 0, 5, 3, 4, 2, 8, 1 };
           removeElmts(array);
    }
    static void removeElmts(int[] array) {
        Random r = new Random();
        while (array.length > 0) {
        int index = r.nextInt(array.length);
        System.out.println("index = " + index + ", element = " + array[index]);
        int[] array2 = new int[array.length - 1];
        for (int i = 0; i < index; i++)
        array2[i] = array[i];
        for (int i = index; i < array.length - 1; i++)
        array2[i] = array[i + 1];
        array = array2;
}
}
}
