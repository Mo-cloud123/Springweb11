package se.mo.springweb11.models;

import jakarta.persistence.*;

@Entity
public class HockeyPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name = "Name")
    private String name;

    @Column(name= "Age")
    private int age;
}
