<h1 align="center"> Projeto-Java</h1>

<p align="center">Meu primeiro projeto Java</p>

Tabela de conteúdos
=================

   * [Sobre]
   * [Instalação e modo de usar]
   * [Como o programa funciona usar]
   * [JavaDoc]

<h3> Sobre </h3>

Este projeto desenvolve uma aplicação em Java, utilizando o Intellij Idea (https://www.jetbrains.com/idea/). A ideia é poder gerenciar um treinamento que acontecerá em duas etapas. As etapas aconceterão em duas salas separadas, sendo uma delas com 5 alunos e a outra com 4 alunos. Na segunda etapa do treinamento a metade da turma troca de sala para estimular a troca de conhecimento e promover a integração entre os membros das equipes.

<h3> Instalação e modo de usar</h3>

A instalação desta aplicação é bem simples e requer apenas que você baixe o arquivo <a href="https://github.com/vanderleik/Projeto-Java/blob/master/out/artifacts/Projeto2_jar/Projeto2.jar">"Projeto2.jar"</a>. Este arquivo de extensão .jar permitirá replicar a execução deste programa.
<p></p>
Após baixar o arquivo, você deve digitar salvá-lo em uma pasta local e acessar a pasta com o uso do Prompt de Comando do Windows, ou o equivalente no Linux ou Mac. Ao localizar a pasta onde o arquivo .jar foi salvo, com o Prompt de Comando, digite "java -jar Projeto2.jar" que o programa será executado na sua totalidade.

<h3>Como o programa funciona usar</h3>

A primeira parte deste projeto cria Strings que receberão mais adiante os dados dos participantes.

* <b>Alunos participantes do evento:</b> No máximo 9 alunos divididos em duas salas de treinamento. Temos uma String para o nome e uma para os sobrenomes. Depois é feita a concatenação na hora de imprimir os dados na tela.
* <b>Salas de treinamento:</b> São duas salas sendo uma delas com capacidade para 5 alunos e a outra com capacidade para 4 alunos.
* <b>Espaço café:</b> São dois espaços para servir o coffee break. Cada espaço recebe uma das turmas.
* <b>Etapas do treinamento:</b> O treinamento é dividido em duas etapas. Na segunda etapa, metade dos alunos trocam de sala com o objetivo de estimular a troca de conhecimentos e experiências.
 
1.<b> Alimentando as Strings com os dados:</b>

1.1. <b>Alunos (nome e sobrenome):</b> para este projeto estou usando os nomes dos integrantes da banda Titãs (formação inicial da banda).

1.1.2.<b> Armazenando os dados dos alunos (Nome e Sobrenome em arquivo texto.</b>
Estou usando Arrays Multidimensionais para concatenar o nome e o sobrenome dos alunos que estão participando do treinamento.
A lista gerada com nome e sobrenome é impressa no arquivo "alunos.txt", para armazenamento e acesso futuro, permitindo assim a persistência dos dados.

1.2. <b>Salas de treinamento:</b>
São duas salas de treinamento, inspiradas no <i>Rock'n'Rio</i>. Uma delas se chama Paco Mundo (que é o paco principal da cidade do Rock) e a outra o Palco Sunset, que é muito importante por abrir espaço para apresentação de grandes bandas antes das atrações principais no Palco Mundo.
 
1.2.1. <b>Armazenando os dados das salas de treinamento em arquivo texto.</b>
A lista de palcos, ou salas de aula, é impressa e salva em um arquivo texto, chamado "salasdetreinamento.txt".
 
1.3. <b>Espaço café:</b>
São dois espaços café criados, um para cada turma, cujos alunos devem usar de forma alternada (pelo menos metade deles) entre os dias de treinamento. Os nomes são inspirados nas famosas franquias americanas <i>Hard Rock</i> <i>Cafe e Starbucks</i>.
 
1.3.1. <b>Armazenando os dados dos espaços de café em arquivo texto.</b>
A lista de espaços café é impressa e salva em um arquivo texto, chamado "salasdecafe.txt".
 
1.4. <b>Etapas do treinamento:</b>
Temos duas etapas de treinamento, ou o treinamento é dividido em dois dias. Optei por nomes simples como "Etapa 01" e "Etapa 02".
 
1.4.1. <b>Armazenando os dados das etapas de treinamento em arquivo texto.</b>
A lista das etapas de treinamento é impressa e salva em um arquivo texto, chamado "etapastreinamento.txt".
 
2. <b>Imprimindo os dados das turmas na primeira etapa do treinamento (Nome, Sala de Treinamento e Sala de Café).</b>
O objetivo é listar na tela os alunos que participam da primeira etapa de treinamento, relacionando cada aluno às suas respectivas salas e espaços café.

2.1. <b>Armazenando os dados da primeira etapa do treinamento:</b>
A listagem gerada é armazenada em um <i>Array Multidimensional</i>, contendo a etapa equivalente, nome do aluno, sala e espaço café.
Os dados gravados no Array são transferidos para a String "first" e posteriormente gravados no arquivo "primeiraEtapa.txt".
 
3. <b>Imprimindo os dados das turmas na segunda etapa do treinamento (Nome, Sala de Treinamento e Sala de Café).</b>
O bloco de códigos tem por objetivo listar na tela os alunos que participam da segunda etapa de treinamento, relacionando cada aluno às suas respectivas salas e espaços café.
 
3.1. <b>Armazenando os dados da segunda etapa do treinamento:</b>
A listagem gerada é armazenada em um <i>Array Multidimensional</i>, contendo a etapa equivalente, nome do aluno, sala e espaço café.

Os dados gravados no Array são transferidos para a String "second" e posteriormente gravados no arquivo "segundaEtapa.txt".

4. <b>Consultas.</b>

4.1. Vamos <b>verificar se uma pessoa está matriculada no treinamento</b>. Para isso usamos o binary search, que é um algorítimo de pesquisa binária.

4.2. <b>Pesquisa vários valores na lista:</b>
Especifico quais valores (nomes) eu quero pesquisar na minha relação de alunos. Se a pessoa estiver matriculada, a aplicação retorna com o número do índice em que está armazenado o nome. Caso não esteja matriculado, retorna uma mensagem informando que não está matriculado.

<h3> JavaDoc</h3>
É possível acessar o JavaDoc gerado pelo IntelliJ, salvo na pasta  <a href="https://github.com/vanderleik/Projeto-Java/tree/master/JavaDoc">JavaDoc</a>.
