package com.server.uber.eats.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

//@EnableTransactionManagement
@Configuration
//@ComponentScan(value = "io.reactivestax")
public class TransactionConfiguration {
//
//
//    @Bean
//    public PlatformTransactionManager platformTransactionManager(@Autowired UserTransaction userTransaction,
//                                                                 @Autowired TransactionManager transactionManager) {
//        // datasource
//        // jms
//        // jpa
//        return new JtaTransactionManager(userTransaction, transactionManager);
//    }
}
