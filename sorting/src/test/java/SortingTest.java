import org.junit.jupiter.api.Assertions;

class SortingTest {

    public static void main(String[] args) {
//        bubbleTest();
//        selectionTest();
//        insertrionTest();
        fastTest();
    }

    private static void fastTest() {
        int[] unsortedArray = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        FastSort fast = new FastSort();

        System.out.println("Start fast test");
        fast.sort(unsortedArray);

        Assertions.assertArrayEquals(expectedArray, unsortedArray);
    }

    private static void insertrionTest() {
        int[] unsortedArray = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Insertion insertion = new Insertion();

        System.out.println("Start insertion test");
        insertion.sort(unsortedArray);

        Assertions.assertArrayEquals(expectedArray, unsortedArray);
    }

    private static void selectionTest() {
        int[] unsortedArray = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Start selection test");
        SelectionSort underTest = new SelectionSort();
        long start = System.currentTimeMillis();

        int[] sortedArray = underTest.sort(unsortedArray);

        Assertions.assertArrayEquals(sortedArray, expectedArray);

        System.out.println(System.currentTimeMillis() - start);
    }

    private static void bubbleTest() {
        int[] unsortedArray = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Start bubble test");
        Bubble underTest = new Bubble();

        long start = System.currentTimeMillis();

        int[] sortedArray = underTest.sort(unsortedArray);

        Assertions.assertArrayEquals(sortedArray, expectedArray);

        System.out.println(System.currentTimeMillis() - start);
    }
}