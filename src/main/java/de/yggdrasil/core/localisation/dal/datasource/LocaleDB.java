package de.yggdrasil.core.localisation.dal.datasource;

import de.yggdrasil.core.dal.data.DALWriteScope;
import de.yggdrasil.core.dal.data.DataSource;

public class LocaleDB implements DataSource {
    @Override
    public DALWriteScope[] getSupportedWriteScopes() {
        return new DALWriteScope[0];
    }

    @Override
    public byte[] getBytes(String identifier) {
        return new byte[0];
    }

    @Override
    public void writeBytes(String key, byte[] value) {

    }
}
