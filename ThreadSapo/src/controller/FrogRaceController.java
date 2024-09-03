package controller;

public class FrogRaceController extends Thread
{
 private int sapoN;
 private int sapoH;
 private int sapoL;

 public FrogRaceController(int sapoN, int sapoH, int sapoL)
 {
 this.sapoN = sapoN;
 this.sapoH = sapoH;
 this.sapoL = sapoL;
 }

 public void run()
 {
 Race();
 }

 private void Race()
 {
  int h = 0, l = 0; 
  while (l < 1000)
  {
  sapoH = (int) (Math.random() * 200) + 1;
  h = h + sapoH;
  sapoL = sapoL + (int) (Math.random() * 150) + 1;
  l = l + sapoL;
  System.out.println("O sapo " + sapoN + " deu um salto de " + sapoH + " m de altura e se deslocou " + sapoL + " m de distância");
  }
   System.out.println("O sapo " + sapoN + " passou a linha de chegada uhull");
 }
}
