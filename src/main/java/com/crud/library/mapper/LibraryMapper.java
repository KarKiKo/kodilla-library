package com.crud.library.mapper;

import com.crud.library.domain.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibraryMapper {

    public Reader mapToReader (final ReaderDto readerDto){
        return new Reader(
                //readerDto.getId(),
                readerDto.getName(),
                readerDto.getSurname(),
                readerDto.getAccountCreation()
        );
    }

    public Book mapToBook (final BookDto bookDto){
        return new Book(
                //bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getIssueYear()
/*                bookDto.getCopiesOfBook().stream()
                    .map(b -> new CopyOfTheBook(b.getId(),b.getBook(),b.getStatus()))
                    .collect(Collectors.toList())*/
        );
    }

    public BookDto mapToBookDto (final Book book){
        return new BookDto(
                //book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getIssueYear()
/*                book.getCopiesOfBook().stream()
                    .map(b -> new CopyOfTheBookDto(b.getId(), b.getBook(),b.getStatus()))
                    .collect(Collectors.toList())*/
        );
    }

    public CopyOfTheBook mapToCopy (final CopyOfTheBookDto copyOfTheBookDto){
        return new CopyOfTheBook(
                //copyOfTheBookDto.getId(),
                //copyOfTheBookDto.getBook(),
                copyOfTheBookDto.getStatus()
        );
    }

    public List<CopyOfTheBookDto> mapToCopyDtoList (final List<CopyOfTheBook> copyOfTheBookList){
        return copyOfTheBookList.stream()
            .map(c-> new CopyOfTheBookDto(
                    //c.getId(),
                    //c.getBook(),
                    c.getStatus()
            ))
            .collect(Collectors.toList());
    }

    public CopyOfTheBookDto mapToCopyDto (final CopyOfTheBook copyOfTheBook) {
        return new CopyOfTheBookDto(
                //copyOfTheBook.getId(),
                //copyOfTheBook.getBook(),
                copyOfTheBook.getStatus()
        );
    }

    public List<BookDto> mapToBookDtoList (final List<Book> bookList){
        return bookList.stream()
                .map(b-> new BookDto(
                       // b.getId(),
                        b.getTitle(),
                        b.getAuthor(),
                        b.getIssueYear()
/*                        b.getCopiesOfBook().stream()
                                .map(t -> new CopyOfTheBookDto(t.getId(), t.getBook(),t.getStatus()))
                                .collect(Collectors.toList())*/
                ))
                .collect(Collectors.toList());
    }

    public Rent mapToRent (final RentDto rentDto) {
        return new Rent(
                //rentDto.getId(),
                //rentDto.getCopyOfTheBook(),
                //rentDto.getReader(),
                rentDto.getRentDate(),
                rentDto.getReturnDate()
        );
    }

    public RentDto mapToRentDto (final Rent rent) {
        return new RentDto(
                //rent.getId(),
                //rent.getCopyOfTheBook(),
                //rent.getReader(),
                rent.getRentDate(),
                rent.getReturnDate()
        );
    }
}
