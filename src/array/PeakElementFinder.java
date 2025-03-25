package array;

public class PeakElementFinder {

    public static int findPeakElement(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] >= a[i - 1] && a[i] >= a[i + 1]) {
                return a[i];
            }
        }
        // If no peak element is found
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 15, 5, 25, 2};
        int peakElement = findPeakElement(a);

        if (peakElement != -1) {
            System.out.println("Peak Element: " + peakElement);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
