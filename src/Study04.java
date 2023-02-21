public class Study04 {
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

    public static void main(String[] args) {
        비밀지도(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});
    }
}
