public class Multiples {
    static void main() {
        System.out.println(count_multiples(3,5,1000));
    }
    private static int count_multiples(int x, int y, int k) {
        int count = 0;
        for (int i = 1; i < k; i = i + 1){
            boolean divisibleBy3 = i % x == 0;
            boolean divisibleBy5 = i % y == 0;
            if (divisibleBy3 || divisibleBy5 ) {
                count++;
            }
        }
        return count;
    }

}
