package com.JsonStringTest.JsonStringTest.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.*;

public class JsonLogic {

    private static JsonLogic jsonLogic;

    public static JsonLogic getJsonLogic(){

        if(jsonLogic == null) {
            return new JsonLogic();
        }
        return jsonLogic;

    }

    public Map<String, String> getStringToJson(String str){

        List<String> itemList = makeToList(str);
        return makeJson(itemList);
    }



    private List<String> makeToList(String str){
        String[] itemsArray = str.split(" ");
        List<String> itemList = new ArrayList<String>();

        for(String item:itemsArray) {
            itemList.add(item);
        }
        return itemList;
    }

    private Map<String, String> makeJson(List<String> itemList){
        HashMap<String, String> map = new HashMap<>();
        boolean isEmpty = false;
        while(!isEmpty) {

            int c = 0;
            String s = itemList.get(0);
            List<String> foundItems = new ArrayList<String>();
            for (String item : itemList) {
                if (item.equals(s)) {
                    foundItems.add(item);
                    c++;
                }
            }
            itemList.removeAll(foundItems);
            if(itemList.isEmpty()){
                isEmpty = true;
            }
            map.put(s, ""+foundItems.size());
        }
        return map;
    }






}
