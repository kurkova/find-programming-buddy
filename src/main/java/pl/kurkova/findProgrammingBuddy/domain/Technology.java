package pl.kurkova.findProgrammingBuddy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "technologies")
public class Technology {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "kindOfTechnology")
    @Enumerated(EnumType.STRING)
    private KindOfTechnology kindOfTechnology;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;
}
