package com.spring.mvc.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.CacheControl;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.spring.mvc")
@PropertySource({ "classpath:application.properties" })
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    private Environment env;

    @Bean
    public DataSource myDataSource() {

        ComboPooledDataSource myDataSource = new ComboPooledDataSource();

        try {
            myDataSource.setDriverClass("org.postgresql.Driver");
        }
        catch (PropertyVetoException exc) {
            throw new RuntimeException(exc);
        }

        myDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
        myDataSource.setUser(env.getProperty("jdbc.user"));
        myDataSource.setPassword(env.getProperty("jdbc.password"));

        myDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
        myDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
        myDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
        myDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));

        return myDataSource;
    }

    private Properties getHibernateProperties() {

        Properties props = new Properties();

        props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
        props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));

        return props;
    }

    private int getIntProperty(String propName) {

        String propVal = env.getProperty(propName);
        int intPropVal = Integer.parseInt(propVal);

        return intPropVal;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(){

        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

        sessionFactory.setDataSource(myDataSource());
        sessionFactory.setPackagesToScan(env.getProperty("hibernate.packagesToScan"));
        sessionFactory.setHibernateProperties(getHibernateProperties());

        return sessionFactory;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(sessionFactory);
        return txManager;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/", "D:/statics/")
                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());

    }



    @Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/");
        bean.setSuffix(".jsp");
        return bean;
    }
    
}
