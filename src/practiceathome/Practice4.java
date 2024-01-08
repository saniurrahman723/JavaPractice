package practiceathome;

public class Practice4 {
	public static void main(String[] args) {

		//Q.1 Write a java code to find H,K,J from char [] A - Z your output should be = H K J

		String [] nameArray=	{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(String name  :nameArray) {
			if(name == "H" || name == "K" || name == "J") {
				System.out.println(name+ "");
			}


			/* Q.3 Write a java code to compare between two array and find the matching values 
	String [] strings = {"Apple","Orange"} 
	String [] strings2 = {"Banana","Apple","Orange","Mango"}
	your output should be = "Apple","Orange" */


		}
		System.out.println("------------------------");


		/*Q.Write a java code to print 10 to 1
     Your output should look like 10 9 8 7 6 5 4 3 2 1*/ 

		String  name = "12345678910";
		for (int i = name.length()-1; i >=0; i--) {
			System.out.println(name.charAt(i));
		}
		System.out.println("------------------------------------");

		/*Q.Write a java code to print "asrTek" from "     asrTek    "
	your code should remove all the white space and print only asrTek*/

		String name1 = " ASR TEK ";
		System.out.println(name1.trim());

		System.out.println("------------------------------------");

		/*4 write a java program to print below

		 *
		 **
		 ***
		 ****
		 *****
		 ****** */

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();


		}
		/*Q.find duplicate value from array {"Apple","Orange","Banana","Apple","Banana","Mango"};
Output = Apple 
		   Banana*/



	}

}

