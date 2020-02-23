package net.qiujuer.web.italker.push;

import net.qiujuer.web.italker.push.service.AccountService;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * author:fmm
 */
public class Application extends ResourceConfig {

    public Application() {
        //注册包名
        packages(AccountService.class.getPackage().getName());
        // 注册json解析器
        register(JacksonJsonProvider.class);
        // 注册日志
        register(Logger.class);
    }
}
