package com.crud.library.controller;

import com.crud.library.domain.*;
import com.crud.library.mapper.LibraryMapper;
import com.crud.library.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    DbService dbService;
    @Autowired
    LibraryMapper libraryMapper;

    @RequestMapping(method = RequestMethod.POST, value ="/newReader", consumes = APPLICATION_JSON_VALUE)
    public void createReader(@RequestBody ReaderDto readerDto){
        dbService.saveReader(libraryMapper.mapToReader(readerDto));
    }
    @RequestMapping(method = RequestMethod.POST, value = "/newBook", consumes = APPLICATION_JSON_VALUE)
    public void createBook(@RequestBody BookDto bookDto){
        dbService.saveBook(libraryMapper.mapToBook(bookDto));
    }
    @RequestMapping(method = RequestMethod.POST, value = "/newCopy", consumes = APPLICATION_JSON_VALUE)
    public void createCopyOfTheBook(@RequestBody CopyOfTheBookDto copyOfTheBookDto){
        dbService.saveCopy(libraryMapper.mapToCopy(copyOfTheBookDto));
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/updateStatus")
    public CopyOfTheBookDto updateStatusOfCopyOfTheBook(@RequestBody CopyOfTheBookDto copyOfTheBookDto){
        return libraryMapper.mapToCopyDto(dbService.saveCopy(libraryMapper.mapToCopy(copyOfTheBookDto)));
    }
    @RequestMapping(method = RequestMethod.GET, value = "/getBooks")
    public List<BookDto> getAllBooksOfTheLibrary(){
        return libraryMapper.mapToBookDtoList(dbService.getAllBooks());
    }
    @RequestMapping(method = RequestMethod.GET, value = "/getCopies/{bookID}")
    public List<CopyOfTheBookDto> getAllAvailableCopiesOfTheBook (@PathVariable Integer bookID){
        return libraryMapper.mapToCopyDtoList(dbService.getAllCopiesOfTheBook(bookID));
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/returnCopy")
    public RentDto returnCopyOfTheBook (@RequestParam Integer rentID, @RequestParam Date date) throws  TaskNotFoundException{
        return libraryMapper.mapToRentDto(dbService.getRent(rentID).orElseThrow(TaskNotFoundException::new));
    }
    @RequestMapping(method = RequestMethod.POST, value = "/borrowCopy")
    public void borrowCopyOfTheBook (@RequestBody RentDto rentDto){
       dbService.saveRent(libraryMapper.mapToRent(rentDto));
    }
}
