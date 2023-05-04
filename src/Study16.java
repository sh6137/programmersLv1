import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Study16 {
    public int[] 대충_만든_자판(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int count = 0;
        for (String str : targets) {
            for (int i = 0; i < str.length(); i++) {
                String al = String.valueOf(str.charAt(i));
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int j = 0; j < keymap.length; j++) {
                    if (keymap[j].indexOf(al) != -1) {
                        arrayList.add(keymap[j].indexOf(al));
                    }
                }
                if (arrayList.size() == 0) {
                    answer[count] = -1;
                    break;
                } else {
                    int a = Collections.min(arrayList) + 1;
                    answer[count] = answer[count] + a;
                }
            }
            count++;
        }
        return answer;
    }

    public int 문자열_나누기(String s) {
        int answer = 0;
        char x = 0;
        int xNum = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                x = s.charAt(i);
                xNum++;
            } else {
                if (x == s.charAt(i)) {
                    xNum++;
                } else {
                    num++;
                }
                if (xNum == num) {
                    s = s.substring(i + 1);
                    i = -1;
                    answer++;
                }
            }
        }

        if (s.length() >= 1) {
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Study16 study16 = new Study16();
//        study16.대충_만든_자판(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"});
        study16.문자열_나누기("abracadabra");
    }
}
