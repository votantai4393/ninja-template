/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tea.map.item;

import com.tea.constants.ItemName;
import com.tea.item.Item;
import com.tea.item.ItemFactory;

/**
 *
 * @author kitakeyos - Hoàng Hữu Dũng
 */
public class MapItem extends ItemMap {

    public MapItem(short id) {
        super(id);
        this.ownerID = -1;
        Item item = ItemFactory.getInstance().newItem(ItemName.DIA_DO);
        item.isLock = true;
        item.setQuantity(1);
        item.yen = 10000;
        setItem(item);
    }

    @Override
    public boolean isExpired() {
        return false;
    }

}
