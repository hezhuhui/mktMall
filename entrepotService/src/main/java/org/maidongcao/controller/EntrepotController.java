package org.maidongcao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EntrepotController {

    @GetMapping("/entrepot/{string}")
    public String echo(@PathVariable String string) {
        log.info("Hello Nacos Discovery: {}", string);
        return "Hello Nacos Discovery " + string;
    }
}
