package com.unisender.entities;

import java.util.ArrayList;
import java.util.List;

public class FieldData {
	List<String> fields = new ArrayList<String>();
	List<List<String>> data = new ArrayList<List<String>>();
	
	public void addField(String name){
		if (data.size() > 0)
			throw new IllegalStateException("can not add field since the data is filled");
		fields.add(name);
	}
	
	public void addFields(String[] names){
		for (String name: names){
			addField(name);
		}
	}
	
	public void addValues(List<String> values){
		if (values == null)
			throw new IllegalArgumentException("values cannot be null");
		
		if (values.size() != fields.size())
			throw new IllegalStateException("values length must be exactly the same length as files length");
		
		data.add(values);
	}

	public void addValues(String[] values){
		List<String> vList = new ArrayList<String>();
		
		for (String v: values){
			vList.add(v);
		}
		addValues(vList);
	}
	
	public void clear(){
		if (fields != null){
			fields.clear();
		}
		if (data != null){
			data.clear();
		}
	}
	
	public Integer getFiledCount(){
		return fields.size();
	}
	
	public Integer getDataCount(){
		return data.size();
	}
	
	public String getField(int index){
		return fields.get(index);
	}
	public List<String> getData(int index){
		return data.get(index);
	}
	
}
