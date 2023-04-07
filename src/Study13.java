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

    public String 완주하지_못한_선수(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(completion);
        LinkedList<String> participantSet = new LinkedList(Arrays.asList(participant));
        participantSet.sort(Comparator.naturalOrder());
        for (int i = 0; i < completion.length; i++) {
            if (participantSet.get(0).equals(completion[i])) {
                participantSet.remove(0);
            } else if (participantSet.get(1).equals(completion[i])) {
                participantSet.remove(1);
            }
        }
        answer = participantSet.get(0);


        return answer;
    }


    public static void main(String[] args) {
        Study13 s = new Study13();
        s.완주하지_못한_선수(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
    }
}
