package com.jj.halterocms.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Lifter dao layer.
 * A lifter is considered an athlete DURING competition, therefore he/she must have weight, birth year, etc...
 */
@Entity
@Table(name = "lifters")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
//@ToString(exclude = "bout")
//@EqualsAndHashCode(exclude = "bout")
public class AthleteBout {

    /**
     * Identification of the lifter
     */
    @Id
    @Column(name = "lifter_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer athleteBout;

    /**
     * Bout.
     */
    @ManyToOne
    @JoinColumn(name = "bout_id")
    private Bout bout;

    /**
     * Category.
     */
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    /**
     * Athlete.
     */
    @ManyToOne
    @JoinColumn(name = "athlete_id")
    private Athlete athlete;

    /**
     * Athlete's bodyweight during competition.
     */
    @Column(name = "body_weight", precision = 6, scale = 3)
    private Double bodyWeight;

    /**
     * Lifter's order in the bout. It can be dynamically changed during competition.
     */
    @Column(name = "lifter_order", length = 3)
    private Integer lifterOrder;

    /**
     * A random number chosen at the begining of the competition set up.
     */
    @Column(name = "order_number", length = 4)
    private Integer orderNumber;

    /**
     * Weight of the first snatch.
     */
    @Column(name = "snatch_weight_1", length = 3)
    private Integer snatchWeight1;

    /**
     * Weight of the second snatch.
     */
    @Column(name = "snatch_weight_2", length = 3)
    private Integer snatchWeight2;

    /**
     * Weight of the third snatch.
     */
    @Column(name = "snatch_weight_3", length = 3)
    private Integer snatchWeight3;

    /**
     * Status of the first snatch.
     */
    @Column(name = "snatch_status_1", length = 1)
    private String snatchStatus1;

    /**
     * Status of the second snatch.
     */
    @Column(name = "snatch_status_2", length = 1)
    private String snatchStatus2;

    /**
     * Status of the third snatch.
     */
    @Column(name = "snatch_status_3", length = 1)
    private String snatchStatus3;

    /**
     * Weight of the first clean and jerk.
     */
    @Column(name = "cj_weight_1", length = 3)
    private Integer cjWeight1;

    /**
     * Weight of the second clean and jerk.
     */
    @Column(name = "cj_weight_2", length = 3)
    private Integer cjWeight2;

    /**
     * Weight of the third clean and jerk.
     */
    @Column(name = "cj_weight_3", length = 3)
    private Integer cjWeight3;

    /**
     * Status of the first clean and jerk.
     */
    @Column(name = "cj_status_1", length = 3)
    private String cjStatus1;

    /**
     * Status of the second clean and jerk.
     */
    @Column(name = "cj_status_2", length = 1)
    private String cjStatus2;

    /**
     * Status of the third clean and jerk.
     */
    @Column(name = "cj_status_3", length = 1)
    private String cjStatus3;

    /**
     * Weight of the best accomplished snatch.
     */
    @Column(name = "best_snatch_weight", length = 3)
    private Integer snatchWeightBest;

    /**
     * Weight of the best accomplished clean and jerk.
     */
    @Column(name = "best_cj_weight", length = 3)
    private Integer cjWeightBest;

    /**
     * Addition of the best snatch and cj of the lifter.
     */
    @Column(name = "olympic_total", length = 3)
    private Integer olympicTotal;

    /**
     * Score according to Sinclair formula.
     */
    @Column(name = "sinclair_score", precision = 6, scale = 3)
    private Double sinclairScore;

    /**
     * Score according to Sinclair master.
     */
    @Column(name = "sinclair_master_score", precision = 6, scale = 3)
    private Double sinclairMasterScore;

    /**
     * Age of the lifter during competition. Only considering the birth year.
     */
    @Column(name = "age_from_year", length = 4)
    private Integer ageFromYear;

    /**
     * Snatch progression from previous to actual lift.
     */
    @Column(name = "snatch_progression", length = 3)
    private Integer snatchProgression;

    /**
     * Clean&Jerk progression from previous to actual lift.
     */
    @Column(name = "cj_progression", length = 3)
    private Integer cjProgression;

    /**
     * Indicates if the lifter is still snatching.
     */
    @Column(name = "still_snatching")
    private boolean stillSnatching;

    /**
     * Indicates if the lifter has finished the competition.
     */
    @Column(name = "finishedBout")
    private boolean finishedBout;

}
