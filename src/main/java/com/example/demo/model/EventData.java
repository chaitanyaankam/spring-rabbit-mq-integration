package com.example.demo.model;

import com.fasterxml.jackson.databind.JsonNode;

public class EventData {

	private String id;
	private String type;
	private String created;
	private String operationToken;
	private String usernmae;
	private JsonNode jsonObject;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getOperationToken() {
		return operationToken;
	}
	public void setOperationToken(String operationToken) {
		this.operationToken = operationToken;
	}
	public String getUsernmae() {
		return usernmae;
	}
	public void setUsernmae(String usernmae) {
		this.usernmae = usernmae;
	}
	public JsonNode getJsonObject() {
		return jsonObject;
	}
	public void setJsonObject(JsonNode jsonObject) {
		this.jsonObject = jsonObject;
	}
	
}
