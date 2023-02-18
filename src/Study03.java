public class Study03 {
    public boolean 문자열_다루기_기본(String s) {
        boolean answer = true;
        String[] str = s.split("");
        if (str.length == 4 || str.length == 6) {
            for (int i = 0; i < str.length; i++) {
                if (!Character.isDigit(str[i].charAt(0))) {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }

    public static long 부족한_금액_계산하기(int price, int money, int count) {
        long answer = -1;
        long priceResult = 0;
        long result = 0;

        for (int i = 1; i <= count; i++) {
            priceResult += price * i;
        }
        if (money >= priceResult) {
            result = 0;
        } else {
            result = Math.abs(money - priceResult);
        }
        answer = result;
        return answer;
    }

    public int[][] 행렬의_덧셈(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public void 직사각형_별찍기(int a, int b) {
        String star = "*";
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

    //최소공배수 = 최대공약수 * (수 1 / 최대공약수) * (수 2/ 최대공약수)
    public int[] 최대공약수와_최소공배수(int n, int m) {
        int[] answer = new int[2];
        int a = 0;
        if (n > m) {
            a = eucd(n, m);
        } else {
            a = eucd(m, n);
        }
        answer[0] = a;
        answer[1] = a * (n / a) * (m / a);
        return answer;
    }

    public int eucd(int big, int small) {
        int result = big % small;
        if (result == 0) {
            return small;
        } else {
            return eucd(small, result);
        }
    }

    public static void main(String[] args) {
        부족한_금액_계산하기(3, 20, 4);
    }
}
