package com.scaler.splitwisejune24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "splitwise_groups")
public class Group extends BaseModel {
    private String name;
    private String description;

    @ManyToMany
    private List<User> members;

    @ManyToOne
    private User createdBy; //Admin

    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;
}
