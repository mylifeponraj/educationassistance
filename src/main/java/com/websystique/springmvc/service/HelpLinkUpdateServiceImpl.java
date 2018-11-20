package com.websystique.springmvc.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.HelpLinkUpdateDao;
import com.websystique.springmvc.model.HelpLinkUpdate;
import com.websystique.springmvc.model.User;


@Service("helplinkupdateservice")
@Transactional
public class HelpLinkUpdateServiceImpl implements HelpLinkUpdateService {
	
	@Autowired
	HelpLinkUpdateDao dao;
	@Override
	public void save(HelpLinkUpdate helplinkupdate) {
		// TODO Auto-generated method stub
		dao.save(helplinkupdate);
	}
	public HelpLinkUpdate findByURL(String helplink) {
		HelpLinkUpdate helplinkupdate = dao.findByURL(helplink);
		return helplinkupdate;
	}
	@Override
	public boolean ishelplinkupdateUnique(Integer id, String helplink) {
		HelpLinkUpdate helplinkupdate = findByURL(helplink);
		return ( helplinkupdate == null || ((id != null) && (helplinkupdate.getId() == id)));
	}
	

	/*@Override
	public boolean ishelplinkupdateUnique(int id ,String url, String filedid, String value, String helplink) {
		HelpLinkUpdate helplinkupdate = findByURL(id,url,filedid,value,helplink);
		return ( helplinkupdate == null || ((id != null) && (helplinkupdate.getId() == id)));
			return false;
	}*/
	
}
