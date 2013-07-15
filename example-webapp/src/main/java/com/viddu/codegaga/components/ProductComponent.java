package com.viddu.codegaga.components;

import java.util.EnumSet;
import java.util.Map;

import org.springframework.ui.ModelMap;

import com.viddu.codegaga.components.Component;
import com.viddu.codegaga.models.ProductInfo;
import com.viddu.codegaga.models.SizeEnum;

public class ProductComponent implements Component {

//    private static final String PRODUCT_RECS_TEMPLATE = "productRecs";
//    private static final String PRODUCT_TEMPLATE = "product";

    private static final String PRODUCT_RECS_TEMPLATE = "/WEB-INF/jsp/product-recs.jsp";
    private static final String PRODUCT_TEMPLATE = "/WEB-INF/jsp/product.jsp";

    @Override
    public String getViewName(String region) {
        if (region.equalsIgnoreCase("MAIN")) {
            return PRODUCT_TEMPLATE;
        } else if (region.equalsIgnoreCase("FOOTER")) {
            return PRODUCT_RECS_TEMPLATE;
        } else {
            return PRODUCT_TEMPLATE;
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
