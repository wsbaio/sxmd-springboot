package com.sxmd.mybatistest.dao;

import com.sxmd.mapper.*;
import com.sxmd.mybatistest.entity.MyTestEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * Description: 测试
 *
 * @author cy
 * @date 2019年06月18日 17:50
 * Version 1.0
 */
@Mapper
public interface MyTestDao extends BaseSelectMapper<MyTestEntity>, BaseInsertMapper<MyTestEntity>, BaseUpdateMapper<MyTestEntity> , BaseDeleteMapper<MyTestEntity> , BaseExampleMapper<MyTestEntity> {

    public String getName(String id);
}
