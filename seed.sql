
INSERT INTO "public"."tb_parking_spot" ("id","apartment","block","brand_car","color_car","license_plate_car","model_car","parking_spot_number","registration_date","responsible_name")
VALUES
('68caa1c6-e444-443b-859b-0a76e01f2dbf', '550', 'B', 'bmw', 'white', 'UJK1', 'x1', '15A', '2022-11-12 13:33:39.358806', 'Joao Souza'),
('3ff0d4b6-fdf5-401b-97e7-13c57485f92b', '1102', 'A2', 'hyndai', 'black', 'UHE', 'hb202', '110Aa', '2022-11-14 01:23:53.990875', 'Pedro Rocha'),
('3ff0d4b6-fdf5-401b-97e7-13c57485f92c', '113', 'A3', 'hyndai', 'orange', 'UHJ', 'hb20202', '110Ba', '2022-11-14 01:23:53.990875', 'Pedro Sampaio'),
('3ff0d4b6-fdf5-401b-97e7-13c57485f92D', '114', 'A5', 'hyndai', 'red', 'HHE', 'Hb20s', '130CC', '2022-11-14 01:23:53.990875', 'Pedro Almeida');

INSERT INTO "public"."tb_role" ("role_id","role_name") VALUES ('b7f32f86-443f-4a94-bf16-4907820366dd', 'ROLE_ADMIN'),('6bba18d8-fd44-4cda-a3bd-76bb7d9c6380', 'ROLE_USER');

INSERT INTO "public"."tb_user" ("user_id","password","username") VALUES ('f18f5f73-ca49-4f3f-ba94-0bd447504cdd', '$2a$10$jZxwqjrYRMEDMMJ4fIohxO9yjoHy0mKa4Zmb3ynEU0toIhi2LsEDa', 'maria'),('c1b75c67-f9a4-4252-b4af-9b92cebbcad6', '$2a$10$jZxwqjrYRMEDMMJ4fIohxO9yjoHy0mKa4Zmb3ynEU0toIhi2LsEDa', 'joao');

INSERT INTO "public"."tb_users_roles" ("user_id","role_id") VALUES ('f18f5f73-ca49-4f3f-ba94-0bd447504cdd', 'b7f32f86-443f-4a94-bf16-4907820366dd'),('c1b75c67-f9a4-4252-b4af-9b92cebbcad6', '6bba18d8-fd44-4cda-a3bd-76bb7d9c6380');
