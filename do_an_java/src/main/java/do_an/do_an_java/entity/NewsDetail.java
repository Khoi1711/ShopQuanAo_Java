package do_an.do_an_java.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
@Table(name = "news_details")
public class NewsDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_detail_id")
    private int newsDetailId;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private Timestamp createdAt;

    // getters and setters

}