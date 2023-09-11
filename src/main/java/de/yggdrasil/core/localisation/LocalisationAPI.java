package de.yggdrasil.core.localisation;

import net.minestom.server.entity.Player;

public class LocalisationAPI {

    private final Localizer localizer = new Localizer();
    public String translate(String identifier, Player player) {
        return localizer.localize(identifier, player);
    }

    public String getPlayerLocale(Player player) {
        return localizer.getSession(player).getLocale();
    }
}
