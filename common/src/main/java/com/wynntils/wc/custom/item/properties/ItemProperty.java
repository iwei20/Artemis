/*
 * Copyright © Wynntils 2022.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.wc.custom.item.properties;

import com.wynntils.wc.custom.item.WynnItemStack;
import com.wynntils.wc.custom.item.properties.type.HighlightProperty;

public abstract class ItemProperty {
    public static final Class<DurabilityProperty> DURABILITY = DurabilityProperty.class;
    public static final Class<ItemTierProperty> ITEM_TIER = ItemTierProperty.class;
    public static final Class<CosmeticTierProperty> COSMETIC_TIER = CosmeticTierProperty.class;

    public static final Class<HighlightProperty> HIGHLIGHT = HighlightProperty.class;

    protected WynnItemStack item;

    public ItemProperty(WynnItemStack item) {
        this.item = item;

        // attach property to the itemstack
        item.addProperty(this);
    }
}
