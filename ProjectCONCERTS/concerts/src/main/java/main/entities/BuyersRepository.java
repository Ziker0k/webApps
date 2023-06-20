package main.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyersRepository extends CrudRepository<Buyers, Iterable> {
}
