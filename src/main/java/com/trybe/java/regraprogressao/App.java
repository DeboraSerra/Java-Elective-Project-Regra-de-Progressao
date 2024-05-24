package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int numOfProjects = Integer.parseInt(scanner.nextLine());
    int[] gradeWheights = new int[numOfProjects];
    String[] names = new String[numOfProjects];
    int[] grades = new int[numOfProjects];
    for (int n = 0; n < numOfProjects; n += 1) {
      System.out.println("Digite o nome da atividade " + (n + 1) + ":");
      names[n ] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (n + 1) + ":");
      gradeWheights[n] =Integer.parseInt(scanner.nextLine()) ;
      System.out.println("Digite a nota obtida para " + names[n] + ":");
      grades[n] = Integer.parseInt(scanner.nextLine());
    }
    scanner.close();
    System.out.println(gradeWheights);
    System.out.println(names);
  }
}
