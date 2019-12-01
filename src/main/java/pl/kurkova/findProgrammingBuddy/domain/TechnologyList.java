package pl.kurkova.findProgrammingBuddy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "technologyList")
public class TechnologyList {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ListName")
    private String ListName;

        @OneToMany(
            targetEntity = Technology.class,
            mappedBy = "technologyList",
            fetch = FetchType.EAGER
    )
    private List<Technology> technologyList = new ArrayList<>();

}
