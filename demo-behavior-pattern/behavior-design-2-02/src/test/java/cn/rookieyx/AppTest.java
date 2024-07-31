package cn.rookieyx;

import cn.rookieyx.factory.ICacheFactory;
import cn.rookieyx.factory.impl.EGMCacheFactory;
import cn.rookieyx.factory.impl.IIRCacheFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test_EGMCacheService() {
        ICacheFactory factory = new EGMCacheFactory();
        CacheService cacheService = factory.createCacheService();
        cacheService.set("test", "EGM Value");
        System.out.println(cacheService.get("test")); // 输出 EGM Value
    }

    @Test
    public void test_IIRCacheService() {
        ICacheFactory factory = new IIRCacheFactory();
        CacheService cacheService = factory.createCacheService();
        cacheService.set("test", "IIR Value");
        System.out.println(cacheService.get("test")); // 输出 IIR Value
    }

}
