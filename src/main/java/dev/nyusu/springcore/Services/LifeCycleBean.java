package dev.nyusu.springcore.Services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import dev.nyusu.springcore.Controller.MainController;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycleBean  implements InitializingBean, DisposableBean, BeanNameAware,
BeanFactoryAware, ApplicationContextAware, BeanPostProcessor{

    private String javaVersion;



    public LifeCycleBean() {
        System.out.println("In the Bean Life Cycle Empty Constructor");
    }


    
    public String getJavaVersion() {
        return javaVersion;
    }

    @Value("${java.specification.version}")
    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
        System.out.println("## 1 Properties Set. Java Version: " + this.javaVersion);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 2 BeanNameAware My Bean Name is : " + name);
            
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3 BeanFactoryAware = Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4 ApplicationContextAware - Application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## 5 postConstruct - The Post Construct annotated method has been called.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6 afterPropertiesSet - Populate Properties - The LifeCycleBean has its properties set");
    }

    @PreDestroy
    public void PreDestroy(){
        System.out.println("## 7 the @PreDestroy annothed method has been called");
    }


    @Override
    public void destroy() throws Exception {
      System.out.println("## 8 DisposableBean.destroy - The LIfecycle Bean has been terminated");
    }

    @Override
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
       System.out.println("## postProcessBeforeInitialization: " + beanName);

       if (bean instanceof MainController){
        MainController controller = (MainController) bean;
        System.out.println("Calling before init");
        controller.beforeInit();
       }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }


    @Override
    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## postProcessAfterInitialization: " + beanName);

        if (bean instanceof LifeCycleBean){
            LifeCycleBean bean17 = (LifeCycleBean) bean;
            System.out.println("Calling before init");
            bean17.beforeInit();
           }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }


    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }


    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }


  
    
    
}
