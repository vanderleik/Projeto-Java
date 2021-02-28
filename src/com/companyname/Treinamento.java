package com.companyname;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Essa aplicacao foi criada para gerenciar um treinamento realizado em duas etapas, com alunos divididos em duas turmas.
 * A partir de uma lista de alunos, salas de aula e espaco de cafe, e gerado um ensalamento, permitindo a troca de 50% deles entre os dois dias do evento.
 *
 * @author Vanderlei Kleinschmidt
 * @version 1.0
 *
 */

public class Treinamento {

    public static void main(String[] args) throws IOException {

/**
 * A primeira parte deste projeto cria Strings que receberão mais adiante os dados dos participantes.
 *
 * Alunos participantes do evento: No máximo 9 alunos divididos em duas salas de treinamento.
 * Temos uma String para o nome e uma para os sobrenomes. Depois é feita a concatenação na hora de imprimir os dados na tela.
  */

        String[] alunoNome = new String[9];
        String[] alunoSobrenome = new String[9];

/**
 * Salas de treinamento: São duas salas sendo uma delas com capacidade para 5 alunos e a outra com capacidade para 4 alunos.
 *
 */
        String[] sala = new String[2]; // Tamanho máximo de 2 porque só pode receber dois valores (duas salas)
        int[] salaLotacao = new int[2]; // Tamanho máximo de 2 porque só pode receber dois valores. O valor é equivalente à capacidade de cada sala.

/**
* Espaço café: São dois espaços para servir o coffee break. Cada espaço recebe uma das turmas.
*/
        String[] coffee = new String[2]; // Mesma regra das salas de treinamento.
        int[] cofeeLotacao = new int[2]; // Mesma regra das salas de treinamento.

/**
 * Etapas do treinamento: O treinamento é dividido em duas etapas. Na segunda etapa, metade dos alunos trocam de sala com o objetivo de estimular a troca de conhecimentos e experiências.
 */
        String[] etapas = new String[2]; // O treinamento é dividido em duas etapas.

/**
*       1. Alimentando as Strings com os dados:
 *
 *      1.1. Alunos (nome e sobrenome): para este projeto estou usando os nomes dos integrantes da banda Titãs (formação inicial da banda).
 */
        alunoNome = new String[]{"Arnaldo", "Branco", "Marcelo", "Nando", "Paulo", "Sérgio", "Tony", "Ciro", "André"};
        alunoSobrenome = new String[]{"Antunes", "Mello", "Fromer", "Reis", "Miklos", "Britto", "Bellotto", "Pessoa", "Jung"};

/**
 * É possível verificar se a inclusão dos dados nas Strings deu certo, ativando o código abaixo:
 *         System.out.println("Nomes: "+ Arrays.toString(alunoNome));
 *         System.out.println("Sobrenomes: " + Arrays.toString(alunoSobrenome));
 */

/**
 *      1.1.2. Armazenando os dados dos alunos (Nome e Sobrenome em arquivo texto.
 *      Estou usando Arrays Multidimensionais para concatenar o nome e o sobrenome dos alunos que estão participando do treinamento.
 */
        String[][] alunosNomeCompleto;
        alunosNomeCompleto = new String[][]{
                {alunoNome[0], alunoSobrenome[0]},
                {alunoNome[1], alunoSobrenome[1]},
                {alunoNome[2], alunoSobrenome[2]},
                {alunoNome[3], alunoSobrenome[3]},
                {alunoNome[4], alunoSobrenome[4]},
                {alunoNome[5], alunoSobrenome[5]},
                {alunoNome[6], alunoSobrenome[6]},
                {alunoNome[7], alunoSobrenome[7]},
                {alunoNome[8], alunoSobrenome[8]}
        };
/**
 * A lista gerada com nome e sobrenome é impressa no arquivo "alunos.txt", para arquivo e acesso futuro, permitindo assim a persistência dos dados.
 */

        String students = "alunos.txt";
        try (FileOutputStream fos1 = new FileOutputStream(students)) {

            String pt1 = Arrays.deepToString(alunosNomeCompleto);
            byte[] mybytes = pt1.getBytes();

            fos1.write(mybytes);
        }

/**
 *      1.2. Salas de treinamento:
 *      São duas salas de treinamento, inspiradas no Rock'n'Rio. Uma delas se chama Paco Mundo (que é o paco principal da cidade do Rock) e a outra o Palco Sunset, que é muito importante por abrir espaço para apresentação de grandes bandas antes das atrações principais no Palco Mundo.
 */

        sala = new String[]{"Palco Mundo", "Palco Sunset"};

/**
 *      1.2.1. Armazenando os dados das salas de treinamento em arquivo texto.
 *      A lista de palcos, ou salas de aula, é impressa e salva em um arquivo texto, chamado "salasdetreinamento.txt".
 */

        String classe = "salasdetreinamento.txt";
        try (FileOutputStream fos2 = new FileOutputStream(classe)) {

            String pt2 = Arrays.deepToString(sala);
            byte[] mybytes = pt2.getBytes();

            fos2.write(mybytes);
        }

/**
*        1.3. Espaço café:
 *        São dois espaços café criados, um para cada turma, cujos alunos devem usar de forma alternada (pelo menos metade deles) entre os dias de treinamento.
 *        Os nomes são inspirados nas famosas franquias americanas Hard Rock Cafe e Starbucks.
*/
        coffee = new String[]{"Hard Rock", "Starbucks"};

/**
*       1.3.1. Armazenando os dados dos espaços de café em arquivo texto.
 *      A lista de espaços café é impressa e salva em um arquivo texto, chamado "salasdecafe.txt".
*/

        String coffeePlace = "salasdecafe.txt";
        try (FileOutputStream fos3 = new FileOutputStream(coffeePlace)) {

            String pt3 = Arrays.deepToString(coffee);
            byte[] mybytes = pt3.getBytes();

            fos3.write(mybytes);
        }

/**
*       1.4. Etapas do treinamento:
*       Temos duas etapas de treinamento, ou o treinamento é dividido em dois dias. Optei por nomes simples como "Etapa 01" e "Etapa 02".
*/

        etapas = new String[]{"Etapa 01", "Etapa 02"};

/**
*       1.4.1. Armazenando os dados das etapas de treinamento em arquivo texto.
 *      A lista das etapas de treinamento é impressa e salva em um arquivo texto, chamado "etapastreinamento.txt".
*/

        String etapasTreina = "etapastreinamento.txt";
        try (FileOutputStream fos4 = new FileOutputStream(etapasTreina)) {

            String pt4 = Arrays.deepToString(etapas);
            byte[] mybytes = pt4.getBytes();

            fos4.write(mybytes);
        }

/**
*        2. Imprimindo os dados das turmas na primeira etapa do treinamento (Nome, Sala de Treinamento e Sala de Café).
 *       O bloco de códigos abaixo tem por objetivo listar na tela os alunos que participam da primeira etapa de treinamento, relacionando cada aluno às suas respectivas salas e espaços café.
*/

        System.out.println("Primeira etapa do treinamento");
        System.out.println("Aluno" + "             " + "[Sala]" + "            " + "(Espaço Café)");
        for (int i = 0; i < alunoNome.length; i++) {
            if (i < 4) {
                System.out.println(alunoNome[i] + " " + alunoSobrenome[i] + "      " + "[" + sala[0] + "]" + "      " + "(" + coffee[0] + ")");
            } else {
                System.out.println(alunoNome[i] + " " + alunoSobrenome[i] + "      " + "[" + sala[1] + "]" + "      " + "(" + coffee[1] + ")");
            }
        }

/**
*       2.1. Armazenando os dados da primeira etapa do treinamento:
 *      A listagem gerada é armazenada em um Array Multidimensional, contendo a etapa equivalente, nome do aluno, sala e espaço café.
*/

        String[][] primeiraEtapa;
        primeiraEtapa = new String[][]{
                {etapas[0], alunoNome[0], sala[0], coffee[0]},
                {etapas[0], alunoNome[1], sala[0], coffee[0]},
                {etapas[0], alunoNome[2], sala[0], coffee[0]},
                {etapas[0], alunoNome[3], sala[0], coffee[0]},
                {etapas[0], alunoNome[4], sala[1], coffee[1]},
                {etapas[0], alunoNome[5], sala[1], coffee[1]},
                {etapas[0], alunoNome[6], sala[1], coffee[1]},
                {etapas[0], alunoNome[7], sala[1], coffee[1]},
                {etapas[0], alunoNome[8], sala[1], coffee[1]}
        };
/**
 *      Os dados gravados no Array são transferidos para a String "first" e posteriormente gravados no arquivo "primeiraEtapa.txt".
  */
        String first = "primeiraEtapa.txt";
        try (FileOutputStream fos5 = new FileOutputStream(first)) {

            String pt5 = Arrays.deepToString(primeiraEtapa);
            byte[] mybytes = pt5.getBytes();

            fos5.write(mybytes);
        }

/**
*       3. Imprimindo os dados das turmas na segunda etapa do treinamento (Nome, Sala de Treinamento e Sala de Café).
*       O bloco de códigos abaixo tem por objetivo listar na tela os alunos que participam da segunda etapa de treinamento, relacionando cada aluno às suas respectivas salas e espaços café.
*/

        System.out.println();
        System.out.println("Segunda etapa do treinamento");
        System.out.println("Aluno" + "             " + "[Sala]" + "            " + "(Espaço Café)");
        for (int i = 0; i < alunoNome.length; i++) {
            if (i < 2) {
                System.out.println(alunoNome[i] + " " + alunoSobrenome[i] + "      " + "[" + sala[1] + "]" + "      " + "(" + coffee[1] + ")");
            } else if (i == 3) {
                System.out.println(alunoNome[3] + " " + alunoSobrenome[3] + "      " + "[" + sala[0] + "]" + "      " + "(" + coffee[0] + ")");
            } else if (i == 4) {
                System.out.println(alunoNome[4] + " " + alunoSobrenome[4] + "      " + "[" + sala[0] + "]" + "      " + "(" + coffee[0] + ")");
            } else {
                System.out.println(alunoNome[i] + " " + alunoSobrenome[i] + "      " + "[" + sala[1] + "]" + "      " + "(" + coffee[1] + ")");
            }
        }
/**
 *      3.1. Armazenando os dados da segunda etapa do treinamento:
 *      A listagem gerada é armazenada em um Array Multidimensional, contendo a etapa equivalente, nome do aluno, sala e espaço café.
 */

        String[][] segundaEtapa;
        segundaEtapa = new String[][]{
                {etapas[1], alunoNome[0], sala[1], coffee[1]},
                {etapas[1], alunoNome[1], sala[1], coffee[1]},
                {etapas[1], alunoNome[2], sala[1], coffee[1]},
                {etapas[1], alunoNome[3], sala[0], coffee[0]},
                {etapas[1], alunoNome[4], sala[0], coffee[0]},
                {etapas[1], alunoNome[5], sala[1], coffee[1]},
                {etapas[1], alunoNome[6], sala[1], coffee[1]},
                {etapas[1], alunoNome[7], sala[1], coffee[1]},
                {etapas[1], alunoNome[8], sala[1], coffee[1]}
        };
/**
 *      Os dados gravados no Array são transferidos para a String "second" e posteriormente gravados no arquivo "segundaEtapa.txt".
  */

        String second = "segundaEtapa.txt";
        try (FileOutputStream fos6 = new FileOutputStream(second)) {

            String pt6 = Arrays.deepToString(segundaEtapa);
            byte[] mybytes = pt6.getBytes();

            fos6.write(mybytes);
        }

/**
 *       4. Consultas.
 *       4.1. Vamos verificar se uma pessoa está matriculada no treinamento. Para isso usamos o binary search, que é um algorítimo de pesquisa binária.
*/

        List<String> list = new ArrayList<String>(Arrays.asList(alunoNome)); // Criando um ArrayList a partir do conteúdo do Array "primeira etapa".
        Collections.sort(list); // Ordena o array
        System.out.println();
        System.out.printf("ArrayList ordenada: %s%n", list);

/**
 *      4.2. Pesquisa vários valores na lista:
 *      Especifico quais valores (nomes) eu quero pesquisar na minha relação de alunos. Se a pessoa estiver matriculada, a aplicação retorna com o número do índice em que está armazenado o nome. Caso não esteja matriculado, retorna uma mensagem informando que não está matriculado.
 */

        printSearchResults(list, "Arnaldo"); // Primeira pessoa a ser pesquisada
        printSearchResults(list, "Marcelo"); // Segunda pessoa a ser pesquisada
        printSearchResults(list, "Vanderlei"); // Essa pessoa não está participando do treinamento
    }

        // 4.3. Realiza a pesquisa e apresenta o resultado
            private static void printSearchResults(List<String> list, String key)
    {
        int result = 0;

        System.out.printf("%nPesquisando por: %s%n", key);
        result = Collections.binarySearch(list, key);

        if (result >= 0)
            System.out.printf("Encontrado no indice %d%n", result);
        else
            System.out.printf("Aluno nao matriculado (%d)%n",result);

    }

  }