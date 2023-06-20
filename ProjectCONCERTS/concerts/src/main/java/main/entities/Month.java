package main.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Month
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date month;

    @OneToMany(mappedBy = "month", cascade = CascadeType.ALL)
    private List<Concerts> concertsList;
}
