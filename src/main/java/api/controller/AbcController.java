package api.controller;

import java.util.concurrent.atomic.AtomicLong;

import common.pojo.AbcPojo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbcController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/abc")
    public AbcPojo greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new AbcPojo(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
