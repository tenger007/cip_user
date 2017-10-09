package com.cip.user.service;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import com.cip.user.util.MyConfigUtil;
import com.cip.user.util.MyPwTools;

public class MyPwdCallback implements CallbackHandler {

	@Override
	public void handle(Callback[] arg0) throws IOException, UnsupportedCallbackException {

		WSPasswordCallback wsp = (WSPasswordCallback) arg0[0];

		String identifier = wsp.getIdentifier();

		String pw = MyConfigUtil.getProperties(identifier);

		String getpw = MyPwTools.getpw(identifier, pw);

		wsp.setPassword(getpw);

	}

}
