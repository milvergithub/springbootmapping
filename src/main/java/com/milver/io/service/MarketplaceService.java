package com.milver.io.service;

import com.milver.io.domain.Marketplace;
import com.milver.io.repository.marketplace.MarketplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MarketplaceService {

    @Autowired
    private MarketplaceRepository marketplaceRepository;

    public Page<Marketplace> findAll(Pageable pageable) {
        return marketplaceRepository.findAll(pageable);
    }
}
