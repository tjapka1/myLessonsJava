package de.aitTr.App;

import java.util.List;

public interface AutoService {
    List<Auto> getAllAutos();
    List<Auto> getAllAutos(String brand);
    Auto getAuto(long id);
    Auto addAuto(Auto auto);
    Auto removeAuto(Auto auto);
    City updateAuto(Auto auto);

}
