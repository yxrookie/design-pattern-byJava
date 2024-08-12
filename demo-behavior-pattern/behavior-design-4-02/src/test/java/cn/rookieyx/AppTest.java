package cn.rookieyx;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test_Director() {
        Director director = new Director();
        // 豪华欧式
        System.out.println(director.levelOne(132.25D).getDetail());
        // 轻奢田园
        System.out.println(director.levelOne(98.25D).getDetail());
        // 现代简约
        System.out.println(director.levelOne(85.43D).getDetail());
    }
}
