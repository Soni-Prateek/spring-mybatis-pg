package com.baeldung.mybatis.spring;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

@Mapper
public interface BlifMapper {
    @Select("SELECT * FROM dlms.blif_error")
    Collection<BlifError> getData();
}
