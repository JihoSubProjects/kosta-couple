package com.maker.couple.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "matching")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matching {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_id")
    private Profile from;

    @ManyToOne
    @JoinColumn(name = "to_id")
    private Profile to;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "match_at")
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date matchAt;

    public enum Status {
        READY,
        PASS,
        ARROW,
        SUCCESS,
        FAIL,
    }

}
