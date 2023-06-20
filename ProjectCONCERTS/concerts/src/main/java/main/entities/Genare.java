package main.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Genare
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String genare;

    @OneToMany(mappedBy = "genare", cascade = CascadeType.ALL)
    List<Concerts> concertsList;

}
