package view;
import controller.FrogRaceController;

public class FrogRace
{
 public static void main(String Args[])
 {
	 int[] sapoN = {1,2,3,4,5};
	 int sapoH = 0;
	 int sapoL = 0;
	 
	 for (int i = 0; i < 5; i++)
	 {
	 
	 Thread sapo = new FrogRaceController(sapoN[i], sapoH, sapoL);
	 sapo.start();
	 }
 }
}