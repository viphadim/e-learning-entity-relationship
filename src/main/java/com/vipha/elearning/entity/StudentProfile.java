package com.vipha.elearning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="student_profiles")
public class StudentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;

    private String facebookLink;
    private String githubLink;
    private String major;
    private String phoneNumber;
    private String university;
    private String profilePicture;

    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;

    @OneToMany(mappedBy = "studentProfile")
    private List<Enrollment> enrollment;



}
