package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "READERS")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Reader {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column (name = "ACCOUNT_CREATION_DATE")
    private String accountCreation;
    @OneToOne(mappedBy = "reader")
    private Rent rent;

    public Reader(String name, String surname, String accountCreation) {
        this.name = name;
        this.surname = surname;
        this.accountCreation = accountCreation;
    }
}
