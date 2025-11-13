package org.mod.submit_mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Submit_mod implements ModInitializer {

    public static final String MOD_ID = "submit_mod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {

      LOGGER.info("Submit Mod initialized!");
      ModItems.initialize();
    }

}
