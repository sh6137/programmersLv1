import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Study01 {
    public String 짝수와_홀수(int num) {
        String answer = "";
        if (num % 2 != 0) {
            answer = "Odd";
        } else {
            answer = "Even";
        }
        return answer;
    }

    public double 평균_구하기(int[] arr) {
        double answer = 0;
        answer = Arrays.stream(arr).average().getAsDouble();
        return answer;
    }

    public int 약수의_합(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer = answer + i;
            }
        }
        return answer;
    }

    public int 자릿수_더하기(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] strArrays = str.split("");
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < strArrays.length; i++) {
            arrayList.add(Integer.valueOf(strArrays[i]));
        }
        answer = arrayList.stream().mapToInt(f -> f).sum();
        return answer;
    }

    public int[] 자연수_뒤집어_배열로_만들기(long n) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] str = String.valueOf(n).split("");
        for (int i = str.length - 1; i >= 0; i--) {
            arrayList.add(Integer.valueOf(str[i]));
        }
        answer = arrayList.stream().mapToInt(f -> f).toArray();
        return answer;
    }

    boolean 문자열_내_p와_y의_개수(String s) {
        boolean answer = true;
        String[] str = s.split("");
        ArrayList<String> pList = new ArrayList<>();
        ArrayList<String> yList = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("p") || str[i].equals("P")) {
                pList.add(str[i]);
            } else if (str[i].equals("y") || str[i].equals("Y")) {
                yList.add(str[i]);
            }
        }

        if (yList.size() - pList.size() != 0) {
            answer = false;
        }
        return answer;
    }

    public long 정수_제곱근_판별(long n) {
        long answer = 0;
        long test = (long) Math.sqrt(n);
        if (test * test == n) {
            answer = (long) Math.pow(test + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }

    public long[] x만큼_간격이_있는_n개의_숫자(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < n; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }

    public int 문자열을_정수로_바꾸기(String s) {
        int answer = 0;
        answer = Integer.valueOf(s);
        return answer;
    }

    public static long 정수_내림차순으로_배치하기(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Comparator.reverseOrder());

        String a = "";
        for (int i = 0; i < str.length; i++) {
            a += str[i];
        }
        answer = Long.valueOf(a);
        return answer;
    }

    public int 나머지가_1이_되는_수_찾기(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public boolean solution(int x) {
        boolean answer = true;
        String[] str = String.valueOf(x).split("");
        int a = Arrays.stream(str).mapToInt(f -> Integer.valueOf(f)).sum();
        if (x % a == 0) {
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        정수_내림차순으로_배치하기(118372);
    }
}
