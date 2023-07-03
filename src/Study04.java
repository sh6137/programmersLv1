import java.time.LocalDate;
import java.util.*;
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

    public int[] 두_개_뽑아서_더하기(int[] numbers) {
        int[] answer = {};
        Set<Integer> setList = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    setList.add(numbers[i] + numbers[j]);
                }
            }
        }
        ArrayList arrayList = new ArrayList(setList);
        answer = arrayList.stream().mapToInt(f -> (int) f).toArray();
        Arrays.sort(answer);
        return answer;
    }

    public static long 크기가_작은_부분문자열(String t, String p) {
        long answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());
            if (Long.valueOf(p) >= Long.valueOf(str)) {
                answer++;
            }
        }
        return answer;
    }

    public String 이천십육년(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = 0;
        for (int i = 0; i < a - 1; i++) {
            date += month[i];
        }
        date += b - 1;

        answer = day[date % 7];
        return answer;
    }
    public String 이천십육년2(int a, int b) {
        String answer = "";
        answer = LocalDate.of(2016,a,b).getDayOfWeek().toString().substring(0,3);
        return answer;
    }

    public static void main(String[] args) {
//        K번째수(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
//        크기가_작은_부분문자열("10203", "15");
        비밀지도(5,new int[]{9, 20, 28, 18, 11},new int[]{30, 1, 21, 17, 28});
    }
}
