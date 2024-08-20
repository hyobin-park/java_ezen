package com.mycompany.ch15.second;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("박효빈", 26);
//		map.put("박효빈", "26");  오류 발생(Integer 선언한 자리에 문자열로 put 해서)
		
		map.forEach((key, value)->{
		System.out.println(key + ":" + value);
		});
		
		System.out.println("---------------------");
		
		for( String strKey : map.keySet() ) {
			Integer strValue = map.get(strKey);
			System.out.println( strKey + ":" + strValue );
		}
		
		
	}

}
