/*
drop table athletes if exists
drop table bout if exists
drop table categories if exists
drop table competitions if exists
drop table lifters if exists
create table athletes (athlete_id integer generated by default as identity, birth_day_ts TIMESTAMP, club varchar(255), full_name varchar(255), gender varchar(255) not null, licence varchar(255), primary key (athlete_id))
create table bout (bout_id integer generated by default as identity, bout_date_ts TIMESTAMP, bout_number integer, gender varchar(255), name varchar(255), status varchar(255), competition_id integer, primary key (bout_id))
create table categories (category_id integer generated by default as identity, active boolean, description varchar(255), down_limit double not null, gender varchar(255), name varchar(255), up_limit double not null, primary key (category_id))
create table competitions (competition_id integer generated by default as identity, begin_ts TIMESTAMP, end_ts TIMESTAMP, name varchar(255), organizer varchar(255), place varchar(255), primary key (competition_id))
create table lifters (lifter_id integer generated by default as identity, age_from_year integer, body_weight double, cj_progression integer, cj_status_1 varchar(3), cj_status_2 varchar(1), cj_status_3 varchar(1), cj_weight_1 integer, cj_weight_2 integer, cj_weight_3 integer, best_cj_weight integer, finished_bout boolean, lifter_order integer, olympic_total integer, order_number integer, sinclair_master_score double, sinclair_score double, snatch_progression integer, snatch_status_1 varchar(1), snatch_status_2 varchar(1), snatch_status_3 varchar(1), snatch_weight_1 integer, snatch_weight_2 integer, snatch_weight_3 integer, best_snatch_weight integer, still_snatching boolean, athlete_id integer, bout_id integer, category_id integer, primary key (lifter_id))
alter table bout add constraint FKahllyw0ic69s67j456sy7m3dg foreign key (competition_id) references competitions
alter table lifters add constraint FKaq5isvxumxvjbemqqh7heh45l foreign key (athlete_id) references athletes
alter table lifters add constraint FKief2gg3mwhlid72vbe0f4dr7m foreign key (bout_id) references bout
alter table lifters add constraint FKn62fisij3e3o40j0qdcpm4hpg foreign key (category_id) references categories
*/