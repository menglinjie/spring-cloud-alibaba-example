package com.mlj.snapup.provider.service;

import com.mlj.snapup.commonapi.Dto.Result;
import com.mlj.snapup.commonapi.service.SnaPupService;
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
    @Override
    public Result get(String s) {
        return new Result(s);
    }
}