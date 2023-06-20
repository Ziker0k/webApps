package main.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Concerts
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int price;
    private int countSit;

    @ManyToOne(fetch = FetchType.LAZY)
    private Band band;

    @ManyToOne(fetch = FetchType.LAZY)
    private Month month;

    @ManyToOne(fetch = FetchType.LAZY)
    private Adress adress;

    @ManyToOne(fetch = FetchType.LAZY)
    private Genare genare;




}
