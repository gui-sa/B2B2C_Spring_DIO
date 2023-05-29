-- dono
INSERT INTO dono(nome,cpf,banco,conta_corrente) VALUES ("Guilherme","11122233344",1,"blabla");
INSERT INTO dono(nome,cpf,banco,conta_corrente) VALUES ("Maycon","12222233344",23,"blablaBLA");

-- negocio
INSERT INTO negocio(nome,cnpj,fk_dono) VALUES ("Brecho","000111",1);
INSERT INTO negocio(nome,cnpj,fk_dono) VALUES ("Lanchonete SKINA 345","001111",1);
INSERT INTO negocio(nome,cnpj,fk_dono) VALUES ("Lanchonete SKINA 346","021111",2);

-- cliente
INSERT INTO cliente(nome,cpf,credit_Card) VALUES ("Guilherme","11122233344","1asdasdasd");
INSERT INTO cliente(nome,cpf,credit_Card) VALUES ("Ana","13322233344","1asasddddsd");

-- entregador
INSERT INTO entregador(nome,cpf,cnh) VALUES ("Mario","13422233344","1asaddpdsd");
INSERT INTO entregador(nome,cpf,cnh) VALUES ("Mio","11422233344","zzsaddpdsd");
