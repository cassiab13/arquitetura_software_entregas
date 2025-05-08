# 🎓 Engenharia de Software - 7SA

## 👥 Alunos:
- **Cassia Yumi Iwamoto Basso** – RA: 22265008-2
- **Jean Aparecido de Almeida Soares** – RA: 22254287-2

---

# 🧩 Padrão de Projeto: Adapter

O padrão **Adapter** é um padrão de projeto estrutural que tem como objetivo **adaptar interfaces incompatíveis**, permitindo que classes com interfaces diferentes trabalhem juntas.

---

## ✅ Classes Criadas

### 🔹 1. `Pessoa` (Entidade)
- Representa o modelo de domínio com os atributos
- Possui métodos getters, setters e `toString()`.


### 🔹 2. `RepositorioDePessoas` (Interface)
- Define um contrato com o método:
  List<Pessoa> listarPessoas();
- Abstrai a origem dos dados.
  

### 🔹 3. `PessoaCsvAdapter` (Adapter)
- Implementação concreta da interface `RepositorioDePessoas`, responsável por adaptar a leitura do arquivo .csv para o objeto Pessoa.


### 🔹 4. `TestePessoaAdapter` (Classe de teste)
- Demonstra como utilizar o adapter `PessoaCsvAdapter`como se fosse uma implementação do `RepositorioDePessoas`.
