insert into cliente (id, nome, cnpj_cpf) values (1, 'Marcelo Lins', '859');
insert into cliente (id, nome, cnpj_cpf) values (2, 'Ingrid Lins', '339');
insert into produto (id, nome, valor) values (1, 'biscoito', 1.77);
insert into produto (id, nome, valor) values (2, 'pamonha', 10.55);

insert into venda (data_venda) values ( '2022-06-10');
insert into venda (data_venda) values ( '2018-06-01');

insert into vendas_x_produtos (venda_id, produto_id) values (1, 1), (1, 2);