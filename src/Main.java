package application;

import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Funcionario func = new Funcionario();

        System.out.println("Insira os dados do funcionário abaixo, nome, salário e imposto: ");
        func.nome = sc.next();
        func.salarioBruto = sc.nextDouble();
        func.taxaDeImposto = sc.nextDouble();

        System.out.println("Funcionário:  " + func);

        System.out.println("Qual a porcentagem em que você quer aumentar o salário?");
        double percAumenta = sc.nextDouble();

        func.aumentaSalario(percAumenta);

        System.out.println("Funcionário atualizado: " + func);

        sc.close();
    }
}