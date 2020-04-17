package com.mlj.snapup.provider;

import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.ArrayList;
import java.util.List;

/**
 * //使用@Service暴露服务
 * //使用@Reference引用服务
 * //
 * //使用@EnableDubbo开启注解Dubbo功能
 * //或者配置包扫描
 */
@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
public class ProviderApplication {

    public static void main(String[] args) {
//        initFlowRules();
        SpringApplication.run(ProviderApplication.class, args);
    }

//    public static void initFlowRules() {
//        List<FlowRule> rules = new ArrayList<>();
//        FlowRule rule = new FlowRule();
//        rule.setResource("test");
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        // Set limit QPS to 20.
//        rule.setCount(1);
//        rules.add(rule);
//        FlowRuleManager.loadRules(rules);
//    }
}
