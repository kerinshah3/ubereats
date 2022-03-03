package com.server.uber.eats.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

@Configuration
// @PropertySource("classpath:application.properties") properties are loaded property-placeholder defined spring context file
public class AtomikosJtaConfiguration {

//    @Bean
//    public UserTransaction userTransaction() throws Throwable {
//        UserTransactionImp userTransactionImp = new UserTransactionImp();
//        userTransactionImp.setTransactionTimeout(1000);
//        return userTransactionImp;
//    }
//
//    @Bean(initMethod = "init", destroyMethod = "close")
//    public TransactionManager transactionManager() throws Throwable {
//        UserTransactionManager userTransactionManager = new UserTransactionManager();
//        userTransactionManager.setForceShutdown(false);
//        return userTransactionManager;
//    }
}
