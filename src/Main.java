import java.util.Random;

public class Main {

    public void pensionLotto(int quantity) {
        Random random = new Random();
        int[] jo = new int[quantity];
        String[] number = new String[quantity];
        //조 추첨
        for (int i = 0; i < quantity; i++) {
            jo[i] = random.nextInt(5) + 1;
        }
        //번호 추첨
        for (int i = 0; i < quantity; i++) {
            String str = "";
            for (int j = 0; j < 6; j++) {
                str += " " + String.valueOf(random.nextInt(10));
            }
            number[i] = str;
        }

        for (int i = 0; i < quantity; i++) {
            System.out.println(jo[i] + "조"+ number[i]);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.pensionLotto(5);
        System.out.println("Hello world!");
    }
}