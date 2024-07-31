package cn.rookieyx.impl;

import cn.rookieyx.CacheService;
import cn.rookieyx.RedisUtils;
import cn.rookieyx.factory.ICacheAdapter;
import cn.rookieyx.matter.EGM;
import cn.rookieyx.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-31 14:43
 **/
public class CacheServiceImpl implements CacheService {
    private ICacheAdapter cacheAdapter;

    public void setCacheAdapter(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public String get(String key) {
        return cacheAdapter.get(key);
    }

    @Override
    public void set(String key, String value) {
        cacheAdapter.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        cacheAdapter.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        cacheAdapter.del(key);
    }
}
