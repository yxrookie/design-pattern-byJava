package cn.rookieyx.resource.impl;

import cn.rookieyx.resource.IResource;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-30 18:54
 **/
public class NetworkResource implements IResource {
    private boolean inUse;

    public NetworkResource() {
        System.out.println("创建新的网络资源");
        this.inUse = false;
    }

    @Override
    public void use() {
        System.out.println("使用网络资源");
        this.inUse = true;
    }

    @Override
    public void release() {
        System.out.println("释放网络资源");
        this.inUse = false;
    }

    public boolean isInUse() {
        return inUse;
    }

    @Override
    public String getResourceType() {
        return "Network";
    }
}
