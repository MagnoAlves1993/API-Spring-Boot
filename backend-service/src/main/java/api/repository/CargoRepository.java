package api.repository;

import org.springframework.data.repository.CrudRepository;

import api.models.ApiResponseCargo;


public interface CargoRepository extends CrudRepository<ApiResponseCargo, Integer> {
    
}