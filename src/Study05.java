public class Study05 {
    public static int 콜라_문제(int a, int b, int n) {
        int answer = 0;
        while (true) {
            int remain = 0;
            if (n % a != 0) {
                remain = n % a;
            }
            if (remain != 0) {
                n = n - remain;
            }
            answer += (n / a) * b;
            n = (n / a) * b;;
            n = n + remain;
            if (n < a) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(콜라_문제(3, 1, 20));
    }
}
