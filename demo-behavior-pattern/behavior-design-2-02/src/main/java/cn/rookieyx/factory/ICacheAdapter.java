package cn.rookieyx.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author rookieyx
 * @description 适配接口
 * @create 2024-07-31 14:57
 **/
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
