package com.projectnngu.logcom.controllers;

import com.projectnngu.logcom.models.Delivery;
import com.projectnngu.logcom.models.OrderDel;
import com.projectnngu.logcom.repo.OrderDelRepository;
import com.projectnngu.logcom.services.DeliveryService;
import com.projectnngu.logcom.services.DriverService;
import com.projectnngu.logcom.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final DeliveryService deliveryService;

    @Autowired
    private OrderDelRepository orderDelRepository;

    @GetMapping("/order/{id}")
    public String home(@PathVariable Long id, Model model) {
        model.addAttribute("order",orderService.getOrderDelById(id));
        return "order";
    }

    @GetMapping("/order/add")
    public String orderAdd(Model model) {
        return "order-add";
    }

    @GetMapping("/order")
    public String tracking(@RequestParam String tracking, Model model){

        model.addAttribute("delivery", deliveryService.getDeliveryByTrackNumber(tracking));
        return "order-info";
    }



}
