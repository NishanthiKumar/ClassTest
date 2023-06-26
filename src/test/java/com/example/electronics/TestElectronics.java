package com.example.electronics;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestElectronics {
    @Autowired
	AcController ad;
	
	@Test
	public void testGetThis() {
		ad.getThis();
	}
	
	

}
