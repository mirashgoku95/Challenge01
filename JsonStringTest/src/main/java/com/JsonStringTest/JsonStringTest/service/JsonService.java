package com.JsonStringTest.JsonStringTest.service;

import java.util.*;

@Deprecated
public class JsonService {

    private static JsonService jsonLogic;

    public static JsonService getJsonLogic(){

        if(jsonLogic == null) {
            return new JsonService();
        }
        return jsonLogic;

    }

    public Map<String, String> getStringToJson(String str){

        List<String> itemList = makeToList(str);
        return makeJson(itemList);
    }



    private List<String> makeToList(String str){
        String[] itemsArray = str.split(" ");
        List<String> itemList = new ArrayList<String>(Arrays.asList(itemsArray));

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
