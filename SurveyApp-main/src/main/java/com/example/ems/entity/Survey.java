package com.example.ems.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private String date;
    private String liking;
    private String interest;
    private String likelyhood;
    private String comments;
}