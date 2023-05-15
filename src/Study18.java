import java.util.*;

public class Study18 {
    public String[] 달리기_경주(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            hashMap.put(players[i], i);
        }

        for (int i = 0; i < callings.length; i++) {
            int nowNum = hashMap.get(callings[i]);
            String player = players[nowNum];
            String firstplayer = players[nowNum - 1];

            players[nowNum] = firstplayer;
            players[nowNum - 1] = player;

            hashMap.put(firstplayer, nowNum);
            hashMap.put(player, nowNum - 1);
        }

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            answer[entry.getValue()] = entry.getKey();
        }

        return answer;
    }

    public static void main(String[] args) {
        Study18 study18 = new Study18();
        System.out.println(study18.달리기_경주(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"}));
    }
}
