package designPattern.Prototype;

import java.lang.reflect.Field;

/**
 * Created by root on 10/9/15.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Prototype type = new Prototype();
        type.setString("ha, you are here!!!");
        Prototype type2 = (Prototype)type.clone();
        System.out.println("type2 : " + type2.getString());
        Prototype type3 = (Prototype)type.deepClone();
        System.out.println("type3 : " + type3.getString());
        System.out.println("type: " + type.getString().hashCode());
        System.out.println("type2: " + type2.getString().hashCode());
        System.out.println("type3: " + type3.getString().hashCode());

        System.out.println("*********************************************");
        String string = type2.getString();
        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] value = (char[])valueField.get(string);
        value[0] = 'w';
        value[1] = '1';
        value[2] = ',';
        System.out.println("type : " + type.getString());
        System.out.println(type.getString().equals(type2.getString()));
        System.out.println("type2 : " + type2.getString());
        System.out.println("type3 : " + type3.getString());
        System.out.println("type == type2" + (type.getString() == type2.getString()));
        System.out.println("type == type3" + (type.getString() == type3.getString()));
        System.out.println("type2 == type3" + (type2.getString() == type3.getString()));
        System.out.println(type.getString().equals(type2.getString()));
        System.out.println(type.getString().equals(type3.getString()));
        System.out.println(type2.getString().equals(type3.getString()));
        System.out.println(type.getString().hashCode());
        System.out.println(type2.getString().hashCode());
        System.out.println(type3.getString().hashCode());
//        String s1 = "123";
//        String s2 = "123";
//        String s3 = new String("123");
//        String s4 = s3.intern();
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s4);
//        System.out.println(s2 == s3);
//        System.out.println(s2 == s4);
//        System.out.println(s3 == s4);
    }
}
