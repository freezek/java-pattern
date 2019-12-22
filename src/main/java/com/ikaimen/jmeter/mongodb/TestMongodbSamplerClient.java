//package com.ikaimen.jmeter.mongodb;
//
//import com.mongodb.client.MongoCursor;
//import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
//import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
//import org.apache.jmeter.samplers.SampleResult;
//import org.apache.jmeter.util.Document;
//
///**
// * @author Mr.Chen
// * @title:
// * @projectName com.ikaimen
// * @description: TODO
// * @date 2019/4/4  5:11 PM
// **/
//public class TestMongodbSamplerClient extends AbstractJavaSamplerClient {
//
//    public static String host = null;
//    public static int port = 0;
//    public String collection = "";
//    public MongodbClient mc = null;
//    public MongoCursor<Document> mongoCursor = null;
//	/* 获取页面填写的参数 */
//
//    @Override
//    public void setupTest(JavaSamplerContext context) {
//
//        //host = context.getParameter("host");
//
//       // port = context.getIntParameter("port");
//
//       // collection = context.getParameter("collection");
//
//    }
//
//    @Override
//    public SampleResult runTest(JavaSamplerContext arg0) {
//        // TODO Auto-generated method stub
//
//
//
//        SampleResult result = new SampleResult();
//        result.setSampleLabel("MongodbSampler" + Thread.currentThread().getId());
//        result.sampleStart();
//        mc = new MongodbClient();
//        mc.ConnectionMongoClient("139.196.70.111", 7017, "irs");
//        mongoCursor = mc.query("HttpRequestSampler", "");
//        while(mongoCursor.hasNext()) {
//            collection = collection + mongoCursor.next().toString() + "\n";
//            System.out.println("collection" + collection);
//        }
//        if (collection != "" || !collection.equals("")) {
//            result.setResponseData(collection.getBytes());
//        }else {
//            result.setResponseData(("the return data is null !").getBytes());
//        }
//        mc.closeConnection();
//        result.setSuccessful(true);
//        result.sampleEnd();
//        return result;
//    }
//
//}
