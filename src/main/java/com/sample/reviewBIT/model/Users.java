package com.sample.reviewBIT.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "headline")
    private String headline;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_no")
    private String phone_no;
}
