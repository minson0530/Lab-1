public class Reduce {
    static void main() {
        System.out.println(count_steps(100));
    }
    private static int count_steps(int n) {
        int curr = n;
        int step = 0;
        while (curr > 0) {
            if (curr % 2 == 0) {
                curr = curr / 2;
            }
            else {
                curr--;
            }
            step++;
        }
        return step;
    }

}