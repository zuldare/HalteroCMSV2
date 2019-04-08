package com.jj.halterocms.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Bout of a competition.
 */
@Entity
@Table(name = "bout")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "competition")
@EqualsAndHashCode(exclude = "competition")
public class Bout {

    /**
     * Identification of the bout.
     */
    @Id
    @Column(name = "bout_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boutId;

    /**
     * Competition of the bout.
     */
    @ManyToOne
    @JoinColumn(name = "competition_id")
    private Competition competition;


    /**
     * Athletes from a bout.
     */
    @OneToMany(mappedBy = "bout", fetch = FetchType.EAGER)
    private Set<AthleteBout> athleteBouts;


    /**
     * Name of the bout.
     */
    @Column(name = "name")
    private String name;

    /**
     * Number of the bout in the competition.
     */
    @Column(name = "bout_number")
    private Integer boutNumber;

    /**
     * Date of the bout.
     */
    @Column(name = "bout_date_ts", columnDefinition = "TIMESTAMP")
    private LocalDateTime boutDate;

    /**
     * Gender of the bout.
     */
    @Column(name = "gender")
    private String gender;

    /**
     * Bout status.
     */
    @Column(name = "status")
    private String status;


}
