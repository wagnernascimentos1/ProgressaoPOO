CREATE TABLE Aluno(
ID_Aluno integer PRIMARY KEY,
Nome varchar(80),
Endereco varchar(100),
Matricula numeric,
Serie integer,
Responsavel varchar(80),
Boletim numeric(2,1),
Frequencia numeric
);

CREATE TABLE Boletim(
ID_Boletim integer PRIMARY KEY,
Nota1 float,
Nota2 float,
Faltas numeric,
Disciplina char(15)
);

CREATE TABLE Frequencia(
ID_Frequencia integer PRIMARY KEY,
ID_ALuno INTEGER,
ID_Disciplina INTEGER,
FOREIGN KEY (ID_ALuno) REFERENCES Aluno (ID_Aluno),
FOREIGN KEY (ID_Disciplina) REFERENCES Disciplina (ID_Disciplina),
Faltas numeric
);

CREATE TABLE Professor(
ID_Professor integer PRIMARY KEY ,
Nome varchar(80),
Endereco varchar (100),
CONSTRAINT fk_Disciplina FOREIGN KEY (fk_Disciplina) REFERENCES Disciplina (ID_Disciplina)
);

CREATE TABLE Disciplina(
ID_Disciplina integer PRIMARY KEY,
Nome varchar(15)
);
