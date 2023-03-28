import java.util.*;
import java.util.stream.Collectors;

public class Study09 {
    public static int 과일_장수(int k, int m, int[] score) {
        int answer = 0;
        Integer[] scoreInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreInteger, Collections.reverseOrder());
        // 분할
        ArrayList<Integer[]> splitList = new ArrayList<>();
        for (int i = 0; i < scoreInteger.length; i += m) {
            Integer[] sliceArray = Arrays.copyOfRange(scoreInteger, i, Math.min(i + m, scoreInteger.length));
            splitList.add(sliceArray);
        }
        //분할 끝
        for (int i = 0; i < splitList.size(); i++) {
            if (splitList.get(i).length == m) {
                int min = Arrays.stream(splitList.get(i)).mapToInt(f -> f).min().getAsInt();
                answer = answer + (min * m * 1);
            }
//            System.out.println(Arrays.asList(splitList.get(i)));
        }
//        System.out.println(answer);
        return answer;
    }

    public int[] 명예의_전당1(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arrayList = new ArrayList();
        for (int i = 0; i < score.length; i++) {
            arrayList.add(score[i]);
            arrayList = arrayList.stream().sorted().collect(Collectors.toList());
            if (arrayList.size() > k) {
                arrayList.remove(0);
                answer[i] = arrayList.get(0);
            }else {
                answer[i] = arrayList.get(0);
            }
        }
        return answer;
    }

    public int 다트_게임(String dartResult) {
        int answer = 0;
        String[] a = dartResult.split("");
        for (int i = 0; i < a.length; i++) {

        }
        return answer;
    }
    public static void main(String[] args) {
        과일_장수(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
    }
}
