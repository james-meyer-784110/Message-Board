USE msgboard_db;
SET FOREIGN_KEY_CHECKS = 0;
truncate users;
truncate posts;
truncate threads;
truncate boards;
SET FOREIGN_KEY_CHECKS = 1;

INSERT into users (username, email, password)
VALUES ('Alice', 'alice@email.com', 'password123'),
    ('Bob', 'bob@email.com', 'password123'),
    ('Charlie', 'charlie@email.com', 'password123'),
    ('Donnie', 'donnie@email.com', 'password123');

INSERT into boards (title, description)
VALUES ('Cooking', 'The process by which meat and plant matter is made digestible for homosapiens.'),
    ('Music', 'Sounds produced in mathematical sequences that provide homosapiens with visceral reactions.'),
    ('Non-homosapiens', 'A board for sentient, possibly non-bipedal life views.');

INSERT into threads (board_id, title, time_stamp)
VALUES (1, 'First time eating food!', '2019.08.07.08:30:15'),
    (2, 'Why is there no good Country Music?', '2019.08.07.08:30:15'),
    (3, 'Telepaths Unite!');

INSERT into posts (user_id, thread_id, time_stamp, message)
VALUES (1, 1, '2019.08.07.08:30:15', 'I never tried eating food before, but gave it a shot today. Definately gonna make this a habbit.'),
    (2, 2, '2019.08.07.08:30:15', 'The title speaks for itself. I never hear good country on the radio :('),
    (3, 3, '2019.08.07.08:30:15', '...silently, over vast distances...');