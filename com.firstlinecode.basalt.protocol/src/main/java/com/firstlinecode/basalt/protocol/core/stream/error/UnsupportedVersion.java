package com.firstlinecode.basalt.protocol.core.stream.error;

import com.firstlinecode.basalt.protocol.core.LangText;

public class UnsupportedVersion extends StreamError {
	public static final String DEFINED_CONDITION = "unspported-version";
	
	public UnsupportedVersion() {
		this(null);
	}
	
	public UnsupportedVersion(String text) {
		super(DEFINED_CONDITION);
		if (text != null) {
			setText(new LangText(text));
		}
	}
}
