public class Author {
    private String nameAuthor;
    private String familyAuthor;

    public Author(String nameAuthor, String familyAuthor) {
        this.nameAuthor = nameAuthor;
        this.familyAuthor = familyAuthor;
    }
    public String getNameAuthor() {
        return  nameAuthor;
    }
    public String getFamilyAuthor() {
        return familyAuthor;
    }
    public String toString() {
        return "Имя автора - " + this.nameAuthor + ", Фамилия автора - " + this.familyAuthor;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        if (familyAuthor != author.familyAuthor) {
            return false;
        } else {
            return nameAuthor == author.nameAuthor;
        }
    }
    public int hashCode() {
        int result = 10;
        result = 31 * result + familyAuthor.hashCode();
        result = 31 * result + nameAuthor.hashCode();
        return result;
    }
}
