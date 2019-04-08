package com.jj.halterocms.halterocms.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Athlete dao layer.
 */
@Entity
@Table(name = "athletes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Athlete {

    /**
     * Identification of the athlete.
     */
    @Id
    @Column(name = "athlete_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer athleteId;


    /**
     * Full name of the athlete.
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * Gender of the athlete.
     */
    @Column(name = "gender", nullable = false)
    private String gender;

    /**
     * Licence identification of the athlete.
     */
    @Column(name = "licence")
    private String licence;

    /**
     * Birthday of the athlete
     */
    @Column(name = "birthDay_ts", columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDate;

    /**
     * Club of the athlete.
     */
    @Column(name = "club")
    private String club;

    /**
     * Athletes from a bout.
     */
    @OneToMany(mappedBy = "bout", fetch = FetchType.EAGER)
    private Set<AthleteBout> athleteBouts;

}
