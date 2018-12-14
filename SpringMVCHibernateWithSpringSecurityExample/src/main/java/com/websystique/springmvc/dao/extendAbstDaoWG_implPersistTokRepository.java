package com.websystique.springmvc.dao;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.AbstractDaoWithGenerics;
import com.websystique.springmvc.model.EntityPersistentLogin;

@Repository("tokenRepositoryDao")
@Transactional
public class extendAbstDaoWG_implPersistTokRepository extends AbstractDaoWithGenerics<String, EntityPersistentLogin>
		implements PersistentTokenRepository {

	static final Logger logger = LoggerFactory.getLogger(extendAbstDaoWG_implPersistTokRepository.class);

	@Override
	public void createNewToken(PersistentRememberMeToken token) {
		logger.info("Creating Token for user : {}", token.getUsername());
		EntityPersistentLogin objEntityPersistentLogin = new EntityPersistentLogin();
		objEntityPersistentLogin.setUsername(token.getUsername());
		objEntityPersistentLogin.setSeries(token.getSeries());
		objEntityPersistentLogin.setToken(token.getTokenValue());
		objEntityPersistentLogin.setLast_used(token.getDate());
		persist(objEntityPersistentLogin);

	}

	@Override
	public PersistentRememberMeToken getTokenForSeries(String seriesId) {
		logger.info("Fetch Token if any for seriesId : {}", seriesId);
		try {
			Criteria crit = createEntityCriteria();
			crit.add(Restrictions.eq("series", seriesId));
			EntityPersistentLogin localEntityPersistentLogin = (EntityPersistentLogin) crit.uniqueResult();

			return new PersistentRememberMeToken(localEntityPersistentLogin.getUsername(), localEntityPersistentLogin.getSeries(),
					localEntityPersistentLogin.getToken(), localEntityPersistentLogin.getLast_used());
		} catch (Exception e) {
			logger.info("Token not found...");
			return null;
		}
	}

	@Override
	public void removeUserTokens(String username) {
		logger.info("Removing Token if any for user : {}", username);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("username", username));
		EntityPersistentLogin localEntityPersistentLogin = (EntityPersistentLogin) crit.uniqueResult();
		if (localEntityPersistentLogin != null) {
			logger.info("rememberMe was selected");
			delete(localEntityPersistentLogin);
		}
	}

	@Override
	public void updateToken(String seriesId, String tokenValue, Date lastUsed) {
		logger.info("Updating Token for seriesId : {}", seriesId);
		EntityPersistentLogin localEntityPersistentLogin = getByKey(seriesId);
		localEntityPersistentLogin.setToken(tokenValue);
		localEntityPersistentLogin.setLast_used(lastUsed);
		update(localEntityPersistentLogin);
	}

}
