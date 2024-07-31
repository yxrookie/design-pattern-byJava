package cn.rookieyx;

import java.util.concurrent.TimeUnit;

/**
 * @author rookieyx
 * @description redis 单机服务实现类
 * @create 2024-07-31 14:24
 **/
public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }

}
