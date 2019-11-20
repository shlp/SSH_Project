package com.custom.action;

import java.util.List;

import com.custom.entity.Custom;
import com.custom.service.CustomService;
import com.opensymphony.xwork2.ActionContext;
/*
 * 20165874-…Ú¿ˆ∆º
 */
public class CustomAction {
	private CustomService customService;
	private List<Custom> customLists;
	private Integer customid;
	private String caddress;
	private String cemail;
	private String cname;
	private String cpost;

	

	public CustomService getCustomService() {
		return customService;
	}

	public void setCustomService(CustomService customService) {
		this.customService = customService;
	}
	

	
	public List<Custom> getCustomLists() {
		return customLists;
	}

	public void setCustomLists(List<Custom> customLists) {
		this.customLists = customLists;
	}

	

	
	
	
	public Integer getCustomid() {
		return customid;
	}

	public void setCustomid(Integer customid) {
		this.customid = customid;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpost() {
		return cpost;
	}

	public void setCpost(String cpost) {
		this.cpost = cpost;
	}

	public String findCustom(){
		
		customLists=customService.findAll();
		ActionContext.getContext().put("customLists",customLists);
		
		return "findcustomsuccess";
	}
	
	
	public String toUpdate(){
		 Custom custom=customService.findById(customid);
			ActionContext.getContext().put("custom",custom);
		 return "toupdatesuccess";
		
	}
	public String updateCustom(){
      Custom custom=customService.findById(customid);
      
      custom.setCaddress(caddress);
      custom.setCemail(cemail);
      custom.setCname(cname);
      custom.setCpost(cpost);
	  customService.updateCustom(custom);
	  customLists=customService.findAll();
		ActionContext.getContext().put("customLists",customLists);
		return "updatesuccess";
	}
	
	
   public String delelteCustom(){
	   
	    Custom custom=customService.findById(customid);
		customService.deleteCustom(custom);
		customLists=customService.findAll();
		ActionContext.getContext().put("customLists",customLists);
		return "deletesuccess";
	}
	
}
