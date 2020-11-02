package hnewey.fullstack.service;

import hnewey.fullstack.model.TestResponse;
import hnewey.fullstack.model.UserInput;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private static final String returnValue = "Hello World";

    public TestResponse test() {
        return new TestResponse(returnValue);
    }

    public TestResponse testInput(UserInput input) {
        //do whatever you want with the input (save to db, manipulate and return, etc)
        return new TestResponse(returnValue + "-" + input.getMessage());
    }
}
