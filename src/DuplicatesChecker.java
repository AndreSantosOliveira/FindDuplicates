import java.util.BitSet;

public class DuplicatesChecker {

    // Bit set array de bits
    void checkDuplicates(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        BitSet bs = new BitSet();

        for (int num : array) {
            int num0 = num - min; // Começar com base do min value
            if (bs.get(num0)) {
                System.out.println(num);
            } else {
                bs.set(num0);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 50, 50, 26, 37, 8, 9, -1, -1, 800000000, 800000000}; // Example array with negative numbers
        DuplicatesChecker duplicatesChecker = new DuplicatesChecker();
        duplicatesChecker.checkDuplicates(array);
    }
}