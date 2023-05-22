import java.time.Duration;
import java.time.LocalDate;
import java.util.HashMap;

public class Study19 {

    public int[] 개인정보_수집_유효기간(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        String[] str = today.split(".");
        LocalDate localToday = LocalDate.of(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
        HashMap<String, Integer> termsHash = new HashMap();
        for (int i = 0; i < terms.length; i++) {
            String[] a = terms[i].split(" ");
            termsHash.put(a[0], Integer.parseInt(a[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] a = privacies[i].split(" ");
            String[] b = a[0].split(".");
            LocalDate localDate = LocalDate.of(Integer.parseInt(b[0]),Integer.parseInt(b[1]),Integer.parseInt(b[2]));
            Duration diff = Duration.between(localToday,localDate);

        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
