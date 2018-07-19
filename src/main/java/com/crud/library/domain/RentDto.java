package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class RentDto {

    private int id;
    private CopyOfTheBook copyOfTheBook;
    private Reader reader;
    private Date rentDate;
    private Date returnDate;

    public RentDto(Date rentDate, Date returnDate) {
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }
}
