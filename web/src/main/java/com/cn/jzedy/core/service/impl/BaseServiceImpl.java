package com.cn.jzedy.core.service.impl;

import com.cn.jzedy.core.mapper.BaseRepository;
import com.cn.jzedy.core.service.BaseService;

/**
 * @auther Jzedy
 * @time 2018/7/21 23:30
 * @description
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    private BaseRepository<T> baseRepository;

    protected void setBaseRepository(BaseRepository<T> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public T findOne(String id) {
        return baseRepository.selectByPrimaryKey(id);
    }
}
