package com.jj.halterocms.halterocms.domain;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


/**
 * Competition dao layer.
 */

@Entity
@Table(name = "competitions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Competition {

    /**
     * Identifies the competition in the system.
     */
    @Id
    @Column(name = "competition_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer competitionId;


    /**
     * Bouts of a competition.
     */
    @OneToMany(mappedBy = "competition", fetch = FetchType.EAGER)
    private Set<Bout> competitionBouts;

    /**
     * Name of the competition.
     */
    @Column(name = "name")
    private String name;

    /**
     * Place where the competition is bout to be held.
     */
    @Column(name = "place")
    private String place;

    /**
     * Name of the competition's organizer.
     */
    @Column(name = "organizer")
    private String organizer;

    /**
     * Date when the competition starts.
     */
    @Column(name = "begin_ts", columnDefinition = "TIMESTAMP")
    private LocalDateTime beginTs;

    /**
     * Date when the competition ends.
     */
    @Column(name = "end_ts", columnDefinition = "TIMESTAMP")
    private LocalDateTime endTs;

}
