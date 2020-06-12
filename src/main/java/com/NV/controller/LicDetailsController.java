package com.NV.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.NV.bean.Agent;

@RestController
public class LicDetailsController {

	@RequestMapping("/home")
	public ModelAndView onStartPage() {
		LicDetailsService licObj=new LicDetailsService();
		List<Agent> list = licObj.getAll();
		ModelAndView model = new ModelAndView("/WEB-INF/views/index.jsp");
		model.addObject("listAgent", list);
		model.addObject("size", list.size());

		return model;
    }
	
	@RequestMapping("/lic")
	public List<Agent> getLic() {
		LicDetailsService licObj=new LicDetailsService();
		List<Agent> list = licObj.getAll();
		return list;
    }
}
