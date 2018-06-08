package com.cisco.dna.ClientApiTester;

import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cisco.com.dnac.v1.api.client.ApiClient;
import cisco.com.dnac.v1.api.client.ApiException;
import cisco.com.dnac.v1.api.client.api.MiscApi;
import cisco.com.dnac.v1.api.client.api.NetworkDeviceApi;
import cisco.com.dnac.v1.api.client.model.CountResult;
import cisco.com.dnac.v1.api.client.model.GenerateTokenRequest;
import cisco.com.dnac.v1.api.client.model.GenerateTokenResponse;
import cisco.com.dnac.v1.api.client.model.NetworkDeviceListResult;

/*
 * 
Copyright (c) 2018 Cisco and/or its affiliates.
This software is licensed to you under the terms of the Cisco Sample
Code License, Version 1.0 (the "License"). You may obtain a copy of the
License at
               https://developer.cisco.com/docs/licenses
All use of the material herein must be in accordance with the terms of
the License. All rights not expressly granted by the License are
reserved. Unless required by applicable law or agreed to separately in
writing, software distributed under the License is distributed on an "AS
IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
or implied.

*/

public class Application {

	static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws IOException {
		logger.info("Sample Programm is now running");

		final String basePath = "https://{ipaddress}"; //<== set Ip address, replace {ipaddress}
		String userPassword = "{username}:{password}"; //<== replace {username} and {password} with proper values
		
		try {
			// get network device API
			NetworkDeviceApi dnaNetworkDeviceApi = new NetworkDeviceApi();
			
			// get client API
		    ApiClient dnaClient = dnaNetworkDeviceApi.getApiClient();
		    dnaClient.setBasePath(basePath);

		    // turn on for full debug
			//dnaClient.setDebugging(true);
			
	        // if server uses self signed cert provide it OR ignore it
		    //dnaClient.setSslCaCert(this.getClass().getClassLoader().getResourceAsStream("192.168.139.73.pem"));
		    //OR
		    dnaClient.setVerifyingSsl(false);

		    // get token
			MiscApi miscApi = new MiscApi();	// get proper API to get token
			GenerateTokenRequest request = new GenerateTokenRequest();
			byte[] encoding = Base64.encodeBase64(userPassword.getBytes());
			GenerateTokenResponse tokenResponse = miscApi.postAuthToken(request,  "Basic " + new String(encoding));
			logger.info("Got Back Token [{}]", tokenResponse.getToken());

			// tell client to use this cookie for all api calls
			dnaClient.addDefaultHeader("X-AUTH-TOKEN", tokenResponse.getToken()); //dnaCookie);
		    
	        // make #1 API call
			CountResult dnaNetDevCount = dnaNetworkDeviceApi.getNetworkDeviceCount();
	        logger.info("Got response [getNetworkDeviceCount]=[{}]", dnaNetDevCount.getResponse());
			
	        // make #2 API call
	        NetworkDeviceListResult deviceRsp = dnaNetworkDeviceApi.getNetworkDevice(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	        logger.info("Got response [getNetworkDeviceAll]=[{}]", deviceRsp.getResponse());

		}
		catch (ApiException e) {
			logger.error("ApiException Excpetion", e);
		}
		
		logger.info("Sample Program Complete");
		return;
	}
}

