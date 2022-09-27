package br.com.devdojo.awesome.repository;

import br.com.devdojo.awesome.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// Estendendo de um repositorio do CRUD // que já tem alguns metodos prontos |
// Passando por parametro, um Objeto do tipo estudante e o tipo do Objeto.
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByNameIgnoreCaseContaining(String name);
}
