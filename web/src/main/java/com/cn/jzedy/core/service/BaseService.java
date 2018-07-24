package com.cn.jzedy.core.service;

/**
 * @auther Jzedy
 * @time 2018/7/21 23:29
 * @description
 */
public interface BaseService<T> {
    T findOne(String id);
}
