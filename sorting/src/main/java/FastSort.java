public class FastSort {
    public int[] sort(int[] array) {
        int supportElementIndex = array.length - 1;
        int rightMarkIndex = array.length;
        int leftMarkIndex = 0;

        sortElement(array, supportElementIndex, rightMarkIndex, leftMarkIndex);

        return array;
    }

    private void sortElement(int[] array, int supportElementIndex, int rightMarkIndex, int leftMarkIndex) {
        if (leftMarkIndex == rightMarkIndex) { // one number left in the array
            // found the next sorted number
            return; // todo
        }

        for (int l = leftMarkIndex; l <= supportElementIndex; l++) {
            if (array[l] >= array[supportElementIndex]) { // the left mark moves to the right
                leftMarkIndex = l;

                for (int r = rightMarkIndex; r >= l; r--) { // the right mark moves to the left
                    if (array[r] <= array[supportElementIndex]) {
                        rightMarkIndex = r;

                        int leftMarkStopIndexValue = array[leftMarkIndex];
                        if (rightMarkIndex == leftMarkIndex) {
                            array[leftMarkIndex] = array[supportElementIndex];
                            array[supportElementIndex] = array[leftMarkIndex];
                            supportElementIndex = leftMarkIndex;
                            sortElement(array, supportElementIndex, rightMarkIndex, leftMarkIndex);
                            return;
                        }

                        array[leftMarkIndex] = array[rightMarkIndex];
                        array[rightMarkIndex] = leftMarkStopIndexValue;
                    }
                }
            } else if (l == supportElementIndex) {
                // found the next sorted number
                // todo
                return;
            }
        }
    }
}
