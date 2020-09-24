package com.cb.locator;

import com.ipl.external.IPLScoreComp;
import com.ipl.external.IPLScoreCompImpl;

public class IPLScoreCompServiceLocator{
 
    final static IPLScoreComp extComp=new IPLScoreCompImpl();
    public static IPLScoreComp getExtComp() {
    	return extComp;
    }
}
