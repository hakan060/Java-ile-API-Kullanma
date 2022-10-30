package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entites.concretes.Brand;

import java.util.List;

//veri tabanı işleri yapacak DAO gibi bir şeydir Repo

public interface BrandRepository {
    List<Brand> getAll();

}
