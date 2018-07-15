package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity (name = "COPIES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CopyOfTheBook {

    @Id
    @GeneratedValue
            //(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn (name = "BOOK_ID")
    //@Column (name = "BOOK_ID")
    private Book book;

    @Column
    private String status;
}
