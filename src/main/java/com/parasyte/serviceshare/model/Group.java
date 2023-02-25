package com.parasyte.serviceshare.model;

import javax.persistence.*;

@Entity
@Table(name = "group")
public class Group {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
