package string;

/**
 * Created by root on 11/18/15.
 */
public class TestBreakFlag {
    public static void main(String[] args) {
        loop : for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int z = 0; z < 10; z++) {
                        if (z == 5) {
                            break loop;
                        }
                        System.out.println(z);
                    }
                }
            }
        }
        System.out.println("happy, break out!");
    }
}
