package com.salesforce.gryffindor;

import java.util.Objects;

//Classic Pojo - Mutable
public class Team {
    private String name;
    private String mascot;
    private String coach;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) &&
                Objects.equals(mascot, team.mascot) &&
                Objects.equals(coach, team.coach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mascot, coach);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Team{");
        sb.append("name='").append(name).append('\'');
        sb.append(", mascot='").append(mascot).append('\'');
        sb.append(", coach='").append(coach).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
