package dev.gobank.auth;

import dev.gobank.person.Identifier;

import java.util.HashMap;
import java.util.Map;

public class AuthManager {
    private Map<String, Auth> authStorage = new HashMap<String, Auth>();

    public boolean register(Identifier identifier, String password) {
        String token = identifier.getKey();
        Auth auth = new Auth(password, token);
        authStorage.put(token, auth);
        return true;
    }

    public boolean authenticate(Identifier identifier, String password) {
        String token = identifier.getKey();
        Auth auth = authStorage.get(token);
        return auth != null && auth.getPassword().equals(password);
    }

    public boolean removeAuth(Identifier identifier) {
        String token = identifier.getKey();
        return authStorage.remove(token) != null;
    }

    public Auth getAuthByIdentifier(Identifier identifier) {
        String token = identifier.getKey();
        return authStorage.get(token);
    }
}
