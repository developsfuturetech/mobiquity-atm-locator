package com.mobiquity.atm.locator.dao;

import com.mobiquity.atm.locator.entity.LocatorApiResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface AtmLocatorData
{
  List<LocatorApiResponse> getData() throws IOException;
}
