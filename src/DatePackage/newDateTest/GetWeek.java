package DatePackage.newDateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by root on 11/26/15.
 * author: zd
 */
public class GetWeek {
//    public static void main(String[] args) {
////        Date date = new SimpleDateFormat("yyyy-MM-dd EEEE").parse("2015-11-26 星期四");
////        System.out.println(date.getTime());
////        System.out.println(date);
//
//        SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy年 MM月 dd日 EEEE hh:mm:ss");
//        Date date1 = sdfDateFormat.parse("2015年 01月 09日 星期六 12:02:26");
//        System.out.println(date1);
//    }

    public static void main(String[] args){
        //1、创建DatagramSocket;
        SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy年 MM月 dd日 EEE hh:mm:ss");
        Date date;
        try {
            date = sdfDateFormat.parse("2015年 01月 09日 星期六 12:02:26");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }
        System.out.println(date.getTime());
//        DatagramSocket socket = new DatagramSocket(7879);
//        System.out.println(socket.getReceiveBufferSize());
//        int i = 0;
//        while(!Thread.interrupted()) {
//            DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
//            try {
//                socket.receive(packet);
//                System.out.println(new String(packet.getData(), 0, packet.getLength()));
//                Thread.sleep(10);
//            } catch (Exception e) {
//            }
//        }
//
//        //4、关闭连接。
//        socket.close();
    }
}
