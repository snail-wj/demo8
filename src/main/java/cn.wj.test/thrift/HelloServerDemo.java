package cn.wj.test.thrift;

import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * User: WJ
 * Date: 2017/9/5
 */
public class HelloServerDemo {
    public static final int SEVER_PORT = 8090;

    public void startServer(){
        try{
            System.out.println("HelloWorld TSimpleServer start ....");
            HelloWorldService.Processor<HelloWorldService.Iface> processor = new HelloWorldService.Processor<HelloWorldService.Iface>(new HelloWorldImpl());

            //简单的单线程服务模型，一般用于测试
            TServerSocket serverSocket = new TServerSocket(SEVER_PORT);
            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            tArgs.protocolFactory(new TBinaryProtocol.Factory());
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
}
