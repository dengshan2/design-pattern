package system_getProperty;

import java.lang.management.ManagementFactory;

/**
 *      《登鹳雀楼》 作者： 王之涣
 *      百日依山尽， 黄河入海流。
 *      欲穷千里目， 更上一层楼。
 * Created by root on 11/11/15.
 * author: zd
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.getProperty("path.separator"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vm.version"));
        System.out.println(System.getProperty("java.vm.vendor"));
        System.out.println(System.getProperty("java.vm.name"));
        System.out.println(System.getProperty("java.vm.specification.version"));
        System.out.println(System.getProperty("java.vm.specification.vendor"));
        System.out.println(System.getProperty("java.vm.specification.name"));
        System.out.println(System.getProperty("java.specification.version"));
        System.out.println(System.getProperty("java.specification.vendor"));
        System.out.println(System.getProperty("java.specification.name"));
        System.out.println(System.getProperty("java.class.version"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println(System.getProperty("java.compiler"));
        System.out.println(System.getProperty("java.ext.dirs"));
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name);
        String pid = name.split("@")[0];
        System.out.println(pid);
    }
}
