package com.array2D;

public class twoDMax {

	public void colMax(int s[][])
	{
		for(int i=0;i<s.length;i++)
		{
			int max= s[0][i];
			for(int j=0;j<s[i].length;j++)
			{
				if(max<s[j][i])
				{
					max=s[j][i];
				}
			}
			System.out.println(max);
		}
	}
	
	public void rowMax(int s[][])
	{
		for(int i=0;i<s.length;i++)
		{
			int max=s[i][0];
			for(int j=0;j<s[i].length;j++)
			{
				if(max<s[i][j])
				{
					max=s[i][j];
				}
			}
			System.out.println(max);
		}
	}
	public static void main(String[] args) {
		
		int s[][]= {{2,4,5,6},
					{1,3,7,9},
					{8,0,4,6},
					{1,3,6,8}};
		
		twoDMax t= new twoDMax();
		t.colMax(s);
		System.out.println("==================================");
		t.rowMax(s);
	}
}
