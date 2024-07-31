package cn.rookieyx;

import java.util.concurrent.TimeUnit;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-31 14:44
 **/
public interface CacheService {
    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);

}
