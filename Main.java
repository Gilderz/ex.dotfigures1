//******Задача про вкладені цикли  (базові графічні примітиви 3)******//

package main;
public class Main {
    public static void main(String[] args) {
        int rows = 6;
      //******Трикутник******//
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < 2 * rows - 1; j++) {

                if (j >= rows - i - 1 && j <= rows + i - 1) {
                    System.out.print(". ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
        System.out.println();
        //******Трапеція******//
        	for (int i = 3; i < rows; i++) {

            for (int j = 0; j < 2 * rows - 1; j++) {

                if (j >= rows - i - 1 && j <= rows + i - 1) {
                    System.out.print(". ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}
