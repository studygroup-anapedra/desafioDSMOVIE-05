
# Desafio: Testes de API com MockMvc e RestAssured




<h2>Requisitos que satisfaz o desafio proposto: </h2>

<p>
    Este é um projeto de filmes com avaliações. A visualização dos dados dos filmes é pública e não requer login. No entanto, as alterações de filmes, como inserir, atualizar e deletar, são permitidas apenas para usuários com perfil ADMIN. As avaliações de filmes podem ser registradas por qualquer usuário logado, seja CLIENT ou ADMIN.
    A entidade Score armazena uma nota de 0 a 5 que cada usuário atribui a cada filme. Sempre que um usuário registra uma nota, o sistema recalcula a média das notas de todos os usuários e atualiza a nota média na entidade Movie, juntamente com a contagem de votos.
    O projeto(Spring Boot com Java) e os testes unitários da camada de controller deverão ser desenvolvidos a partir das especificações desses testes que foram fornecidas pelo avaliador. O avaliado poderá optar por desenvolver primeiro os testes ou o projeto, contanto que entregue o projeto com todos os testes passando. O Jacoco deve reportar 100% de cobertura de testes.
 </p>
<p>
 <h2>Competências avaliadas: </h2>
 </p>
  <p>

       - Testes unitários da camada de controller

       - Implementação de testes unitários com JUnit e Mockito

       - Cobertura de código com Jacoco

       - Modelagem em camadas bem definidas

       - Desacoplamento

       - Cardinalidade de classe

       - Filtro por parâmetro

       - Segurança

       - Permissão

       - Autenticação

       - Padrão DTO

       - Inversão de dependência




  </p>

  <h2>Especificações de testes que satisfaz o desafil: </h2>
  <p>

        - MovieService.findAll() deve retornar OK quando nenhum argumento for fornecido

        - MovieService.findAll() deve retornar filmes paginados quando o parâmetro de título do filme não estiver vazio

        - MovieService.findById(id) deve retornar um filme quando o id existir

        - MovieService.findById(id) deve lançar ResourceNotFoundException quando o id não existir

        - MovieService.insert(dto) deve retornar UnprocessableEntity quando o administrador estiver logado e o título estiver em branco

        - MovieService.insert(dto) deve retornar Forbidden quando o cliente estiver logado

        - MovieService.insert(dto) deve retornar Unauthorized quando o token for inválido

        - ScoreService.saveScore(dto) deve lançar ResourceNotFoundException quando o id do filme não existir

        - ScoreService.saveScore(dto) deve retornar UnprocessableEntity quando o id do filme estiver ausente

        - ScoreService.saveScore(dto) deve retornar UnprocessableEntity quando a pontuação for menor que zero
   <p>
 <h2>Competências adcionais: </h2>
  <p>

        - Testes unitários da camada de servio em projeto Spring Boot com Java

        - Entrgar o desafio proposto

        - Arquitetar e desenvolver o projeto do zero, usando padroes pertinentes.

        - O desenvolvimento será guiado pela abordagem TDD (Test-Driven Development).

        - Desenvolver um frontend.

        - integração de frontend e backend

        - Implementar nas nuvens/aws
  </p>

  <h2>Especificações de testes adcionais: </h2>
  <p>

        - MovieService.findAll() deve retornar uma página de filmes

        - MovieService.findById(id) deve retornar um filme quando o id existir

        - MovieService.findById(id) deve lançar ResourceNotFoundException quando o id não existir

        - MovieService.insert(dto) deve retornar um filme

        - MovieService.update(id, dto) deve retornar um filme quando o id existir

        - MovieService.update(id, dto) deve lançar ResourceNotFoundException quando o id não existir

        - MovieService.delete(id) deve fazer nada quando o id existir

        - MovieService.delete(id) deve lançar ResourceNotFo undException quando o id não existir

        - MovieService.delete(id) deve lançar DatabaseException quando o id for dependente

        - UserService.authenticated() deve retornar um usuário quando houver usuário logado

        - UserService.authenticated() deve lançar UsernameNotFoundException quando não houver usuário logado

        - UserService.loadUserByUsername(username) deve retornar um UserDetails quando o username existir

        - UserService.loadUserByUsername(username) deve lançar UsernameNotFoundException quando o username não existir

        - ScoreService.saveScore(dto) deve retornar os dados do filme quando o id existir

        - ScoreService.saveScore(dto) deve lançar ResourceNotFoundException quando o id do filme não existi
  </p>



 </p>
 <h2>Ferramentas utilizadas: </h2>
  <p>

<p>🚀 1 - Java 21</p>

<p>🚀 2 - Spring Boot 3.2.5</p>

<p>🚀 3 - Spring Data</p>

<p>🚀 4 - PostgreSQL(perfil/dev)</p>

<p>🚀 5 - RestAssured</p>

<p>🚀 6 - Spring Validation</p>

<p>🚀 7 - Jacoco</p>

<p>🚀 8 - Postman</p>

<p>🚀 9 - Estilo Arquitetural REST</p>

<p>🚀 10 - Maven</p>

<p>🚀 11 - JPA</p>

<p>🚀 12 - Linux</p>

<p>🚀 13 - IntelliJ</p>

<p>🚀 14 - VS Code</p>

<p>🚀 15 - H2 (perfil/test)</p>

<p>🚀 16 - Spring Security</p>

<p>🚀 17 - JUnit 5</p>

<p>🚀 18 - OAuth2</p>

<p>🚀 19 - Git/GitHub</p>

<p>🚀 20 - Commits com Assinaturas</p>

<p>🚀 21 - Code Review</p>

<p>🚀 22 - Mockito</p>

<p>🚀 23 - Proteção de Branches</p>

<p>🚀 24 - Pull Request</p>

  <p >

 </p>