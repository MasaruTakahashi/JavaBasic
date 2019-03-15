package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course {

	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

	String CourseName;
	String[] CourseUnit;

	public void PREFIX(){

	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String[] getCourseUnit() {
		return CourseUnit;
	}

	public void setCourseUnit(String[] courseUnit) {
		CourseUnit = courseUnit;
	}


	public static void main(String[] args) {

		DBCourse PREFIX = new DBCourse();

		PREFIX.setCourseName("【Eラーニング】DB基礎");
		System.out.println(PREFIX.getCourseName());

		String[] courseunit = {"DB基礎","SQL基礎","正規化","SQL応用"};
		PREFIX.setCourseUnit(courseunit);
		for(int i = 0 ; i < PREFIX.getCourseUnit().length ; i++) {
			System.out.println( PREFIX.getCourseUnit()[i]);

	}

	}

}
