package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandServices;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // bu sınıf busines nesnesidir
public class BrandManager implements BrandServices {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        // iş kurallari markalari listeleyebilmek için

        return brandRepository.getAll();
    }
}
