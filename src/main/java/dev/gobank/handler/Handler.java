package dev.gobank.handler;

import dev.gobank.system.SessionContext;

public interface Handler {
    boolean handle(SessionContext currentSession);
}
