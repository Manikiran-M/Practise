
class AdditionMatrix
{
	public static void main(String args[])
	{
	int Matrix1[][]={{1,4,7},{2,5,8},{3,6,9}};
	int Matrix2[][]={{3,6,9},{2,5,8},{1,4,7}};
	for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
			{
			System.out.print(Matrix1[i][j]+Matrix2[i][j]+" ");
			}
		System.out.println();
		}
	}
}
