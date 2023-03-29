import java.util.Arrays;

public class Study10 {
    public static int 다트게임(String dartResult) {
        int answer = 0;
        String[] str = dartResult.split("");
        String[] numberStr = new String[]{"", "", ""};
        int[] numberInt = new int[3];
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (Character.isDigit(str[i].charAt(0))) {
                numberStr[count] += str[i];
            } else {
                if (str[i].equals("S")) {
                    numberInt[count] = Integer.parseInt(numberStr[count]);
                    count++;
                } else if (str[i].equals("D")) {
                    numberInt[count] = Integer.parseInt(numberStr[count]) * Integer.parseInt(numberStr[count]);
                    count++;
                } else if (str[i].equals("T")) {
                    numberInt[count] = Integer.parseInt(numberStr[count]) * Integer.parseInt(numberStr[count]) * Integer.parseInt(numberStr[count]);
                    count++;
                } else if (str[i].equals("#")) {
                    numberInt[count - 1] = numberInt[count - 1] * -1;
                } else if (str[i].equals("*")) {
                    if (count - 2 == -1) {
                        numberInt[count - 1] = numberInt[count - 1] * 2;
                    } else {
                        numberInt[count - 1] = numberInt[count - 1] * 2;
                        numberInt[count - 2] = numberInt[count - 2] * 2;
                    }
                }
            }
        }
        answer = Arrays.stream(numberInt).sum();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(다트게임("1S2D*3T"));
    }
}
