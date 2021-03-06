package com.Triveni.chocolates;

import java.util.Comparator;
import com.Triveni.chocolates.Chocolate;

public class SortChocolateWeight implements Comparator<Chocolate>
{
	public int compare(Chocolate a,Chocolate b)
	{
		if(a.getWeight() - b.getWeight()>0)
		{
			return 1;
		}
		else if(a.getWeight() - b.getWeight()<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
