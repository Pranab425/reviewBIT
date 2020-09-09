package com.sample.reviewBIT.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "company_id")
    private int company_id;

    @Column(name = "details")
    private String details;

    @Column(name = "types")
    private String types;

    @Column(name = "posted_on")
    private String posted_on;

    @Column(name = "location")
    private String location;

    @Column(name = "roles")
    private String roles;
}
