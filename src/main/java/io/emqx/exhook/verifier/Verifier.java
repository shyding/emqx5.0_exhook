package io.emqx.exhook.verifier;

import io.emqx.exhook.ClientInfo;

public interface Verifier {
    public boolean verify(ClientInfo clientinfo);
}
