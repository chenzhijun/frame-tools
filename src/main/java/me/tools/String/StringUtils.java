package me.tools.String;

/**
 * 字符工具类
 *
 * @author chen
 * @version V1.0
 * @date 2017/8/1
 */
public class StringUtils {

    public static Boolean isEmpty(String str) {
        return null == str || str.length() <= 0 ? true : false;
    }
}
