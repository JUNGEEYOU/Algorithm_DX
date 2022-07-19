import java.util.Scanner;
/*
 10726. 이진수 표현
 */

class Solution_10726 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String result = "ON";

            for (int j = 0; j < n; j++) {
                if ((m & (1 << j)) == 0) {  // m숫자의 j번째를 확인하여 0이 나오면 off로 변경
                    result = "OFF";
                    break;
                }
            }
            System.out.printf("#%d %s%n", test_case, result);
        }
    }
}