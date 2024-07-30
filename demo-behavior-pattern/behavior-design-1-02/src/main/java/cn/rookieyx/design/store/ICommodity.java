package cn.rookieyx.design.store;

import java.util.Map;

/**
 * @author rookieyx
 * @description 发奖接口
 * @create 2024-07-30 15:57
 **/
public interface ICommodity {
    // 入参：用户ID， 奖品ID， 业务ID， 扩展字段
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
