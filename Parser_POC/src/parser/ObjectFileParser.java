package parser;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.JSONArray;
import org.json.JSONObject;

import test.ParserTest;

public class ObjectFileParser {
	
	public static JSONObject parse(String objFilePath){
		StringBuffer jsonData = new StringBuffer("");
		
		try(InputStream is = ParserTest.class.getResourceAsStream(objFilePath);
		    BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"))){
			String line = null;
			while ((line = br.readLine()) != null) {
				jsonData.append(line + "\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new JSONObject(jsonData.toString());
	}
	
	
	public static JSONObjectAccessor getJSONObjectAccessor(String objFilePath){
		JSONObject json = parse(objFilePath);
		
		String id = json.getString("id");
		//Check for uniqueness and non-null and blank
		JSONObjectAccessor accessor = new JSONObjectAccessor(id);
		
		boolean dbBacked = json.getBoolean("dbBacked");
		accessor.addMetaData("dbBacked", dbBacked);
		
		JSONArray attrs = json.getJSONArray("attributes");
		System.out.println("JSON array--> "+attrs.length());
		
		/*attrs.toList().stream()
			  		  .forEach((e)->{
			  			  System.out.println(e);
			  			 // Map<String,Object> retMap = ObjectFileParser.createAttributeMap(e);
			  			  accessor.addAttribute((HashMap)e.get("name"), e);
			  		  });*/
		attrs.forEach((e)->{
			  	Map<String,Object> retMap = ObjectFileParser.createAttributeMap(e);
	  			accessor.addAttribute((String)retMap.get("name"), retMap);
			 });

		return accessor;
	}
	
	public static Map<String,Object> createAttributeMap(Object json){
		Map<String,Object> map = new HashMap<>();
		JSONObject jsonObject = (JSONObject)json;
		map.put("name", jsonObject.getString("name"));
		map.put("type", jsonObject.getString("type"));
		map.put("length", jsonObject.getInt("length"));
		map.put("required", jsonObject.getBoolean("required"));
		return map;
	}
}
