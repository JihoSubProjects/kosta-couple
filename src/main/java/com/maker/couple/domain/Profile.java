package com.maker.couple.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    private int salary;

    private int height;

    private int weight;

    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date createdAt;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.REMOVE)
    private List<Dream> dreams;

    @OneToMany(mappedBy = "from")
    private List<Matching> fromMatchings;

    @OneToMany(mappedBy = "to")
    private List<Matching> toMatchings;

    public enum Sex {
        MALE,
        FEMALE,
        BISEXUAL,
        NONE,
    }

}
