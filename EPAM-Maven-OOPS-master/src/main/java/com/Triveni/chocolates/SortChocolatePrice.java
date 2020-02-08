package com.Triveni.chocolates;

import java.util.Comparator;
import com.Triveni.chocolates.Chocolate;

public class SortChocolatePrice implements Comparator<Chocolate>
{
	public int compare(Chocolate a,Chocolate b)
	{
		if(a.getPrice() - b.getPrice()>0)
		{
			return 1;
		}
		else if(a.getPrice() - b.getPrice()<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
