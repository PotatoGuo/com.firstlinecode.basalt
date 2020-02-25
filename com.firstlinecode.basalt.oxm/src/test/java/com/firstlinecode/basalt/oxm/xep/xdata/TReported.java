package com.firstlinecode.basalt.oxm.xep.xdata;

import java.util.ArrayList;
import java.util.List;

import com.firstlinecode.basalt.oxm.convention.annotations.Array;

public class TReported {
	@Array(type=TField.class, elementName="field")
	private List<TField> fields;

	public List<TField> getFields() {
		if (fields == null)
			fields = new ArrayList<>();
		
		return fields;
	}

	public void setFields(List<TField> fields) {
		this.fields = fields;
	}
	
}
