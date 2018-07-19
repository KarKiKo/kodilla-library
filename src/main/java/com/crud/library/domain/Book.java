package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "BOOKS")
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String title;
    @Column
    private String author;
    @Column(name = "ISSUE_YEAR")
    private int issueYear;
    @OneToMany(
            targetEntity = CopyOfTheBook.class,
            mappedBy = "book",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<CopyOfTheBook> copiesOfBook = new ArrayList<>();

    public Book(String title, String author, int issueYear) {
        this.title = title;
        this.author = author;
        this.issueYear = issueYear;
    }

    public void addCopy(CopyOfTheBook copy){
        copy.setBook(this);
        getCopiesOfBook().add(copy);
    }
}
