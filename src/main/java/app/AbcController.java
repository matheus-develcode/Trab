package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.TwitterException;

@RestController
public class AbcController {
    @GetMapping("/abc")
    public Object greeting(
            @RequestParam(value = "name", defaultValue = "source:twitter4j yusukey") String name) throws TwitterException {
        return TwitterService.searchtweets(name);

    }
}
