package com.crud.library.service;

import com.crud.library.domain.Book;
import com.crud.library.domain.CopyOfTheBook;
import com.crud.library.domain.Reader;
import com.crud.library.domain.Rent;
import com.crud.library.repository.BookRepository;
import com.crud.library.repository.CopyRepository;
import com.crud.library.repository.ReaderRepository;
import com.crud.library.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    ReaderRepository readerRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CopyRepository copyRepository;
    @Autowired
    RentRepository rentRepository;

    public Reader saveReader(Reader reader){
        return readerRepository.save(reader);
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public CopyOfTheBook saveCopy(CopyOfTheBook copyOfTheBook){
        return copyRepository.save(copyOfTheBook);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBook(final Integer id){
        return bookRepository.findById(id);
    }

    public Rent saveRent(Rent rent){
        return rentRepository.save(rent);
    }

    public Optional<CopyOfTheBook> getCopy(final Integer id){
        return copyRepository.findById(id);
    }

    public Optional<Reader> getReader(final Integer id){
        return readerRepository.findById(id);
    }

    public Optional<Rent> getRent(final Integer id){
        return rentRepository.findById(id);
    }

    public List<CopyOfTheBook> getAllCopiesOfTheBook(final int id){
        return copyRepository.findCopyOfTheBooksByBook_Id(id);
    }
}
