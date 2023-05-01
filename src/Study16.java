import java.util.ArrayList;
import java.util.Collections;

public class Study16 {
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

    }
}
