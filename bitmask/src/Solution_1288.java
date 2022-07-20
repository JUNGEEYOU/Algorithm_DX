/*
  새로운 불면증 치료법

  N의 배수 번호인 양을 세기

 */
import java.util.Scanner;


class Solution_1288
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
//            int result = 0;
            int visit = (1 << 10) -1;  // 총 10가지 수 체크 (1111...)
            int cur = 1;
            int mul = n;
            while(visit > 0){
                mul = n * cur;
                while(mul > 0) {
                    int div = mul % 10;           // 현재 자리의 수 얻기
                    visit = visit & ~(1 << div);  // 현재 자리의 값의 비트값을 얻어 반대로하여 곱하면 해당 값만 제거
                    mul = mul / 10;
                }
                cur += 1;
            }
            System.out.printf("#%d %d%n", test_case, (cur - 1) * n);
        }
    }
}