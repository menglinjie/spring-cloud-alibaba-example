//package com.mlj.snapup.consumer;
//
//import com.alibaba.csp.sentinel.Entry;
//import com.alibaba.csp.sentinel.SphU;
//import com.alibaba.csp.sentinel.slots.block.BlockException;
//import com.alibaba.csp.sentinel.slots.block.RuleConstant;
//import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
//import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
//import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
//import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author menglinjie
// * @date Created in 2020/4/16 15:37
// * @description: 测试Sentinel限流功能，代码侵入型较高
// */
//public class TestSentinel {
//    public static void main(String[] args) {
//        initFlowRules();
//        while (true) {
//            Entry entry = null;
//            try {
//                entry = SphU.entry("HelloWorld");
//
//                /*您的业务逻辑 - 开始*/
//                System.out.println("hello world");
//                /*您的业务逻辑 - 结束*/
//                Thread.sleep(30);
//
//            } catch (BlockException e1) {
//
//                /*流控逻辑处理 - 开始*/
//                System.out.println("block!");
//                /*流控逻辑处理 - 结束*/
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                if (entry != null) {
//                    entry.exit();
//                }
//            }
//        }
//    }
//
//    /**
//     * 规则来指定允许该资源通过的请求次数
//     */
//    private static void initFlowRules() {
//        List<FlowRule> rules = new ArrayList<>();
//        FlowRule rule = new FlowRule();
//        rule.setResource("HelloWorld");
//        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
//        // Set limit QPS to 20.
//        rule.setCount(10);
//        rules.add(rule);
//        FlowRuleManager.loadRules(rules);
//    }
//
////    public static void initFlowRules() {
////        List<DegradeRule> rules = new ArrayList<>();
////        DegradeRule rule = new DegradeRule();
////        rule.setResource("test");
////        // 80s内调用接口出现异常次数超过5的时候, 进行熔断
////        rule.setCount(2);
////        rule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_COUNT);
////        rule.setTimeWindow(80);
////        rules.add(rule);
////        DegradeRuleManager.loadRules(rules);
////    }
//}