package pl.kurkova.findProgrammingBuddy.mapper;

import org.springframework.stereotype.Component;
import pl.kurkova.findProgrammingBuddy.domain.Technology;
import pl.kurkova.findProgrammingBuddy.dto.TechnologyDto;

@Component
public class TechnologyMapper {

    public Technology mapToTechnology(final TechnologyDto technologyDto){
        return new Technology(
                technologyDto.getId(),
                technologyDto.getName(),
                technologyDto.getKindOfTechnology(),
                technologyDto.getUser()
        );
    }

    public TechnologyDto mapToTechnologyDto (final Technology technology){
        return new TechnologyDto(
                technology.getId(),
                technology.getName(),
                technology.getKindOfTechnology(),
                technology.getUser()
        );
    }

}
