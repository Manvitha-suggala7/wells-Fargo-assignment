package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;

    // Constructor
    public User(String username, String email, List<Post> posts) {
        this.username = username;
        this.email = email;
        this.posts = posts;
    }

    // Default constructor (required by JPA)
    public User() {}

    // Getters
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public List<Post> getPosts() { return posts; }

    // Setters
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPosts(List<Post> posts) { this.posts = posts; }
}