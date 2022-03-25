package com.example.docker.docker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Created by DIPU on 12/6/21
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private Long id;
    private String name;
    private String address;
    private int age;
    private String language;
}
