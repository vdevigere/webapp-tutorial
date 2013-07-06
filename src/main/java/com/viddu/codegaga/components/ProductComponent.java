package com.viddu.codegaga.components;

import java.util.EnumSet;
import java.util.Map;

import org.springframework.ui.ModelMap;

import com.viddu.codegaga.models.ProductInfo;
import com.viddu.codegaga.models.SizeEnum;

public class ProductComponent implements Component {

    @Override
    public String getViewName(String region) {
        if (region.equalsIgnoreCase("MAIN")) {
            return "product";
        } else if (region.equalsIgnoreCase("RIGHT")) {
            return "productRecs";
        } else {
            return "product";
        }
    }

    @Override
    public Map<String, Object> getModelMap() {
        ModelMap mm = new ModelMap();
        // TODO: Fetch this from DB
        ProductInfo productInfo = new ProductInfo("Blue Shirt", 1L);
        EnumSet<SizeEnum> options = EnumSet.allOf(SizeEnum.class);
        productInfo.setOptions(options);
        mm.addAttribute(productInfo);
        return mm;
    }

}
