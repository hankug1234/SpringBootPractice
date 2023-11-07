package com.crdt.implement.analyzer;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class UrlNotAccesibleFailureAnalyzer extends AbstractFailureAnalyzer<UrlNotAccessibleException>{

	@Override
	protected FailureAnalysis analyze(Throwable rootFailure, UrlNotAccessibleException cause) {
		
		return new FailureAnalysis("Unable to access the URL="+cause.getUrl(),"validate the url and ensure it is accessible",cause);
	}

}
