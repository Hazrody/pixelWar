-- Création de la table "pixels"
CREATE TABLE pixel
(
    pixel_id     serial PRIMARY KEY,
    x_coordinate INT        NOT NULL,
    y_coordinate INT        NOT NULL,
    color        VARCHAR(7) NOT NULL
);

