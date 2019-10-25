package TypesOfCars;

public enum Type {
    Diesel("Diesel"),
    Electric("Electric"),
    Petrol("Petrol");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}';
    }
}