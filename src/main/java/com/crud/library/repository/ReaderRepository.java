package com.crud.library.repository;

import com.crud.library.domain.CopyOfTheBook;
import com.crud.library.domain.Reader;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ReaderRepository extends CrudRepository<Reader,Integer> {

    @Override
    Reader save(Reader reader);
    @Override
    Optional<Reader> findById (Integer id);
}
