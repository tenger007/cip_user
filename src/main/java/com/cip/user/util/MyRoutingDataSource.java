package com.cip.user.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyRoutingDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		System.err.println("datasource-key:" + MyDataSourceSwitch.getKey());
		return MyDataSourceSwitch.getKey();
	}

}
