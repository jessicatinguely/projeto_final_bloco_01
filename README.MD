# 🥩🍗🐖🧂 BomSabor Açougue

> Projeto desenvolvido como atividade prática do BootCamp **Generation**.  
> Aplicação console em **Java** simulando um sistema de cadastro de produtos de açougue.  
> Implementa conceitos de **POO (Programação Orientada a Objetos)**, **CRUD** e **Collections**.

---

## 📑 Índice
- [📖 Sobre o Projeto](#-sobre-o-projeto)
- [🛠 Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [📂 Estrutura de Pacotes](#-estrutura-de-pacotes)
- [⚙️ Funcionalidades](#️-funcionalidades)
- [▶️ Como Executar](#️-como-executar)
- [📸 Exemplo de Execução](#-exemplo-de-execução)
- [👩‍💻 Autora](#-autora)

---

## 📖 Sobre o Projeto
O **BomSabor Açougue** é uma aplicação em Java (console) para gerenciamento de produtos:

- Produtos organizados em **categorias**:  
  - `Carne`  
  - `Frango`  
  - `Suíno`  
  - `Tempero`  

- Cada categoria possui **atributos específicos**, além dos atributos comuns herdados da classe abstrata `Produto`.

---

## 🛠 Tecnologias Utilizadas
- ☕ **Java 17+**
- 🖥 Console (CLI)
- 📦 **Collections API** (`ArrayList`)
- ⚡ **POO**: Herança, Polimorfismo, Abstração e Encapsulamento
- 📚 **Pacotes** para organização do código

---

## 📂 Estrutura de Pacotes

```
projeto_final_bloco_01
 ├── controller         # ProdutoController (implementa CRUD em memória)
 ├── model              # Produto (abstrata) + Carne, Frango, Suino, Tempero
 ├── repository         # Interface ProdutoRepository
 ├── util               # Classe Cores (personalização no console)
 └── Menu.java          # Classe principal com o Menu interativo
```

---

## ⚙️ Funcionalidades

✔️ **Criar Produto** (cada categoria pede atributos específicos)  
✔️ **Listar Produtos** (mostra todos com seus detalhes)  
✔️ **Buscar Produto por ID**  
✔️ **Atualizar Produto** (permite manter ou alterar atributos)  
✔️ **Deletar Produto** (com confirmação)  

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU-USUARIO/projeto_final_bloco_01.git
   cd projeto_final_bloco_01
   ```

2. Compile os arquivos `.java`:
   ```bash
   javac -d bin src/projeto_final_bloco_01/**/*.java
   ```

3. Execute a aplicação:
   ```bash
   java -cp bin projeto_final_bloco_01.Menu
   ```

---

## 📸 Exemplo de Execução

```
╔══════════════ 🥩🍗🐖🧂  BOMSABOR  🧂🐖🍗🥩 ══════════════╗
  [1] ✳️  Criar Produto
  [2] 📋  Listar Todos os Produtos
  [3] 🔎  Buscar Produto por Id
  [4] 🔄  Atualizar Dados do Produto
  [5] 🗑️  Apagar Produto
  [0] 🚪  Sair
╚═══════════════════════════════════════════════════════════╝
👉 Entre com a opção desejada:
```

---

## 👩‍💻 Autora
**Jessica Ghirardelli Tinguely**  
📧 [jessicatinguely@icloud.com](mailto:jessicatinguely@icloud.com)  
🌐 [GitHub](https://github.com/jessicatinguely)
