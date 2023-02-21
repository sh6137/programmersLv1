import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Study04 {
    //todo : 비트연산 , 자리수 포함
    public static String[] 비밀지도(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String numResult = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i] | arr2[i])));
            String sarp = numResult.replaceAll("1", "#");
            sarp = sarp.replaceAll("0", " ");
            answer[i] = sarp;
        }
        return answer;
    }

    //
    public String[] 문자열_내_마음대로_정렬하기(String[] strings, int n) {
        String[] answer = {};
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }
        answer = strings;
        return answer;
    }

    public static int[] K번째수(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                arrayList.add(array[j]);
            }
//            ArrayList a = new ArrayList<>(arrayList.stream().sorted().collect(Collectors.toList())) ;
            Collections.sort(arrayList);
            answer[i] = arrayList.get(commands[i][2] - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        K번째수(new int[]{1, 5, 2, 6, 3, 7, 4},new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }
}
