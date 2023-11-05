
public class Array03 {
	public static double getAverage(double[] student1) {
		double sum = 0.0;
		double average = 0.0;
		for (int i = 0; i < student1.length; i++) {
			sum += student1[i];
		}
		average = sum / student1.length;
		return average;
	}	
	public static void main(String[] args) {
		// 한반에 학생이 3명이 있고 
		// 각 학생은 국 영 수를 수강하고 있고 각학생들의 점수(정수)를 배열로 표현해 봅시다
		double[] student1 = {95,98,99};
		double[] student2 = {85,95,75};
		double[] student3 = {88,78,79};
		
		// 각 학생들의 평균을 구해서 그 평균들을 배열로 저장해주세요
		double[] studentAverage = new double[3];
		studentAverage[0] = getAverage(student1);		
		studentAverage[1] = getAverage(student2);
		studentAverage[2] = getAverage(student3);
		// 출력
		for (int i = 0; i < studentAverage.length; i++) {
			System.out.format("평균 : %.2f\n", studentAverage[i]);
		}
	}

}
