# Sistema CRUD Java + MySQL (Swing)

Aplicação desktop desenvolvida em Java utilizando Swing para interface gráfica e MySQL como banco de dados.

O sistema implementa um CRUD completo (Create, Read, Update, Delete) para gerenciamento de clientes, permitindo inserção, visualização, atualização e exclusão de registros em tempo real.

## 🚀 Funcionalidades

- Inserir novos clientes (nome e endereço)
- Listar automaticamente os dados ao iniciar o sistema
- Atualizar registros existentes com base no ID
- Excluir registros diretamente do banco de dados
- Sincronização automática entre interface (JTable) e banco de dados

## 🧠 Conceitos aplicados

- JDBC (Java Database Connectivity)
- Integração com banco de dados relacional (MySQL/MariaDB)
- Separação entre interface gráfica e persistência de dados
- Uso de `Statement` e evolução para `PreparedStatement`
- Manipulação de tabelas com `JTable` e `DefaultTableModel`
- Boas práticas de CRUD com sincronização via SELECT após operações

## 🛠️ Tecnologias utilizadas

- Java (Swing)
- MySQL / MariaDB
- JDBC
- NetBeans (ou IDE similar)

## 🗄️ Estrutura do Banco de Dados

```sql
CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(255) NOT NULL
);
