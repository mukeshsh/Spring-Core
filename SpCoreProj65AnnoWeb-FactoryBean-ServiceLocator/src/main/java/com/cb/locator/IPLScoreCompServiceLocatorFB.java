package com.cb.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.ipl.external.IPLScoreComp;
import com.ipl.external.IPLScoreCompImpl;

@Component("locator")
public class IPLScoreCompServiceLocatorFB implements FactoryBean<IPLScoreComp> {
    private IPLScoreComp extComp;
    
	public IPLScoreCompServiceLocatorFB() {
		extComp=new IPLScoreCompImpl();
	}

	@Override
	public IPLScoreComp getObject() throws Exception {
		return extComp;
	}

	@Override
	public Class<?> getObjectType() {
		return IPLScoreComp.class;
	}
   @Override
public boolean isSingleton() {
	return true;
}
}
