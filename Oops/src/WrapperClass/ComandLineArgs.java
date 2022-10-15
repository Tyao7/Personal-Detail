package WrapperClass;

public class ComandLineArgs {
	public static void main(String[] tyao) {
		int lenght = tyao.length;
		if (lenght == 0) {
			System.out.println("no input provide");
		} else {
			System.out.println("List of argument");
			//\u000d System.out.println(tyao[4]);

			for (int i = 0; i < lenght; i++) {
				System.out.println(tyao[i]);
			}
			//\u000dSystem.out.println("ejaz");

		}
	}
}
