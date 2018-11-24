package chapter01;

public class ArrayTest01 {
	public static void main(String[] args) {
		int student1Score = 100;
		int student2Score = 50;
		int student3Score = 70;
		int student4Score = 80;
		
		int[] studentScores = new int[4];
		studentScores[0] = 100;
		studentScores[1] = 90;
		studentScores[2] = 80;
		studentScores[3] = 70;
		
		int sum = 0;
		for(int i = 0; i < studentScores.length; i++) {
			sum += studentScores[i];
		}
		
		// for each
		for( int score : studentScores ){
			System.out.println( score );
		}
		
		System.out.println(sum);
		System.out.println(sum/studentScores.length);
	}
}
