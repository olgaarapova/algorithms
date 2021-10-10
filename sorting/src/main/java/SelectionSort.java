import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] array) {
        int length = array.length;

        for (int k = 0; k < length; k++) {
            int min = array[k];
            int minIndex = k;

            for (int i = k; i < length; i++) {
                int comparingElement = array[i];
                if (comparingElement < min) {
                    min = comparingElement;
                    minIndex = i;
                }
            }

            array[minIndex] = array[k];
            array[k] = min;
        }
        System.out.println(String.valueOf(array));

        return array;
    }
}
