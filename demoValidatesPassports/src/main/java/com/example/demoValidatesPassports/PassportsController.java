package com.example.demoValidatesPassports;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassportsController {

    private final PassportsService passportsService;

    public PassportsController(PassportsService passportsService){
        this.passportsService = passportsService;

    }

    @PostMapping
    public Valid validatesPassports(@RequestBody Passports passport){

        return passportsService.validatesPassports(passport);

    }

}
