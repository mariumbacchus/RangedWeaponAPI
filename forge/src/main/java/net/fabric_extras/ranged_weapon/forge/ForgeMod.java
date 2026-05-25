package net.fabric_extras.ranged_weapon.forge;

import net.fabric_extras.ranged_weapon.RangedWeaponMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RangedWeaponMod.ID)
public final class ForgeMod {

    public ForgeMod() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        RangedWeaponMod.init();
    }
}