package com.viddu.codegaga.models;

import java.util.Collection;

import org.apache.tiles.beans.MenuItem;

public class MenuBO {
    Collection<MenuItem> mainMenu;

    public Collection<MenuItem> getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(Collection<MenuItem> mainMenu) {
        this.mainMenu = mainMenu;
    }
}
