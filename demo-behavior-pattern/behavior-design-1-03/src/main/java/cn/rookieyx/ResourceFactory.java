package cn.rookieyx;

import cn.rookieyx.resource.IResource;
import cn.rookieyx.resource.impl.DatabaseResource;
import cn.rookieyx.resource.impl.FileSystemResource;
import cn.rookieyx.resource.impl.NetworkResource;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-30 18:54
 **/
public class ResourceFactory {

    private static final int MAX_POOL_SIZE = 5;
    private static final IResource[] pool = new IResource[MAX_POOL_SIZE];
    private static int currentIndex = 0;

    public static synchronized IResource getResource(String type) {
        for (IResource resource : pool) {
            if (resource != null && !resource.isInUse()) {
                if (resource.getResourceType().equals(type)) {
                    resource.use();
                    System.out.println("复用已有的" + type + "资源");
                    return resource;
                }
            }
        }

        if (currentIndex < MAX_POOL_SIZE) {
            IResource resource = createResource(type);
            pool[currentIndex++] = resource;
            resource.use();
            return resource;
        }

        System.out.println("没有可用的" + type + "资源");
        return null;
    }

    private static IResource createResource(String type) {
        switch (type) {
            case "Database":
                return new DatabaseResource();
            case "FileSystem":
                return new FileSystemResource();
            case "Network":
                return new NetworkResource();
            default:
                throw new IllegalArgumentException("未知的资源类型：" + type);
        }
    }

    public static synchronized void releaseResource(IResource resource) {
        if (resource != null) {
            resource.release();
            System.out.println("释放" + resource.getResourceType() + "资源");
        }
    }
}
