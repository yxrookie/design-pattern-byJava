package cn.rookieyx.factory.impl;

import cn.rookieyx.CacheService;
import cn.rookieyx.factory.ICacheFactory;
import cn.rookieyx.impl.CacheServiceImpl;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-31 15:55
 **/
public class IIRCacheFactory implements ICacheFactory {
    @Override
    public CacheService createCacheService() {
        CacheServiceImpl cacheService = new CacheServiceImpl();
        cacheService.setCacheAdapter(new IIRCacheAdapter());
        return cacheService;
    }
}
