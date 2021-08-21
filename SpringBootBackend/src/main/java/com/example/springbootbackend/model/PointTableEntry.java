package com.example.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pointstable")
public class PointTableEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Position")
    private long position;

    @Column(name = "Team")
    private String team;

    @Column(name = "Won")
    private Integer won;

    @Column(name = "Lost")
    private Integer lost;

    @Column(name = "Points")
    private Integer points;

    @Column(name = "NRR")
    private Float nrr;

    public PointTableEntry(){

    }

    public PointTableEntry(String team, Integer won, Integer lost,
                           Integer points, Float nrr){
        super();
        this.team = team;
        this.won = won;
        this.lost = lost;
        this.points = points;
        this.nrr = nrr;
    }

    public void setId(long position) {
        this.position = position;
    }

    public long getId() {
        return position;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setWon(Integer won) {
        this.won = won;
    }

    public Integer getWon() {
        return won;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Integer getLost() {
        return lost;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPoints() {
        return points;
    }

    public void setNrr(Float nrr) {
        this.nrr = nrr;
    }

    public Float getNrr() {
        return nrr;
    }
}
