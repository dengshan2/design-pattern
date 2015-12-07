package ThreadTest2.catchOtherThreadLockData;

/**
 *      《静夜思》 作者： 李白
 *      床前明月光，疑是地上霜。
 *      举头望明月，低头思故乡。
 * Created by root on 11/11/15.
 * author: zd
 */
public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            try {
                System.out.println("等待b对象完成计算：");
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("b对象的值为： " + b.count);
        }
    }
}