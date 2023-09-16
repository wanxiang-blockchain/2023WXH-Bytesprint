package com.bytesprint.common.utils;

/**
 * NumberUtils
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public class NumberUtils {
    public static int parseInt(String str, int defaultValue) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
