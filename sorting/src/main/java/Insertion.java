public class Insertion {

    public int[] sort(int[] array) {
        for (int k = 1; k < array.length; k++) { // цикл для добавления инсершна, k - идекс элемента, который нужно отсортировать
            int currentValue = array[k];
            int newPlaceForKValueInSortedPart = findNewPlaceForK(array, k);
            insertK(array, k, newPlaceForKValueInSortedPart);
        }
        return array;
    }

    private void insertK(int[] array, int k, int newPlaceForKValueInSortedPart) {
        if (k == newPlaceForKValueInSortedPart) {
            return;
        }
        if (newPlaceForKValueInSortedPart == Integer.MAX_VALUE) {
            return;
        } else if (newPlaceForKValueInSortedPart == Integer.MIN_VALUE) {
            int startValue = array[k];

            for (int i = k; i >= 0; i--) {
                insertInStartOfLeftPart(array, k, i, startValue);
            }
        } else {
            int startValue = array[k];

            for (int i = k; i > newPlaceForKValueInSortedPart; i--) {
                if (i == newPlaceForKValueInSortedPart + 1) {
                    array[newPlaceForKValueInSortedPart + 1] = startValue;
                } else {
                    array[i] = array[i - 1];
                }
            }
        }
    }

    private void insertInStartOfLeftPart(int[] array, int k, int i, int startValue) {
        if (i == 0) {
            array[i] = startValue;
        }

        if (i > 0) {
            array[i] = array[i - 1];
        }
    }

    private int findNewPlaceForK(int[] array, int k) {
        int firstValueLessThanCurrentInSortedArrayPart = Integer.MAX_VALUE;
        for (int i = k - 1; i >= 0; i--) { // обратный цикл для правой стороны массива алгоритма, ищем чисто меньшее, чем array[k], - слева
            if (array[i] > array[k]) {
                if (i == 0) {
                    return Integer.MIN_VALUE;
                } else if (array[i + 1] < array[k]) {
                    return i;
                }
                continue;
            } else if (array[i] < array[k]) {
                if (i == k - 1) {
                    return Integer.MAX_VALUE;
                }
                return i;
            }
        }
        return firstValueLessThanCurrentInSortedArrayPart;
    }

}
