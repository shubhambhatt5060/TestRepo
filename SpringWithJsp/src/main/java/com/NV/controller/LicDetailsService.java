package com.NV.controller;

import java.util.ArrayList;
import java.util.List;

import com.NV.bean.Agent;

public class LicDetailsService {
	public List<Agent> getAll()
	{
		List<Agent> list=new ArrayList<Agent>();
		Agent a1=new Agent();
		a1.setAgentName("Shubham");
		a1.setTenantId("1234");
		a1.setClientIp("10.1.1.1");
		a1.setServerId("1341351");
		a1.setSessionId("7584");
		a1.setTimestamp(10121478);
		list.add(a1);
		
		Agent a2=new Agent();
		a2.setAgentName("Shubham1");
		a2.setTenantId("1212334");
		a2.setClientIp("127.1.1.1");
		a2.setServerId("5432351");
		a2.setSessionId("33456");
		a2.setTimestamp(98761234);
		list.add(a2);
		
		Agent a3=new Agent();
		a3.setAgentName("Shubham2");
		a3.setTenantId("651234");
		a3.setClientIp("165.1.1.1");
		a3.setServerId("3345");
		a3.setSessionId("75342");
		a3.setTimestamp(23354456);
		list.add(a3);
		
		Agent a4=new Agent();
		a4.setAgentName("Shubham3");
		a4.setTenantId("345345234");
		a4.setClientIp("127.1.1.144");
		a4.setServerId("2345");
		a4.setSessionId("43242");
		a4.setTimestamp(224324);
		list.add(a4);
		
		Agent a5=new Agent();
		a5.setAgentName("Shubham4");
		a5.setTenantId("32424322");
		a5.setClientIp("10.1.1.45");
		a5.setServerId("34424");
		a5.setSessionId("23232");
		a5.setTimestamp(4545);
		list.add(a5);

		
		
		return list;
	}
}
