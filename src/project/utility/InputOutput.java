/**
 * 
 */
package project.utility;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author KyazAi
 *
 */
public class InputOutput {
		
	public final static String INSERT = "\n> ";
	public final static String NUMBER_ELEMENTS = "Insert the number of elements:";
	public final static String NUMBER_ROWS = "Insert the number of rows:";
	public final static String NUMBER_COLUMNS = "Insert the number of columns:";
	public final static String SHARP = "#";
	public final static String ASTERIX = "*";
	public final static String SPACE = " ";
	public final static String SLASH = "/";
	public final static String NEW_LINE = "\n";
	
	public static String insertString() {
		boolean error = true;
		String input = null;
		do {
			Scanner i = new Scanner(System.in);
			System.out.print(INSERT);
			input = i.nextLine();
			if(!input.isEmpty()) 
				return input;
		}while(error);
		return input;
		
	}
	
	public static String insertVector() {
		System.out.println(NUMBER_ELEMENTS);
		int elements = (int)InputOutput.insertReal();
		String[] vector = new String[elements];
		for(int i=0;i<elements;i++) {
			System.out.println(SHARP+(i+1)+SLASH+SHARP+elements);
			vector[i] = InputOutput.insertString();
		}
		return stringVector(vector);
	}
	
	public static String insertTable() {
		System.out.println(NUMBER_ROWS);
		int rows = (int)InputOutput.insertReal();
		System.out.println(NUMBER_COLUMNS);
		int col = (int)InputOutput.insertReal();
		String[][] table = new String[rows][col];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(SHARP+(i+1)+SLASH+SHARP+rows+SPACE+SHARP+(j+1)+SLASH+SHARP+(col));
				table[i][j] = InputOutput.insertString();
			}
		}
		return stringTable(table);
	}
	
	public static String stringVector(String[] vector) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<vector.length;i++)
			sb.append(SHARP+(i+1)+SPACE+vector[i]+NEW_LINE);
		return sb.toString();
	}
	
	public static String stringTable(String[][] table ) {
		int maxLength = table[0][0].length();
		for(String[] row : table)
			for(String col : row)
				maxLength = Math.max(col.length(), maxLength);
		StringBuffer sb = new StringBuffer();
		for(String[] row : table) {
			for(String col : row)
				sb.append(String.format("%"+2*maxLength+"s"+SPACE, col));
			sb.append(NEW_LINE+NEW_LINE);
		}
	return sb.toString();
	}
	
	public static String stringAuthor(String[] authors) {
		int maxLength = authors[0].length();
		for(String author : authors)
			maxLength = Math.max(author.length(), maxLength);
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 2*maxLength; i++)
			sb.append(SHARP);
		sb.append(NEW_LINE);
		
		for(String author : authors) 
			sb.append(NEW_LINE+author);
		sb.append(NEW_LINE+NEW_LINE);
		for(int i = 0; i < 2*maxLength; i++)
			sb.append(SHARP);
		return sb.toString();
	}
	
	public static double insertReal() {
		boolean error = true;
		double input=-1.0;
		do {
			Scanner i = new Scanner(System.in);
			try {
				
				System.out.print(INSERT);
				input = i.nextDouble();
				error = false;
			}catch(InputMismatchException ex) {
				i.next();
			}
		}while(error);
		return input;
	}
	
	public static double insertReal(double min, double max) {
		double tmp = min;
		min = Math.min(min, max);
		max = Math.max(tmp, max);
		boolean error=true;
		double temp;
		do {
			temp = insertReal();
			if(temp<=max&&temp>=min)
				error=false;
		}while(error);
		return temp;
	}
	
	public static int insertInteger() {
		boolean error = true;
		int input=-1;
		do {
			Scanner i = new Scanner(System.in);
			try {
				
				System.out.print(INSERT);
				input = i.nextInt();
				error = false;
			}catch(InputMismatchException ex) {
				i.next();
			}
		}while(error);
		return input;
	}
	
	public static int insertInteger(int min, int max) {
		int tmp = min;
		min = Math.min(min, max);
		max = Math.max(tmp, max);
		boolean error=true;
		int temp;
		do {
			temp = insertInteger();
			if(temp<=max&&temp>=min)
				error=false;
		}while(error);
		return temp;
	}
	
	public static int casualInteger(int min, int max) {
		int tmp = min;
		min = Math.min(min, max);
		max = Math.max(tmp, max);
		Random rdm = new Random();
		return min + rdm.nextInt(max + 1 - min);
	}
	
}
