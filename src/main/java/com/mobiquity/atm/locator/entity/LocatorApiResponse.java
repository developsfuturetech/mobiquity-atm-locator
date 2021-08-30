package com.mobiquity.atm.locator.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LocatorApiResponse
{
  private Address address;
  private int distance;
  private String type;

  @JsonIgnore
  public String openingHours;
  
  @JsonIgnore
  public String functionality;

  public Address getAddress()
  {
    return this.address;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  public int getDistance()
  {
    return this.distance;
  }

  public void setDistance(int distance)
  {
    this.distance = distance;
  }

  public String getType()
  {
    return this.type;
  }

  public void setType(String type)
  {
    this.type = type;
  }
}
