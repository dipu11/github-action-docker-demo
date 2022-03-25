package com.example.docker.docker.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by DIPU on 12/6/21
 */

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private int age;
    private String language;
}
