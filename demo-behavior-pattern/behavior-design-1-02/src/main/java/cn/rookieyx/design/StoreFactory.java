package cn.rookieyx.design;

import cn.rookieyx.design.store.ICommodity;
import cn.rookieyx.design.store.impl.CardCommodityService;
import cn.rookieyx.design.store.impl.CouponCommodityService;
import cn.rookieyx.design.store.impl.GoodsCommodityService;

/**
 * @author rookieyx
 * @description
 * @create 2024-07-30 15:56
 **/
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
