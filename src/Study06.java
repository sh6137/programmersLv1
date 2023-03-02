import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Study06 {

    public int 폰켓몬(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }

        if (integers.size() > count) {
            answer = count;
        } else {
            answer = integers.size();
        }
        return answer;
    }


    public static int[] 가장_가까운_같은_글자(String s) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();

        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                arrayList.add(-1);
            } else {
                int count = -1;
                for (int j = i - 1; j >= 0; j--) {
                    if (str[i].equals(str[j])) {
                        arrayList.add(i - j);
                        break;
                    } else {
                        if (j == 0) {
                            arrayList.add(count);
                        }
                    }
                }
            }
        }
        answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(가장_가까운_같은_글자("foobar")));

    }
}


