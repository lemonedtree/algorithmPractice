package exam.xiecheng;

import java.util.Scanner;

public class ChangeK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.next();
            int k = in.nextInt();
            int res = solution(s, k);
            System.out.println(res);
        }
    }

    private static int MOD = (int) (1e9 + 7);
    public static int solution(String num, int k) {
        //末尾一定是00，25，50，75
        //各个位之和最后一定是3的倍数
        int len = num.length();
        if (len < k || len < 2 || k == 0) {
            return 0;
        }
        // 长度为2时
        if (len == 2) {
            int val = Integer.parseInt(num);
            int index0 = val % 10;
            int index1 = val / 10;

            if (k == 1) {
                //只能修改一个，就看能不能改成25 50 75了
                if (val == 25 || val == 50 || val == 75) {
                    return 0;
                }
                if (index1 == 2 || index1 == 5 || index1 == 7) {
                    return 1;
                }
                if (index0 == 0) {
                    return 1;
                }
                if (index0 == 5) {
                    return 2;
                }
            } else {
                //能修改两个
                if (index0 != 0 && index0 != 5 && index1 != 2 && index1 != 5 && index1 != 7) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        long res = 0L;
//        res += to00(num, k);
//        res += to25(num, k);
//        res += to50(num, k);
//        res += to75(num, k);
        return (int) res % MOD;
    }

//    private static long to00(String s, int k) {
//
//    }
//
//    private static long to25(String s, int k) {
//
//    }

//    private static long to50(String s, int k) {
//
//    }
//
//    private static long to75(String s, int k) {
//
//    }

    private static int mod3(String num) {
        int count = 0;
        for(char ch: num.toCharArray()) {
            count += ch - '0';
        }
        return count % 3;
    }

//    private static int[][] changeAddModCount(String num, int k, int add) {
//        //到了index i时，恰好使用了j次变化机会，是的整个num % 3 增加了t
//        int[][][] dp = new int[num.length()][k + 1][3];
//
//    }

    //res[0] 需要消耗多少，res[1]有多少种可能性
    public static int[] changeTo00(int num) {
        int[] res = new int[2];
        if (num == 0) {
            return res;
        }
        int index0 = num / 10;
        int index1 = num % 10;
        if (index0 == 0 || index1 == 0) {
            res[0] = 1;
            res[1] = 1;
            return res;
        }
        res[0] = 2;
        res[1] = 1;
        return res;
    }

    public static int[] changeTo25(int num) {
        int[] res = new int[2];
        if (num == 25) {
            return res;
        }
        int index0 = num / 10;
        int index1 = num % 10;
        if (index0 == 5 || index1 == 2) {
            res[0] = 1;
            res[1] = 1;
            return res;
        }
        res[0] = 2;
        res[1] = 1;
        return res;
    }

    public static int[] changeTo50(int num) {
        int[] res = new int[2];
        if (num == 50) {
            return res;
        }
        int index0 = num / 10;
        int index1 = num % 10;
        if (index0 == 0 || index1 == 5) {
            res[0] = 1;
            res[1] = 1;
            return res;
        }
        res[0] = 2;
        res[1] = 1;
        return res;
    }

    public static int[] changeTo75(int num) {
        int[] res = new int[2];
        if (num == 75) {
            return res;
        }
        int index0 = num / 10;
        int index1 = num % 10;
        if (index0 == 5 || index1 == 7) {
            res[0] = 1;
            res[1] = 1;
            return res;
        }
        res[0] = 2;
        res[1] = 1;
        return res;
    }
}
