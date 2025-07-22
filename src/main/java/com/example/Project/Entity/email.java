package com.example.Project.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "email")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "receiver", nullable = false)
    private String receiver;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "body", nullable = false)
    private String body;
}
