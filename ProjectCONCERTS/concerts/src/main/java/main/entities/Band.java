package main.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Band
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nameBand;

    private String bandMembers;

    private String imgBand;

    @OneToMany(mappedBy = "band", cascade = CascadeType.ALL)
    private List<Concerts> concertsList;


}
