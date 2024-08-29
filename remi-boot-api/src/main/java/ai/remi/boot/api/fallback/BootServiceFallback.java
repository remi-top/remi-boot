package ai.remi.boot.api.fallback;

import ai.remi.boot.api.service.BootServiceAPI;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BootServiceFallback implements BootServiceAPI {
    @Setter
    private Throwable cause;

    /**
     * 这里是实现在服务失败时调用的回退方法
     * @param goodsId
     * @return
     */
    @Override
    public String findById(int goodsId) {
        log.error("findById = {}", cause.getMessage());
        return null;
    }
}
