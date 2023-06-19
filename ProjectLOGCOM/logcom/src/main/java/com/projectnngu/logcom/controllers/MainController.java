package com.projectnngu.logcom.controllers;

import com.projectnngu.logcom.models.Delivery;
import com.projectnngu.logcom.models.Driver;
import com.projectnngu.logcom.models.OrderDel;
import com.projectnngu.logcom.models.enums.Busyness;
import com.projectnngu.logcom.repo.DeliveryRepository;
import com.projectnngu.logcom.repo.DriverRepository;
import com.projectnngu.logcom.repo.OrderDelRepository;
import com.projectnngu.logcom.services.DeliveryService;
import com.projectnngu.logcom.services.DriverService;
import com.projectnngu.logcom.services.OrderService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.sql.Time;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;

@Controller
@RequiredArgsConstructor

public class MainController {
    private final DeliveryService deliveryService;
    private final DriverService driverService;
    private final OrderService orderService;


    @Autowired
    private OrderDelRepository orderDelRepository;
    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private DeliveryRepository deliveryRepository;



    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Главная страница");
        return "index";
    }
    @GetMapping("/admin/admin")
    public String admin(Model model) {
        model.addAttribute("drivers", driverRepository.findAll());
        model.addAttribute("orderDels", orderDelRepository.findAll());
        model.addAttribute("delivery", deliveryRepository.findAll());
        model.addAttribute("flag", false);
        Busyness busyness = Busyness.NOTBUSY;
        model.addAttribute("busyness",busyness);
        String track1 = Long.toHexString(Double.doubleToLongBits(Math.random()));
        return "adminPanel";
    }

    @PostMapping("/admin/admin/reset")
    public String changeTimeDelivery(@RequestParam Long row, Model model) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY HH:mm:ss");
        String date = format.format(new java.util.Date());
        Date selectedDate = new SimpleDateFormat("DD-MM-YYYY HH:mm:ss").parse(date);
        deliveryService.setTimeDelivery(row,selectedDate);
        return "redirect:/admin/admin";
    }

    @PostMapping("/admin/admin/save")
    public String adminSave(@RequestParam double priceOrder, @RequestParam String timeExpected, @RequestParam Long orderId, @RequestParam Long driverId, Model model) throws ParseException {
        OrderDel orderDel = orderService.getOrderDelById(orderId);
        Driver driver = driverService.getDriverById(driverId);
        Date selectedDate = new SimpleDateFormat("DD-MM-YYYY HH:mm:ss").parse(timeExpected);




        Delivery delivery = new Delivery(orderDel.getTrackNumber(),priceOrder, selectedDate, null, orderDel,driver);
        deliveryRepository.save(delivery);
        return "redirect:/admin/admin";
    }

    @PostMapping("/create")
    public String orderDelAdd(@RequestParam String fullName, @RequestParam String phone, @RequestParam String addressSend, @RequestParam String addressDelivery,
                              @RequestParam double weight , Model model){
        String trackNumber = Long.toHexString(Double.doubleToLongBits(Math.random()));
        OrderDel orderDel = new OrderDel(trackNumber,fullName,addressSend,addressDelivery,weight,new java.util.Date(),phone,null);
        orderDelRepository.save(orderDel);
        model.addAttribute("greb",true);

        return "redirect:/order/" + orderDel.getId();
    }

}
