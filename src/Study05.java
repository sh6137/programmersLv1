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
            n = (n / a) * b;
            n = n + remain;
            if (n < a) {
                break;
            }
        }
        return answer;
    }

    public String 푸드_파이트_대회(int[] food) {
        String answer = "";
        for (int i = 1; i < food.length; i++) {
            if (food[i] == 1) {
                food[i] = 0;
            } else {
                if (food[i] % 2 != 0) {
                    food[i] = food[i] - 1;
                }
            }
        }
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                answer += String.valueOf(i);
            }
        }
        StringBuilder str = new StringBuilder(answer);
        answer = answer + "0" + str.reverse();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(콜라_문제(3, 1, 20));
    }
}
