import java.util.HashSet;

public class Study06 {

    public int 폰켓문(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }

        if (integers.size() > count) {
            answer = count;
        }else {
            answer = integers.size();
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}


