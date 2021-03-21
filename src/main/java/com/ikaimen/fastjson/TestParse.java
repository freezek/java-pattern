package com.ikaimen.fastjson;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class TestParse {

    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();
        //objects.add(1);
        Hello hello = new Hello();

        hello.setName("jack");
        hello.setList(objects);
        String s = JSON.toJSONString(hello);
        System.out.println(s);

        String jsonStr = "{\"RESTUDY_MODULE\":[{\"$ref\":\"$.currentLos.wl\\\\_rx\\\\_nndly\\\\_02.itemProcessMap.VIDEO\\\\_AND\\\\_DOC\"},{\"$ref\":\"$.currentLos.wl\\\\_rx\\\\_nndly\\\\_02.itemProcessMap.TEST\\\\_STUDY\\\\_QUESTION\"}],\"TEST_CHECK_MODULE\":[{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"1\",\"itemType\":\"TEST_QUESTION\",\"number\":\"2\",\"status\":\"READY\"}],\"REVIEW_MODULE\":[{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"1\",\"itemType\":\"TEST_STUDY_QUESTION\",\"number\":\"2\",\"status\":\"READY\"}],\"TEST_MODULE\":[{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"1\",\"itemType\":\"TEST_QUESTION\",\"number\":\"2\",\"status\":\"READY\"}],\"STUDY_MODULE:BASIC\":[{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"1\",\"itemType\":\"VIDEO_AND_DOC\",\"number\":\"1\",\"status\":\"READY\"},{\"itemMode\":\"MAX_NUM\",\"itemOrder\":\"2\",\"itemType\":\"INTERACTIVE_QUESTION\",\"number\":\"1\",\"status\":\"READY\"},{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"3\",\"itemType\":\"TEST_STUDY_QUESTION\",\"number\":\"4\",\"status\":\"READY\"}],\"STUDY_MODULE:COMPREHENSIVE\":[{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"1\",\"itemType\":\"VIDEO_AND_DOC\",\"number\":\"1\",\"status\":\"READY\"},{\"itemMode\":\"MAX_NUM\",\"itemOrder\":\"2\",\"itemType\":\"INTERACTIVE_QUESTION\",\"number\":\"1\",\"status\":\"READY\"},{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"3\",\"itemType\":\"TEST_STUDY_QUESTION\",\"number\":\"3\",\"status\":\"READY\"}],\"STUDY_CHECK_MODULE\":[{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"1\",\"itemType\":\"VIDEO_AND_DOC\",\"number\":\"1\",\"status\":\"READY\"},{\"itemMode\":\"MAX_NUM\",\"itemOrder\":\"2\",\"itemType\":\"INTERACTIVE_QUESTION\",\"number\":\"1\",\"status\":\"READY\"},{\"itemMode\":\"FIX_NUM\",\"itemOrder\":\"3\",\"itemType\":\"TEST_STUDY_QUESTION\",\"number\":\"4\",\"status\":\"READY\"}]}";

        System.out.println(JSON.parseObject(jsonStr).get("RESTUDY_MODULE"));


    }

    static class Hello{

        private List list;

        private String name;

        public List getList() {
            return list;
        }

        public void setList(List list) {
            this.list = list;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
