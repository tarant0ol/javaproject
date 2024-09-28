package pr4;

public enum Color {
    red("красный(ая)"), green("зеленый(ая)"), blue("синий(яя)"), black("ёрный(ая)"),
    white("белый(ая)"), grey("серый(ая)"), purple("фиолетовый(ая)");

    private final String name;

    private Color(String name) {
         this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return super.toString();
    }
}
