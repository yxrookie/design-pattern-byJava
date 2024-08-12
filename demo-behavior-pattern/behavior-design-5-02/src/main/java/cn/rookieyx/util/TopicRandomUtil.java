package cn.rookieyx.util;

import java.util.*;

/**
 * @author rookieyx
 * @description
 * @create 2024-08-12 11:46
 **/
public class TopicRandomUtil {
    // option --> 题目  key --> 答案
    static public Topic random(Map<String, String> option, String key) {
        // keySet--> 题目的选项
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        // 打乱 题目的选项
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<String, String>();
        int idx = 0;
        String keyNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }

}
