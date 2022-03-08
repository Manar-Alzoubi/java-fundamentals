package inheritance;

public class Shop extends Review {
    private String name;
    private String description;
    private int dollarNumbers;

    public Shop(String name, String description, int dollarNumbers) {
        super();
        this.name = name;
        this.description = description;
        this.dollarNumbers = dollarNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDollarNumbers() {
        return dollarNumbers;
    }

    public void setDollarNumbers(int dollarNumbers) {
        this.dollarNumbers = dollarNumbers;
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarNumbers=" + dollarNumbers +
                '}';
    }


}
