package ru.gb.server.storage.authentecation;

import ru.gb.exchangemodels.models.Actions.Authentication;

public interface DbProvider {
    Authentication userAuthentication(String login, String password);
    Authentication userRegistration(String login, String password);
    Authentication getUserRootFolderByLogin(String login);
    void disconnect();
}

