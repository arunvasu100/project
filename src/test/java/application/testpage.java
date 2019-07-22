package application;

public class testpage {
	
	

	@Test
	public void verifyTabs() {
	Assert.assertTrue(homePage.elementFound(homePage.women()));
	Assert.assertTrue(homePage.elementFound(homePage.dress()));
	Assert.assertTrue(homePage.elementFound(homePage.tshirt()));
	}



	    
	    @Test
	    public void verifysize() {
	    Assert.assertTrue(homePage.isElementVisible(homePage.verfiysize()));
	    
	    }
	    
	    @Test
	    public void verifyaddtocart() {
	      
	    }
	    
	    
	    
	    }

}
