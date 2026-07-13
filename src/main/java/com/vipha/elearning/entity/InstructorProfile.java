package com.vipha.elearning.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name="instructor_profiles")
public class InstructorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private String userId;

    private String biography;

    private String facebookLink;
    private String githubLink;
    private String jobTitle;
    private String phoneNumber;

    private Instant createdAt;
    private Instant lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;

    @OneToMany(mappedBy = "instructorProfile")
    private List<Course> courses;



}
