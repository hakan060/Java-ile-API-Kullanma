package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import kodlama.io.rentACar.business.abstracts.BrandServices;
import kodlama.io.rentACar.entites.concretes.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ANNOTATION BILGILENDIRME
@RequestMapping("/api/brands")
public class BrandsContoller {

    private BrandServices brandServices;

    @Autowired // parametreler bak
    public BrandsContoller(BrandServices brandServices) {
        this.brandServices= brandServices;
    }
    @GetMapping("/getAll")
    public  List<Brand> getAll() {
        return brandServices.getAll();
    }

}
