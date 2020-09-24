package com.cb.service;

import com.ipl.external.IPLScoreComp;

public class CrickBuzzScoreMgmtServiceImpl implements CrickBuzzScoreMgmtService {
   
	private IPLScoreComp extComp;
	
	public CrickBuzzScoreMgmtServiceImpl(IPLScoreComp extComp) {
		this.extComp = extComp;
	}

	@Override
	public String fetchScore(int mid) {
		// use external comp ref
		return extComp.getScore(mid);
	}

}
