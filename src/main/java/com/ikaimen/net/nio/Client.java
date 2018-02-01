package com.ikaimen.net.nio;

/**
 * @author Mr.Chen
 * @description NIO 模型客户端
 * @create 2018-02-01 16:58
 **/
public class Client {

    private static String DEFAULT_HOST = "127.0.0.1";
    private static int DEFAULT_PORT = 12345;
    private static ClientHandler clientHandler;
    public static void start(){
        start(DEFAULT_HOST,DEFAULT_PORT);
    }
    public static synchronized void start(String ip,int port){
        if(clientHandler!=null)
            clientHandler.stop();
        clientHandler = new ClientHandler(ip,port);
        new Thread(clientHandler,"Server").start();
    }
    //向服务器发送消息
    public static boolean sendMsg(String msg) throws Exception{
        if(msg.equals("q")) return false;
        clientHandler.sendMsg(msg);
        return true;
    }
    public static void main(String[] args){
        start();
    }
}
