/*
 * Copyright © Wynntils 2022.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.wc.custom.item.properties;

import com.wynntils.core.webapi.profiles.item.ItemTier;
import com.wynntils.utils.objects.CustomColor;
import com.wynntils.wc.custom.item.GearItemStack;
import com.wynntils.wc.custom.item.WynnItemStack;
import com.wynntils.wc.custom.item.properties.type.HighlightProperty;

public class ItemTierProperty extends ItemProperty implements HighlightProperty {
    private final ItemTier tier;

    public ItemTierProperty(WynnItemStack item) {
        super(item);

        // parse tier
        if (item instanceof GearItemStack gearItem) {
            tier = gearItem.getItemProfile().getTier();
            return;
        }

        tier = ItemTier.fromComponent(item.getHoverName());
    }

    public ItemTier getTier() {
        return tier;
    }

    @Override
    public CustomColor getHighlightColor() {
        return tier == null ? CustomColor.NONE : tier.getHighlightColor();
    }
}
