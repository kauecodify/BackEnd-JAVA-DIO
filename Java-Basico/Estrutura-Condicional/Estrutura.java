/**
 * Estruturas de Repetição: for, while, do-while
 * Estruturas condicionais: if, else, switch-case
 * Estruturas de exceções: try, catch, finally
 */


 //controle de fluxo de condicional simples
 public class ExemploCondicional {
    public static void main(String[] args) {
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }
    }
}

//controle de fluxo de condicional composta

public class ExemploCondicaoComposta {
    public static void main(String[] args) {
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}


//condição encadeada

public class ExemploCondicaoEncadeada {
    public static void main(String[] args) {
        int nota = 75;

        if (nota >= 90) {
            System.out.println("Nota A");
        } else if (nota >= 80) {
            System.out.println("Nota B");
        } else if (nota >= 70) {
            System.out.println("Nota C");
        } else if (nota >= 60) {
            System.out.println("Nota D");
        } else {
            System.out.println("Nota F");
        }
    }
}

//condição ternária

public class ExemploCondicaoTernaria {
    public static void main(String[] args) {
        int numero = 10;

        String resultado = (numero % 2 == 0) ? "par" : "ímpar";

        System.out.println("O número é " + resultado);
    }
}

//Switch-case

public class ExemploSwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDoDia;

        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda-feira";
                break;
            case 3:
                nomeDoDia = "Terça-feira";
                break;
            case 4:
                nomeDoDia = "Quarta-feira";
                break;
            case 5:
                nomeDoDia = "Quinta-feira";
                break;
            case 6:
                nomeDoDia = "Sexta-feira";
                break;
            case 7:
                nomeDoDia = "Sábado";
                break;
            default:
                nomeDoDia = "Dia inválido";
                break;
        }

        System.out.println("O dia da semana é: " + nomeDoDia);
    }
}

