package de.yggdrasil.core.localisation;

import de.yggdrasil.core.dal.DAL;
import de.yggdrasil.core.localisation.dal.request.PlayerLocaleReadRequest;
import de.yggdrasil.core.localisation.session.LocalizerSession;
import de.yggdrasil.core.localisation.session.SessionLibrary;
import net.minestom.server.entity.Player;

public class Localizer {

    private final static LocaleLibrary LOCALE_LIBRARY = new LocaleLibrary();
    private final static SessionLibrary SESSION_LIBRARY = new SessionLibrary();

    public String localize (String identifier, Player target){
        return LOCALE_LIBRARY.getString(identifier, SESSION_LIBRARY.getSession(target));
    }

    public LocalizerSession createSession(Player player){
        String locale = (String) DAL.get().read(new PlayerLocaleReadRequest(player)).getData();
        return new LocalizerSession(player, locale);
    }

    public LocalizerSession getSession(Player target){
        return SESSION_LIBRARY.getSession(target);
    }

}
