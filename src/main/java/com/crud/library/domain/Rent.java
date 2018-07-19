package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "RENTS")
@NoArgsConstructor
@Getter
@Setter
public class Rent {

    @Id
    @GeneratedValue
    private int id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name ="COPY_ID")
    private CopyOfTheBook copyOfTheBook;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name ="READER_ID")
    private Reader reader;
    @Column (name = "RENT_DATE")
    private Date rentDate;
    @Column (name = "RETURN_DATE")
    private Date returnDate;

    public Rent(Date rentDate, Date returnDate) {
        this.rentDate = rentDate;
        this.returnDate = returnDate;
    }
}
