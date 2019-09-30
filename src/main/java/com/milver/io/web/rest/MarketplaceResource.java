package com.milver.io.web.rest;

import com.milver.io.domain.Marketplace;
import com.milver.io.service.MarketplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/marketplaces")
public class MarketplaceResource {

    @Autowired
    private MarketplaceService marketplaceService;

    @GetMapping
    public Page<Marketplace> findAllMarketPlace(Pageable pageable) {
        return marketplaceService.findAll(pageable);
    }
}
