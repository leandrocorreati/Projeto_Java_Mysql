-- MySQL Script generated by MySQL Workbench
-- 02/16/17 22:23:49
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema dbinfox
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbinfox
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbinfox` DEFAULT CHARACTER SET latin1 ;
USE `dbinfox` ;

-- -----------------------------------------------------
-- Table `dbinfox`.`tbclientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinfox`.`tbclientes` (
  `idcli` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `nomecli` VARCHAR(50) NOT NULL COMMENT '',
  `endcli` VARCHAR(100) NOT NULL COMMENT '',
  `fonecli` VARCHAR(50) NOT NULL COMMENT '',
  `emailcli` VARCHAR(50) NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`idcli`)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dbinfox`.`tbos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinfox`.`tbos` (
  `os` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `data_os` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '',
  `equipamento` VARCHAR(50) NOT NULL COMMENT '',
  `defeito` VARCHAR(50) NOT NULL COMMENT '',
  `servico` VARCHAR(150) NULL DEFAULT NULL COMMENT '',
  `tecnico` VARCHAR(30) NULL DEFAULT NULL COMMENT '',
  `valor` DECIMAL(10,2) NULL DEFAULT NULL COMMENT '',
  `idcli` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`os`)  COMMENT '',
  INDEX `idcli` (`idcli` ASC)  COMMENT '',
  CONSTRAINT `tbos_ibfk_1`
    FOREIGN KEY (`idcli`)
    REFERENCES `dbinfox`.`tbclientes` (`idcli`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `dbinfox`.`tbusuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbinfox`.`tbusuarios` (
  `iduser` INT(11) NOT NULL COMMENT '',
  `usuario` VARCHAR(50) NOT NULL COMMENT '',
  `fone` VARCHAR(15) NULL DEFAULT NULL COMMENT '',
  `login` VARCHAR(15) NOT NULL COMMENT '',
  `senha` VARCHAR(15) NOT NULL COMMENT '',
  PRIMARY KEY (`iduser`)  COMMENT '',
  UNIQUE INDEX `login` (`login` ASC)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
