package com.tools;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;




/**
 * 完成对JSON数据的解析
 * 
 *
 */
public class jsonTools {

	public jsonTools() {
		
	}
	
	/**
	 * 获取对象数据
	 * @param key   data   get data+i  double[] {data1,data2,data3}  i<jsonboject.length
	 * @param jsonString
	 * @return
	 */
/*	public static Person getPerson(String key,String jsonString){
		Person person = new Person();
		try {
			JSONObject jsonObject = new JSONObject(jsonString);
			JSONObject personObject = jsonObject.getJSONObject(key);
			person.setId(personObject.getInt("id"));
			person.setName(personObject.getString("name"));
			person.setAddress(personObject.getString("address"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return person;
	}
	
	*//**
	 * 获取对象数组数据
	 * @param key
	 * @param jsonString
	 * @return
	 *//*
	public static List<MessageItem> getMessage(String key,String jsonString){
		List<MessageItem> list = new ArrayList<MessageItem>();
		try {
			JSONObject jsonObject = new JSONObject(jsonString);
			//返回json的数组
			JSONArray jsonArray = jsonObject.getJSONArray(key);
			for(int i=0;i<jsonArray.length();i++){
				JSONObject jsonObject2 = jsonArray.getJSONObject(i);
				MessageItem item = new MessageItem();
				item.setTitle(jsonObject2.getString("title"));
				item.setMsg(jsonObject2.getString("msg"));
				item.setTime(jsonObject2.getString("time"));
				list.add(item);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return list;
	}*/
	/**
	 * 获取String数组数据
	 * @param key
	 * @param jsonString
	 * @return
	 */
/*	public static List<String> getList(String key,String jsonString){
		List<String> list = new ArrayList<String>();
		try {
			JSONObject jsonObject = new JSONObject(jsonString);
			JSONArray jsonArray = jsonObject.getJSONArray(key);
			for(int i=0;i<jsonArray.length();i++){
				String msg = jsonArray.getString(i);
				list.add(msg);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return list;
	}
	*//**
	 * 获取对象的Map集合数据
	 * @param key
	 * @param jsonString
	 * @return
	 *//*
	public static List<Map<String,Object>> getListMap(String key,String jsonString){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		try {
			JSONObject jsonObject = new JSONObject(jsonString);
			JSONArray jsonArray = jsonObject.getJSONArray(key);
			for(int i=0;i<jsonArray.length();i++){
				JSONObject jsonObject2 = jsonArray.getJSONObject(i);
				Map<String,Object> map = new HashMap<String, Object>();
				@SuppressWarnings("unchecked")
				Iterator<String> iterator = jsonObject2.keys();
				while(iterator.hasNext()){
					String json_key = iterator.next();
					Object json_value = jsonObject2.get(json_key);
					if(json_value==null){
						json_value = "";
					}
					map.put(json_key, json_value);
				}
				list.add(map);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}*/
}