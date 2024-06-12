package fundamentals;

import util.TutorialUtil;

import java.time.*;

public class DealingWithTime {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        // 1718066969000
        Instant customTimestamp = Instant.ofEpochMilli(1718066969000L);
        System.out.println(customTimestamp);

        TutorialUtil.line();

        // now() -> Read from server timezone
        OffsetDateTime nowUtc = OffsetDateTime.now(ZoneId.of("UTC"));
        System.out.println(nowUtc);
        OffsetDateTime nowTokyo = OffsetDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(nowTokyo);
        OffsetDateTime customFromInstant = OffsetDateTime.ofInstant(
                Instant.ofEpochMilli(1718066969000L), ZoneId.of("Asia/Tokyo")
        );
        System.out.println(customFromInstant);

        TutorialUtil.line();

        ZonedDateTime nowUtcZonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(nowUtcZonedDateTime);
        ZonedDateTime nowTokyoZonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(nowTokyoZonedDateTime);
        ZonedDateTime customFromInstantZonedDateTime = ZonedDateTime.ofInstant(
                Instant.ofEpochMilli(1718066969000L), ZoneId.of("Asia/Tokyo")
        );
        System.out.println(customFromInstantZonedDateTime);

        TutorialUtil.line();

        LocalDateTime localDateTime = LocalDateTime.now();
        // It can split to date or time
        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
    }
}
