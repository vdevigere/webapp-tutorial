package com.viddu.codegaga.components;

import java.util.EnumSet;

import org.springframework.web.servlet.ModelAndView;

import com.viddu.codegaga.models.ProductInfo;
import com.viddu.codegaga.models.SizeEnum;

public class ProductComponent implements Component {

    public ModelAndView render() {
        ModelAndView mv = new ModelAndView("product");
        //TODO: Fetch this from DB
        ProductInfo productInfo = new ProductInfo("Blue Shirt", 1L);
        EnumSet<SizeEnum> options = EnumSet.allOf(SizeEnum.class);
        productInfo.setOptions(options);
        mv.addObject(productInfo);
        return mv;
    }

}
