package cn.wj.test.thrift;

import org.apache.thrift.*;

/**
 * User: WJ
 * Date: 2017/9/5
 */
public class HelloWorldImpl implements HelloWorldService.Iface {

    public HelloWorldImpl() {
    }

    public String sayHello(String username) throws TException {
        return "Hi," + username + " welcome to my blog www.baidu.com";
    }
}
