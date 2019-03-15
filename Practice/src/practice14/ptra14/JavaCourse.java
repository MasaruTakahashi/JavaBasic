package practice14.ptra14;

import practice14.common.Course;

public class JavaCourse implements Course {

	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

	private String CourseName;
	private String[] CourseUnit;

	public void PREFIX() {

	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}

	public String[] getCourseUnit() {
		return CourseUnit;
	}

	public void setCourseUnit(String[] CourseUnit) {
		this.CourseUnit = CourseUnit;
	}

	public static void main(String[] args) {

		JavaCourse PREFIX = new JavaCourse();

		PREFIX.setCourseName("【Eラーニング】Java");
		System.out.println(PREFIX.getCourseName());

		String[] courseunit = { "式と演算", "制御構文", "メソッド", "配列", "オブジェクト指向", "継承", "高度な継承" };
		//		for(int i = 0 ; i < courseunit.length ; i++)
		PREFIX.setCourseUnit(courseunit);

		for (int i = 0; i < PREFIX.getCourseUnit().length; i++) {
			System.out.println(PREFIX.getCourseUnit()[i]);

		}

	}

}
