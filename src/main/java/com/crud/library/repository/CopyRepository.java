package com.crud.library.repository;

import com.crud.library.domain.Book;
import com.crud.library.domain.CopyOfTheBook;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CopyRepository extends CrudRepository<CopyOfTheBook,Integer> {

    @Override
    CopyOfTheBook save(CopyOfTheBook copyOfTheBook);

    @Override
    Optional<CopyOfTheBook> findById(Integer id);

    List<CopyOfTheBook> findCopyOfTheBooksByBook_Id(Integer bookId);
}

