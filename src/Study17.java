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

    public static void main(String[] args) {
    }
}
