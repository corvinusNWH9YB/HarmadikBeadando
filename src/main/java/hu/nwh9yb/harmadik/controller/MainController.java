package hu.nwh9yb.harmadik.controller;

import hu.nwh9yb.harmadik.dto.SimpleResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;

@RestController
@RequestMapping("/harmadik")
public class MainController {
    @GetMapping("")
    public SimpleResponse udvozles(@RequestParam(required = false) String name){
        if(!StringUtils.hasText(name)){
            name = "Felhasznalo";
        }

        return new SimpleResponse(MessageFormat.format("Hello {0}!", name));
    }

    @PostMapping("/megfordit")
    public SimpleResponse megfordit(@RequestBody(required = false) String value){
        if(!StringUtils.hasText(value)){
            value = "Alma a fa alatt";
        }
        String reverseValue = new StringBuilder(value).reverse().toString();
        return new SimpleResponse(reverseValue);
    }
}
