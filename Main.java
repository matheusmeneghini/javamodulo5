import models.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("--- PEDIDO DE VENDAS ---");

        int option;

        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.println("");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual operação você deseja realizar?");
            option = scanner.nextInt();

            process(option);
        } while(option != 0);
    }

    public static void process(int option) throws Exception {
        switch (option) {
            case 1: {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Qual a descrição que você deseja dar ao novo produto: ");
                String descricao = scanner.nextLine();

                System.out.print("Qual o ID que você deseja dar ao novo produto: ");
                int id = scanner.nextInt();
                Integer objint = new Integer(id);

                System.out.print("Qual o preço: ");
                double preco = scanner.nextDouble();
                Double objdouble = new Double(preco);

                System.out.print("Qual a data de validade: ");
                String dataString = scanner.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produto novoProduto = new Produto(id, descricao, preco, dataValidade);

                System.out.println("Produto criado com sucesso: ");
                //System.out.println("--- ID: " + novoProduto.getId());
                System.out.println("--- ID: " + objint);
                System.out.println("--- Descrição: " + novoProduto.getDescricao());
                System.out.println("--- Preço: " + objdouble);
                System.out.println("--- Data de Validade: " + novoProduto.getDataValidade());
                System.out.println("-----------------------------------------------");
            }
        }
    }
}