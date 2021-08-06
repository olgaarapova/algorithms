import org.junit.jupiter.api.Assertions;

class BubbleTest {

    public static void main(String[] args) {
        Bubble underTest = new Bubble();
        int[] unsortedArray = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        long start = System.currentTimeMillis();

        int[] sortedArray = underTest.sort(unsortedArray);

        Assertions.assertArrayEquals(sortedArray, expectedArray);

        System.out.println(System.currentTimeMillis() - start);
    }
}