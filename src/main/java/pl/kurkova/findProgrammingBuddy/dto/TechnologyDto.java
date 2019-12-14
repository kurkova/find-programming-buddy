package pl.kurkova.findProgrammingBuddy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kurkova.findProgrammingBuddy.domain.KindOfTechnology;
import pl.kurkova.findProgrammingBuddy.domain.User;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TechnologyDto {
    private Long id;
    private String name;
    private KindOfTechnology kindOfTechnology;
    private User user;
}
