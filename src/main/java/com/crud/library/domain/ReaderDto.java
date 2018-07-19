package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReaderDto {

    private int id;
    private String name;
    private String surname;
    private String accountCreation;
    private Rent rent;

    public ReaderDto(String name, String surname, String accountCreation) {
        this.name = name;
        this.surname = surname;
        this.accountCreation = accountCreation;
    }
}
