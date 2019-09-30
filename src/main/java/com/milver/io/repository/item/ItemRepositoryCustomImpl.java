package com.milver.io.repository.item;

import com.milver.io.domain.Item;
import com.milver.io.domain.custom.ItemBy;
import com.milver.io.domain.custom.ItemCustom;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class ItemRepositoryCustomImpl implements ItemRepositoryCustom {

    private final EntityManager entityManager;

    @Autowired
    public ItemRepositoryCustomImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Item> findAllNativeItems() {
        String query = "select itm_id, itm_name, itm_description, itm_active from itm_item";
        return entityManager.createNativeQuery(query, "Item.findAllNative").getResultList();
    }

    @Override
    public List<ItemCustom> findAllNativeFilterItems() {
        String query = "select itm_id, itm_name, itm_description, itm_active from itm_item";
        return entityManager.createNativeQuery(query, "Item.findAllNativeFilter").getResultList();
    }

    @Override
    public List<ItemCustom> findAllNativeByItems() {
        String query = "select itm_id, itm_name, itm_description from itm_item";
        return entityManager.createNativeQuery(query, "Item.findAllNativeBy").getResultList();
    }
}
