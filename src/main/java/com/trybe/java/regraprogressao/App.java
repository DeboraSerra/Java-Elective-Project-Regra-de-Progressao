package com.trybe.java.regraprogressao;

import java.util.Arrays;
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
      names[n] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (n + 1) + ":");
      gradeWheights[n] = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + names[n] + ":");
      grades[n] = Integer.parseInt(scanner.nextLine());
    }
    System.out.println(Arrays.stream(gradeWheights).count());
    if (Arrays.stream(gradeWheights).count() != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      return;
    }
    int gradesSum = 0;
    for (int n = 0; n < numOfProjects; n += 1) {
      gradesSum += (grades[n] * gradeWheights[n]);
    }
    long result = gradesSum / 100;
    if (result >= 85) {
      String successPrefix = "Parabéns! Você alcançou ";
      String successSuffix = "%! E temos o prazer de informar que você obteve aprovação!";
      System.out.println(successPrefix + String.format("%.1f", result) + successSuffix);
    } else {
      String failPrefixPart1 = "Lamentamos informar que, ";
      String failPrefixPart2 = "com base na sua pontuação alcançada neste período, ";
      String failPrefix = failPrefixPart1 + failPrefixPart2;
      String failSuffix = "%, você não atingiu a pontuação mínima necessária para sua aprovação";
      System.out.println(failPrefix + String.format("%.1f", result) + failSuffix);
    }
    scanner.close();
  }
}
