package do_an.do_an_java.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "contacts")
@Getter
@Setter
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private int contactId;

    @Column(name = "name")
    @NotBlank(message = "Name is required!")
    @Size(max = 50, message = "Name must be less than or equal to 50 characters!")
    private String name;

    @Column(name = "email")
    @NotBlank(message = "Email is required!")
    @Email(message = "Invalid email format!")
    private String email;

    @Column(name = "subject")
    @NotBlank(message = "Subject is required!")
    @Size(max = 100, message = "Subject must be less than or equal to 100 characters!")
    private String subject;

    @Column(name = "message")
    @NotBlank(message = "Message is required!")
    @Size(max = 1000, message = "Message must be less than or equal to 1000 characters!")
    private String message;

}