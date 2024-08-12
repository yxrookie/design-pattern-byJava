package cn.rookieyx;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
   public void test_DeepCopy_clone() {
       // 创建原始对象
       Address address = new Address("New York", "5th Avenue");
       int[] scores = {90, 85, 88};
       Person_DeepCopy original = new Person_DeepCopy("John Doe", 30, address, scores);

       // 克隆对象
       Person_DeepCopy cloned = original.clone();

       // 打印原始对象和克隆对象的信息
       System.out.println("Original: " + original);
       System.out.println("Clone: " + cloned);

       // 修改克隆对象的状态
       cloned.getAddress().setCity("Los Angeles");
       cloned.getScores()[0] = 100;

       // 再次打印以验证修改
       System.out.println("After modification:");
       System.out.println("Original: " + original);
       System.out.println("Clone: " + cloned);
   }

    @Test
    public void test_ShallowCopy_clone() {
        // 创建原始对象
        Address address = new Address("New York", "5th Avenue");
        int[] scores = {90, 85, 88};
        Person_ShallowCopy original = new Person_ShallowCopy("John Doe", 30, address, scores);

        // 克隆对象
        Person_ShallowCopy cloned = original.clone();

        // 打印原始对象和克隆对象的信息
        System.out.println("Original: " + original);
        System.out.println("Clone: " + cloned);

        // 修改克隆对象的状态
        cloned.getAddress().setCity("Los Angeles");
        cloned.getScores()[0] = 100;

        // 再次打印以验证修改
        // 由于 Address 和 score 均为浅拷贝所以均发生改变
        System.out.println("After modification:");
        System.out.println("Original: " + original);
        System.out.println("Clone: " + cloned);
    }
}
