package MemoryMap;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * Created on 11/4/15.
 */
public class MemoryMapWriter {
    public static void main(String[] args) throws Exception {
        File file = new File("mapped.txt");
//        file.delete();
        FileChannel fc = new RandomAccessFile(file, "rw").getChannel();
        System.out.println(fc.size());
        long bufferSize = 100;
        MappedByteBuffer mem = fc.map(FileChannel.MapMode.READ_WRITE, 0, bufferSize);
        int start = 0;
        long counter = 0;
        long HUNDREDK = 1000;
        long startT = System.currentTimeMillis();
        long noOfMessage = HUNDREDK * 10 * 10;
//        for (;;) {
//            if (!mem.hasRemaining()) {
//                start += mem.position();
//                mem = fc.map(FileChannel.MapMode.READ_WRITE, start, bufferSize);
//            }
//            mem.putLong(counter);
//            counter++;
//            if (counter > noOfMessage) {
//                break;
//            }
//            long endT = System.currentTimeMillis();
//            long tot = endT - startT;
//            System.out.println(String.format("No of Message %s, Time(ms) %s", counter, tot));
//        }
        FileLock lock;
        while (true) {
            lock = fc.tryLock(0, 20, false);
            if (lock != null) {
                break;
            }
        }
        System.out.println(System.currentTimeMillis());
        mem.putLong(19);
        mem.putInt(333);
        mem.putLong(19);
        mem.putInt(333);
        Thread.sleep(10000l);
        lock.close();
        fc.close();
        System.out.println("over");
    }
}
