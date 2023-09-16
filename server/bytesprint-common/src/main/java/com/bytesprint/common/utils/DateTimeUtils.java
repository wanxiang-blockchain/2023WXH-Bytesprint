package com.bytesprint.common.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeUtils
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public class DateTimeUtils {
    /**
     * Standard format: yyyy-MM-dd HH:mm:ss
     */
    public static String standardFormat(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
