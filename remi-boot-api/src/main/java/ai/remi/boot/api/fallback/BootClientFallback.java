package ai.remi.boot.api.fallback;

import ai.remi.boot.api.client.BootClientApi;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BootClientFallback implements BootClientApi {
    @Setter
    private Throwable cause;

    @Override
    public String findById(int goodsId) {
        log.error("findById = {}", cause.getMessage());
        return null;
    }
}
