INSERT INTO tb_especialidade(nome,criado_Em) values ('NUTRICAO',NOW());
INSERT INTO tb_especialidade(nome,criado_Em) values ('CARDIOLOGIA',NOW());
INSERT INTO tb_especialidade(nome,criado_Em) values ('PEDIATRIA',NOW());
INSERT INTO tb_especialidade(nome,criado_Em) values ('DERMATOLOGIA',NOW());

INSERT INTO tb_convenio(nome,cnpj,telefone,criado_Em) values ('Sul América S.A','29.978.814/0001-87','0800-702-2242',NOW());
INSERT INTO tb_convenio(nome,cnpj,telefone,criado_Em) values ('Unimed','02.812.468/0001-06','0800-940-0343',NOW());
INSERT INTO tb_convenio(nome,cnpj,telefone,criado_Em) values ('Golden Cross','01.518.211/0007-79','0800-729-2001',NOW());

INSERT INTO tb_cargo(autoridade,criado_Em) values ('ROLE_USUARIO',NOW());
INSERT INTO tb_cargo(autoridade,criado_Em) values ('ROLE_OPERADOR',NOW());
INSERT INTO tb_cargo(autoridade,criado_Em) values ('ROLE_ADMIN',NOW());


INSERT INTO tb_usuario(email,senha,apelido,criado_Em) values ('bruno@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG','admin',NOW());
INSERT INTO tb_usuario_cargo(usuario_id,cargo_id) values (1,3);
INSERT INTO tb_funcionario(primeiro_Nome,ultimo_Nome,rg,orgao_Emissor,cpf,email,telefone,celular,data_Nascimento,area_Atuacao,is_Medico,criado_Em) values ('Bruno','Pinho','9999999','Secretaria de Segurança Pública','9999999','bruno@email.com','75999999999','75999999990','1999-11-21',4,false,NOW());
INSERT  INTO tb_funcionario_usuario(funcionario_id,usuario_id) values (1,1);
INSERT INTO tb_endereco(cep,logradouro,complemento,bairro,cidade,estado,criado_Em) values ('40110160','Rua João das Botas','','Canela','Salvador','BA',NOW());
INSERT INTO tb_funcionario_endereco(funcionario_id,endereco_id) values (1,1);
