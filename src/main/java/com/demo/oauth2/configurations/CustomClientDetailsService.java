package com.demo.oauth2.configurations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.BaseClientDetails;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.stereotype.Service;

@Service("clientDetailsService")
public class CustomClientDetailsService implements ClientDetailsService {

	private String clientId;
	private String clientSecret;

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws OAuth2Exception {
		if(this.clientId.equals(clientId)){
			List<String> authorizedGrantTypes = new ArrayList<String>();
			authorizedGrantTypes.add("password");
			authorizedGrantTypes.add("refresh_token");
			authorizedGrantTypes.add("client_credentials");
			
			BaseClientDetails clientDetails = new BaseClientDetails();
			clientDetails.setClientId(this.clientId);
			clientDetails.setClientSecret(clientSecret);
			clientDetails.setAuthorizedGrantTypes(authorizedGrantTypes);
			return clientDetails;
		}
		else{
			throw new NoSuchClientException("No client recognized with id: " + clientId);
		}
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

}
