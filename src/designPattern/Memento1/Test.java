package designPattern.Memento1;

/**
 * Created by root on 10/23/15.
 */
public class Test {
    public static void main(String[] args) {
        Original original = new Original("ori");
        Storage storage = new Storage(original.createMemento());

        System.out.println(original.getValue());
        original.setValue("new");
        System.out.println(original.getValue());

        System.out.println("======================================");
        original.restoreMemento(storage.getMemento());
        System.out.println(original.getValue());
    }
}
