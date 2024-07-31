package cn.rookieyx;

import java.util.concurrent.TimeUnit;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-31 14:44
 **/
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
