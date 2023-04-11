import java.util.Collection;
import java.util.HashMap;

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
                } else if (j == babbling[i].length()-1) {

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

        return answer;
    }


    public static void main(String[] args) {
        Study14 study14 = new Study14();
        study14.옹알이2(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
    }
}
