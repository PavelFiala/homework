package pavelf.demo.homework;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

abstract class AbstractHomeworkEndpoint<E> {

    JpaRepository<E, Long> repository;

    AbstractHomeworkEndpoint(JpaRepository<E, Long> repository) {
        this.repository = repository;
    }

    @GetMapping("{id}")
    Optional<E> getEntiyById(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @GetMapping()
    List<E> getAllEntities() {
        return repository.findAll();
    }

    @PostMapping
    E saveEntity(@RequestBody E entity) {
        return repository.save(entity);
    }

    @DeleteMapping("{id}")
    void deleteEntity(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
}