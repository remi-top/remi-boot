package ai.remi.boot.api.factory;

import ai.remi.boot.api.service.BootServiceAPI;
import ai.remi.boot.api.fallback.BootServiceFallback;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class BootServiceFactory implements FallbackFactory<BootServiceAPI> {

    @Override
    public BootServiceAPI create(Throwable cause) {
        BootServiceFallback fallback = new BootServiceFallback();
        fallback.setCause(cause);
        return fallback;
    }
}

