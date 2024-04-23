package edu.iu.habahram.ducksservice.repository;

import edu.iu.habahram.ducksservice.model.Customer;
import edu.iu.habahram.ducksservice.model.DuckTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DucksRepositoryDB extends CrudRepository<DuckTable, Integer> {
}
