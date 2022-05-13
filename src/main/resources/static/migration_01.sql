CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE table public.academia(
	id uuid DEFAULT uuid_generate_v4() PRIMARY key,
	nome varchar(100) not null,
	ativo boolean not null default true,
	data_criacao date not null default CURRENT_DATE,
	data_alteracao date not null default CURRENT_DATE
);

create table public.tipo_usuario(
	id integer primary key,
	nome varchar(100) not null,
	descricao varchar(255) null
);

create table public.usuario(
	id uuid DEFAULT uuid_generate_v4() PRIMARY key,
	nome varchar(255) not null,
	login varchar(100) not null,
	senha varchar(100) not null,
	email varchar(255) null,
	ativo boolean default true not null,
	id_academia uuid not null,
	id_tipo_usuario integer not null,
	data_criacao date not null default CURRENT_DATE,
	data_alteracao date not null default CURRENT_DATE,
	constraint usuario_x_academia FOREIGN KEY(id_academia) references public.academia (id),
	constraint usuario_x_tipo_usuario FOREIGN KEY(id_tipo_usuario) references public.tipo_usuario (id)
);

ALTER TABLE public.academia
add column id_usuario uuid not null,
ADD CONSTRAINT academia_x_usuario FOREIGN KEY (id_usuario) REFERENCES usuario (id);

insert into public.tipo_usuario values
(1, 'Professor', 'Professor da academia'),
(2, 'Aluno', 'Aluno da academia');