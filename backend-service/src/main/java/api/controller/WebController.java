package api.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import java.net.URISyntaxException;
import org.springframework.validation.annotation.Validated;
import java.util.Optional;
import java.net.URI;
import api.models.ApiResponseCargo;
import api.repository.CargoRepository;
@RestController
@RequestMapping(path="/")
public class WebController {
    @Autowired

    private CargoRepository CargoRepository;

    @GetMapping(path="/cargos")
    public @ResponseBody Iterable<ApiResponseCargo> getAll() {
        return CargoRepository.findAll();
    }
    
    @GetMapping("/cargos/{id}")
    ResponseEntity<?> getGroup(@PathVariable Integer id) {
        Optional<ApiResponseCargo> cargo = CargoRepository.findById(id);
        return cargo.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add/cargos")
    ResponseEntity<ApiResponseCargo> createGroup(@Valid @RequestBody ApiResponseCargo cargo) throws URISyntaxException {
        ApiResponseCargo result = CargoRepository.save(cargo);
        return ResponseEntity.created(new URI("/cargo/" + result.getId()))
                .body(result);
    }
}