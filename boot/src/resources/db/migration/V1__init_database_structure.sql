DROP TABLE IF EXISTS CART;
DROP TABLE IF EXISTS MARKET;
DROP TABLE IF EXISTS PRODUCT_OFFER;

CREATE TABLE CART (
	id UUID NOT NULL,
	product_name varchar(45) NOT NULL,
	active bool NOT NULL,
    CONSTRAINT cart_pkey PRIMARY KEY (id)
);

CREATE TABLE MARKET (
	name varchar(45) NOT NULL,
    CONSTRAINT market_pkey PRIMARY KEY (name)
);

CREATE TABLE PRODUCT_OFFER (
	id UUID NOT NULL,
	product_name varchar(45) NOT NULL,
	active bool NOT NULL,
	start_date timestamp NOT NULL,
    end_date timestamp NOT NULL,
    market varchar(45) NOT NULL,
    original_price numeric(10, 2) NOT NULL,
    discounted_price numeric(10, 2) NOT NULL,
    CONSTRAINT product_offer_pkey PRIMARY KEY (id)
);
