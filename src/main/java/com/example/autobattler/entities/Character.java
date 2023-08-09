package com.example.autobattler.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Characters")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "health")
    private int health;

    @Column(name = "damage")
    private int damage;

}
