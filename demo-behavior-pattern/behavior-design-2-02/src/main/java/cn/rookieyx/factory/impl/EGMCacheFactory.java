package cn.rookieyx.factory.impl;

import cn.rookieyx.CacheService;
import cn.rookieyx.factory.ICacheFactory;
import cn.rookieyx.impl.CacheServiceImpl;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-31 15:50
 **/
public class EGMCacheFactory implements ICacheFactory {

    @Override
    public CacheService createCacheService() {
        CacheServiceImpl cacheService = new CacheServiceImpl();
        cacheService.setCacheAdapter(new EGMCacheAdapter());
        return cacheService;
    }
}
