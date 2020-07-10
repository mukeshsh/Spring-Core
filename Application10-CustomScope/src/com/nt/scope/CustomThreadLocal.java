package com.nt.scope;

import java.util.HashMap;

public class CustomThreadLocal extends ThreadLocal<Object> {
	@Override
	public Object initialValue() {

		return new HashMap<String, Object>();
	}
}
