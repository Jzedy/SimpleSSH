package com.cn.jzedy;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @auther Jzedy
 * @time 2018/7/19 23:12
 * @description
 */
public class SelfTeset {
    @Test
    public void test1() throws IllegalAccessException {
        NoSetClass noSetClass = new NoSetClass();
        Class<?> clazz = noSetClass.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if (Modifier.isFinal(mod) || Modifier.isStatic(mod)) continue;
            field.setAccessible(true);
            field.set(noSetClass,"jzedy");
        }
        System.out.println(JSONObject.toJSONString(noSetClass));
    }

    class NoSetClass{
        public String name;
    }
}
