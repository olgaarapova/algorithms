public class Bubble {

    public int[] sort(int[] array) {
        int count = array.length;
        int largestIndex = count - 1;
        int lastSortedElement = Integer.MIN_VALUE;

        while (true) {
            int lower = lastSortedElement;

            for (int i = largestIndex - 1; i >= 0; i--) {
                int rigth = array[i + 1];
                int left = array[i];

                if (rigth < left) {
                    lower = rigth;
                    array[i + 1] = left;
                    array[i] = lower;
                }
            }

            if (lower == lastSortedElement) {
                break;
            }

            lastSortedElement = lower;
        }

        return array;
    }
}
