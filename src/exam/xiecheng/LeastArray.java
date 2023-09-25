package exam.xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeastArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            int[] res = solution(nums);
            printArray(res);
        }
    }
    public static int[] solution(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        //最后一个要是没得换了，就和倒数第二个换一下
        List<Integer> rest = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            rest.add(i);
        }
        //前面n - 1个
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != rest.get(0)) {
                res[i] = rest.get(0);
                rest.remove(0);
            } else {
                res[i] = rest.get(1);
                rest.remove(1);
            }
        }
        //最后一个
        if (nums[n - 1] == rest.get(0)) {
            int p = res[n - 2];
            res[n - 2] = rest.get(0);
            res[n - 1] = p;
        } else {
            res[n - 1] = rest.get(0);
        }
        return res;
    }

    public static void printArray(int[] nums) {
        StringBuilder sb = new StringBuilder();
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            sb.append(nums[i] + " ");
        }
        sb.append(nums[n - 1] + "");
        System.out.println(sb.toString());
    }
}
