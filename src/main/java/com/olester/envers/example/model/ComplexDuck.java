package com.olester.envers.example.model;

import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Quack Quack !
 */
@Entity
@Audited
@Table(name = "COMPLEX_DUCK")
public class ComplexDuck {

    private long id;

    private BigDecimal weight;

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = " WEIGHT")
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
