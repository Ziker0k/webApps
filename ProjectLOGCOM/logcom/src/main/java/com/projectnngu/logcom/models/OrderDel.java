package com.projectnngu.logcom.models;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderDel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "track_number")
    private String trackNumber;

    @Column(name = "name_customer")
    private String fullnameCustomer;

    @Column(name = "adress_sending")
    private String adressSending;

    @Column(name = "adress_delivery")
    private String adressDelivery;

    @Column(name = "weight_order")
    private double weightOrder;

    @Column(name = "time_order")
    private java.util.Date timeOrder;

    @Column(name = "number_customer")
    private String numberCustomer;

    @Column(name = "execution_stage")
    private String executionStage;

    @OneToMany(mappedBy = "orderDel")
    private Collection<Delivery> delivery;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getFullnameCustomer() {
        return fullnameCustomer;
    }

    public void setFullnameCustomer(String fullnameCustomer) {
        this.fullnameCustomer = fullnameCustomer;
    }

    public String getAdressSending() {
        return adressSending;
    }

    public void setAdressSending(String adressSending) {
        this.adressSending = adressSending;
    }

    public String getAdressDelivery() {
        return adressDelivery;
    }

    public void setAdressDelivery(String adressDelivery) {
        this.adressDelivery = adressDelivery;
    }

    public double getWeightOrder() {
        return weightOrder;
    }

    public void setWeightOrder(double weightOrder) {
        this.weightOrder = weightOrder;
    }

    public java.util.Date getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(java.util.Date timeOrder) {
        this.timeOrder = timeOrder;
    }

    public String  getNumberCustomer() {
        return numberCustomer;
    }

    public void setNumberCustomer(String numberCustomer) {
        this.numberCustomer = numberCustomer;
    }

    public String getExecutionStage() {
        return executionStage;
    }

    public void setExecutionStage(String executionStage) {
        this.executionStage = executionStage;
    }

    public OrderDel() {
    }

    public OrderDel(String trackNumber,String fullnameCustomer, String adressSending, String adressDelivery, double weightOrder, java.util.Date timeOrder, String numberCustomer, String executionStage) {
        this.trackNumber = trackNumber;
        this.fullnameCustomer = fullnameCustomer;
        this.adressSending = adressSending;
        this.adressDelivery = adressDelivery;
        this.weightOrder = weightOrder;
        this.timeOrder = timeOrder;
        this.numberCustomer = numberCustomer;
        this.executionStage = executionStage;
    }
}
