package cn.rookieyx;

import cn.rookieyx.impl.CacheServiceImpl;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  @Test
    public void test_CacheService() {
      CacheServiceImpl cacheService = new CacheServiceImpl();
      cacheService.set("star", "hahaha", 1);
      String star = cacheService.get("star", 1);
      System.out.println("存储值: "+star);
  }
}
