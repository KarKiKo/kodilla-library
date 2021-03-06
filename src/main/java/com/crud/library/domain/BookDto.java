package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class BookDto {

    private int id;
    private String title;
    private String author;
    private int issueYear;
    private List<CopyOfTheBookDto> copiesOfBook;

    public BookDto(String title, String author, int issueYear) {
        this.title = title;
        this.author = author;
        this.issueYear = issueYear;
    }
}
