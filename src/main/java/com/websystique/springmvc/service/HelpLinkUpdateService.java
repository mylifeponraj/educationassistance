package com.websystique.springmvc.service;

import com.websystique.springmvc.model.HelpLinkUpdate;

public interface HelpLinkUpdateService {
	
	void save(HelpLinkUpdate helplinkupdate);

	boolean ishelplinkupdateUnique(Integer id,String url);	
}
