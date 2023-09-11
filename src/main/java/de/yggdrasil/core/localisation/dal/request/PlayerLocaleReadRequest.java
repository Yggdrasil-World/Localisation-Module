package de.yggdrasil.core.localisation.dal.request;

import de.yggdrasil.core.dal.data.DataSource;
import de.yggdrasil.core.dal.requests.DALReadRequest;
import de.yggdrasil.core.dal.requests.DALRequestType;
import de.yggdrasil.core.localisation.dal.datasource.LocaleDB;
import net.minestom.server.entity.Player;

public class PlayerLocaleReadRequest implements DALReadRequest {

    private final Player player;
    public PlayerLocaleReadRequest(Player player) {
        this.player = player;
    }

    @Override
    public Class<? extends DataSource> getDatasource() {
        return LocaleDB.class;
    }

    @Override
    public String getIdentifier() {
        return player.getUuid().toString();
    }

    @Override
    public Class getTargetType() {
        return String.class;
    }

    @Override
    public DALRequestType getRequestType() {
        return DALRequestType.LOCALE;
    }
}
