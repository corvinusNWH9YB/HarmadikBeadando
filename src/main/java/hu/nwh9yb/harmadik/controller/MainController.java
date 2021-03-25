package hu.nwh9yb.harmadik.controller;

import hu.nwh9yb.harmadik.dto.SimpleResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
public class MainController {
    @GetMapping("/harmadik")
    public SimpleResponse udvozles(@RequestParam(required = false) String name){
        if(!StringUtils.hasText(name)){
            name = "Felhasznalo";
        }

        return new SimpleResponse(MessageFormat.format("Hello {0}!", name));
    }
}
