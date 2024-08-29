package ai.remi.boot.api.factory;

import ai.remi.boot.api.client.BootClientApi;
import ai.remi.boot.api.fallback.BootClientFallback;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class BootClientFactory implements FallbackFactory<BootClientApi> {

    @Override
    public BootClientApi create(Throwable cause) {
        BootClientFallback fallback = new BootClientFallback();
        fallback.setCause(cause);
        return fallback;
    }
}

