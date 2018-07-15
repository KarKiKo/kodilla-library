package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "READERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reader {

    @Id
    @GeneratedValue
            //(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column (name = "ACCOUNT_CREATION_DATE")
    private Date accountCreation;
}
