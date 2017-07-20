CREATE TABLE public.viagem
(
    id integer NOT NULL DEFAULT nextval('viagem_id_seq'::regclass),
    nome_passageiro text COLLATE pg_catalog."default" NOT NULL,
    cia_aerea text COLLATE pg_catalog."default" NOT NULL,
    data_saida timestamp without time zone NOT NULL,
    data_chegada timestamp without time zone NOT NULL,
    cidade_origem text COLLATE pg_catalog."default" NOT NULL,
    cidade_destino text COLLATE pg_catalog."default" NOT NULL,
    id_solicitacao integer,
    CONSTRAINT viagem_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.viagem
    OWNER to postgres;
