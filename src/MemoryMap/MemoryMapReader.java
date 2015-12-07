package MemoryMap;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * Created on 11/4/15.
 * author: zd
 */
public class MemoryMapReader {
    public static void main(String[] args) throws Exception {
        FileChannel fc = new RandomAccessFile(new File("/opt/testNode/RemoteLinuxLogAgent/conf/speed.txt"), "rw").getChannel();
        long bufferSize = 1000;
        MappedByteBuffer mem = fc.map(FileChannel.MapMode.READ_ONLY, 0, bufferSize);
        long oldSize = fc.size();

        long currentPos = 0;
        long xx = currentPos;

        long startTime = System.currentTimeMillis();
        long lastValue = -1;
        FileLock lock;
        while (true) {
            lock = fc.tryLock(0, 20, false);
            if (lock != null) {
                break;
            }
        }
        long count = mem.getLong();
        System.out.println(count);
        int speed = mem.getInt(8);
        System.out.println(speed);
        lock.close();
        fc.close();
//        for (;;) {
//            while (mem.hasRemaining()) {
//                lastValue = mem.getLong();
//                currentPos += 8;
//            }
//            if (currentPos < oldSize) {
//                xx = xx + mem.position();
//                mem = fc.map(FileChannel.MapMode.READ_ONLY, xx, bufferSize);
//            } else {
//                long end = System.currentTimeMillis();
//                long tot = end -startTime;
//                System.out.println(String.format("Last Value Read %s, Time(ms) %s ", lastValue, tot));
//                System.out.println("Waiting for message");
//                while (true) {
//                    long newSize = fc.size();
//                    if (newSize > oldSize) {
//                        oldSize = newSize;
//                        xx = xx + mem.position();
//                        mem = fc.map(FileChannel.MapMode.READ_ONLY, xx, oldSize-xx);
//                        System.out.println("Got some data");
//                        break;
//                    }
//                }
//            }
//        }

    }
}


