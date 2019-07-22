package application;

public class testpage {
	
	

	@Test
	public void verifyTabs() {
	Assert.assertTrue(homePage.elementFound(homePage.women()));
	Assert.assertTrue(homePage.elementFound(homePage.dress()));
	Assert.assertTrue(homePage.elementFound(homePage.tshirt()));
	}



	    
	    @Test
	    public void verifysize12345() {
	    Assert.assertTrue(homePage.isElementVisible(homePage.verfiysize()));
	    
	    }
	    
	    @Test
	    public void verifyaddtocart() {
	      
	    }
	    
	    
	    
	    }

}
