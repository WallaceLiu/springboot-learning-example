package org.spring.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * 城市实体类
 * <p>
 * Created by bysocket on 07/02/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataTypeDemo {

    /**
     *
     */
    private Date d;

    /**
     *
     */
    private Time t;

    /**
     *
     */
    private String dt;

    /**
     *
     */
    private Timestamp ts;

}
