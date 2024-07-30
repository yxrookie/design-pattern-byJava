package cn.rookieyx.resource.impl;

import cn.rookieyx.resource.IResource;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-30 18:53
 **/
public class DatabaseResource implements IResource {
    private boolean inUse;

    public DatabaseResource() {
        System.out.println("创建新的数据库资源");
        this.inUse = false;
    }

    @Override
    public void use() {
        System.out.println("使用数据库资源");
        this.inUse = true;
    }

    @Override
    public void release() {
        System.out.println("释放数据库资源");
        this.inUse = false;
    }

    public boolean isInUse() {
        return inUse;
    }

    @Override
    public String getResourceType() {
        return "Database";
    }
}
