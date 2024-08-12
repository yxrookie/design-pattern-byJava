package cn.rookieyx;

/**
 * @author rookieyx
 * @description Builder 接口
 * @create 2024-08-10 16:25
 **/
public interface IMenu {
    IMenu appendCeiling(Matter matter);    // 吊顶
    IMenu appendCoat(Matter matter);       // 涂料
    IMenu appendFloor(Matter matter);      // 地板
    IMenu appendTile(Matter matter);       // 地砖
    String getDetail();                    // 明细
}
