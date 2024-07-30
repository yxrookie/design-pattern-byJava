package cn.rookieyx.resource;

/**
 * @author rookieyx
 * @description 资源操作接口
 * @create 2024-07-30 18:53
 **/
public interface IResource {
    void use();
    void release();
    boolean isInUse();
    String getResourceType();
}
