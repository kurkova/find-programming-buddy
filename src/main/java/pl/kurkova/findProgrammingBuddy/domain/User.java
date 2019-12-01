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
@Entity
@Table (name = "users")
public class User {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "city")
    private String city;

    @Column(name = "levelOfProgramming")
    private String levelOfProgramming;

    @Column(name = "sizeOfTeam")
    private int sizeOfTeam;

    @OneToMany(
            targetEntity = Technology.class,
            mappedBy = "user",
            fetch = FetchType.EAGER
    )
    private List<Technology> technologiesKnown = new ArrayList<>();

    @OneToMany(
            targetEntity = Technology.class,
            mappedBy = "user",
            fetch = FetchType.EAGER
    )
    private List<Technology> technologiesToStudy = new ArrayList<>();

}
