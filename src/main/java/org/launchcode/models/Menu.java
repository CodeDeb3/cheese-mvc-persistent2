package org.launchcode.models;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Debbie on 4/13/2017.
 */

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    public Menu() {}

    // list of cheeses add one cheese at a time
    public void addItem(Cheese item) {cheeses.add(item); }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    // do not set cheeses bc it already has its own controller
    public List<Cheese> getCheeses() {return cheeses;}
}
