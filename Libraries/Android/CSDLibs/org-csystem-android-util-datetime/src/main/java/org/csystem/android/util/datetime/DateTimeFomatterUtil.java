package org.csystem.android.util.datetime;
import java.time.format.DateTimeFormatter;

public class DateTimeFomatterUtil {

    private DateTimeFomatterUtil()
    {}

    public static final DateTimeFormatter DATE_TIME_FOMATTER_TR = DateTimeFormatter.ofPattern("dd/MM/yyyy  kk:mm:ss");
    public static final DateTimeFormatter DATE_FOMATTER_TR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

}
