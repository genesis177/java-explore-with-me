package ru.practicum.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; // ДОБАВЛЕНО: импорт

import java.time.LocalDateTime;

@Data
@Table(name = "statistics")
@Entity
@AllArgsConstructor
@NoArgsConstructor  // ДОБАВЛЕНО: аннотация для JPA
public class Hit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String app;
    @Column
    private String uri;
    @Column
    private String ip;
    @Column(name = "time_stamp")
    private LocalDateTime timestamp;
}