import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Euclid(1111111, 1234567);
    }

    // 1.1.20
    public static double ln(int N) {
        if (N == 1) return 1;
        return Math.log(N) + ln(N - 1);
    }

    // 1.1.22
    /*
        initial: low: 0   high: a.length - 1 depth: 0
     */
    public static int BinarySearch_Recursive(int key, Integer[] a, int low, int high, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println("low: " + low + " high: " + high);
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (key < a[mid]) return BinarySearch_Recursive(key, a, low, mid - 1, depth + 1);
        else if (key > a[mid]) return BinarySearch_Recursive(key, a, mid + 1, high, depth + 1);
        else{
            System.out.println("the index of the target is " + mid);
            return mid;
        }
    }

    // 1.1.24
    public static int Euclid(int p, int q) {
        System.out.println("p: " + p + " q: " + q);
        if (q == 0) return p;
        int r = p % q;
        return Euclid(q, r);
    }


}


