package DatePackage.newDateTest;

/**
 * Created by root on 11/26/15.
 * zd
 */
public class RunnableTest implements Runnable {
    private long count;
    private String name;

    public long getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        name = "haha";
        count = 0;
        for (int i = 0; i < 5000; i++) {
            count += i;
        }

        System.out.println("over!");
    }
}
