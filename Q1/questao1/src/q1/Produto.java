package q1;
public class Produto {
    
    private String name;
    private Double value;
    private Integer tipe;
    
    public Produto(String name, Double value, Integer tipe) {
        this.name = name;
        this.value = value;
        this.tipe = tipe;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getValue() {
        return value;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public Integer getTipe() {
        return tipe;
    }
    public void setTipe(Integer tipe) {
        this.tipe = tipe;
    }
   


}
