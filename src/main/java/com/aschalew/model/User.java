package com.aschalew.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value ="User", description="model")
public class User {
	
	String name;
	String id;
	
	@ApiModelProperty(value="Name", name="Namu")
	@JsonProperty("nammmu")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@ApiModelProperty(value="idd", name ="idd")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
