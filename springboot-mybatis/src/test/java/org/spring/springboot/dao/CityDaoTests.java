package org.spring.springboot.dao;

import org.junit.Test;
import org.spring.springboot.base.BaseTest;
import org.spring.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;


public class CityDaoTests extends BaseTest {

    @Autowired
    CityDao dao;

    @Test
    public void testfindByName() {
        City city = dao.findByName("a");
        System.out.println(city);
    }
}
