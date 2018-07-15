package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "BOOKS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
            //(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String title;
    @Column
    private String author;
    @Column(name = "ISSUE_YEAR")
    private int issueYear;
/*    @OneToMany(
            targetEntity = CopyOfTheBook.class,
            mappedBy = "book",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<CopyOfTheBook> copiesOfBook;*/

}
