package com.bytesprint.common.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * CollectionUtils
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public class CollectionUtils {
    public static boolean isEmpty(Collection<?> coll) {
        return coll == null || coll.isEmpty();
    }
    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length == 0;
    }
    public static <T> boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }
    public static boolean isNotEmpty(Collection<?> coll) {
        return !isEmpty(coll);
    }
    public static <T> boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }
    public static <T> boolean contains(Collection<T> coll, T value) {
        if (isEmpty(coll)) {
            return false;
        }
        if (value == null) {
            return false;
        }
        if (value instanceof String && StringUtils.isNullOrEmpty((String) value)) {
            return false;
        }
        return coll.contains(value);
    }
    /**
     * get first element of collection * * @param coll coll * @param <T>  T * @return first element
     */
    public static <T> T firstElement(Collection<T> coll) {
        if (coll == null || coll.isEmpty()) {
            return null;
        }
        return (T) coll.toArray()[0];
    }
    /**
     * get last element of collection * * @param coll coll * @param <T>  T * @return first element
     */
    public static <T> T lastElement(Collection<T> coll) {
        if (coll == null || coll.isEmpty()) {
            return null;
        }
        return (T) coll.toArray()[coll.size() - 1];
    }
    public static <T> T findFirst(Collection<T> coll, Predicate<? super T> predicate) {
        Collection<T> elements = findElements(coll, predicate);
        return firstElement(elements);
    }
    public static <T> Collection<T> findElements(Collection<T> coll, Predicate<? super T> predicate) {
        if (coll == null) {
            return null;
        }
        return coll.stream().filter(predicate).toList();
    }
    public static <T> Collection<T> emptyIfNull(Collection<T> collection) {
        return collection == null ? Collections.emptyList() : collection;
    }
    public static <T> List<T> union(Collection<T> list1, Collection<T> list2) {
        Collection<T> c1 = emptyIfNull(list1);
        Collection<T> c2 = emptyIfNull(list2);
        ArrayList<T> result = new ArrayList<>(c1.size() + c2.size());
        result.addAll(c1);
        result.addAll(c2);
        return result;
    }

}
