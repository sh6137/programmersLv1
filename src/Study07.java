public class Study07 {
    public static int[] 모의고사(int[] answers) {
        int[] answer = {};
        int[] a = new int[{1, 2, 3, 4, 5}];
        int[] b = new int[{2, 1, 2, 3, 2, 4, 2, 5}];
        int[] c = new int[{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}];
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (a[((i + 1) % a.length)-1] == answer[i]) {
                count++:
            }
        }
        System.out.println(count);
        return answer;
    }

    public static void main(String[] args) {
        모의고사(new int[]{1,2,3,4,5});
    }
}
