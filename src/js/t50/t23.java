package js.t50;

/**
 * 题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，
 * 说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
 */
public class t23 {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(f(10, 34));
	}

	private static int f(int i, int j) {
		int age = 0;
		if (j == 1) {
			age = i;
		} else {
			age = f(i + 2, j = j - 1);
		}
		return age;
	}
}
