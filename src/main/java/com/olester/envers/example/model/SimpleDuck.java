package com.olester.envers.example.model;

import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Quack !
 */
@Entity
@Audited
@Table(name = "SIMPLE_DUCK")
public class SimpleDuck {

    private long id;

    private String duckName;

    private int numberOfFeather;


    @Id
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
