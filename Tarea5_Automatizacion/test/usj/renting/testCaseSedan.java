package usj.renting;
import static org.junit.Assert.*;

import org.junit.Test;

import usj.renting.SedanPrice;


public class testCaseSedan {

	@Test
	public void negativeInputgetCharge()
	{
		SedanPrice objectSedanPrice = new SedanPrice();
		double dResult = objectSedanPrice.getCharge(-1);
		
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
		SedanPrice objectSedanPrice = new SedanPrice();
		double dResult = objectSedanPrice.getCharge(0);
		
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
		SedanPrice objectSedanPrice = new SedanPrice();
		double dResult = objectSedanPrice.getCharge(2);
		
		if(dResult==1.5)
		{
			assertEquals("1.5",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 1,5");
		}
	}
	
	@Test
	public void limitWithChangeTarificationBelowgetCharge()
	{
		SedanPrice objectSedanPrice = new SedanPrice();
		double dResult = objectSedanPrice.getCharge(3);
		
		if(dResult==1.5)
		{
			assertEquals("1.5",String.valueOf(dResult));
		}
		else
		{
			fail("Retourned value " + dResult+" ,expected 1,5");
		}
	}
	
	@Test
	public void limitWithChangeTarificationAbovegetCharge()
	{
		SedanPrice objectSedanPrice = new SedanPrice();
		double dResult = objectSedanPrice.getCharge(4);
		
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
		SedanPrice objectSedanPrice = new SedanPrice();
		double dResult = objectSedanPrice.getLoyaltyPoints(-1);
		
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
		SedanPrice objectSedanPrice = new SedanPrice();
		double dResult = objectSedanPrice.getLoyaltyPoints(0);
		
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
		SedanPrice objectSedanPrice = new SedanPrice();
		double dResult = objectSedanPrice.getLoyaltyPoints(1);
		
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
