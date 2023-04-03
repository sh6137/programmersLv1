import java.util.HashMap;

public class Study12 {
    public static int[] 추억_점수(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hash.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (hash.get(photo[i][j]) != null) {
                    int a = hash.get(photo[i][j]);
                    answer[i] += a;
                }
            }
        }
        return answer;
    }

    public int 덧칠하기(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] > max) {
                answer++;
                max = section[i] + m - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        추억_점수(new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}});
    }
}
