package org.json;

public class JSONDeduplicateObject extends JSONObject {
	public JSONDeduplicateObject(String json) throws JSONException {
        super(json);
    }
	
	@Override
	public JSONObject put(String name, Object value) throws JSONException {
		if(super.has(name)){
			throw new JSONException("Key " + name + " is duplicated");
		}
		return super.put(name, value);
	}
}