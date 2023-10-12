-- Création de la table "users"
CREATE TABLE users (
                       user_id serial PRIMARY KEY,
                       username VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       email VARCHAR(255)
);

-- Création de la table "pixels"
CREATE TABLE pixels (
                        pixel_id serial PRIMARY KEY,
                        x_coordinate INT NOT NULL,
                        y_coordinate INT NOT NULL,
                        color VARCHAR(7) NOT NULL, -- Format hexadécimal pour la couleur (par exemple, #RRGGBB)
                        user_id INT REFERENCES users(user_id)
);

-- Création de la table "pixel_updates"
CREATE TABLE pixel_updates (
                               update_id serial PRIMARY KEY,
                               pixel_id INT REFERENCES pixels(pixel_id),
                               new_color VARCHAR(7) NOT NULL, -- Format hexadécimal pour la couleur
                               update_time TIMESTAMPTZ DEFAULT current_timestamp
);
