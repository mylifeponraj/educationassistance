package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.HelpLinkUpdate;
import com.websystique.springmvc.model.User;

public interface HelpLinkUpdateDao {

	void save(HelpLinkUpdate helplinkupdate);

	HelpLinkUpdate findByURL(String helplink);
}
