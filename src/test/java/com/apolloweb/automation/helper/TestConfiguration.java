package com.apolloweb.automation.helper;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class TestConfiguration {
    private JSONParser parser;
    private static TestConfiguration testConfig;
    private String host;
    private String user;
    private String pass;

    private TestConfiguration(){
        try {
            parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src\\test\\resources\\config.json"));
            JSONObject jsonObject = (JSONObject) obj;
            host = (String) jsonObject.get("host");
            user = (String) jsonObject.get("user");
            pass = (String) jsonObject.get("pass");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static TestConfiguration getTestConfig() {
        if (testConfig == null){
            testConfig = new TestConfiguration();
        }
        return testConfig;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

}
