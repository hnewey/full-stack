package hnewey.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TestResponse {
    //this object is returned by Controller.java to illustrate java object marshalling
    private String value;
}
