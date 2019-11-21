package pl.kurkova.findProgrammingBuddy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.kurkova.findProgrammingBuddy.domain.KindOfTechnology;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TechnologyDto {
    private Long id;
    private String name;
    private KindOfTechnology kindOfTechnology;
}
