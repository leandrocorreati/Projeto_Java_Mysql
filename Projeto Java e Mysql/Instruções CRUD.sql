
-- Comentario
-- A linha a baixo cria o banco de dados 
create database dbinfox;
-- A linha Abaixo determina qual banco de dados a ser usaddo
use dbinfox;
-- o bloco de instruções abaixo cria uma tabela
create table tbusuarios
(
iduser int primary key,
usuario varchar(50) not null,
fone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);

-- Descrição de uma tabela 
desc tbusuarios;

-- A linha abixo insere dados na tabela (CRUD)
-- create -> read
insert into tbusuarios(iduser, usuario, fone, login, senha) 
values (1,'josé de assis', '12981465932', 'jose_assis', '123456');
insert into tbusuarios(iduser, usuario, fone, login, senha) 
values (2,'Administrador', '12981465932', 'admin', 'admin');
insert into tbusuarios(iduser, usuario, fone, login, senha) 
values (3,'Larissa', '12981465932', 'lary', '123456');
insert into tbusuarios(iduser, usuario, fone, login, senha) 
values (4,'Laisa', '12981465932', 'laisa88', '123456');
-- A linha abaixo exibe os dados da tabela (CRUD)
-- read -> select
select * from tbusuarios;

-- A linha abaixo modifica os dados na tabela (CRUD)
-- update -> update(atualiza)
update tbusuarios set fone='8888-8888' where iduser=2;

-- A linha abaixo apaga um registro da tabela (CRUD)
-- delete -> delete (deleta)
delete from tbusuarios  where iduser=3;

select * from tbusuarios;

-- create (CRUD)
create table  tbclientes
(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar(100) not null,
fonecli varchar(50) not null,
emailcli varchar(50)
);

desc tbclientes; -- Mostra a descrição da tabela

insert into tbclientes(nomecli, endcli, fonecli, emailcli)
values ('Linus Torvalds', 'Rua Tux, 2015','9999-9999', 'linus@linux.com');

insert into tbclientes(nomecli, endcli, fonecli, emailcli)
values ('Bill Gates', 'Rua Windows, 10','9999-9999', 'gates@msconfig.com');

select * from tbclientes;

-- create (CRUD)
create table tbos
(
os int primary key auto_increment,
data_os timestamp default current_timestamp, -- Essa linha serve para puxar a hora do servidor e lançar no campo data_os
equipamento varchar(50) not null,
defeito varchar(50) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);

desc tbos;

insert into tbos(equipamento, defeito, servico, tecnico, valor, idcli)
value ('notebook','não liga', 'troca da fonte','Leandro', 120.00,1);

select * from tbos;

-- O codigo abaixo trás informação de duas tabelas
select
o.os,equipamento,defeito,servico,valor,
c.nomecli,fonecli
from tbos as o
inner join 
tbclientes as c 
on 
(o.idcli = c.idcli);



















