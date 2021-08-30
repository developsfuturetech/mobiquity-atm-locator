package com.mobiquity.atm.locator.dao;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobiquity.atm.locator.entity.LocatorApiResponse;

public class AtmLocatorDataImpl implements AtmLocatorData
{


	@Value("${atm.locator.service}")
	private String URL;	

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<LocatorApiResponse> getData() throws IOException
	
	{
		String response = restTemplate.getForObject(URL, String.class);
		String parsedResponse = response.substring(6, response.length());
		ObjectMapper objectMapper = new ObjectMapper();
		LocatorApiResponse[] atmLocations = objectMapper.readValue(parsedResponse, LocatorApiResponse[].class);
		return Arrays.asList(atmLocations);
	}
}
