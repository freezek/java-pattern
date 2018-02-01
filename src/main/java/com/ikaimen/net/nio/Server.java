package com.ikaimen.net.nio;

/**
 * @author Mr.Chen
 * @description NIO 模型服务端，主要采取异步轮询的形式实现
 * @create 2018-02-01 16:52
 **/
public class Server {

    private static int DEFAULT_PORT = 12345;
    private static ServerHandler serverHandle;
    public static void start(){
        start(DEFAULT_PORT);
    }
    public static synchronized void start(int port){
        if(serverHandle!=null)
            serverHandle.stop();
        serverHandle = new ServerHandler(port);
        new Thread(serverHandle,"Server").start();
    }
    public static void main(String[] args){
        start();
    }

}
