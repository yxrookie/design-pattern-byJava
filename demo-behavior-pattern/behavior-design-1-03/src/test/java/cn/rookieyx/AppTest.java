package cn.rookieyx;

import cn.rookieyx.resource.IResource;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test_resource_pool() {
        // 获取数据库资源
        // 获取第一个数据库资源
        IResource dbResource1 = ResourceFactory.getResource("Database");
        // 获取第二个数据库资源
        IResource dbResource2 = ResourceFactory.getResource("Database");

        // 释放数据库资源
        ResourceFactory.releaseResource(dbResource1);
        ResourceFactory.releaseResource(dbResource2);

        // 获取文件系统资源
        IResource fsResource = ResourceFactory.getResource("FileSystem");
        ResourceFactory.releaseResource(fsResource);

        // 获取网络资源
        IResource netResource = ResourceFactory.getResource("Network");
        ResourceFactory.releaseResource(netResource);
    }

    @Test
    public void test_resource_pool2() {
        // 获取第一个数据库资源
        IResource dbResource1 = ResourceFactory.getResource("Database");
        Assert.assertNotNull(dbResource1);
        Assert.assertEquals("Database", dbResource1.getResourceType());

        // 获取第二个数据库资源
        IResource dbResource2 = ResourceFactory.getResource("Database");
        Assert.assertNotNull(dbResource2);
        Assert.assertEquals("Database", dbResource2.getResourceType());

        // 释放第一个数据库资源
        ResourceFactory.releaseResource(dbResource1);

        // 获取文件系统资源
        IResource fsResource = ResourceFactory.getResource("FileSystem");
        Assert.assertNotNull(fsResource);
        Assert.assertEquals("FileSystem", fsResource.getResourceType());

        // 释放文件系统资源
        ResourceFactory.releaseResource(fsResource);

        // 获取网络资源
        IResource netResource = ResourceFactory.getResource("Network");
        Assert.assertNotNull(netResource);
        Assert.assertEquals("Network", netResource.getResourceType());

        // 释放网络资源
        ResourceFactory.releaseResource(netResource);

        // 再次获取数据库资源，应该复用已释放的资源
        IResource dbResource3 = ResourceFactory.getResource("Database");
        Assert.assertNotNull(dbResource3);
        Assert.assertEquals("Database", dbResource3.getResourceType());

        // 检查是否复用了资源
        // 如果 dbResource1 和 dbResource3 是同一个对象实例，则表示复用成功
        Assert.assertSame(dbResource1, dbResource3);

        // 释放第二个数据库资源
        ResourceFactory.releaseResource(dbResource2);
        // 释放第三个数据库资源
        ResourceFactory.releaseResource(dbResource3);
    }
}
