package cn.rookieyx.factory;

import cn.rookieyx.CacheService;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-31 15:49
 **/
public interface ICacheFactory {
    CacheService createCacheService();
}
