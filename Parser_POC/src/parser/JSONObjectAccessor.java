package parser;

import java.util.HashMap;
import java.util.Map;

public class JSONObjectAccessor {
	private String id;
	private Map<String,Object> metaDataMap = new HashMap<>();
	private Map<String,Object> attributeMap = new HashMap<>();
	
	public String getId() {
		return id;
	}

	public JSONObjectAccessor(String id) {
		this.id = id;
	}

	public boolean addMetaData(String key, Object value){
		return metaDataMap.put(key, value) != null;
	}
	
	public boolean addAttribute(String key, Object value){
		return attributeMap.put(key, value) != null;
	}
	
	public DataObject getDataObject(){
		DataObject dataObject = new DataObject(id, this);
		return dataObject;
	}
	
	public Object getMetaData(String key){
		return metaDataMap.get(key);
	}
	
	@SuppressWarnings("unchecked")
	public Object getAttribute(String key){
		if(!key.contains("."))
			return attributeMap.get(key);
		else{
			String[] tokens = key.split("\\.");
			return ((Map<String, Object>) attributeMap.get(tokens[0])).get(tokens[1]);
		}
	}
	
}


