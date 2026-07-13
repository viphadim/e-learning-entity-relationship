package com.vipha.elearning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name="courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer countRating;
    private String description;
    private Float discountPercent;

    private Boolean isDeleted;
    private Boolean isPublished;

    private String keyword;
    private String level;
    private BigDecimal price;
    private String slug;
    private Float starRating;
    private String thumbnail;
    private String title;
    private Float totalHours;

    private Instant createdAt;
    private Instant lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "instuctor_id")
    private InstructorProfile instructorProfile;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "course")
    private List<Video> video;
}

