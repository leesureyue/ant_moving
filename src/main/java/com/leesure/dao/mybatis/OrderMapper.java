package com.leesure.dao.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.leesure.dao.entity.Order;

@Mapper
public interface OrderMapper {
    int insert(@Param("pojo") Order pojo);

    int insertSelective(@Param("pojo") Order pojo);

    int insertList(@Param("pojos") List<Order> pojo);

    int update(@Param("pojo") Order pojo);
}
