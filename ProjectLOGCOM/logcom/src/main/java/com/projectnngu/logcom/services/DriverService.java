package com.projectnngu.logcom.services;

import com.projectnngu.logcom.models.Driver;
import com.projectnngu.logcom.models.OrderDel;
import com.projectnngu.logcom.repo.DriverRepository;
import com.projectnngu.logcom.repo.OrderDelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepository driverRepository;

    //public List<OrderDel> listOrderDels (){
    //return orderDelRepository.findAll();
    //}

    public void saveDriver(Driver driver){
        log.info("Saving new {}", driver);
        driverRepository.save(driver);
    }

    public void deleteDriver(Long id){
        driverRepository.deleteById(id);
    }

    public Driver getDriverById(Long id){
        return driverRepository.findById(id).orElse(null);
    }
}
