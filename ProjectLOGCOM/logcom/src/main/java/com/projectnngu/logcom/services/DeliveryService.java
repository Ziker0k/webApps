package com.projectnngu.logcom.services;

import com.projectnngu.logcom.models.Delivery;
import com.projectnngu.logcom.models.Driver;
import com.projectnngu.logcom.models.OrderDel;
import com.projectnngu.logcom.repo.DeliveryRepository;
import com.projectnngu.logcom.repo.DriverRepository;
import com.projectnngu.logcom.repo.OrderDelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class DeliveryService {
        private final OrderDelRepository orderDelRepository;
        private final DeliveryRepository deliveryRepository;
        private final DriverRepository driverRepository;

        //public List<OrderDel> listOrderDels (){
        //return orderDelRepository.findAll();
        //}

        public void saveDelivery(Delivery delivery, Driver driver, OrderDel orderDel){
            log.info("Saving new {}", delivery);
            deliveryRepository.save(delivery);
        }

        public void deleteOrderDel(Long id){
            orderDelRepository.deleteById(id);
        }

        public void setTimeDelivery(Long id, Date date){
            Delivery delivery = deliveryRepository.findById(id).orElse(null);
            if(!delivery.equals(null)) {
                delivery.setTimeDelivery(date);
                deliveryRepository.save(delivery);
            }
        }

        public Delivery getDeliveryByTrackNumber(String trackNumber) {
            for(Delivery delivery : deliveryRepository.findAll()) {
                if (delivery.getTrackNumber().equals(trackNumber)) return delivery;
            }
            return null;
        }


        public Delivery getDeliveryById(Long id){
            return deliveryRepository.findById(id).orElse(null);
        }
}
