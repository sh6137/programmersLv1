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
        }else{
            answer = false;
        }
        return answer;
    }
    public static long 부족한_금액_계산하기(int price, int money, int count) {
        long answer = -1;
        long priceResult = 0;
        long result = 0;

        for (int i = 1; i <= count; i++) {
            priceResult += price*i;

        }
        if (money >= priceResult) {
            result = 0;
        }else{
            result = Math.abs(money - priceResult);
        }
        answer = result;
        return answer;
    }

    public static void main(String[] args) {
        부족한_금액_계산하기(3,20,4);
    }
}
