import java.util.ArrayList;
import java.util.Collections;

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

    public static void main(String[] args) {
        Study16 study16 = new Study16();
        study16.대충_만든_자판(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"});
    }
}
