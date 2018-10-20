use dblibrary;

INSERT INTO author(first_name, last_name) VALUES ("David", "Divijakov");
INSERT INTO author(first_name, last_name) VALUES ("Petar", "Petrovic");
INSERT INTO author(first_name, last_name) VALUES ("Vepar", "Dnjeprovic");

INSERT INTO book(name,genre) VALUES ("Tito i ja", "Akcija");
INSERT INTO book(name,genre) VALUES ("Karavan Svetlosti", "Romatika");
INSERT INTO book(name,genre) VALUES ("Isusov zlocin", "Romatika");
INSERT INTO book(name,genre) VALUES ("Templari i tajna Svetih Otaca", "Romatika");

INSERT INTO book_authors(book_id, author_id) VALUES (1,1);
INSERT INTO book_authors(book_id, author_id) VALUES (2,1);
INSERT INTO book_authors(book_id, author_id) VALUES (3,1);
INSERT INTO book_authors(book_id, author_id) VALUES (1,2);
INSERT INTO book_authors(book_id, author_id) VALUES (2,2);
INSERT INTO book_authors(book_id, author_id) VALUES (3,2);
INSERT INTO book_authors(book_id, author_id) VALUES (4,3);
INSERT INTO book_authors(book_id, author_id) VALUES (3,3);

	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.4</version>
		</dependency>

