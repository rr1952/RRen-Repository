import java.util.List;

/**
 * Created by RIchard on 7/20/2017.
 */
    public interface DataAccessObjecto {
        //Implementing CRUD. Create, Read, Update, Delete.
        //Reading
        public List<Product> read();
        //Creating
        public void add(Product p);
        //Deleting
        public void delete(int index);
        //updating
        public void update(int index, Product p);
    }