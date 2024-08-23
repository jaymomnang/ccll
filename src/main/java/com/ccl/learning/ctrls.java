package com.ccl.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ctrls {

    @GetMapping("/")
    public String api(){
       return "Merry Christmas! Ho Ho Ho";
    }

}
