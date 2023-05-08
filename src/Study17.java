import java.util.Stack;

public class Study17 {

    public int 크레인_인형뽑기_게임(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (integerStack.size() >= 1) {
                        if (integerStack.peek() == board[j][moves[i] - 1]) {
                            integerStack.pop();
                            answer = answer + 2;
                        } else {
                            integerStack.push(board[j][moves[i] - 1]);
                        }
                    } else {
                        integerStack.push(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public String 신규_아이디_추천(String new_id) {
        String answer = "";
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        String pattern = "[^a-z0-9-_.]";
        new_id = new_id.replaceAll(pattern, "");
        //3단계
        new_id = new_id.replaceAll("\\.{2,}", ".");
        //4단계
        if (new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        if (new_id.length() > 0) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        //5단계
        if (new_id.equals("")) {
            new_id = "a";
        }
        //6단계
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        //7단계
        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id = new_id + new_id.charAt(new_id.length() - 1);
            }
        }
        answer = new_id;
        return answer;
    }

    public static void main(String[] args) {
        Study17 study17 = new Study17();
        study17.신규_아이디_추천("abcdefghijklmn.p");
    }
}
