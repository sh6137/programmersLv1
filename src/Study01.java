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

    public boolean 하샤드_수(int x) {
        boolean answer = true;
        String[] str = String.valueOf(x).split("");
        int a = Arrays.stream(str).mapToInt(f -> Integer.valueOf(f)).sum();
        if (x % a == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public long 두_정수_사이의_합(int a, int b) {
        long answer = 0;
        int[] array = new int[2];
        array[0] = a;
        array[1] = b;
        Arrays.sort(array);
        for (int i = array[0]; i <= array[1]; i++) {
            answer += i;
        }
        return answer;
    }

    public long 콜라츠_추측(long num) {
        long answer = 0;
        while (true) {
            if (answer > 500) {
                answer = -1;
                break;
            }
            if (num == 1) {
                break;
            } else if (num % 2 == 0) {
                num = num / 2;
                answer++;
            } else if (num % 2 != 0) {
                num = (num * 3) + 1;
                answer++;
            }
        }
        return answer;
    }

    public String 서울에서_김서방_찾기(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }

    public int[] 나누어_떨어지는_숫자_배열(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrayList.add(arr[i]);
            }
        }
        if (arrayList.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = arrayList.stream().sorted().mapToInt(f -> f).toArray();
        }
        return answer;
    }


    public String 핸드폰_번호_가리기(String phone_number) {
        String answer = "";
        String[] str = phone_number.split("");
        for (int i = 0; i < str.length - 4; i++) {
            str[i] = "*";
        }
        for (int i = 0; i < str.length ; i++) {
            answer += str[i];
        }
        return String.valueOf(str.toString());
    }

    public static void main(String[] args) {
        정수_내림차순으로_배치하기(118372);
    }
}
