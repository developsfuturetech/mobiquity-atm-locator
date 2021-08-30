package com.mobiquity.atm.locator.service;

import com.mobiquity.atm.locator.dao.AtmLocatorData;
import com.mobiquity.atm.locator.entity.LocatorApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class AtmLocatorService
{

  @Autowired
  AtmLocatorData atmLocatorData;

  public List<LocatorApiResponse> getAtmLocation() throws Exception
  {
    return atmLocatorData.getData();
  }

  public List<LocatorApiResponse> getAtmLocationByCity(String city) throws Exception
  {
    return atmLocatorData.getData().stream().filter(response -> response.getAddress().getCity().equalsIgnoreCase(city)).collect(toList());
  }

}
