import java.util.ArrayList;
import java.util.Collections;

public class Study15 {

    public String 둘만의_암호(String s, String skip, int index) {
        String answer = "";
        String[] str = s.split("");
        String result = "";
        for (String a : str) {
            for (int i = 0; i < index; i++) {
                int s1 = (int) a.charAt(0) + 1;
                if (s1 == 123) {
                    s1 = 97;
                }
                char ch = (char) s1;
                if (skip.contains(String.valueOf(ch))) {
                    i--;
                }
                a = String.valueOf(ch);
            }
            result += a;
        }
        answer = result;
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
        Study15 study15 = new Study15();
        study15.둘만의_암호("aukks", "wbqd", 5);
    }
}
