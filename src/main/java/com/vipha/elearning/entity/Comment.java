package com.vipha.elearning.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean isDeleted;
    private String text;

    private Instant createdAt;
    private Instant lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Comment comment;

    @ManyToOne
    private Video video;


}
