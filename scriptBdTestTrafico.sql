CREATE TABLE test(
	id int AUTO_INCREMENT NOT NULL,
    pregunta VARCHAR(255) NOT NULL,
    respCorrecta varchar(255) not null,
    respErronea2 varchar(255) not null,
    respErronea3 varchar(255) not null,
    CONSTRAINT pk_id PRIMARY KEY (id)
) CHARACTER SET utf8;

insert into test values (0, 
	'Está detenido delante de un semáforo. ¿Cuándo está permitido hablar por teléfono móvil?',
	'Sólo cuando se utilice un dispositivo de manos libres',
    'Sólo mientras esté el semáforo en rojo',
    'Sólo cuando el semáforo esté en una zona urbana'
);

insert into test values (0, 
	'¿Quién asume los gastos de los accidentes de tráfico?',
	'Sólo cuando se utilice un dispositivo de manos libres',
    'Sólo mientras esté el semáforo en rojo',
    'Sólo cuando el semáforo esté en una zona urbana'
);