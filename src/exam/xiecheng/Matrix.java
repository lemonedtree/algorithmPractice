package exam.xiecheng;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int m = in.nextInt();
            char[][] chs = new char[n][m];
            for(int i = 0; i < n; i++) {
                String s = in.next();
                chs[i] = s.toCharArray();
            }
            int res = matrixCount(chs);
            System.out.println(res);
        }
    }

    public static int matrixCount(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        //[0][0] 到 [i][j] 各个字母存在的个数
        int[][] dp = new int[n][m];
        dp[0][0] = setContains(matrix[0][0]);

        for (int j = 1; j < m; j++) {

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
        return n * m;
    }

    private static int setContains(char ch) {
        int index = ch - 'a';
        return 1 << ch;
    }
}
