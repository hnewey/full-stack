package hnewey.fullstack.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//the annotation below tells spring to ignore fields passed from the front end that don't correspond to any fields in this class
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInput {
    //more fields can be added here to correspond with other data being passed from the front end
    private String message;
}
