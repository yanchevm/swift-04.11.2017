-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema school
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema school
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `school` DEFAULT CHARACTER SET utf8 ;
USE `school` ;

-- -----------------------------------------------------
-- Table `school`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`addresses` (
  `id` INT(11) NOT NULL,
  `country` VARCHAR(45) NULL DEFAULT NULL,
  `city` VARCHAR(45) NULL DEFAULT NULL,
  `street` VARCHAR(45) NULL DEFAULT NULL,
  `number` VARCHAR(45) NULL DEFAULT NULL,
  `floor` INT(11) NULL DEFAULT NULL,
  `apartment_no` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`disciplines`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`disciplines_studied`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines_studied` (
  `student_id` VARCHAR(45) NOT NULL,
  `disciplinestudied_id` VARCHAR(45) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`disciplines_taught`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`disciplines_taught` (
  `teacher_id` VARCHAR(45) NULL DEFAULT NULL,
  `disciplinetaught_id` VARCHAR(45) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`students` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `enrollment_date` DATE NOT NULL,
  `address_id` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 18
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `school`.`teachers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `school`.`teachers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `salary` DOUBLE NULL DEFAULT NULL,
  `address_id` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 31
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
