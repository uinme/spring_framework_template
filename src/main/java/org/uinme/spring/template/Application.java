package org.uinme.spring.template;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.ClassUtils;
import org.uinme.spring.template.service.SampleService;

public class Application {
    @Autowired
    private SampleService sampleService;
    
    Log log = LogFactory.getLog(Application.class);
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Application.class);
        ctx.scan(ClassUtils.getPackageName(Application.class));
        ctx.refresh();
        Application app = ctx.getBean(Application.class);
        app.run(args);
    }
    
    public void run(String...args) {
        log.info("Start sample service");
        sampleService.execute();
    }
}
