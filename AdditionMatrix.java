
class AdditionMatrix
{
	public static void main(String args[])
	{
	int a[][]={{1,4,7},{2,5,8},{3,6,9}};
	int b[][]={{3,6,9},{2,5,8},{1,4,7}};
	for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
			{
			System.out.print(a[i][j]+b[i][j]+" ");
			}
		System.out.println();
		}
	}
}