# adapter

Implementação do padrão de projeto adapter baseado nos artigos https://www.thiengo.com.br/padrao-de-projeto-adapter e https://www.devmedia.com.br/padrao-de-projeto-adapter-em-java/26467

Quando usar?

- Quando necessita-se alterar o comportamento de uma classe em um projeto por alguma mudança negocial e não há possibilidade de alteração da classe antiga por complexidade ou alto acoplamento, por exemplo. Para alterar o comportamento cria-se uma classe adaptadora que implementará a interface antiga, mas que como saída dos métodos implementados apresentará o novo comportamento desejado. Nessa classe adaptadora, haverá composição para a classe de saída que será a adaptação feita no código.