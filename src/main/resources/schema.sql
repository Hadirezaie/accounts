CREATE TABLE IF NOT EXISTS customer (
    customer_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    mobile_number VARCHAR(15) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(255) DEFAULT NULL,
    updated_at TIMESTAMP DEFAULT NULL,
    updated_by VARCHAR(255) DEFAULT NULL
);


CREATE TABLE IF NOT EXISTS accounts (
    account_id SERIAL PRIMARY KEY,
    customer_id INT NOT NULL,
    account_number VARCHAR(20) UNIQUE NOT NULL,
    account_type VARCHAR(50) NOT NULL,
    branch_address VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(255) DEFAULT NULL,
    updated_at TIMESTAMP DEFAULT NULL,
    updated_by VARCHAR(255) DEFAULT NULL
);
