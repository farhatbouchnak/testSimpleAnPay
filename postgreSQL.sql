-- -----------------------------------------------------
-- Table `merchant`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS merchant (
  id INT NOT NULL,
  create_date DATE NULL,
  name VARCHAR(45) NOT NULL,
  birth_date DATE NULL,
  last_name VARCHAR(45) NOT NULL,
  idioma VARCHAR(25) NOT NULL,
  product_id INT NOT NULL,
  adresse_id INT NOT NULL,
  PRIMARY KEY (ID),
  CONSTRAINT FK_Products FOREIGN KEY (product_id) REFERENCES product(id)ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;
-- -----------------------------------------------------
-- Table `product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS product (
  id INT NOT NULL,
  create_date DATE NULL,
  label VARCHAR(45) NULL,
  unit_price INT NULL,
  currency VARCHAR(45) NULL,
  weight FLOAT NULL,
  height FLOAT NULL,
  marchand_id INT NOT NULL,
  PRIMARY KEY (ID),
  CONSTRAINT FK_Marchands FOREIGN KEY (marchand_id) REFERENCES merchant(id)ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;
