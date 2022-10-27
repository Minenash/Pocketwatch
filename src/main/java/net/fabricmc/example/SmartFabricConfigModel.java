package net.fabricmc.example;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

import java.util.List;

@Modmenu(modId = "smart-fabric")
@Config(name = "smart-fabric", wrapperName = "SmartFabricConfig")
public class SmartFabricConfigModel {

    public boolean showDetails = false;
    public List<String> whitelist = List.of("minecraft:clock", "minecraft:compass", "minecraft:recovery_compass");

}
