INSERT INTO course (id, name, created_date, last_updated_time) values (10001,  'Spring data JPA ', sysdate(),sysdate());
INSERT INTO course (id, name, created_date, last_updated_time) values (10002,  'Spring data REST ',sysdate(),sysdate());
INSERT INTO course (id, name, created_date, last_updated_time) values (10003,  'Spring MVC ',sysdate(),sysdate());
INSERT INTO course (id, name, created_date, last_updated_time) values (10004,  'Spring MASTER CLASS',sysdate(),sysdate());


INSERT INTO passport (id, number) values (40001,  'E123456');
INSERT INTO passport (id, number) values (40002,  'A123456');
INSERT INTO passport (id, number) values (40003,  'B123456');


INSERT INTO student (id, name,passport_id) values (20001,  'nanna',40001);
INSERT INTO student (id, name,passport_id) values (20002,  'nanna Dash 	',40002);
INSERT INTO student (id, name,passport_id) values (20003,  'nanna pinky ',40003);



INSERT INTO review (id,rating,description,course_id) values (50001, '5' ,'Great Course',10001);
INSERT INTO review (id,rating,description,course_id) values (50002, '4', 'Great Course ! amazing ',10001);
INSERT INTO review (id,rating,description,course_id) values (50003, '4' ,'Great learn ',10004);


INSERT INTO student_course(student_id,course_id) values (20001, 10001);
INSERT INTO student_course(student_id,course_id) values (20001, 10001);
INSERT INTO student_course(student_id,course_id) values (20002, 10002);