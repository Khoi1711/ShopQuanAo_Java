package do_an.do_an_java.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "news_details")
@Getter
@Setter
public class NewsDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_detail_id")
    private int newsDetailId;

    @Column(name = "image_url")
    @NotBlank(message = "Image URL is required!")
    @URL(message = "Invalid URL format!")
    private String imageUrl;

    @Column(name = "title")
    @NotBlank(message = "Title is required!")
    @Size(max = 100, message = "Title must be less than or equal to 100 characters!")
    private String title;

    @Column(name = "content")
    @NotBlank(message = "Content is required!")
    @Size(max = 1000, message = "Content must be less than or equal to 1000 characters!")
    private String content;

    @Column(name = "created_at")
    @NotNull(message = "Created at is required!")
    private Timestamp createdAt;
}