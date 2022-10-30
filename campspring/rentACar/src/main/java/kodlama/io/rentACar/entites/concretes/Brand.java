package kodlama.io.rentACar.entites.concretes;
//marka=brand
public class Brand {
    private int id;
    //id verileri birbirinden ayirmak için kullanılır
    private String name;

    public Brand() {

    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
