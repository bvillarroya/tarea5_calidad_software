package usj.renting;
import static org.junit.Assert.*;

import org.junit.Test;

import usj.renting.CoupePrice;


public class testCaseCoupe {

	@Test
	public void negativeInputgetCharge()
	{
		CoupePrice objectCoupePrice = new CoupePrice();
		double dResult = objectCoupePrice.getCharge(-1);
		
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
		CoupePrice objectCoupePrice = new CoupePrice();
		double dResult = objectCoupePrice.getCharge(0);
		
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
		CoupePrice objectCoupePrice = new CoupePrice();
		double dResult = objectCoupePrice.getCharge(1);
		
		if(dResult==2)
		{
			assertEquals("2.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 2");
		}
	}
	
	@Test
	public void limitWithChangeTarificationBelowgetCharge()
	{
		CoupePrice objectCoupePrice = new CoupePrice();
		double dResult = objectCoupePrice.getCharge(2);
		
		if(dResult==2)
		{
			assertEquals("2.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 2");
		}
	}
	
	@Test
	public void limitWithChangeTarificationAbovegetCharge()
	{
		CoupePrice objectCoupePrice = new CoupePrice();
		double dResult = objectCoupePrice.getCharge(3);
		
		if(dResult==3.5)
		{
			assertEquals("3.5",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 3.5");
		}
	}
	
	@Test
	public void negativeInputgetLoyaltyPoints()
	{
		CoupePrice objectCoupePrice = new CoupePrice();
		double dResult = objectCoupePrice.getLoyaltyPoints(-1);
		
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
		CoupePrice objectCoupePrice = new CoupePrice();
		double dResult = objectCoupePrice.getLoyaltyPoints(0);
		
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
		CoupePrice objectCoupePrice = new CoupePrice();
		double dResult = objectCoupePrice.getLoyaltyPoints(1);
		
		if(dResult==1)
		{
			assertEquals("1.0",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 1");
		}
	}

}
