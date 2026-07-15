package com.vipha.elearning.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name="instructor_profiles")
public class InstructorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;
    private String biography;

    private String facebookLink;
    private String githubLink;
    private String jobTitle;
    private String phoneNumber;

    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;

    @OneToMany(mappedBy = "instructorProfile")
    private List<Course> courses;



}
