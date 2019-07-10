public class Book {

    private String name;
    private String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        if(getName()!=null && getAuthor()!=null){
            return " "+getName()+ " - "+getAuthor();
        }
        return " You haven`t taken any books this day!";
    }
}
