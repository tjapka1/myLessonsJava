package de.aitTr.App;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/autos")
@Tag(name = "autos", description = "API Information of Autos")
public class AutoController {
    private final AutoService service;
    @Autowired
    public AutoController(AutoService service) {
        this.service = service;
    }
    @GetMapping("")
    public List<Auto> listAuto (@RequestParam(name = "brand", required = false,defaultValue = "all") String brand ) {
        if (brand.equals("all")) {
            return service.getAllAutos();
        } else {
            return service.getAllAutos(brand);
        }
    }
    @GetMapping("/{id}")
    @Operation(description = "Information of Auto")
    public Auto getAuto (@PathVariable long id){
        return service.getAuto(id);
    }
    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Auto createAuto(@RequestBody Auto auto){
        service.addAuto(auto);
        return auto;
    }

@DeleteMapping("")
    public Auto deleteAuto(@RequestParam(name = "brand", required = true, defaultValue = "all") String brand){
        return null;
}



}
