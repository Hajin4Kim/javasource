package api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        // 날짜 ,시간 : Calendar (옛날)

        Date d = new Date();
        System.out.println(d); // Fri Aug 30 16:13:10 KST 2024

        // 원하는 포멧으로 날짜를 분리
        // Date ==> SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(d));

        // 월: M , 분 : m (무조건)
        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss"); // TODO: a 는 am pm 의 am 이다.
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(d));

        // TODO: D는 1년 중 몇번째 날
        sdf = new SimpleDateFormat("오늘은 D번째 날");
        System.out.println(sdf.format(d));

        // TODO: d 는 한 달 안의 몇번째 날
        sdf = new SimpleDateFormat("오늘은 d번째 날");
        System.out.println(sdf.format(d));

        // LocalDate / LocalTime
        // LocalDateTime
            // 생성자 X , 메소드만 있음
        LocalDate today = LocalDate.now(); 
        LocalTime now = LocalTime.now(); 
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(today); // 2024-08-30
        System.out.println(now); // 16:40:44.006306800
        System.out.println(localDateTime); // 2024-08-30T16:40:44.006306800

        System.out.println("year " + today.getYear());
        System.out.println("year " + today.getMonthValue());
        System.out.println("year " + today.getDayOfMonth());

        System.out.println("시 : " + now.getHour());
        System.out.println("분 : " + now.getMinute());
        System.out.println("초 : " + now.getSecond());

        // 날짜 연산 가능
        System.out.println(today.plusDays(15));
        System.out.println(today.minusMonths(3));







    }
}
