package do_an.do_an_java.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private int contactId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "subject")
    private String subject;

    @Column(name = "message")
    private String message;

    // getters and setters
}
