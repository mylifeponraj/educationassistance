package com.websystique.springmvc.dao;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.websystique.springmvc.model.HelpLinkUpdate;


@Repository("HelpLinkUpdateDao")
public class HelpLinkUpdateDaoImpl extends AbstractDao<Integer, HelpLinkUpdate> implements HelpLinkUpdateDao {
	static final Logger logger = LoggerFactory.getLogger(HelpLinkUpdateDaoImpl.class);

	
	@Override
	public void save(HelpLinkUpdate helplinkupdate) {
		// TODO Auto-generated method stub
		persist(helplinkupdate);
	}

	

	@Override
	public HelpLinkUpdate findByURL(String helplink) {
		logger.info("SSO : {}", helplink);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("helplinkupdate", helplink));
		HelpLinkUpdate helplinkupdate = (HelpLinkUpdate)crit.uniqueResult();
		if(helplinkupdate!=null){
			Hibernate.initialize(helplinkupdate.getUserProfiles());
		}
		return helplinkupdate;
	}

	

	
}
