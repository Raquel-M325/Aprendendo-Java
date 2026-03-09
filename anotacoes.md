# Sobre Docker
1. O comando "docker run -it java..." faz com que o input de java por exemplo funcione!

2. Se deu "docker build -t java... ." e você mudou o código, terá que repetir novamente o mesmo comando, por conta que não mais a mesma imagem copiada

3. Precisa ter um docker instalado e abrir, se não abrir, não irá funcionar...

4. Basta somente criar e usar um arquivo "Dockerfile", é por ele que você poderá testar os seus códigos

5. No Dockerfile, toda vez que for testar em um arquivo ou pasta diferente, terá que alterar o caminho RUN para direcionar qual dos arquivos precisará compilar e usar no teste, inclusive é recomendado mudar o nome do CMD também para ficar organizado no Docker instalado no seu PC

# Sobre Java
1. Java tem os comando parecidos com C++ e precisa ter um baixado para ajudar a Java funcionar, mas com Docker, não precisará mais baixar a instalação

2. Main sempre deve estar por último dos outros static como C++ 

3. O nome do arquivo que você deu deve ser o mesmo da classe, se for diferente, Java reclama

4. Caso esteja numa pasta especifica, terá que usar o package com o nome da pasta, para que fique organizado e evitar erro

5. Java não tem input por si só, terá que importar usando o código "import java.util.Scanner;" para scannear a resposta do usuário

6. Quando usar o Scanner, terá que criar um novo para abrir como esse exemplo "Scanner input = new Scanner(System.in);", depois nomear novamente a variavel e transformar para o próximo inteiro como esse outro exemplo "int idade = input.nextInt();" que interliga com anterior e depois que usou a lógica desse váriavel, deve fechar como foi esse exemplo "input.close();" que ainda chamou o primeiro nome da variavel que esta ao lado do nome Scanner

7. Se criar outra classe no mesmo arquivo, não pode usar repetido "public", que vai reclamar, somente class ... que já basta, mas terá que chamar o nome da classe para interligar com anterior para funcionar em um só


