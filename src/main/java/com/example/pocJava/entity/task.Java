package com.example.pocJava.entity;
import jakarta.persistence.Entity;

import java.lang.reflect.GenericArrayType;
import java.time.LocalDate;


@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenericArrayType.INDENTIFY)
    private Long id;
    private String Title;
    private String Description;
    private String responsible;
    private LocalDate dateDelivery;
    private boolean finished;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public LocalDate getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDate dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
