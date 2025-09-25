package org.example.databasemigration.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "profiles")
public class profiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="bio")
    private String bio;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="date_of_birth")
    private Date dateOfBirth;

    @Column(name="loyalty_points", nullable = false)
    private Integer loyaltyPoints = 0;
}
