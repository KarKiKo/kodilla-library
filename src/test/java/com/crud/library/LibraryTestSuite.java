package com.crud.library;

import com.crud.library.domain.Reader;
import com.crud.library.repository.BookRepository;
import com.crud.library.repository.CopyRepository;
import com.crud.library.repository.ReaderRepository;
import com.crud.library.repository.RentRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryTestSuite {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CopyRepository copyRepository;
    @Autowired
    ReaderRepository readerRepository;
    @Autowired
    RentRepository rentRepository;

    @Test
    public void addReaderToLibrary() {
        //Given
        Reader reader = new Reader("Jan", "Kowalski", "18-07-2018");
        //When
        readerRepository.save(reader);
        int id = reader.getId();
        Optional<Reader> readReader = readerRepository.findById(id);
        //Then
        Assert.assertEquals(readReader.get().getId(), id);
        //CleanUp
        readerRepository.delete(reader);
    }
/*
    @Test
    public void addBookToLibrary() {
        //Given
        //When
        //Then
        //CleanUp
    }

    @Test
    public void addCopyToLibrary() {
        //Given
        //When
        //Then
        //CleanUp
    }

    @Test
    public void addRentToLibrary() {
        //Given
        //When
        //Then
        //CleanUp
    }*/
}
