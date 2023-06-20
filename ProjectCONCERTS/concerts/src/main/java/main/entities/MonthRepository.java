package main.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends CrudRepository<Month, Integer> {
}
