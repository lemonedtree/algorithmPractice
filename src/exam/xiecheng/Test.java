package exam.xiecheng;

import org.junit.Assert;

public class Test {
    /*
    partition：
    1.长度：1、>1
    2.s中，同样字母出现过；没出现
    3.
     */
    @org.junit.Test
    public void test1() {
        String s = "aa";
        String t = "cd";
        boolean actual = Transfer.canTransfer(s, t);
        Assert.assertEquals(false,actual);
    }

    @org.junit.Test
    public void test2() {
        String s = "aa";
        String t = "ab";
        boolean actual = Transfer.canTransfer(s, t);
        Assert.assertEquals(false,actual);
    }

    @org.junit.Test
    public void test3() {
        String s = "bc";
        String t = "aa";
        boolean actual = Transfer.canTransfer(s, t);
        Assert.assertEquals(true,actual);
    }
}
