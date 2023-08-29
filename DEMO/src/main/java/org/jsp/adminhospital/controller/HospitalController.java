package org.jsp.adminhospital.controller;


import org.jsp.adminhospital.dao.HospitalDao;
import org.jsp.adminhospital.dto.Admin;
import org.jsp.adminhospital.dto.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
@Controller
@SessionAttributes(names= {"a"})
public class HospitalController {
	@Autowired
	private HospitalDao hdao;
		
		@PostMapping("/savehospital")
		public ModelAndView saveAdmin(@ModelAttribute Hospital h, ModelAndView view) {
			view.setViewName("print.jsp");
			h=hdao.saveHospital(h);
			view.addObject("msg", "hospital saved with ID:"+h.getId());
			return view;
		}
		@PostMapping("/loginhospital")
		public ModelAndView login(@RequestParam long phone,@RequestParam String password) {
		Hospital h=hdao.verifyHospital(phone, password);
			ModelAndView view =new 	ModelAndView();
			if(h!=null) {
				view.addObject("a", h);
				view.setViewName("homehospital.jsp");
				return view;
			}else {
				view.addObject("msg", "Invalid phone or password");
				view.setViewName("loginhospital.jsp");
				return view;
			}
		}
		@PostMapping("/updatehospital")
		public ModelAndView updateAdmin(@ModelAttribute Hospital h,ModelAndView view) {
			view.addObject("a",h);
			h=hdao.updateHospital(h);
			view.addObject("msg", "hospital updated with ID:"+h.getId());
			view.setViewName("print.jsp");
			return view;
		}
		
		@PostMapping("/deletehospital")
		public ModelAndView deleteHospital(@RequestParam int id, ModelAndView view) {
			boolean isDeleted=hdao.deleteHospital(id);
			if(isDeleted) {
				view.setViewName("loginhospital.jsp");
				view.addObject("msg", "your account is deleted");
				return view;
			}else {
				view.setViewName("loginhospital.jsp");
				view.addObject("msg", "you must login to delete");
				return view;
			}
			
		}
}
