package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entites.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;
    //bunu bu sekilde yazma sebebmiz global olması ve değiştirebilmek için

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        //elde boş bir Liste var
        brands.add(new Brand(1,"BMW\n"));
        brands.add(new Brand(2,"Mercedes\n"));
        brands.add(new Brand(3,"Audi\n"));
        brands.add(new Brand(4,"Volkswagen\n"));
        brands.add(new Brand(5,"Ford\n"));
        brands.add(new Brand(6,"TOGG\n"));
    }

    @Override
    public List<Brand> getAll() {

        return brands;
    }
}
