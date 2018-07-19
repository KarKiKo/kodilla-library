package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity (name = "COPIES")
@NoArgsConstructor
@Getter
@Setter
public class CopyOfTheBook {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn (name = "BOOK_ID")
    private Book book;

    @Column
    private String status;

    @OneToOne(mappedBy = "copyOfTheBook")
    private Rent rent;

    public CopyOfTheBook(String status) {
        this.status = status;
    }
}
