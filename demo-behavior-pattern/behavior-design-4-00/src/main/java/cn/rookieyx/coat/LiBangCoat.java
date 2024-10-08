package cn.rookieyx.coat;

/**
 * @author rookieyx
 * @description
 * @create 2024-08-10 15:25
 **/

import cn.rookieyx.Matter;

import java.math.BigDecimal;

/**
 * 涂料
 * 品牌；立邦
 */
public class LiBangCoat implements Matter {

    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "立邦";
    }

    public String model() {
        return "默认级别";
    }

    public BigDecimal price() {
        return new BigDecimal(650);
    }

    public String desc() {
        return "立邦始终以开发绿色产品、注重高科技、高品质为目标，以技术力量不断推进科研和开发，满足消费者需求。";
    }

}
