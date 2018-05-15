/**
 * 
 */
package project.utility;

/**
 * @author KyazAi
 *
 */
public class InputOutputDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] authors = {"Sheila98" , "KyazAi"};
		System.out.println(InputOutput.stringAuthor(authors));

		for(int i = 0; i < 10; i++)
			System.out.println(InputOutput.casualInteger(-3, 3));
	}

}
