package tk.mybatis.springboot.service.impl;

import com.google.common.collect.Maps;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<String , Class> handlerMap = Maps.newHashMapWithExpectedSize(3);
        //获取class
        //HandlerProcessor context = new HandlerProcessor(handlerMap);
        //beanFactory.registerSingleton(HandlerProcessor.class.getName(), context);
    }
}
