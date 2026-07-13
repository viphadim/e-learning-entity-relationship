package com.vipha.elearning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name="enrollmets")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime enrolledAt;
    private LocalDateTime paymentAt;
    private String paymentMethod;
    private Boolean paymentStatus;

    private Instant createdAt;
    private Instant lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentProfile studentProfile;

    @ManyToOne
    private Course course;


}
