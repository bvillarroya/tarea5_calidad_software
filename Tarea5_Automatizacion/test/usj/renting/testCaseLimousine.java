package usj.renting;
import static org.junit.Assert.*;

import org.junit.Test;

import usj.renting.LimousinePrice;


public class testCaseLimousine {

	@Test
	public void negativeInputgetCharge()
	{
		LimousinePrice objectLimousinePrice = new LimousinePrice();
		double dResult = objectLimousinePrice.getCharge(-1);
		
		if(dResult==-1)
		{
			assertEquals("-1.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected -1");
		}
	}
	
	@Test
	public void zeroInputgetCharge()
	{
		LimousinePrice objectLimousinePrice = new LimousinePrice();
		double dResult = objectLimousinePrice.getCharge(0);
		
		if(dResult==-1)
		{
			assertEquals("-1.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected -1");
		}
	}
	
	@Test
	public void limitWithWrongValuesgetCharge()
	{
		LimousinePrice objectLimousinePrice = new LimousinePrice();
		double dResult = objectLimousinePrice.getCharge(1);
		
		if(dResult==3)
		{
			assertEquals("3.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 3");
		}
	}
	
	@Test
	public void negativeInputgetLoyaltyPoints()
	{
		LimousinePrice objectLimousinePrice = new LimousinePrice();
		double dResult = objectLimousinePrice.getLoyaltyPoints(-1);
		
		if(dResult==-1)
		{
			assertEquals("-1.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected -1");
		}
	}
	
	@Test
	public void zeroInputgetLoyaltyPoints()
	{
		LimousinePrice objectLimousinePrice = new LimousinePrice();
		double dResult = objectLimousinePrice.getLoyaltyPoints(0);
		
		if(dResult==-1)
		{
			assertEquals("-1.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected -1");
		}
	}
	
	@Test
	public void limitWithWrongValuesgetLoyaltyPoints()
	{
		LimousinePrice objectLimousinePrice = new LimousinePrice();
		double dResult = objectLimousinePrice.getLoyaltyPoints(1);
		
		if(dResult==1)
		{
			assertEquals("1.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 1");
		}
	}
	
	@Test
	public void limitWithTarificationChangeAbovegetLoyaltyPoints()
	{
		LimousinePrice objectLimousinePrice = new LimousinePrice();
		double dResult = objectLimousinePrice.getLoyaltyPoints(2);
		
		if(dResult==2)
		{
			assertEquals("2.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 2");
		}
	}

}
