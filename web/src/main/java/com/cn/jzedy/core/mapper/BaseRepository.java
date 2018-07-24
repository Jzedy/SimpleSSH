package com.cn.jzedy.core.mapper;

/**
 * @auther Jzedy
 * @time 2018/7/21 23:26
 * @description
 */
public interface BaseRepository<T> {
    T selectByPrimaryKey(String id);
}
