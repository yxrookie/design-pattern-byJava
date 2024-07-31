package cn.rookieyx.factory.impl;

import cn.rookieyx.factory.ICacheAdapter;
import cn.rookieyx.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author rookieyx
 * @description EGM集群实现接口 -- 用来统一集群操作调用
 * @create 2024-07-31 15:00
 **/
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }

}
