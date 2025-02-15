package com.example.JFrog.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Links {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="link")
    private String link;
}
