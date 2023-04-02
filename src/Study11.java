import java.util.ArrayList;
import java.util.Arrays;
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

    public static String 카드_뭉치(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        List<String> cardList1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> cardList2 = new ArrayList<>(Arrays.asList(cards2));
        List<String> goalList = new ArrayList<>(Arrays.asList(goal));
        for (int i = 0; i < goalList.size(); i++) {
            if (goalList.get(i).equals(cardList1.get(0))) {
                cardList1.remove(0);
            } else if (goalList.get(i).equals(cardList2.get(0))) {
                cardList2.remove(0);
            } else {
                answer = "No";
            }

            if (cardList1.size() == 0) {
                cardList1.add("1");
            }
            if (cardList2.size() == 0) {
                cardList2.add("2");
            }
        }
        if (answer.equals("")) {
            answer = "Yes";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(카드_뭉치(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"})
        );
    }
}
