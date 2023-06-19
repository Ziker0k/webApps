package com.projectnngu.logcom.services;

import com.projectnngu.logcom.models.OrderDel;
import com.projectnngu.logcom.repo.OrderDelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService {
    private final OrderDelRepository orderDelRepository;

    //public List<OrderDel> listOrderDels (){
        //return orderDelRepository.findAll();
    //}

    public void saveOrder(OrderDel orderDel){
        log.info("Saving new {}", orderDel);
        orderDelRepository.save(orderDel);
    }

    public void deleteOrderDel(Long id){
        orderDelRepository.deleteById(id);
    }

    public OrderDel getOrderDelById(Long id){
        return orderDelRepository.findById(id).orElse(null);
    }
}
