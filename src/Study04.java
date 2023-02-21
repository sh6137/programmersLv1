import java.util.Arrays;

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

    public static void main(String[] args) {
        비밀지도(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});
    }
}
