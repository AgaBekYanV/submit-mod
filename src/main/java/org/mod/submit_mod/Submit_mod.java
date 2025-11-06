package org.mod.submit_mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.mod.submit_mod.Init.ModItems;

import java.util.logging.Logger;


public class Submit_mod implements ModInitializer {

    public static final String MOD_ID = "submit_mod";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Submit_mod");
        ModItems.initialize();
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID,path);
    }
}
