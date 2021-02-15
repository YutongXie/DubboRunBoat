package com.zhe.qiushui.DubboRunBoat.controler;

import com.qiushui.module.ProductPrice;
import com.qiushui.service.PriceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/productPriceQuery")
public class ProductPriceQuery {
    @Resource
    private PriceService priceService;

    @RequestMapping("/getProductPriceByDate")
    public ProductPrice getProductPriceByDate() {
        int date = 20210215;
        String productName = "DaMi";
        return priceService.getProductPrice(productName, date);
    }
}
