package com.projectnngu.logcom.models;

import com.projectnngu.logcom.models.enums.Busyness;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.sql.Blob;
import java.util.Collection;

@Entity
@Table(name = "drivers")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="fullname")
    private String fullName;

    @Column(name="info")
    private String info;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="busyness")
    @Enumerated(EnumType.STRING)
    private Busyness busyness;

    @OneToMany(mappedBy = "driver")
    private Collection<Delivery> delivery;


}
