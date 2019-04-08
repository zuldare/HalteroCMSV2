package com.jj.halterocms.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Category {

    /**
     * Identification of the category.
     */
    @Id
    @Column(name = "category_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**
     * Name of the category.
     */
    @Column(name = "name")
    private String name;

    /**
     * Description of the category.
     */
    @Column(name = "description")
    private String description;

    /**
     * Up limit of the category in kilograms.
     */
    @Column(name = "up_limit", nullable = false, precision = 6, scale = 3)
    private Double up_limit;

    /**
     * Down limit of the category in kilograms.
     */
    @Column(name = "down_limit", nullable = false, precision = 6, scale = 3)
    private Double down_limit;

    /**
     * Gender of the category.
     */
    @Column(name = "gender")
    private String gender;

    /**
     * Determines if the category is active/inactive.
     */
    @Column(name = "active")
    private boolean active;

}
