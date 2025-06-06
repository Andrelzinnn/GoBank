# 🏦 GoBank

**GoBank** é um sistema bancário simples via terminal feito em Java. Ele simula funcionalidades básicas como cadastro, login, saque, depósito, transferência e logoff — com uma estrutura modular organizada por pacotes.

## 🚀 Funcionalidades

- Cadastro de conta com nome e CPF
- Login com autenticação por senha
- Sessão de usuário com controle de logoff (Interação com o usuario em desenvolvimento)
- Operações: saque, depósito, transferência (Interação com o usuario em desenvolvimento)
- Headers ASCII no terminal pra uma UI minimamente amigável
- Limpeza do terminal (na maioria dos sistemas)

## 🧱 Estrutura do Projeto

```
src/
├── main/
│   ├── java/dev/gobank/
│   │   ├── account/        # Conta bancária e lógica de criação
│   │   ├── auth/           # Autenticação e senha
│   │   ├── bank/           # (provável camada de negócio bancário)
│   │   ├── handler/        # Handlers de interação (login, cadastro etc)
│   │   ├── person/         # Identificação por nome + CPF
│   │   ├── system/         # Console, sessão, manager principal
│   │   └── transaction/    # Transações: saque, depósito, transferência
│   └── resources/          # Arquivos de recurso (não utilizados por enquanto)
└── test/
    └── java/               # (em branco por enquanto)
```

## 🧠 Tecnologias usadas

- **Java 17+**
- **Maven** (build, dependências, estrutura padrão)
- Paradigma **Orientado a Objetos**
- Entrada de dados via `Scanner` (modo texto)

## 💻 Como rodar

### Pré-requisitos
- Java JDK 17+
- Maven 3.8+

### Passo a passo

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/gobank.git
cd gobank
```

2. Compile o projeto com Maven:

```bash
mvn clean compile
```

3. Crie um ponto de entrada:

No arquivo `src/main/java/Main.java`, adicione:

```java
public class Main {
    public static void main(String[] args) {
        new dev.gobank.system.SystemManager().init();
    }
}
```

4. Rode o projeto:

```bash
mvn exec:java -Dexec.mainClass="Main"
```

> Se quiser empacotar:

```bash
mvn clean package
java -cp target/GoBank-1.0-SNAPSHOT.jar Main
```

> (Verifica o nome do JAR gerado em `/target/` caso use outro `artifactId` ou versão.)

## 🧪 Testes

Sem testes ainda. Mas a estrutura já suporta testes com JUnit em `src/test/java`.

## 📌 TODO

- [ ] Persistência (JSON, TXT ou banco)
- [ ] Criptografia de senhas
- [ ] Validação mais robusta
- [ ] Testes unitários
- [ ] Histórico de transações
- [ ] Refatorar valores monetários para usar `BigDecimal` (ou `long` em centavos) em vez de `double`

### Desenvolvido com por Andrelzinn👨🏾‍💻.