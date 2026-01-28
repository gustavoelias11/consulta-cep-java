# Buscador de CEP - Java ☕

Projeto desenvolvido para fixar os conhecimentos em Java, consumo de APIs e manipulação de arquivos JSON. A aplicação consulta endereços automaticamente utilizando a API pública do ViaCEP.

## 🔨 Funcionalidades

- [x] Entrada de dados pelo usuário via console.
- [x] Consumo da API **ViaCEP** utilizando a classe `HttpClient`.
- [x] Transformação do JSON de resposta em um Objeto Java (`Record`) utilizando a biblioteca **Gson**.
- [x] Tratamento de erros e exceções durante a requisição.

## 🛠️ Tecnologias Utilizadas

- **Java Development Kit (JDK)**: Versão 17 ou superior (uso de `record`).
- **Gson**: Biblioteca do Google para serialização e desserialização de JSON.
- **IntelliJ IDEA**: IDE utilizada para o desenvolvimento.

## 🚀 Como executar o projeto

1. **Clone o repositório**:
   ```bash
   git clone [https://github.com/gustavoelias11/estudos-alura-java.git](https://github.com/gustavoelias11/estudos-alura-java.git)

2. **Configuração**:
    - Abra o projeto no IntelliJ.
    - Certifique-se de adicionar a biblioteca `gson-2.10.1.jar` (ou versão mais recente) às dependências do módulo.

3. **Execução**:
    - Rode a classe `Main.java`.
    - Digite um CEP válido quando solicitado (ex: `01001000` ou `89230-150`).

## 📌 Exemplo de Uso

**Entrada no console:**
```text
Informe o CEP que deseja consultar::
> 01001000

**Saída:**
Endereco[cep=01001-000, logradouro=Praça da Sé, localidade=São Paulo, uf=SP]
```

## ✒️ Autor

Desenvolvido por **Gustavo Manoel Elias**.
