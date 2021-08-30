package com.mobiquity.atm.locator.controller;

import com.mobiquity.atm.locator.entity.LocatorApiResponse;
import com.mobiquity.atm.locator.service.AtmLocatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AtmLocatorController
{

	@Autowired
	AtmLocatorService atmLocatorService;


	@RequestMapping(value = "/atmLocations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LocatorApiResponse> getAtmLocation() throws Exception
	{
		return atmLocatorService.getAtmLocation();
	}

	@RequestMapping(value = "/atmLocations/{city}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<LocatorApiResponse> getAtmLocationByCity(@PathVariable("city") String city) throws Exception
	{
		return atmLocatorService.getAtmLocationByCity(city);
	}
}
