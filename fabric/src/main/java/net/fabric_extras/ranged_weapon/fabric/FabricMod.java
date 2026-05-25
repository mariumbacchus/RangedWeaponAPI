package net.fabric_extras.ranged_weapon.fabric;

import net.fabric_extras.ranged_weapon.RangedWeaponMod;
import net.fabricmc.api.ModInitializer;

public final class FabricMod implements ModInitializer {

    @Override
    public void onInitialize() {
        RangedWeaponMod.init();
    }
}