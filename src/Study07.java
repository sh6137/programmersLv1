import java.util.ArrayList;

public class Study07 {
    public static int[] 모의고사(int[] answers) {
        int[] answer = {};
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int counta = 0;
        int countb = 0;
        int countc = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < answers.length; i++) {
            if (i == 0) {
                if (a[i] == answers[i]) {
                    counta++;
                }
                if (b[i] == answers[i]) {
                    countb++;
                }
                if (c[i] == answers[i]) {
                    countc++;
                }

            } else {
                int lena = i % a.length;
                int lenb = i % b.length;
                int lenc = i % c.length;
                if (a[lena] == answers[i]) {
                    counta++;
                }
                if (b[lenb] == answers[i]) {
                    countb++;
                }
                if (c[lenc] == answers[i]) {
                    countc++;
                }
            }

        }
        int max = 0;

        if (counta >= countb && counta >= countc) {
            max = counta;
        } else if (countb >= counta && countb >= countc) {
            max = countb;
        } else {
            max = countc;
        }

        if (max == counta) {
            arrayList.add(1);
        }
        if (max == countb) {
            arrayList.add(2);
        }
        if (max == countc) {
            arrayList.add(3);
        }
        answer = arrayList.stream().mapToInt(f -> f).toArray();

        return answer;
    }

    public int 소수_만들기(int[] nums) {
        int answer = -1;

        return answer;
    }
    public static void main(String[] args) {
        모의고사(new int[]{1, 2, 3, 4, 5});

//        int a = 0%5;
//        System.out.println(a);
    }
}
