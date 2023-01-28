public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    /**
     * Binary Search
     * @param key the target to search
     * @param a the array to search
     * @return the index of the target
     */
    public static int BinarySearch(int key, Integer[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < a[mid]) high = mid - 1;
            else if (key > a[mid]) low = mid + 1;
            else return mid;
        }
        return -1;
    }
}