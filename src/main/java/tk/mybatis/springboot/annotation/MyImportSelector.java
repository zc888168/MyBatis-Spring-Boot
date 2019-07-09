package tk.mybatis.springboot.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

@Override 
public String[] selectImports(AnnotationMetadata annotationMetadata) {
return new String[]{"tk.mybatis.springboot.annotation.Triangle"};
} 

} 