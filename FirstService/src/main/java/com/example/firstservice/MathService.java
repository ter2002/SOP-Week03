package com.example.firstservice;

import org.springframework.web.bind.annotation.*;
@RestController
public class MathService {
    @RequestMapping (value = "/add/{value1}/{value2}", method = RequestMethod.GET)
    public String add(@PathVariable("value1") double value1,
                       @PathVariable ("value2") double value2){
        return value1+value2+"";
    }

    @RequestMapping (value = "/minus/{value1}/{value2}", method = RequestMethod.GET)
    public
    String minus(@PathVariable("value1") double value1,
                 @PathVariable ("value2") double value2){
        return value1-value2+"";
    }

    @RequestMapping (value = "/multiply", method = RequestMethod.GET)
    public
    String multiply(@RequestParam("value1") double value1,
                    @RequestParam("value2") double value2){
        return value1*value2+"";
    }
    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public String divide(@RequestParam("value1") double value1,
                         @RequestParam("value2" ) double value2){
        return  value1/value2+"";
    }

}
