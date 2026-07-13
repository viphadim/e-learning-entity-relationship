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
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean isDeleted;
    private Boolean isPublished;
    private String slug;
    private String thumbnail;
    private String title;

    private Instant createdAt;
    private Instant lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;

    @OneToMany(mappedBy = "video")
    private List<Comment> comment;

    @ManyToOne
    private Course course;

}
