package exam.xiecheng;

import org.junit.Assert;
import org.junit.Test;

public class TestLeastArray {
    @Test
    public void testArray() {
        int[] nums = new int[]{2,1,3};
        int[] res = LeastArray.solution(nums);
        for (int i = 0; i < nums.length; i++) {
            Assert.assertNotEquals(nums[i], res[i]);
        }
    }

    @Test
    public void testArray2() {
        int[] nums = new int[]{2,3,1};
        int[] res = LeastArray.solution(nums);
        LeastArray.printArray(res);
        for (int i = 0; i < nums.length; i++) {
            Assert.assertNotEquals(nums[i], res[i]);
        }
    }

    @Test
    public void testArray3() {
        int[] nums = new int[]{1,2,3};
        int[] res = LeastArray.solution(nums);
        LeastArray.printArray(res);
        for (int i = 0; i < nums.length; i++) {
            Assert.assertNotEquals(nums[i], res[i]);
        }
    }

}
