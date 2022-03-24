CREATE TABLE produtores (
  id_produtor INT NOT NULL AUTO_INCREMENT,
  nome_produtor VARCHAR(200) NULL,
  email_produtor VARCHAR(100) NULL,
  cnpj_produtor VARCHAR(14) NULL,
  cpf_produtor VARCHAR(11) NULL,
  telefone_produtor VARCHAR(13) NULL,
  endereco_produtor VARCHAR(100) NULL,
  PRIMARY KEY (id_produtor));