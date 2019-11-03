package interview.preparation;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List users = null;
		getU(users);
		System.out.println(users.get(0));

	}

	static void getU(List users) {
		users = new ArrayList();
		users.add("user1");
	}
}
