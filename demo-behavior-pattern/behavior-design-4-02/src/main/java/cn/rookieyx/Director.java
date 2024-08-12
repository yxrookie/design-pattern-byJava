package cn.rookieyx;

import cn.rookieyx.ceilling.LevelOneCeiling;
import cn.rookieyx.ceilling.LevelTwoCeiling;
import cn.rookieyx.coat.DuluxCoat;
import cn.rookieyx.coat.LiBangCoat;
import cn.rookieyx.floor.ShengXiangFloor;
import cn.rookieyx.tile.DongPengTile;
import cn.rookieyx.tile.MarcoPoloTile;

/**
 * @author rookieyx
 * @description 指挥者
 * @create 2024-08-10 16:25
 **/
public class Director {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new DuluxCoat())            // 涂料， 多乐士
                .appendFloor(new ShengXiangFloor());    // 地板， 圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}
