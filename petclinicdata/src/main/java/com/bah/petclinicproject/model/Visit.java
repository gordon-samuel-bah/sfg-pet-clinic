package com.bah.petclinicproject.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "decription")
    private String decription;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
