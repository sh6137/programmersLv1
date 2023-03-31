import java.util.ArrayList;
import java.util.List;

public class Study11 {
    public static int 기사단원의_무기(int number, int limit, int power) {
        int answer = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
            }
            if (count > limit) {
                count = power;
            }
            integerList.add(count);
        }
        answer = integerList.stream().mapToInt(i -> i).sum();
        return answer;
    }

    public static void main(String[] args) {
        기사단원의_무기(5, 3, 2);
    }
}
