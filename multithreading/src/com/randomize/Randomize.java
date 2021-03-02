package com.randomize;
import java.util.Random;

class Randomize implements Runnable {

   Random r = new Random();

   int num;
   
   public void run() {

	   num = r.nextInt(10) + 1;
   }

   int getNumber(){
      return num;
   }

   public static void main (String args[]) throws InterruptedException {

      Randomize rand1 = new Randomize();

      Randomize rand2 = new Randomize();

      Randomize rand3 = new Randomize();

      Randomize rand4 = new Randomize();

      Randomize rand5 = new Randomize();

      Thread th1=new Thread(rand1);

      Thread th2=new Thread(rand2);

      Thread th3=new Thread(rand3);

      Thread th4=new Thread(rand4);

      Thread th5=new Thread(rand5);

      th1.start();

      th2.start();

      th3.start();

      th4.start();

      th5.start();

      th1.join();

      th2.join();

      th3.join();

      th4.join();

      th5.join();

      System.out.println("randomizeThread1: " + rand1.getNumber());

      System.out.println("randomizeThread2: " + rand2.getNumber());

      System.out.println("randomizeThread3: " + rand3.getNumber());

      System.out.println("randomizeThread4: " + rand4.getNumber());

      System.out.println("randomizeThread5: " + rand5.getNumber());

      int sum = 0; 

      sum = sum + rand1.getNumber();

      sum = sum + rand2.getNumber();

      sum = sum + rand3.getNumber();

      sum = sum + rand4.getNumber();

      sum = sum + rand5.getNumber();

      System.out.println("Total: " + sum);

   }

}