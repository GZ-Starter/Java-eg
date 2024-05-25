#Enter coordinates of n points and display the coordinates of closest two points
import java.util.Scanner;
class Points
{
	private double x_cord,y_cord;

	public void input_points()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X and Y cordinates:");
		x_cord=sc.nextDouble();
		y_cord=sc.nextDouble();
	}

	public void show_points()
	{
		System.out.print("("+x_cord+","+y_cord+")");
	}

	static void findClosestPoints(Points p[],int n)
	{
		Double prevdist=-1.0,d;
		int p1,p2;
		p1=p2=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++){
				d=Math.sqrt(Math.pow(p[j].x_cord-p[i].x_cord,2)+Math.pow(p[j].y_cord-p[i].y_cord,2));

				System.out.println(prevdist);
				System.out.println(d);
				if(prevdist==-1|| prevdist>d){
					prevdist=d;
					p1=i;
					p2=j;
				}
			}
		}
		System.out.print("The closest 2 points are:");
		p[p1].show_points();
		System.out.print(" & ");
		p[p2].show_points();

	}

	public static void main(String args[])
	{
		int n=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of points:");
		n=sc.nextInt();
		Points p[]=new Points[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new Points();
			p[i].input_points();

		}

		Points.findClosestPoints(p,n);
	}
}
