package com.soni;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class LocationFinderMain {
	public static void main(String[] args) {
		String ipAddress = args[0];
		GeoIPService geoIpService = new GeoIPService();							// WSDL - Service
		GeoIPServiceSoap geoIpServiceSoap = geoIpService.getGeoIPServiceSoap();	// WSDL - Port
		GeoIP geoIp = geoIpServiceSoap.getGeoIP(ipAddress);
		System.out.println(geoIp.getCountryName());
	}
}
