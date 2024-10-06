package pr13.T4;

public class Shirt {
    private StringBuffer id;
    private StringBuffer name;
    private StringBuffer color;
    private StringBuffer size;

    public Shirt(String desc){
        String[] d = desc.split(",");
        this.id = new StringBuffer(d[0]);
        this.name = new StringBuffer(d[1]);
        this.color = new StringBuffer(d[2]);
        this.size = new StringBuffer(d[3]);
    }

    public StringBuffer getColor() { return color; }
    public StringBuffer getId() {return id; }
    public StringBuffer getName() { return name; }
    public StringBuffer getSize() { return size;}

    public void setColor(StringBuffer color) { this.color = color; }
    public void setSize(StringBuffer size) { this.size = size;}
    public void setId(StringBuffer id) { this.id = id;}
    public void setName(StringBuffer name) { this.name = name; }

    @Override
    public String toString() {
        return "Shirt{" +
                "id=" + id +
                ", name=" + name +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
