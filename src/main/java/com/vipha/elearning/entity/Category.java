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
@Table(name="categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String icon;

    @Column(nullable = false, length = 50)
    private String name;

    private Instant createdAt;
    private Instant lastModifiedAt;


    private String createdBy;
    private String lastModifiedBy;

    @Column(nullable = false)
    private Boolean isDeleted;

    @OneToMany(mappedBy = "category")
    List<Course> courses;


}
