package ai.remi.boot.api.client;

import ai.remi.boot.api.factory.BootClientFactory;
import ai.remi.comm.feign.aspect.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "remi-boot-client", configuration = FeignAutoConfiguration.class, fallbackFactory = BootClientFactory.class)
public interface BootClientApi {

    @GetMapping("/books/findByBooksId")
    String findById(@RequestParam("booksId") int booksId);
}
