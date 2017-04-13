package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

/**
 * Created by Debbie on 4/13/2017.
 */
public class AddMenuItemForm {

    // pieces of data passed on menuId cheeseId
    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;

    private Menu menu;

    // options of cheeses to add to menu for user to pick
    private Iterable<Cheese> cheeses;

    // default constructor for model to work
    public AddMenuItemForm(){}

    public AddMenuItemForm(Iterable<Cheese> cheeses, Menu menu){

    this.cheeses = cheeses;
    this.menu = menu;
    }
    public int getMenuId() {return menuId;}

    public void setMenuId(int menuId){ this.menuId = menuId;}

    public int getCheeseId() { return cheeseId;}

    public void setCheeseId(int cheeseId) {this.cheeseId = cheeseId;}

    public Iterable<Cheese> getCheeses() { return  cheeses;}

//    public void setCheeses(Iterable<Cheese> cheeses) {
//        this.cheeses = cheeses;
//    }
    public Menu getMenu() { return menu;}
}
