package TestStudent;
public class TestStudent 
{

	public static void main(String[] args) 
	{
		Student s1;
		
		s1 = new Student();
		System.out.println(s1);
		s1.setName("Ally");
		System.out.println(s1.getName());
		s1.setScore(1, 64);
		s1.setScore(2, 76);
		s1.setScore(3, 88);
		System.out.println("Most recent:\t" + s1.getScore(3));
		System.out.println("Average:\t" + s1.getAverage());
		System.out.println("High Score:\t" + s1.getHighScore());
		System.out.println("\nHere is student s1\n" + s1);

	}

}