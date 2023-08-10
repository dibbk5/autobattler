package com.example.autobattler.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Enemies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enemy {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "health")
    private int health;

    @Column(name = "damage")
    private int damage;

    @ManyToOne
    @JsonBackReference
    private Level level;

}
