package designPattern.Builder;

/**
 * Created by root on 10/9/15.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceSms(10);
        builder.produceMail(10);
    }
}
