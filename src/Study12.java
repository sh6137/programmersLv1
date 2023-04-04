import java.util.*;
import java.util.stream.Collectors;

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

    public int 덧칠하(int n, int m, int[] section) {
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

    public static int 체육복(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        Set<Integer> lostSet = new HashSet<>(Arrays.stream(lost).boxed().collect(Collectors.toSet()));
        Set<Integer> reserveSet = new HashSet<>(Arrays.stream(reserve).boxed().collect(Collectors.toSet()));
        Set<Integer> reserveSet2 = new HashSet<>(Arrays.stream(reserve).boxed().collect(Collectors.toSet()));

        reserveSet2.retainAll(lostSet);

        lostSet.removeAll(reserveSet2);
        reserveSet.removeAll(reserveSet2);

        ArrayList<Integer> lostList = new ArrayList<>(lostSet);
        ArrayList<Integer> reserveList = new ArrayList<>(reserveSet);
        for (int i = 0; i < reserveList.size(); i++) {
            if (lostList.contains(reserveList.get(i) - 1)) {
                lostList.remove(lostList.indexOf((reserveList.get(i) - 1)));
            } else if (lostList.contains(reserveList.get(i) + 1)) {
                lostList.remove(lostList.indexOf((reserveList.get(i) + 1)));
            }
        }
        answer = n - lostList.size();
        return answer;
    }

    public static void main(String[] args) {
        체육복(5, new int[]{2, 4}, new int[]{1, 3, 5});
    }
}
