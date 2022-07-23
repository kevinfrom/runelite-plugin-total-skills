package com.example;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TotalSkillPluginTest {
    public static void main(String[] args) throws Exception {
        ExternalPluginManager.loadBuiltin(TotalSkillPlugin.class);
        RuneLite.main(args);
    }
}