import java.util.*;
import java.util.stream.Collectors;

public class Study08 {
    public static int[] 실패율(int N, int[] stages) {
        int[] answer = {};
        int man = stages.length;
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.stream(stages).boxed().collect(Collectors.toList()));
        HashMap<Integer, Double> failList = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            if (N + 1 == i) {

            } else {
                int num = Collections.frequency(arrayList, i);
                if (num == 0) {
                    failList.put(i, 0.0);
                } else {
                    failList.put(i, Double.valueOf(num) / Double.valueOf(man));
                }
                man = man - num;
            }
        }
        ArrayList<Map.Entry<Integer, Double>> entryList = new ArrayList<>(failList.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//        entryList.sort(Map.Entry.comparingByValue());

        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Double> entry : entryList) {
            result.add(entry.getKey());
        }
        answer = result.stream().mapToInt(i -> i).toArray();
        Arrays.toString(answer);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(실패율(5, new int[]{3,3,3,3,3})));
    }
}
