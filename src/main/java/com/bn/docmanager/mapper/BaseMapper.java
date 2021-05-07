package com.bn.docmanager.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author wty
 * @date 2020/11/29 14:49
 */
public interface BaseMapper <T> extends Mapper<T>, MySqlMapper<T> {
}
