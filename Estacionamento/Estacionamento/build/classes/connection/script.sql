/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  mateu
 * Created: 6 de out. de 2022
 */

CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga (
    idVaga  int NOT NULL AUTO_INCREMENT,
    numero  int NOT NULL,
    rua     varchar(100) NOT NULL,
    obliqua boolean NOT NULL,
    PRIMARY KEY (idVaga));

CREATE TABLE motorista (
    idMotorista int NOT NULL AUTO_INCREMENT,
    nome varchar(250) NOT NULL,
    homem boolean NOT NULL,
    rg varchar(10) NOT NULL,
    cpf varchar(11) NOT NULL,
    celular varchar(11) NOT NULL,
    email varchar(250) NOT NULL,
    senha varchar(250) NOT NULL,
    PRIMARY KEY (idMotorista)
);