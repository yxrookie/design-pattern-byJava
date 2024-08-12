package cn.rookieyx;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rookieyx
 * @description 具体建造者
 * @create 2024-08-10 16:26
 **/
public class DecorationPackageMenu implements IMenu{
    private List<Matter> list = new ArrayList<>(); // 装修清单
    private BigDecimal price = BigDecimal.ZERO;    // 装修价格

    private BigDecimal area;                     // 面积
    private  String grade;                      // 装修等级：豪华欧式，轻奢田园，现代简约

    private DecorationPackageMenu() {

    }

    public DecorationPackageMenu(double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    /*
    this 的作用
    1. this 指的是当前 IMenu 接口的实现类的实例，任何调用 appendCoat 方法的对象
    ,this 就是指向那个对象自身
    2. 当返回 this 时，会返回当前对象的实例，这样的好处是支持方法调用，即在同一个对象连续调用多个
    方法
     */
    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");

        for (Matter matter: list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append("、").append(matter.model()).append("、平米价格：").append(matter.price()).append(" 元。\n");
        }

        return detail.toString();
    }
}
