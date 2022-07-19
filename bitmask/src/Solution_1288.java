/*
  새로운 불면증 치료법

  ㅠ  N의 배수 번호인 양을 세기

 */
import java.util.Scanner;


class Solution_1288
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int result = 0;

            System.out.printf("#%d %d", test_case, result);
        }
    }
}