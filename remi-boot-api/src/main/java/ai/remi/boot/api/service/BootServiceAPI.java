package ai.remi.boot.api.service;

import ai.remi.boot.api.BootApi;
import ai.remi.boot.api.factory.BootServiceFactory;
import ai.remi.comm.feign.aspect.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "remi-boot-service", configuration = FeignAutoConfiguration.class, fallbackFactory = BootServiceFactory.class)
public interface BootServiceAPI extends BootApi {


}
