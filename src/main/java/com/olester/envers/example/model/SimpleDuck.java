package com.olester.envers.example.model;

import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * Quack Quack !
 */
@Entity
@Audited
@Table(name ="SIMPLE_DUCK")
public class SimpleDuck {

    private long id;

    private String duckName;

    private int numberOfFeather;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_simpleduck")
    @SequenceGenerator(name = "seq_simpleduck",
            sequenceName = "seq_simpleduck",
            allocationSize = 1)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDuckName() {
        return duckName;
    }

    public void setDuckName(String duckName) {
        this.duckName = duckName;
    }

    public int getNumberOfFeather() {
        return numberOfFeather;
    }

    public void setNumberOfFeather(int numberOfFeather) {
        this.numberOfFeather = numberOfFeather;
    }
}
