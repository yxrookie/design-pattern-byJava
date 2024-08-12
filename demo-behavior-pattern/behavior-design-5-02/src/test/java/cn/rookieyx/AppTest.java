package cn.rookieyx;

import cn.rookieyx.util.Topic;
import cn.rookieyx.util.TopicRandomUtil;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test_TopicRandomUtil() {
        Map<String, String> map01 = new HashMap<String, String>();
        map01.put("A", "JAVA2 EE");
        map01.put("B", "JAVA2 Card");
        map01.put("C", "JAVA2 ME");
        map01.put("D", "JAVA2 HE");
        map01.put("E", "JAVA2 SE");
        Topic newTopic = TopicRandomUtil.random(map01, "A");
        System.out.println(newTopic.getOption());
        System.out.println(newTopic.getKey());
    }

    @Test
    public void test_Hashmap() {
        Map<String, String> map01 = new HashMap<String, String>();
        map01.put("A", "JAVA2 EE");
        map01.put("E", "JAVA2 SE");
        map01.put("C", "JAVA2 ME");
        map01.put("B", "JAVA2 Card");
        map01.put("D", "JAVA2 HE");
        System.out.println(map01);
    }
    @Test
    public void test_QuestionBank() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }

}
