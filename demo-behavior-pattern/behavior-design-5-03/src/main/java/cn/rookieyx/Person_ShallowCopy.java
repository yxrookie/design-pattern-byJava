package cn.rookieyx;

import java.util.Arrays;

/**
 * @author rookieyx
 * @description
 * @create 2024-08-12 17:37
 **/
public class Person_ShallowCopy implements Cloneable {
    private String name;
    private int age;
    private Address address;
    private int[] scores;

    public Person_ShallowCopy(String name, int age, Address address, int[] scores) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.scores = scores;
    }

    // Getter 和 Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public Person_ShallowCopy clone() {
        try {
            Person_ShallowCopy cloned = (Person_ShallowCopy) super.clone();
            // 引用类型不进行拷贝
            // 深拷贝 Address 对象
            // cloned.address = this.address.clone();
            // 深拷贝 scores 数组
            // cloned.scores = this.scores.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
