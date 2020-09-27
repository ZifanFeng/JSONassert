package org.json;

public class JSONDeduplicateTokener extends JSONTokener{

	public JSONDeduplicateTokener(String in) {
		super(in);
	}
	
	@Override
	public Object nextValue() throws JSONException {
        int c = nextCleanInternal();
        switch (c) {
            case '{':
                return readObject();

            default:
            	return super.nextValue();
        }
    }
	
	private int nextCleanInternal() throws JSONException {
        
    }

}
