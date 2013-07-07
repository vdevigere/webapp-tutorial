package com.viddu.codegaga.components;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.apache.tiles.beans.MenuItem;
import org.apache.tiles.beans.SimpleMenuItem;
import org.springframework.ui.ModelMap;

import com.viddu.codegaga.component.Component;
import com.viddu.codegaga.models.MenuBO;

public class MenuComponent implements Component {
    

    @Override
    public String getViewName(String region) {
        return "menu";
    }

    @Override
    public Map<String, Object> getModelMap() {
        ModelMap mm = new ModelMap();
        MenuBO menuBO = new MenuBO();
        Set<MenuItem> mainMenuItems= new LinkedHashSet<MenuItem>();
        
        MenuItem home = new SimpleMenuItem();
        home.setLink("#");
        home.setValue("Home");
        mainMenuItems.add(home);
        
        MenuItem about = new SimpleMenuItem();
        about.setLink("#");
        about.setValue("About");
        mainMenuItems.add(about);

        MenuItem faq = new SimpleMenuItem();
        faq.setLink("#");
        faq.setValue("FAQ");
        mainMenuItems.add(faq);

        menuBO.setMainMenu(mainMenuItems);
        
        mm.addAttribute(menuBO);
        return mm;
    }

}
