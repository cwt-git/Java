public class Binarysearch01 {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 4, 5, 9, 12 };
        int tar = 12; // Target value to search for
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (tar > arr[mid]) {
                st = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            } else {
                System.out.println("Target found at index: " + mid);
                break; // Exit the loop once the target is found
            }
        }

        // Check if the target was not found
        if (st > end) {
            System.out.println("Target not found in the array.");
        }
    }
}
