public class Study05 {
    public static int 콜라_문제(int a, int b, int n) {
        //a =( 받을수 있는 )빈병의 기준,  b = 빈병에 대한 마트가 주는 콜라수,
        //n = 가지고 있는 빈경의 개수
        // 빈병 2병 에 콜라 1개
        int answer = 0;
        while (true) {
            int remain = 0;
            // 4. n 을 a 로 나누어 떨어지게 하기 위해
            if (n % a != 0) {
                remain = n % a;
            }
            if (remain != 0) {
                n = n - remain;
            }
            //4. 끝
            // 1.결과 = 빈병수 / 빈병기준 * 빈병에 대한 마트가 주는 콜라
            answer += (n / a) * b;
            n = (n / a) * b;
            // 2.빈병을 줬을때 남는 콜라병 개수
            n = n + remain;
            // 3.가지고있는 빈병수가 기준에 맞는지 확인
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
