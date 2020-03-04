package com.cy.example.springboot.common.utils;

/**
 * <p>数组操作工具类</p>
 *
 * @author : cy
 */

public class ArrayUtil {

    public static Object[] fillArr(Object[] arr, Object obj) {
        int anchor = 0;
        int anchorNotNull = 0;
        Object[] tmp = new Object[arr.length];
        for (int i = 0; i < tmp.length; i++) {
            boolean notNull = false;
            for (int j = anchor; j < arr.length; j++) {
                anchor = j + 1;
                if (null != arr[j]) {
                    tmp[i] = arr[j];
                    notNull = true;
                    break;
                }
            }
            if (notNull) {
                anchorNotNull ++;
                continue;
            }
        }
        if (anchorNotNull < tmp.length) {
            tmp[anchorNotNull] = obj;
            return tmp;
        } else {
            Object[] result = new Object[tmp.length + 1];

            for (int i = 0; i < tmp.length; i++) {
                result[i] = tmp[i];
            }

            result[result.length - 1] = obj;
            return result;
        }
    }

    public static String[] fillArrCa(String[] arr, Object obj) {
        int anchor = 0;
        int anchorNotNull = 0;
        String[] tmp = new String[arr.length];
        for (int i = 0; i < tmp.length; i++) {
            boolean notNull = false;
            for (int j = anchor; j < arr.length; j++) {
                anchor = j + 1;
                if (null != arr[j]) {
                    tmp[i] = arr[j];
                    notNull = true;
                    break;
                }
            }
            if (notNull) {
                anchorNotNull ++;
                continue;
            }
        }
        if (anchorNotNull < tmp.length) {
            tmp[anchorNotNull] = String.valueOf(obj);
            return tmp;
        } else {
            String[] result = new String[(int)Math.ceil(tmp.length * 1.5)];

            for (int i = 0; i < tmp.length; i++) {
                result[i] = tmp[i];
            }

            result[anchorNotNull] = String.valueOf(obj);
            return result;
        }
    }

}
