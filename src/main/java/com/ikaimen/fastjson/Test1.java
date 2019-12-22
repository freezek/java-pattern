package com.ikaimen.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.ikaimen.javase.exception.DemoException;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author chentao
 * @Date 2019/8/14 4:03 PM
 * @ModifyDate 2019/8/14 4:03 PM
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        try {
            throw new DemoException("abc");
        } catch (Exception e) {
            String a = e.getStackTrace().toString();
            System.out.println(JSON.toJSONString(e.getStackTrace()));
            //e.printStackTrace();
        }


        String str = JSONArray.parseObject("{\n" +
                "\t\"algoConfig\": {\n" +
                "\t\t\"algosMap\": {\n" +
                "\t\t\t\"EFFICIENCY_ALGO\": \"EFF_V1\",\n" +
                "\t\t\t\"STOPPOLICY_ALGO\": \"STOP_V1\",\n" +
                "\t\t\t\"RECOM_ITEM_LO_ALGO\": \"ASSE_V5\",\n" +
                "\t\t\t\"ABILITY_ALGO\": \"ABI_V2\",\n" +
                "\t\t\t\"FORGET_ALGO\": \"FOR_V1\",\n" +
                "\t\t\t\"RECOM_STUDY_LO_ALGO\": \"NLI_V1\",\n" +
                "\t\t\t\"FORGETTION_ALGO\": \"FOR_V1\",\n" +
                "\t\t\t\"RECOM_ASSESMENT_LO_ALGO\": \"KST_V1\",\n" +
                "\t\t\t\"STOP_ALGO\": \"STOP_V1\",\n" +
                "\t\t\t\"MASTERY_ABI_ALGO\": \"MAS_V1\",\n" +
                "\t\t\t\"ABILITY_TRANS_ALGO\": \"TRANS_V1\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"cacheVersion\": {\n" +
                "\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\"resVersion\": \"v2\",\n" +
                "\t\t\"systemVersion\": \"v1\"\n" +
                "\t},\n" +
                "\t\"courseInstanceId\": \"1025199011991635_128_20285\",\n" +
                "\t\"createDate\": 1572269009878,\n" +
                "\t\"curmetricMap\": {\n" +
                "\t\t\"ABILITY_00\": 0.5,\n" +
                "\t\t\"RIGHTRATE_00_00_02\": 0,\n" +
                "\t\t\"LO_IS_TRUE\": false,\n" +
                "\t\t\"RIGHTRATE_00_00_04\": 0,\n" +
                "\t\t\"MODE_ITEM_NUM\": 0,\n" +
                "\t\t\"RIGHTRATE_01_01_05\": 0,\n" +
                "\t\t\"QUANTITY_00_00_01\": 0,\n" +
                "\t\t\"MODE_RATE\": 0,\n" +
                "\t\t\"QUANTITY_00_00_03\": 0,\n" +
                "\t\t\"QUANTITY_00_00_02\": 0,\n" +
                "\t\t\"QUANTITY_00_00_05\": 0,\n" +
                "\t\t\"QUANTITY_00_00_04\": 0,\n" +
                "\t\t\"QUANTITY_00_00_07\": 0,\n" +
                "\t\t\"QUANTITY_00_00_06\": 0,\n" +
                "\t\t\"MODE_ITEM_QUEUE\": \"\",\n" +
                "\t\t\"QUANTITY_00_00_08\": 0,\n" +
                "\t\t\"IS_CUR_ABILITY\": \"011\",\n" +
                "\t\t\"MASTER_02\": {\n" +
                "\t\t\t1: 1.0,\n" +
                "\t\t\t2: 1.0,\n" +
                "\t\t\t3: 1.0\n" +
                "\t\t},\n" +
                "\t\t\"QRANK_03\": \"\",\n" +
                "\t\t\"times\": \"1\",\n" +
                "\t\t\"QRANK_02\": \"\",\n" +
                "\t\t\"RESOURCE_00\": 0,\n" +
                "\t\t\"FORBIDDEN_PARENT\": true,\n" +
                "\t\t\"ITEM_PROCESS\": \"TEST_QUESTION\"\n" +
                "\t},\n" +
                "\t\"currentActivity\": {\n" +
                "\t\t\"ability\": \"0.5\",\n" +
                "\t\t\"activityType\": \"DQUEST\",\n" +
                "\t\t\"codeType\": \"ALGO\",\n" +
                "\t\t\"itemId\": \"62d1df1ef1abd153611d2d51a42db104\",\n" +
                "\t\t\"itemType\": \"1\",\n" +
                "\t\t\"ncode\": \"xjs01020101\",\n" +
                "\t\t\"studyNum\": 0,\n" +
                "\t\t\"submit\": false,\n" +
                "\t\t\"use\": false\n" +
                "\t},\n" +
                "\t\"currentItemProcess\": \"TEST_QUESTION\",\n" +
                "\t\"currentLoCode\": \"xjs01020101\",\n" +
                "\t\"excludedItems\": [],\n" +
                "\t\"goal\": {\n" +
                "\t\t\"defaultCondOper\": \"EGT\",\n" +
                "\t\t\"defaultTargetScore\": \"0.7\",\n" +
                "\t\t\"defaultTargetType\": \"ABILITY_00\",\n" +
                "\t\t\"duration\": \"0\",\n" +
                "\t\t\"goalId\": \"2125199011991774\",\n" +
                "\t\t\"goalType\": \"ASSESSMENT\",\n" +
                "\t\t\"maxRecomSize\": \"0\",\n" +
                "\t\t\"status\": \"INPROCESS\"\n" +
                "\t},\n" +
                "\t\"goalFilter\": [],\n" +
                "\t\"itemProcessMap\": {\n" +
                "\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\"status\": \"READY\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"learnMapCounter\": {\n" +
                "\t\t\"candidateNodes\": [\"xjs01010103\", \"xjs01020101\", \"xjs01020102\", \"xjs01020201\", \"x110807\", \"xjs01020202\", \"xjs01020301\", \"xjs01010104\", \"x111105\"],\n" +
                "\t\t\"curExerciseNodeList\": [],\n" +
                "\t\t\"curExerciseNodeMap\": {},\n" +
                "\t\t\"curLearnedNodeList\": [],\n" +
                "\t\t\"curMasterNodeList\": [],\n" +
                "\t\t\"masteryNodes\": [],\n" +
                "\t\t\"noDealedNodes\": [],\n" +
                "\t\t\"noItemsNodes\": [],\n" +
                "\t\t\"noMasteredNodes\": [\"xjs01010103\", \"xjs01020101\", \"xjs01020102\", \"xjs01020201\", \"x110807\", \"xjs01020202\", \"xjs01020301\", \"xjs01010104\", \"x111105\"],\n" +
                "\t\t\"notMasteredNodes\": [],\n" +
                "\t\t\"recommendedSet\": [\"xjs01020101\"]\n" +
                "\t},\n" +
                "\t\"learnPath\": [\"xjs01020101\"],\n" +
                "\t\"loMap\": {\n" +
                "\t\t\"postMap\": {\n" +
                "\t\t\t\"xjs01010103\": [\"xjs01020101\", \"xjs01020102\", \"xjs01020201\", \"xjs01020202\", \"xjs01020301\"],\n" +
                "\t\t\t\"xjs01020101\": [\"xjs01020102\"],\n" +
                "\t\t\t\"xjs01020102\": [],\n" +
                "\t\t\t\"xjs01020201\": [\"xjs01020202\"],\n" +
                "\t\t\t\"x110807\": [\"xjs01020101\", \"xjs01020102\", \"xjs01020201\", \"xjs01020202\", \"xjs01020301\"],\n" +
                "\t\t\t\"xjs01020202\": [],\n" +
                "\t\t\t\"xjs01020301\": [],\n" +
                "\t\t\t\"xjs01010104\": [\"xjs01020101\", \"xjs01020102\", \"xjs01020201\", \"xjs01020202\", \"xjs01020301\"],\n" +
                "\t\t\t\"x111105\": [\"xjs01020101\", \"xjs01020102\", \"xjs01020201\", \"xjs01020202\", \"xjs01020301\"]\n" +
                "\t\t},\n" +
                "\t\t\"preMap\": {\n" +
                "\t\t\t\"xjs01010103\": [],\n" +
                "\t\t\t\"xjs01020101\": [\"xjs01010103\", \"xjs01010104\", \"x110807\", \"x111105\"],\n" +
                "\t\t\t\"xjs01020102\": [\"xjs01010103\", \"xjs01010104\", \"x110807\", \"x111105\", \"xjs01020101\"],\n" +
                "\t\t\t\"xjs01020201\": [\"xjs01010103\", \"xjs01010104\", \"x110807\", \"x111105\"],\n" +
                "\t\t\t\"x110807\": [],\n" +
                "\t\t\t\"xjs01020202\": [\"xjs01010103\", \"xjs01010104\", \"x110807\", \"x111105\", \"xjs01020201\"],\n" +
                "\t\t\t\"xjs01020301\": [\"xjs01010103\", \"xjs01010104\", \"x110807\", \"x111105\"],\n" +
                "\t\t\t\"xjs01010104\": [],\n" +
                "\t\t\t\"x111105\": []\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"los\": {\n" +
                "\t\t\"xjs01010103\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"xjs01010103\",\n" +
                "\t\t\t\"loDifficulty\": \"1\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020101\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"xjs01020101\",\n" +
                "\t\t\t\"loDifficulty\": \"1\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"resultdiffQueue\": [\"30\"],\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020102\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"xjs01020102\",\n" +
                "\t\t\t\"loDifficulty\": \"1\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020201\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"xjs01020201\",\n" +
                "\t\t\t\"loDifficulty\": \"1\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t},\n" +
                "\t\t\"x110807\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"x110807\",\n" +
                "\t\t\t\"loDifficulty\": \"0\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020202\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"xjs01020202\",\n" +
                "\t\t\t\"loDifficulty\": \"2\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020301\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"xjs01020301\",\n" +
                "\t\t\t\"loDifficulty\": \"3\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01010104\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"xjs01010104\",\n" +
                "\t\t\t\"loDifficulty\": \"1\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t},\n" +
                "\t\t\"x111105\": {\n" +
                "\t\t\t\"ability\": \"0.5\",\n" +
                "\t\t\t\"assessResult\": \"\",\n" +
                "\t\t\t\"attributeMap\": {},\n" +
                "\t\t\t\"courseId\": \"1025199011991635\",\n" +
                "\t\t\t\"currentStudyNum\": 0,\n" +
                "\t\t\t\"gradle\": \"\",\n" +
                "\t\t\t\"hobbies\": [],\n" +
                "\t\t\t\"initAbility\": \"0.5\",\n" +
                "\t\t\t\"interactiveResult\": \"\",\n" +
                "\t\t\t\"itemProcessMap\": {\n" +
                "\t\t\t\t\"TEST_QUESTION\": {\n" +
                "\t\t\t\t\t\"itemMode\": \"FIX_NUM\",\n" +
                "\t\t\t\t\t\"itemOrder\": \"1\",\n" +
                "\t\t\t\t\t\"itemType\": \"TEST_QUESTION\",\n" +
                "\t\t\t\t\t\"number\": \"2\",\n" +
                "\t\t\t\t\t\"status\": \"READY\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t},\n" +
                "\t\t\t\"loCode\": \"x111105\",\n" +
                "\t\t\t\"loDifficulty\": \"0\",\n" +
                "\t\t\t\"loVersion\": \"v1\",\n" +
                "\t\t\t\"loWeight\": \"0\",\n" +
                "\t\t\t\"reason\": \"\",\n" +
                "\t\t\t\"resultCollection\": {},\n" +
                "\t\t\t\"resultQueue\": \"\",\n" +
                "\t\t\t\"status\": \"UNCERTAIN\",\n" +
                "\t\t\t\"studyNum\": 0,\n" +
                "\t\t\t\"studyResult\": \"\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"repeat\": false,\n" +
                "\t\"resLoMap\": {\n" +
                "\t\t\"62d1df1ef1abd153611d2d51a42db104\": \"xjs01020101\"\n" +
                "\t},\n" +
                "\t\"resVersionMap\": {\n" +
                "\t\t\"62d1df1ef1abd153611d2d51a42db104\": \"1\"\n" +
                "\t},\n" +
                "\t\"rules\": [{\n" +
                "\t\t\"actions\": [{\n" +
                "\t\t\t\"actionId\": \"3206\",\n" +
                "\t\t\t\"actionType\": \"EXECUTE\",\n" +
                "\t\t\t\"nextActionId\": \"\",\n" +
                "\t\t\t\"value\": \"TRUE\",\n" +
                "\t\t\t\"variable\": \"UPDATE_TARGET_PRETEST_MODE\"\n" +
                "\t\t}],\n" +
                "\t\t\"conditions\": [],\n" +
                "\t\t\"dynamtic\": false,\n" +
                "\t\t\"project\": \"2\",\n" +
                "\t\t\"ruleId\": \"2012_2_02_1_3206_01\",\n" +
                "\t\t\"ruleType\": \"SEC_PRE_ENTRY\",\n" +
                "\t\t\"trigger\": {\n" +
                "\t\t\t\"triggerId\": \"1\",\n" +
                "\t\t\t\"triggerType\": \"SEC_PRE_ENTRY\"\n" +
                "\t\t}\n" +
                "\t}, {\n" +
                "\t\t\"actions\": [{\n" +
                "\t\t\t\"actionId\": \"4014\",\n" +
                "\t\t\t\"actionType\": \"EXECUTE\",\n" +
                "\t\t\t\"nextActionId\": \"\",\n" +
                "\t\t\t\"value\": \"TRUE\",\n" +
                "\t\t\t\"variable\": \"ASSIGN_COURSE_MASTER_RATE\"\n" +
                "\t\t}],\n" +
                "\t\t\"conditions\": [],\n" +
                "\t\t\"dynamtic\": false,\n" +
                "\t\t\"project\": \"2\",\n" +
                "\t\t\"ruleId\": \"2012_2_02_1_4014_03\",\n" +
                "\t\t\"ruleType\": \"ASSIGN\",\n" +
                "\t\t\"trigger\": {\n" +
                "\t\t\t\"triggerId\": \"2\",\n" +
                "\t\t\t\"triggerType\": \"ASSIGN\"\n" +
                "\t\t}\n" +
                "\t}, {\n" +
                "\t\t\"actions\": [{\n" +
                "\t\t\t\"actionId\": \"6500\",\n" +
                "\t\t\t\"actionType\": \"EXECUTE\",\n" +
                "\t\t\t\"nextActionId\": \"\",\n" +
                "\t\t\t\"value\": \"TRUE\",\n" +
                "\t\t\t\"variable\": \"ITEMPROCESS_CREATE_RULE\"\n" +
                "\t\t}],\n" +
                "\t\t\"conditions\": [],\n" +
                "\t\t\"dynamtic\": false,\n" +
                "\t\t\"project\": \"2\",\n" +
                "\t\t\"ruleId\": \"2012_2_02_7_6500_02\",\n" +
                "\t\t\"ruleType\": \"RULE_TEMPLATE\",\n" +
                "\t\t\"trigger\": {\n" +
                "\t\t\t\"triggerId\": \"7\",\n" +
                "\t\t\t\"triggerType\": \"RULE_TEMPLATE\"\n" +
                "\t\t}\n" +
                "\t}, {\n" +
                "\t\t\"actions\": [{\n" +
                "\t\t\t\"actionId\": \"1000\",\n" +
                "\t\t\t\"actionType\": \"EXECUTE\",\n" +
                "\t\t\t\"nextActionId\": \"\",\n" +
                "\t\t\t\"value\": \"TRUE\",\n" +
                "\t\t\t\"variable\": \"UPDATE_LO_TARGET\"\n" +
                "\t\t}],\n" +
                "\t\t\"conditions\": [{\n" +
                "\t\t\t\"conId\": \"2012_02_009\",\n" +
                "\t\t\t\"logicalOper\": \"AND\",\n" +
                "\t\t\t\"nextCondId\": \"2012_02_010\",\n" +
                "\t\t\t\"operatorSign\": \"LT\",\n" +
                "\t\t\t\"priority\": \"0\",\n" +
                "\t\t\t\"seqNo\": \"0\",\n" +
                "\t\t\t\"value\": \"1\",\n" +
                "\t\t\t\"variable\": \"RIGHTRATE_00_00_04\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"conId\": \"2012_02_010\",\n" +
                "\t\t\t\"logicalOper\": \"\",\n" +
                "\t\t\t\"nextCondId\": \"\",\n" +
                "\t\t\t\"operatorSign\": \"EGT\",\n" +
                "\t\t\t\"priority\": \"0\",\n" +
                "\t\t\t\"seqNo\": \"0\",\n" +
                "\t\t\t\"value\": \"1\",\n" +
                "\t\t\t\"variable\": \"QUANTITY_00_00_04\"\n" +
                "\t\t}],\n" +
                "\t\t\"dynamtic\": false,\n" +
                "\t\t\"project\": \"2\",\n" +
                "\t\t\"ruleId\": \"2012_3_02_3_1000_04\",\n" +
                "\t\t\"ruleType\": \"UPDATE_LO_TARGET\",\n" +
                "\t\t\"trigger\": {\n" +
                "\t\t\t\"triggerId\": \"3\",\n" +
                "\t\t\t\"triggerType\": \"UPDATE_LO_TARGET\"\n" +
                "\t\t}\n" +
                "\t}, {\n" +
                "\t\t\"actions\": [{\n" +
                "\t\t\t\"actionType\": \"EXECUTE\",\n" +
                "\t\t\t\"operatorSign\": \"EXECUTE\",\n" +
                "\t\t\t\"value\": \"TRUE\",\n" +
                "\t\t\t\"variable\": \"GETITEM_Q01\"\n" +
                "\t\t}],\n" +
                "\t\t\"conditions\": [{\n" +
                "\t\t\t\"conId\": \"100\",\n" +
                "\t\t\t\"logicalOper\": \"AND\",\n" +
                "\t\t\t\"nextCondId\": \"101\",\n" +
                "\t\t\t\"operatorSign\": \"ELT\",\n" +
                "\t\t\t\"value\": \"2\",\n" +
                "\t\t\t\"variable\": \"QUANTITY_00_00_02\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"conId\": \"101\",\n" +
                "\t\t\t\"operatorSign\": \"EQ\",\n" +
                "\t\t\t\"value\": \"TEST_QUESTION\",\n" +
                "\t\t\t\"variable\": \"ITEM_PROCESS\"\n" +
                "\t\t}],\n" +
                "\t\t\"dynamtic\": true,\n" +
                "\t\t\"trigger\": {\n" +
                "\t\t\t\"triggerId\": \"4\",\n" +
                "\t\t\t\"triggerType\": \"GET_RESOURCES\"\n" +
                "\t\t}\n" +
                "\t}, {\n" +
                "\t\t\"actions\": [{\n" +
                "\t\t\t\"actionType\": \"EXECUTE\",\n" +
                "\t\t\t\"operatorSign\": \"EXECUTE\",\n" +
                "\t\t\t\"value\": \"TRUE\",\n" +
                "\t\t\t\"variable\": \"UPDATE_PROCESS\"\n" +
                "\t\t}],\n" +
                "\t\t\"conditions\": [{\n" +
                "\t\t\t\"conId\": \"100\",\n" +
                "\t\t\t\"logicalOper\": \"AND\",\n" +
                "\t\t\t\"nextCondId\": \"101\",\n" +
                "\t\t\t\"operatorSign\": \"EGT\",\n" +
                "\t\t\t\"value\": \"2\",\n" +
                "\t\t\t\"variable\": \"QUANTITY_00_00_02\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"conId\": \"101\",\n" +
                "\t\t\t\"operatorSign\": \"EQ\",\n" +
                "\t\t\t\"value\": \"TEST_QUESTION\",\n" +
                "\t\t\t\"variable\": \"ITEM_PROCESS\"\n" +
                "\t\t}],\n" +
                "\t\t\"dynamtic\": true,\n" +
                "\t\t\"trigger\": {\n" +
                "\t\t\t\"triggerId\": \"9\",\n" +
                "\t\t\t\"triggerType\": \"UPDATE_PROCESS_STATUS\"\n" +
                "\t\t}\n" +
                "\t}],\n" +
                "\t\"section\": {\n" +
                "\t\t\"allStatus\": \"INPROCESS\",\n" +
                "\t\t\"classSectionId\": \"1125199011991640\",\n" +
                "\t\t\"courseTemplateId\": \"1025199011991635\",\n" +
                "\t\t\"duration\": \"0\",\n" +
                "\t\t\"groupId\": \"2012\",\n" +
                "\t\t\"kModule\": \"1\",\n" +
                "\t\t\"model\": \"STATIC\",\n" +
                "\t\t\"name\": \"先行测试\",\n" +
                "\t\t\"parentSectionId\": \"1125199011991657\",\n" +
                "\t\t\"parentSessionId\": \"4643783141964800\",\n" +
                "\t\t\"project\": \"2\",\n" +
                "\t\t\"released\": \"ALL\",\n" +
                "\t\t\"rootSectionId\": \"1125199011991636\",\n" +
                "\t\t\"rootSessionId\": \"4584019836945408\",\n" +
                "\t\t\"sModule\": \"990001\",\n" +
                "\t\t\"sModuleSessionIdMap\": {},\n" +
                "\t\t\"sectionId\": \"1125199011991773\",\n" +
                "\t\t\"sectionLevel\": \"4\",\n" +
                "\t\t\"sectionType\": \"ASSESSMENT\",\n" +
                "\t\t\"sessionId\": \"4643783233010688\",\n" +
                "\t\t\"stageCode\": \"30\",\n" +
                "\t\t\"status\": \"INPROCESS\",\n" +
                "\t\t\"taskSectionId\": \"1125199011991657\",\n" +
                "\t\t\"version\": \"5\"\n" +
                "\t},\n" +
                "\t\"sequences\": {},\n" +
                "\t\"sharedData\": {\n" +
                "\t\t\"masteredSet\": [],\n" +
                "\t\t\"noDealedSet\": [],\n" +
                "\t\t\"notMasteredSet\": [],\n" +
                "\t\t\"shareDataMap\": {}\n" +
                "\t},\n" +
                "\t\"storageStatus\": \"USEING\",\n" +
                "\t\"targets\": {\n" +
                "\t\t\"xjs01020101\": {\n" +
                "\t\t\t\"condOper\": \"EGT\",\n" +
                "\t\t\t\"duration\": \"0\",\n" +
                "\t\t\t\"loCode\": \"xjs01020101\",\n" +
                "\t\t\t\"status\": \"INPROCESS\",\n" +
                "\t\t\t\"targetScore\": \"0.7\",\n" +
                "\t\t\t\"targetType\": \"ABILITY_00\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020102\": {\n" +
                "\t\t\t\"condOper\": \"EGT\",\n" +
                "\t\t\t\"duration\": \"0\",\n" +
                "\t\t\t\"loCode\": \"xjs01020102\",\n" +
                "\t\t\t\"status\": \"READY\",\n" +
                "\t\t\t\"targetScore\": \"0.7\",\n" +
                "\t\t\t\"targetType\": \"ABILITY_00\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020201\": {\n" +
                "\t\t\t\"condOper\": \"EGT\",\n" +
                "\t\t\t\"duration\": \"0\",\n" +
                "\t\t\t\"loCode\": \"xjs01020201\",\n" +
                "\t\t\t\"status\": \"READY\",\n" +
                "\t\t\t\"targetScore\": \"0.7\",\n" +
                "\t\t\t\"targetType\": \"ABILITY_00\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020202\": {\n" +
                "\t\t\t\"condOper\": \"EGT\",\n" +
                "\t\t\t\"duration\": \"0\",\n" +
                "\t\t\t\"loCode\": \"xjs01020202\",\n" +
                "\t\t\t\"status\": \"READY\",\n" +
                "\t\t\t\"targetScore\": \"0.7\",\n" +
                "\t\t\t\"targetType\": \"ABILITY_00\"\n" +
                "\t\t},\n" +
                "\t\t\"xjs01020301\": {\n" +
                "\t\t\t\"condOper\": \"EGT\",\n" +
                "\t\t\t\"duration\": \"0\",\n" +
                "\t\t\t\"loCode\": \"xjs01020301\",\n" +
                "\t\t\t\"status\": \"READY\",\n" +
                "\t\t\t\"targetScore\": \"0.7\",\n" +
                "\t\t\t\"targetType\": \"ABILITY_00\"\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"updateDate\": 1572269015724,\n" +
                "\t\"userRegId\": \"6860100834429505\"\n" +
                "}").get("userRegId").toString();
        System.out.println(str);

//        for (int i = 0; i < 10000000; i++) {
//            long l = System.nanoTime();
//            long n = System.currentTimeMillis();
//
//            System.out.println(l+"==="+n);
//           // System.out.println(System.currentTimeMillis());
//        }

//        System.out.println(1568701468814L-1568701225104L);
//
//        User user = new User();
//
//        Class aClass = new Class();
//
//        aClass.setGrade(1);
//        aClass.setName("先进班集体");
//        aClass.setNum(1);
//
//        user.setAge(18);
//        user.setName("张三");
//        user.setSex("1");
//        user.setaClass(aClass);
//
//        System.out.println(user.toString());
//
//        updatePro(user.getaClass());
//
//        System.out.println(user.toString());
//
//        try {
//            java.lang.Class<?> aClass1 = java.lang.Class.forName("com.ikaimen.fastjson.Class");
//
//            Class o = (Class) aClass1.newInstance();
//            o.setName("lisi");
//
//            System.out.println(o.toString());
//
//            aClass1.getDeclaredMethods();
//
//            Stream.of(aClass1.getDeclaredMethods()).forEach(method -> System.out.println(method.getName()));
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    private static void updatePro(Class abc){

        abc.setName("优秀班集体");

    }

}
