package main.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Adress
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String adress;

    @OneToMany(mappedBy = "adress", cascade = CascadeType.ALL)
    private List<Concerts> concertsLits;

}
