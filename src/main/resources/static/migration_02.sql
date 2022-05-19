CREATE TABLE public.grupo_muscular (
	id serial primary key,
	nome varchar(255) NOT NULL,
);

CREATE TABLE public.exercicio (
	id bigserial primary key,
	id_academia uuid NULL,
	id_grupo_muscular serial NOT NULL,
	nome varchar(255) NOT NULL,
	descricao text NULL,
	CONSTRAINT exercicio_id_academia_fkey FOREIGN KEY (id_academia) REFERENCES academia(id),
	CONSTRAINT exercicio_id_grupo_muscular_fkey FOREIGN KEY (id_grupo_muscular) REFERENCES grupo_muscular(id)
);
