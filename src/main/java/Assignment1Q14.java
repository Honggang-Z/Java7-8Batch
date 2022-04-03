import java.util.Arrays;
import java.util.Collections;

public class Assignment1Q14 {
    public static void main(String[] args) {
        return;
    }
    public static int[] merge(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int[] res = new int[a.length + b.length];
        int ap = 0, bp = 0, resp = 0;
        while (ap < a.length && bp < b.length) {
            if (a[ap] < b[bp]) {
                res[resp++] = a[ap++];
            } else {
                res[resp++] = b[bp++];
            }
        }
        if (ap < a.length) {
            while (ap < a.length) {
                res[resp++] = a[ap++];
            }
        }
        if (bp < b.length) {
            while (bp < b.length) {
                res[resp++] = b[bp++];
            }
        }
        return res;
    }
}
