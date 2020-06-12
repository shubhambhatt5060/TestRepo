package com.NV.bean;

public class Agent {
	private String agentName;
	private String tenantId;
	private String clientIp;
	private String serverId;
	private String sessionId;
	private long timestamp;
	
	
	
	public Agent() {
			}

	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Agent [agentName=" + agentName + ", tenantId=" + tenantId + ", clientIp=" + clientIp + ", serverId="
				+ serverId + ", sessionId=" + sessionId + ", timestamp=" + timestamp + "]";
	}
	
	
}
