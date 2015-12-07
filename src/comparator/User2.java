package comparator;

import java.util.Arrays;

/**
 * Created by root on 11/20/15.
 * author: zd
 */
public class User2 implements Comparable {
    private String name;
    private int age;

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }

    @Override
    public int compareTo(Object o) {
        return age - ((User2)o).age;
    }

    public static void main(String[] args) {
        User2[] user2s = new User2[]{new User2("a", 30), new User2("b", 20), new User2("c", 25)};
        Arrays.sort(user2s);
        for (User2 user : user2s) {
            System.out.println(user);
        }
    }
}
