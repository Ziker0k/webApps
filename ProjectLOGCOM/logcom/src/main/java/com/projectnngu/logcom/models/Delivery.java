package com.projectnngu.logcom.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "delivery")
@Data
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="track_number")
    private String trackNumber;

    @Column(name="price_order")
    private Double priceOrder;

    @Column(name="time_expected")
    private Date timeExpected;

    @Column(name="time_delivery")
    private Date timeDelivery;

    @ManyToOne()
    private OrderDel orderDel;

    @ManyToOne()
    private Driver driver;


    public Delivery(String trackNumber,Double priceOrder, Date timeExpected, Date timeDelivery, OrderDel orderDel, Driver driver) {
        this.trackNumber = trackNumber;
        this.priceOrder = priceOrder;
        this.timeExpected = timeExpected;
        this.timeDelivery = timeDelivery;
        this.orderDel = orderDel;
        this.driver = driver;
    }

    public Delivery() {
    }
}
