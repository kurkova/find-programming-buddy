package pl.kurkova.findProgrammingBuddy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.kurkova.findProgrammingBuddy.domain.Technology;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String userName;
    private String city;
    private String levelOfProgramming;
    private int sizeOfTeam;
    private List<Technology> technologiesKnown;
    private List<Technology> technologiesToStudy;
}
