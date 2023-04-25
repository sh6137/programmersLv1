import java.util.*;
import java.util.stream.Collectors;

public class Study14 {

    public int 옹알이2(String[] babbling) {
        int answer = babbling.length;
        String[] exStr = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < exStr.length; j++) {
                babbling[i] = babbling[i].replace(exStr[j], String.valueOf(j));
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < babbling[i].length(); j++) {
                if (Character.isAlphabetic(babbling[i].charAt(j))) {
                    answer--;
                    break;
                } else if (j == babbling[i].length() - 1) {

                } else if (babbling[i].charAt(j) == babbling[i].charAt(j + 1)) {
                    answer--;
                    break;
                }
            }

        }
        return answer;
    }

    public String 카카오_인턴_키패드_누르기(int[] numbers, String hand) {
        String answer = "";
        int right = 0;
        int left = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                left = numbers[i];
                answer += "L";
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                right = numbers[i];
                answer += "R";
            } else {
                int[] center = new int[]{2, 5, 8, 0};
                ArrayList<Integer> arrayList = new ArrayList<>(Arrays.stream(center).boxed().collect(Collectors.toList()));
                if (arrayList.indexOf(left) != -1) {

                } else if (arrayList.indexOf(right) != -1) {

                }
                int locationR = Math.abs(numbers[i] - right);
                int locationL = Math.abs(numbers[i] - left);
                if (locationL < locationR) {
                    left = numbers[i];
                    answer += "L";
                } else if (locationR < locationL) {
                    right = numbers[i];
                    answer += "R";
                }
            }
        }

        return answer;
    }

    public int[] 대충_만든_자판(String[] keymap, String[] targets) {
        int[] answer = {};
        for (String str : targets) {
            for (int i = 0; i < str.length(); i++) {
                String al = String.valueOf(str.charAt(i));
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (String key : keymap) {
                    arrayList.add(key.indexOf(al));
                }
                int a = Collections.min(arrayList);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Study14 study14 = new Study14();
        study14.옹알이2(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
    }
}
