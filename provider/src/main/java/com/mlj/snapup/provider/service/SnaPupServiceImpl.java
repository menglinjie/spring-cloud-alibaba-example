package com.mlj.snapup.provider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.mlj.snapup.commonapi.Dto.Result;
import com.mlj.snapup.commonapi.service.SnaPupService;
import com.mlj.snapup.provider.util.ExceptionUtil;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author menglinjie
 * @date Created in 2020/4/15 14:25
 * @description:
 */
@Service
public class SnaPupServiceImpl implements SnaPupService {
    /**
     * 接口
     *
     * @param s
     * @return
     */
    /**
     * 对应的 `handleException` 函数需要位于 `ExceptionUtil` 类中，并且必须为 static 函数.
     * <p>
     * blockHandler / blockHandlerClass: blockHandler 对应处理 BlockException 的函数名称，可选项。
     * blockHandler 函数访问范围需要是 public，返回类型需要与原方法相匹配，参数类型需要和原方法相匹配并且最后加一个额外的参数，类型为 BlockException。
     * blockHandler 函数默认需要和原方法在同一个类中。若希望使用其他类的函数，则可以指定 blockHandlerClass 为对应的类的 Class 对象，注意对应的函数必需为 static 函数，否则无法解析。
     * <p>
     * fallback 函数名称，可选项，用于在抛出异常的时候提供 fallback 处理逻辑。fallback 函数可以针对所有类型的异常（除了 exceptionsToIgnore 里面排除掉的异常类型）进行处理。
     *
     * @return
     */
    @SentinelResource(value = "test",
            blockHandler = "handleException",
            blockHandlerClass = {ExceptionUtil.class},
            fallback = "helloFallback",
            fallbackClass = {ExceptionUtil.class})
    @Override
    public Result get(String s) {
        //测试熔断
        throw new RuntimeException();
//        return new Result(s);
    }

}