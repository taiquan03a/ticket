package com.ptit.ticket.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

//Plain Object Java Object
@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Category {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "category_id")
    private int category_id;
    @Column(name = "category_name")
    private String category_name;
    @Column(name = "description")
    private String description;

    public int category_id() {
        return category_id;
    }
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    public String category_name() {
        return category_name;
    }
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    public String description() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
