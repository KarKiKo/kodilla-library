package com.crud.library.repository;

import com.crud.library.domain.Reader;
import com.crud.library.domain.Rent;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RentRepository extends CrudRepository<Rent,Integer> {

    @Override
    Rent save(Rent rent);
    @Override
    Optional<Rent> findById (Integer id);
}
