import java.util.ArrayList;
import java.util.Arrays;

public class Study02 {
    public int[] 제일_작은_수_제거하기(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList();
        int a = Arrays.stream(arr).min().getAsInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a) {
                arrayList.add(arr[i]);
            }
        }
        answer = arrayList.stream().mapToInt(f -> f).toArray();
        if (answer.length == 0) {
            answer = new int[]{-1};
        }
        return answer;
    }

    public int 음양_더하기(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]) {
                absolutes[i] = absolutes[i] * -1;
            }
            answer += absolutes[i];
        }
        return answer;
    }

    public static int 없는_숫자_더하기(int[] numbers) {
        int answer = 0;
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            if(!Arrays.stream(numbers).anyMatch(f -> f == finalI)){
                answer += finalI;
            }
        }
        return answer;
    }

    public String 가운데_글자_가져오기(String s) {
        String answer = "";
        char[] a =  s.toCharArray();
        int b = a.length;
        if (b % 2 == 0) {
            char bb = a[b/2];
            char cc = a[(b/2)-1];
            answer = cc+""+bb;
        } else {
            char bb = a[b/2];
            answer = String.valueOf(bb);
        }
        return answer;
    }

    public String 수박수박수박수박수박수(int n) {
        String answer = "";
        String str[] = new String[2];
        str[0] = "수";
        str[1] = "박";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += str[0];
            }else{
                answer += str[1];
            }
        }
        return answer;
    }

    public int 내적(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        없는_숫자_더하기(new int[]{1,2,3,4,6,7,8,0});
    }
}
