import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public int[] 로또의_최고_순위와_최저_순위(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> lottosList = new ArrayList<>(Arrays.stream(lottos).boxed().collect(Collectors.toList()));
        List<Integer> winNumList = new ArrayList<>(Arrays.stream(win_nums).boxed().collect(Collectors.toList()));
        int min = 0;
        int max = 0;
        for (int i = 0; i < winNumList.size(); i++) {
            if (winNumList.contains(lottosList.get(i))) {
                min++;
            }
        }
        max = min;
        for (int i = 0; i < lottosList.size(); i++) {
            if (lottosList.get(i).equals(0)) {
                max++;
            }
        }

        answer[0] = rank(max);
        answer[1] = rank(min);
        return answer;
    }

    private static int rank(int max) {
        if (max == 6) {
            max = 1;
        } else if (max == 5) {
            max = 2;
        } else if (max == 4) {
            max = 3;
        } else if (max == 3) {
            max = 4;
        } else if (max == 2) {
            max = 5;
        } else {
            max = 6;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(다트게임("1S2D*3T"));
    }
}
