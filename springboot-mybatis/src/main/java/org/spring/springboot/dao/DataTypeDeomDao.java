package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.DataTypeDemo;

/**
 * 城市 DAO 接口类
 * <p>
 * Created by bysocket on 07/02/2017.
 */
public interface DataTypeDeomDao {

    /**
     * @param dataTypeDemo
     */
    int insert(DataTypeDemo dataTypeDemo);
}
