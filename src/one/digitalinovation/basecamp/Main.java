package one.digitalinovation.basecamp;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício Prático Operações");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagens
        System.out.println("Mensagens");

        Mensagens.obterMensagem(9);
        Mensagens.obterMensagem(14);
        Mensagens.obterMensagem(1);

       // Emprestimo
        System.out.println("Emprestimos");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);


        }
}