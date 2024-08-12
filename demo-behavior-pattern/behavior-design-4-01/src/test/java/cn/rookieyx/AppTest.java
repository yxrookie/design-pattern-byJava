package cn.rookieyx;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test_DecorationPackageController(){
        DecorationPackageController decoration = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));
    }
}
