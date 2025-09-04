# Java + Hibernate Homework

## Task

1. Configure `hibernate.cfg.xml`:  
   - Set the correct database URL, username, and password.  
   - Add the appropriate Hibernate dialect for your database.  

2. In the `Main` class (method `main`), remove the call:  
   ```java
   userService.deleteById(user.getId());

3. At the end of the `main` method, try to delete a Movie entity (as shown in the screenshot).
   - Fix all related errors.
<img width="819" height="777" alt="image" src="https://github.com/user-attachments/assets/02e2cfeb-b908-4faa-bb1e-1f9a7680b3d3" />

4. Add business logic in the service layer. For example:
   - In `UserService`, add a limitation for the length of the username.
   - In `MovieService`, add validation for the movie title.
   - In `UserWatchedListService`, add a restriction for the rating value.
   

 ## Solution
 1. Solution for task 3.

```java
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER, orphanRemoval = true)
    private List<UserWatchedList> userWatchedLists;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
```
