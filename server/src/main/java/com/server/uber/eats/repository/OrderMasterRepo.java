package com.server.uber.eats.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class OrderMasterRepo extends JdbcDaoSupport {

    @Autowired
    DataSource dataSource;

//    @Autowired
//    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void setJdbcTemplate() {
       setDataSource(this.dataSource);
    }

    public void update(int orderId){
        String query ="update order_master set order_status ='ready not'  where order_id = ?";

        getJdbcTemplate().update(query,orderId);
    }

}
