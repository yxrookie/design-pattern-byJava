package cn.rookieyx.factory.impl;

import cn.rookieyx.factory.ICacheAdapter;
import cn.rookieyx.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author rookieyx
 * @description IIR集群实现接口 -- 用来统一集群操作调用
 * @create 2024-07-31 15:02
 **/
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    public String get(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }
}
