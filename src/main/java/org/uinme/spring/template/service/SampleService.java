package org.uinme.spring.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uinme.spring.template.component.SampleComponent;

@Service
public class SampleService {
    @Autowired
    private SampleComponent sampleConComponent;
    
    public void execute() {
        System.out.println("This is sample service.");
        
        sampleConComponent.execute();
    }
}
