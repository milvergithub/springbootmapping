package com.milver.io.service;

import com.milver.io.domain.Item;
import com.milver.io.domain.custom.ItemBy;
import com.milver.io.domain.custom.ItemCustom;
import com.milver.io.repository.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> findAllNativeItems() {
        return itemRepository.findAllNativeItems();
    }

    public List<ItemCustom> findAllNativeFilterItems() {
        return itemRepository.findAllNativeFilterItems();
    }

    public List<ItemCustom> findAllNativeByItems() {
        return itemRepository.findAllNativeByItems();
    }
}
