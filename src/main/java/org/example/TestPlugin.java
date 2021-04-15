package org.example;

import cosmo.addons.AddonInterface;
import cosmo.addons.AddonManager;

public class TestPlugin implements AddonInterface {
    public AddonManager addonManager;

    @Override
    public boolean start() {
        System.out.println("HELLO WORLD FROM PLUGIN");
        return true;
    }

    @Override
    public boolean stop() {
        System.out.println("GOODBYE WORLD FROM PLUGIN");
        return true;
    }

    @Override
    public void setPluginManager(AddonManager addonManager) {
        this.addonManager = addonManager;
    }
}
