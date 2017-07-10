/**
 * Created by: Richard
 * Date of Creation: 7/7/2017
 */
public class Movie {

    private String title;
    private String category;

    public Movie(String title, String category) {
        this.setCategory(category);
        this.setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
