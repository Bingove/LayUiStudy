package com.bingove.layui.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @author 崔兴伟
 * @date 2017/11/18.
 */
public interface MyMapper<T> extends Mapper<T> , MySqlMapper<T> {
    //特别注意，该接口不能被扫描到，否则会出错
}
