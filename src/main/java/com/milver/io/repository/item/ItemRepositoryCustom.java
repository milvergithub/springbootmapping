package com.milver.io.repository.item;

import com.milver.io.domain.Item;
import com.milver.io.domain.custom.ItemBy;
import com.milver.io.domain.custom.ItemCustom;

import java.util.List;

public interface ItemRepositoryCustom {

    List<Item> findAllNativeItems();

    List<ItemCustom> findAllNativeFilterItems();

    List<ItemCustom> findAllNativeByItems();
}
