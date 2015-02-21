package com.olester.envers.example.model;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Table(name ="COMPLEX_DUCK")
public class ComplexDuck {

    private long id;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_complexduck")
    @SequenceGenerator(name = "seq_complexduck",
            sequenceName = "seq_complexduck",
            allocationSize = 1)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
