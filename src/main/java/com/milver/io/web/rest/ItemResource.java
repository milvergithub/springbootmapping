package com.milver.io.web.rest;

import com.milver.io.domain.Item;
import com.milver.io.domain.custom.ItemBy;
import com.milver.io.domain.custom.ItemCustom;
import com.milver.io.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("v1/items")
public class ItemResource {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> findAllNativeItems() {
        return itemService.findAllNativeItems();
    }

    @GetMapping("/filter")
    public List<ItemCustom> findAllNativeFilterItems() {
        return itemService.findAllNativeFilterItems();
    }

    @GetMapping("/by")
    public List<ItemCustom> findAllNativeByItems() {
        return itemService.findAllNativeByItems();
    }
}
