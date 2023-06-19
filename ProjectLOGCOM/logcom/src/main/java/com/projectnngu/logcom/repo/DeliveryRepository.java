package com.projectnngu.logcom.repo;

import com.projectnngu.logcom.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepository extends CrudRepository<Delivery,Long> {
}
