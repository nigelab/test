package com.rsqa.testdev.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.rsqa.testdev.rally.TestCase;

public class Test1
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    TestCase bean = new TestCase();
    bean.setName("Check Login Logic");
    
    Gson GSON = new Gson();
    String jsonStr = GSON.toJson(bean);
    System.out.println(String.format("TestCase = %s", jsonStr));
    
    JsonElement jsonObj = GSON.toJsonTree(bean);
    JsonArray array = new JsonArray();
    JsonObject obj = new JsonObject();
  }
}
