package com.qouteall.imm_ptl_peripheral.ducks;

import net.minecraft.resource.DataPackSettings;
import net.minecraft.resource.ResourcePackManager;

public interface IECreateWorldScreen {
    ResourcePackManager portal_getResourcePackManager();
    
    DataPackSettings portal_getDataPackSettings();
}
