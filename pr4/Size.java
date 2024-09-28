package pr4;

public enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);

    private final int eurosize;

    private Size (int eurosize){
        this.eurosize = eurosize;
    }

    public int getEurosize() {
        return this.eurosize;
    }

    public String getDescription(){
        if (this.eurosize == 32) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }
}