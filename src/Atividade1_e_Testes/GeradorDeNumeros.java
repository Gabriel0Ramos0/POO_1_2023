package Atividade1_e_Testes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class GeradorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<List<Integer>> ultimosSorteios = new ArrayList<>();
        
        boolean continuarSorteio = true;
        List<Integer> numerosFixos = new ArrayList<>();

        // Peça ao usuário para inserir 3 números diferentes e verifique a validade
        while (numerosFixos.size() < 3) {
            System.out.print("Digite um número fixo (1-25): ");
            int numeroFixo = scanner.nextInt();
            if (numeroFixo >= 1 && numeroFixo <= 25 && !numerosFixos.contains(numeroFixo)) {
                numerosFixos.add(numeroFixo);
            } else {
                System.out.println("Número inválido ou duplicado. Tente novamente.");
            }
        }
        
        while (continuarSorteio) {
            // Realiza o sorteio de 12 números de 1 a 25 sem repetição
            Set<Integer> numerosSorteados = new HashSet<>(numerosFixos); // Inclui os números fixos
            while (numerosSorteados.size() < 15) {
                int numeroSorteado;
                do {
                    numeroSorteado = random.nextInt(25) + 1;
                } while (numerosSorteados.contains(numeroSorteado));
                numerosSorteados.add(numeroSorteado);
            }
            
            // Converte o Set para uma lista
            List<Integer> numerosSorteadosList = new ArrayList<>(numerosSorteados);
            
            // Exibe os números sorteados
            System.out.println("Números sorteados: " + numerosSorteadosList);
            
            // Adiciona uma cópia dos números sorteados à lista de últimos sorteios
            ultimosSorteios.add(numerosSorteadosList);

            // Pergunta ao usuário se deseja fazer outro sorteio
            System.out.print("Deseja fazer outro sorteio? (S/N): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("N")) {
                continuarSorteio = false;
            }
        }
        
        // Conta a quantidade de ocorrências de cada número
        int[] contagem = new int[25];
        for (List<Integer> sorteioAnterior : ultimosSorteios) {
            for (int numero : sorteioAnterior) {
                contagem[numero - 1]++;
            }
        }

        // Exibe os números que não caíram ou tiveram uma ocorrência baixa
        System.out.println("Números que não caíram ou tiveram uma ocorrência baixa:");
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] == 0 || contagem[i] < 2) {
                System.out.print((i + 1) + " ");
            }
        }
        
        scanner.close();
    }
}
