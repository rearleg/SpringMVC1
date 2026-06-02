package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String LogTest() {
        String name = "Spring";

        log.trace("trace log={}, {}", name, "바보다 보다야!!");
        log.debug("debug log={}", name);
        log.info("debug log={}", name);
        log.warn("debug log={}", name);
        log.error("debug log={}", name);
        log.info(" info log={}", name);

        return null;
    }
}
