package org.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity

@Table(name="placement")

public class Placement {

@Id

private Integer id;

private String name;

private String date;

private String qulification;

private Integer year;

// getters and setters

public Integer getId() {

return id;

}

public void setId(Integer id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public String getDate() {

return date;

}

public void setDate(String date) {

this.date = date;

}

public String getQulification() {

return qulification;

}

public void setQulification(String qulification) {

this.qulification = qulification;

}

public Integer getYear() {

return year;

}

public void setYear(Integer year) {

this.year = year;

}

// default constructor

public Placement() {

super();



}

// constructor using fields

public Placement(Integer id, String name, String date, String qulification, Integer year) {

super();

this.id = id;

this.name = name;

this.date = date;

this.qulification = qulification;

this.year = year;

}

// to string method

@Override

public String toString() {

return "Placement [id=" + id + ", name=" + name + ", date=" + date + ", qulification=" + qulification

+ ", year=" + year + "]";

}

}