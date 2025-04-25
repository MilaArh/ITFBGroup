package com.example.demoInnChecker;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InnCheckerController {
    private final InnChecker innChecker;

    public InnCheckerController(InnChecker innChecker){
        this.innChecker = innChecker;

    }

    @PostMapping
    public String checkInn(@RequestBody Inn innStr){

        return innChecker.checkInn(innStr);

    }
}
