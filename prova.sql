use spring

create table tempo (
 tmp_id bigint primary key auto_increment,
 tmp_data_hora datetime not null,
 tmp_medida float not null,
 tmp_umidade float,
 tmp_patriculas float
 );

 INSERT INTO tempo (tmp_data_hora, tmp_medida, tmp_umidade, tmp_patriculas) VALUES
('2023-10-24 08:00:00', 25.5, 65.2, 120.0),
('2023-10-24 08:15:00', 26.0, 64.8, 122.5),
('2023-10-24 08:30:00', 24.8, 67.0, 118.2),
('2023-10-24 08:45:00', 27.2, 63.5, 125.8),
('2023-10-24 09:00:00', 26.5, 66.1, 121.3);