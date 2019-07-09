package tk.mybatis.springboot.annotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Circle.class})
@Configuration
public class MainConfig { 

} 