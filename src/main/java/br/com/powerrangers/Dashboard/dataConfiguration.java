/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.powerrangers.Dashboard;


import javax.activation.DataSource;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 *
 * @author vinic
 */
@Configuration
public class dataConfiguration {
   @Bean
   public DataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("com.mysql.jdbc.driver");
       dataSource.setUrl("jdbc:mysql://localhost:3306/dashboard?autoReconnect=true&useSSL=false");
       dataSource.setUsername("root");
       dataSource.setPassword("toor");
       return dataSource();
   }
   
   @Bean
   public JpaVendorAdapter vendorAdapter(){
       HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
       adapter.setDatabase(Database.MYSQL);
       adapter.setGenerateDdl(true);
       adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
   return adapter;
   }
   
   
}
