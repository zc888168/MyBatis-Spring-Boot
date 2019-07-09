package tk.mybatis.springboot.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(MyCondition.class)
public class ConditionConfig { 

@Bean
public ConditionBean conditionBean(){ 
return new ConditionBean(); 
} 

} 