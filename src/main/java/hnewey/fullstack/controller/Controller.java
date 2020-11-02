package hnewey.fullstack.controller;

import hnewey.fullstack.model.TestResponse;
import hnewey.fullstack.model.UserInput;
import hnewey.fullstack.service.TestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controller {

    private TestService testService;

    public Controller(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/testGet")
    public TestResponse testGetEndpoint() {
        return testService.test();
    }

    @PostMapping("/testPost")
    public TestResponse testPostEndpoint(@RequestBody UserInput input) {
        return testService.testInput(input);
    }
}
