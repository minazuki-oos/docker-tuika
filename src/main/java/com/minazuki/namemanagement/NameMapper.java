package com.minazuki.namemanagement;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;




@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();
}

