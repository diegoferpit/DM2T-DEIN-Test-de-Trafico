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
	'Sólo cuando se utilice un dispositivo de manos libres', -- correcta
    'Sólo mientras esté el semáforo en rojo',
    'Sólo cuando el semáforo esté en una zona urbana'
);

insert into test values(1,
	'¿Con qué luz deberá utilizarse SIEMPRE la luz antiniebla delantera de forma simultánea?',
	'Con las luces de posición.', -- correcta
	'Con la luz antiniebla trasera',
	'Con las luces de largo alcance'
);

insert into test values(2,
	'¿Cada cuánto se debe renovar el permiso B en España?',
	'Cada 10 años hasta que el titular cumpla 65 años.', -- Correcta
	'Cada 10 años hasta que el titular cumpla 70 años.',
	'Cada 5 años hasta que el titular cumpla 45 años.'
);

insert into test values(3,
	'En un vehículo mixto adaptable ¿es obligatorio llevar un chaleco reflectante?',
	'Sí.', -- Correcta.
	'No, pero es recomendable.',
	'Sí, en el maletero del vehículo.'
);

insert into test values(4,
	'¿Puede circular conduciendo un ciclomotor por una vía interurbana sin arcén?',
	'Sí, por la derecha, ocupando la parte imprescindible de la calzada.', -- Correcta
	'Sí, por el centro del carril derecho.',
	'No, en este caso no puede circular.'
);

insert into test values(5,
	'¿Cuántas luces de posición laterales debe llevar un automóvil?',
	'Mínimo 2 luces y máximo dependiendo de su longitud.', -- Correcta
	'Mínimo 2 luces y máximo 4',
    'Mínimo 3 luces y máximo dependiendo de su longitud'
);

insert into test values(6,
	'Mientras se realiza un estacionamiento, ¿es fácil que el dispositivo del airbag se dispare?',
    'No, puesto que los sistemas de airbag actuales son muy precisos a la hora de determinar cuándo deben hincharse.', -- Correcta
	'Sí, un airbag puede ponerse en funcionamiento en cualquier momento.',
	'Este tipo de cuestiones dependerá de la marca del vehículo.'
);

insert into test values(7,
	'El campo de visión de los niños es limitado ...',
    'Debido a su corta estatura.', -- Correcta
	'Debido a que no prestan atención.',
	'Debido al bajo desarrollo que tienen del sentido de la vista.'
);

insert into test values (8,
	'¿A qué usuarios de la vía pública les afecta las señales de estos semáforos?',
	'A todos los vehículos.', -- Correcta
	'A todos los vehículos menos las bicicletas.',
	'Exclusivamente a los vehículos de motor.'
);

insert into test values(9,
	'Los agentes inmovilizan su vehículo porque tiene una tasa de alcohol mayor de la permitida ¿Cuándo puede volver a conducir?',
    'Cuando la tasa de alcohol baje al nivel permitido.', -- Correcta
	'No podré conducir ese día, tengo que buscar otro conductor',
	'Cuando se marche el agente'
);

insert into test values(10,
	'Si aumenta la velocidad, la distancia de frenado...',
	'Aumenta.', -- Correcta
	'No cambia.',
	'Disminuye.'
);

insert into test values(11,
	'¿Qué acción debemos llevar a cabo en caso de soplar fuerte viento lateral?',
    'Adaptar la velocidad, y circular con marchas cortas cuando sea necesario.', -- Correcta
	'Reducir la velocidad y circular siempre con la primera marcha.',
	'Aumentar la velocidad y circular con marchas largas.'
);

insert into test values(12,
	'¿Puede conducir una motocicleta con el permiso de la clase B?',
    'Sí, solamente en España, con una cilindrada máxima de 125 centímetros cúbicos, y una antigüedad del permiso superior a tres años.', -- Correcta
	'Sí, siempre que sea de una cilindrada menor a 250 centímetros cúbicos.',
	'Sí, siempre que no supere los 25 kW de potencia.'
);

insert into test values(13,
	'Aunque esté prohibido realizar un adelantamiento, un turismo podrá sobrepasar, incluso invadiendo el sentido contrario a...',
    'Conductores de bicicletas.', -- Correcta
	'Cualquier camión.',
	'Cualquier autobús o camión que circule lentamente.'
);

insert into test values(14,
	'En los accidentes de tráfico, influyen de forma significativa...',
    'El conductor, la vía y el vehículo.', -- Correcta
	'La vía y el vehículo, fundamentalmente.',
	'El conductor y la vía, únicamente.'
);

insert into test values(15,
	'¿Cuál es uno de los principios fundamentales en el tráfico?',
	'Ver y ser vistos', -- Correcta
	'Adelantar siempre que sea posible.',
	'Ceder siempre el paso a los peatones.'
);