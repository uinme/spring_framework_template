package org.uinme.spring.template;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uinme.spring.template.service.SampleService;

@Service
public class Main {
    Log log = LogFactory.getLog(getClass());
    
    @Autowired
    private SampleService sampleService;
    
    public void run(String[] args) {
        log.info("Run sample service");
        sampleService.execute();
    }
}
