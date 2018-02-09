INSERT INTO countries values (1, "France");
INSERT INTO countries values (2, "Spain");
INSERT INTO countries values (3, "Portugal");
select * from municipalities;
insert into regions values (4, "Burgundy", 1);
insert into regions values (5, "Aquitaine", 1);
insert into regions values (6, "Limousin", 1);

insert into regions values (1, "Zaragoza", 2);
insert into regions values (2, "Extremadura", 2);
insert into regions values (3, "Galicia", 2);

insert into regions values (7, "BeiraBaixa", 3);
insert into regions values (8, "Oeste", 3);
insert into regions values (9, "Algarve", 3);

insert into populated_area_types values (1, "city");
insert into populated_area_types values (2, "autonomius_area");
insert into populated_area_types values (3, "village");

insert into populated_areas values (1, "Paris", 1, 4);
insert into populated_areas values (2, "Toulouse", 1, 5);
insert into populated_areas values (3, "Ceuta", 3, 1);
insert into populated_areas values (4, "Bilbao", 1, 2);
insert into populated_areas values (5, "Lisbon", 1, 8);
insert into populated_areas values (6, "Porto", 2, 9);

insert into municipalities values (1, "Martinique", 167888, 1);
insert into municipalities values (2, "Cadiz", 280003, 5);
insert into municipalities values (3, "Portalegre", 7300, 2);

insert into streets values (1, "Champs_Elysee", 1);
insert into streets values (2, "Plaza_Mayor", 2);
insert into streets values (3, "Almada", 3);
insert into streets values (4, "Longest_street", 1);
insert into streets values (5, "Sol", 2);
insert into streets values (6, "Almada_Second", 3);

insert into addresses values (1, 3, 36, 90);
insert into addresses values (2, 1, 39, 56);
insert into addresses values (3, 2, 23, 23);
insert into addresses values (4, 6, 99, 7);
insert into addresses values (5, 4, 120, 16);
insert into addresses values (6, 5, 41, 26);
