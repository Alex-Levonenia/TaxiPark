package TypesOfCars;

public enum Type {
    Diesel("Diesel"),
    Electric("Electric"),
    Petrol("Petrol");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String toString(String type) {
        return type;
    }
}