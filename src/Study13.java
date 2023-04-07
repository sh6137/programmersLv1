import java.util.*;
import java.util.stream.Collectors;

public class Study13 {

    public String 숫자_짝꿍(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] XArray = new int[10];
        int[] YArray = new int[10];

        for (String x : X.split("")) {
            XArray[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            YArray[Integer.parseInt(y)]++;
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(XArray[i], YArray[i]); j++) {
                sb.append(i);
            }
        }

        answer = sb.toString();
        if (answer.equals("")) {
            answer = "-1";
        } else if (answer.charAt(0) == 48) {
            answer = "0";
        }
        return answer;
    }

    public static void main(String[] args) {
        Study13 s = new Study13();
        System.out.println(s.숫자_짝꿍("5525", "1255"));
    }
}
