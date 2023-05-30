package de.aitTr.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoServiceImpl implements AutoService{


    AutoRepository repository;
    @Autowired
    public AutoServiceImpl(AutoRepository repository) {
        this.repository = repository;
    }

    /*
        static final List<Auto> autos=new ArrayList<>(
                List.of(
                        new Auto(1,"Mercedes","BA1324",2018),
                        new Auto(2,"Audi","CA8824",2020),
                        new Auto(3,"Audi","CA99",2019),
                        new Auto(4,"Ford","BA1736",2016),
                        new Auto(5,"Mercedes","AA1211",2017)
                )
        );
    */
    @Override
    public List<Auto> getAllAutos(String brand) {
        List<Auto>autos=new ArrayList<>();
        repository.findAll().forEach(a->autos.add(a));
        return autos;
    }
    @Override
    public List<Auto> getAllAutos() {
        return null;
    }

    @Override
    public Auto getAuto(long id) {
        return null;
    }

    @Override
    public Auto addAuto(Auto auto) {
        repository.save(auto);
        return auto;
    }

    @Override
    public Auto removeAuto(Auto auto) {
        return null;
    }

    @Override
    public City updateAuto(Auto auto) {
        return null;
    }


}
