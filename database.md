# Database

## Tables

### Users

`long userId`       user_id [A]
`String username`   username
`String email`      email
`String password`   password

### Posts

`long postId`       post_id [B]
`Thread thread`     thread_id [H] -> [D]
`User author`       user_id [C] -> [A]
`String title`      title
`String message`    message

### Threads

`long threadId`     thread_id [D]
`Post post`         post_id [F] -> [B]
`Board board`       board_id [G] -> [E]

### Boards

`long boardId`          board_id [E]
`String name`           name
`String description`    description