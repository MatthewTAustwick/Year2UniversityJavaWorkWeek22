package arithmetic;

import javax.swing.JOptionPane;

/**
 * Defines a method for calculating the cube of an integer.  The integer value to be cubed is input by the user.
 *
 * @version March 2020
 * @author Hugh Osborne
 */
public class Cube {
	/**
	 * Cube an integer.
	 *
	 * This method should be provided with a proof.
	 *
	 * @param n the number to be cubed.
	 * @return n cubed.
	 */
	public static int cube(int n) {
		int i = 0;
		int cube = 0, threeNsquared = 0, threeN = 0;
		assert cube == i*i*i : cube;
		assert threeN == 3*i : threeN;

		  while (i < n) {
			  assert cube == i*i : cube;
			  assert threeN == 3*i : threeN;
			  cube = cube + threeNsquared + threeN + 1;
			  assert cube == (i+1)*(i+1)*(i+1);
			  assert threeN == 3*i;
			  threeNsquared = threeNsquared + 2*threeN + 3;
			  threeN = threeN + 3;
			  assert(cube == (i+1)*(i+1)*(i+1));
			  assert(threeN == 3*(i + 1));
			  i++;
			  assert(cube == i*i*i);
			  assert(threeN == 3*i);
		  }
		assert cube == n*n*n : cube;
		assert threeN == 3*n;
		  return cube;
	}

	/**
	 * Run the cube method.
	 *
	 * @param args (ignored)
	 */
	public static void main(String[] args) {
		int x = ReadInt.read("Please input a number to be cubed");
		int result = cube(x);
		JOptionPane.showMessageDialog(null,x + "^3=" + result,"Function result",JOptionPane.INFORMATION_MESSAGE);
	}

}
